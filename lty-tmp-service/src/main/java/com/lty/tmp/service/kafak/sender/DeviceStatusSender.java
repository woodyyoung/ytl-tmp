package com.lty.tmp.service.kafak.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lty.tmp.service.common.constant.MsgType;
import com.lty.tmp.service.common.message.SequenceGenerator;
import com.lty.tmp.service.kafak.Sender;
import com.lty.tmp.service.kafak.modle.DeviceStatusResponse;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.kafak.modle.MessageHeader;
import com.lty.tmp.service.socket.WsPush;
import com.lty.tmp.service.socket.util.WsRequest;

/**
 * TMP 请求设备状态信息
 * 
 * @描述:
 * @作者: PXF
 * @创建时间: 2017年10月23日
 * @版本: 1.0
 */

@Component
public class DeviceStatusSender {

	private static final Logger LOG = LoggerFactory.getLogger(DeviceStatusSender.class);
	private static ObjectMapper objMapper = new ObjectMapper();

	@Autowired
	private Sender sender;

	@Autowired
	private SequenceGenerator sequenceGenerator;
	@Autowired
	private WsPush wsPush;

	/**
	 * TMP 页面通过websocket发送请求终端设备状态消息 @功能：
	 * 
	 * @param context
	 *
	 * @返回：void
	 */
	public void tmpRequestDeviceStatus(WsRequest ws) {

		Message<DeviceStatusResponse> message = new Message<DeviceStatusResponse>();
		MessageHeader header = new MessageHeader();
		DeviceStatusResponse messageBody = new DeviceStatusResponse();

		header.setMsg_id(MsgType.request_device_status_info.getType());
		header.setMsg_sn(sequenceGenerator.getMsgId());// 设置报文序列号

		String device_sn = ws.getParams().getDevice_sn();
		Integer request_mask = ws.getParams().getRequest_mask();
		messageBody.setDev_sn(device_sn);
		messageBody.setRequest_mask(request_mask);
		message.setHeader(header);
		message.setBody(messageBody);
		String msg = JSON.toJSONString(message);
		sender.senderMessage(msg);

		LOG.info("TMP 请求设备状态信息消息：" + msg);
	}

}
