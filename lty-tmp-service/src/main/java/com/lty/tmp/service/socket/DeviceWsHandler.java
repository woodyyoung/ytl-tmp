package com.lty.tmp.service.socket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.cache.TmpCache;
import com.lty.tmp.service.kafak.sender.DeviceStatusSender;
import com.lty.tmp.service.kafak.sender.DeviceUploadLogSender;
import com.lty.tmp.service.kafak.sender.OpenCloseDeviceSender;
import com.lty.tmp.service.socket.util.EnumMsgType;
import com.lty.tmp.service.socket.util.WsRequest;
import com.lty.tmp.service.socket.util.WsResponse;
import com.lty.tmp.service.socket.util.WsResponse.DeviceOnlineStatus;

/**
 * 推送大数据展示线路相关的页面的展示信息
 * 
 * @描述:
 * @作者: hgy
 * @创建时间: 2017年8月10日
 * @版本: 1.0
 */
public class DeviceWsHandler extends BasicWsHandler {
	public static final String LINE_CODE = "lineCode";

	public static final String COMPANY_CODE = "companyCode";

	protected static final Logger logger = LoggerFactory
			.getLogger(DeviceWsHandler.class);

	@Autowired
	private TmpCache cache;

	@Autowired
	private DeviceUploadLogSender deviceUploadLogSender;

	@Autowired
	private OpenCloseDeviceSender openCloseDeviceSender;

	@Autowired
	private DeviceStatusSender deviceStatusSender;

	public static final Map<String, WebSocketSession> users;// 最好用Map来存储，key用userid

	static {
		users = new ConcurrentHashMap<String, WebSocketSession>();
	}

	/*
	 * @Value("${catalina.base}") private String env;
	 */

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws IOException {
		String requestMsg = message.getPayload();
		logger.info(requestMsg);
		WsRequest request = JSON.parseObject(requestMsg, WsRequest.class);
		Integer msgType = request.getMsg_type();
		// 设备监控页面》选择或切换线路发送消息给ws服务端
		if (msgType == EnumMsgType.TYPE_102.getCode()) {
			int lineCode = (Integer) request.getParams().getLine_code();
			session.getAttributes().put(LINE_CODE, lineCode);

			String company_id = (String) session.getAttributes().get(
					COMPANY_CODE);
			// 获取公司在线设备数量
			long line_online_device_num = cache
					.get_company_online_num(company_id);
			WsResponse response = new WsResponse();
			response.setMsg_type(EnumMsgType.TYPE_101.getCode());
			response.setlineCode(lineCode);
			response.setCompnay_online_num(line_online_device_num);

			// 返回线路在线设备列表
			Set<String> setMembers = cache.get_online_device_list(company_id,
					lineCode);

			List<DeviceOnlineStatus> list = new ArrayList<WsResponse.DeviceOnlineStatus>();
			setMembers.forEach((String o) -> {
				DeviceOnlineStatus deviceStatus = new DeviceOnlineStatus();
				deviceStatus.setDevice_sn(o);
				deviceStatus.setStatus(1);
				list.add(deviceStatus);
			});

			response.setData(list);
			response.setLine_online_num(list.size());

			TextMessage txt = new TextMessage(JSON.toJSONString(response));
			session.sendMessage(txt);
			return;
		}

		if (msgType == EnumMsgType.TYPE_105.getCode()) {
			deviceStatusSender.tmpRequestDeviceStatus(request);
			return;
		}

		if (msgType == EnumMsgType.TYPE_109.getCode()) {
			openCloseDeviceSender.tmpOpenCloseDeviceDeviceRequest(request);
			return;
		}

		if (msgType == EnumMsgType.TYPE_111.getCode()) {
			deviceUploadLogSender.tmpSendUploadLogRequest(request);
			return;
		}

	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session)
			throws Exception {
		users.put(session.getId(), session);
		logger.info(session.getRemoteAddress() + " come in!---");
		logger.info("DeviceWsHandler user size:---" + users.size());

		// 连接成功返回公司所有在线设备数量
		String company_code = (String) session.getAttributes()
				.get(COMPANY_CODE);
		long num = cache.get_company_online_num(company_code);

		WsResponse response = new WsResponse();
		response.setMsg_type(EnumMsgType.TYPE_101.getCode());
		response.setCompanyCode(company_code);
		response.setCompnay_online_num(num);

		String msg = JSON.toJSONString(response);
		TextMessage txt = new TextMessage(msg);
		session.sendMessage(txt);
		logger.info("connection success!return msg:" + msg);

	}

	@Override
	public Map<String, WebSocketSession> userMap() {
		return users;
	}

}
