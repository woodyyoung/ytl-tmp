package com.lty.tmp.service.kafak.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lty.tmp.service.cache.TmpCache;
import com.lty.tmp.service.common.constant.MsgType;
import com.lty.tmp.service.common.message.SequenceGenerator;
import com.lty.tmp.service.kafak.Sender;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.kafak.modle.MessageHeader;
import com.lty.tmp.service.kafak.modle.OpenCloseDeviceBean;
import com.lty.tmp.service.socket.util.WsRequest;

@Component
public class OpenCloseDeviceSender {

	private static final Logger LOG = LoggerFactory.getLogger(OpenCloseDeviceSender.class);
	private static ObjectMapper objMapper = new ObjectMapper();

	private final int OPEN_DEVICE = 0;
	private final int CLOSE_DEVICE = 1;

	@Autowired
	private Sender sender;
	@Autowired
	private SequenceGenerator sequenceGenerator;
	@Autowired
	private TmpCache tmpCache;

	/**
	 * 
	 * @功能：TMP开启/关闭设备请求
	 * 
	 * @param context
	 *
	 * @返回：void
	 */
	@SuppressWarnings("unchecked")
	public void tmpOpenCloseDeviceDeviceRequest(WsRequest ws) {

		Message message = new Message();
		MessageHeader header = new MessageHeader();
		OpenCloseDeviceBean body = new OpenCloseDeviceBean();

		try {
			header.setMsg_id(MsgType.device_open_or_close_request.getType());
			Integer msgSn = sequenceGenerator.getMsgId();
			header.setMsg_sn(msgSn);// 报文序列号
			body.setDev_sn(ws.getParams().getDevice_sn());
			// 开启
			if (OPEN_DEVICE == ws.getParams().getActive_flag()) {
				body.setActive_flag(OPEN_DEVICE);
				message.setHeader(header);
				message.setBody(body);
				LOG.info("tmp请求终端开启设备:---" + JSON.toJSONString(body));
				sender.senderMessage(objMapper.writeValueAsString(message));
				tmpCache.increment_tmp_open_device(msgSn);
				return;
			}
			// 关闭
			body.setActive_flag(CLOSE_DEVICE);
			message.setHeader(header);
			message.setBody(body);
			LOG.info("tmp请求终端关闭设备:---" + JSON.toJSONString(message));
			String msg = JSON.toJSONString(message);
			sender.senderMessage(msg);
			tmpCache.increment_tmp_close_device(msgSn);
		} catch (JsonProcessingException e) {
			LOG.error("Json解析失败", e);
			e.printStackTrace();
		}

	}

}
