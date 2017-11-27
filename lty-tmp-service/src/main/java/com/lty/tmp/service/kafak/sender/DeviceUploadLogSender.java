package com.lty.tmp.service.kafak.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lty.tmp.service.cache.TmpCache;
import com.lty.tmp.service.common.constant.MsgType;
import com.lty.tmp.service.common.message.FTPconfigureInfo;
import com.lty.tmp.service.common.message.SequenceGenerator;
import com.lty.tmp.service.kafak.Sender;
import com.lty.tmp.service.kafak.modle.DeviceUploadLogBean;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.kafak.modle.MessageHeader;
import com.lty.tmp.service.socket.WsPush;
import com.lty.tmp.service.socket.util.WsRequest;

@Component
public class DeviceUploadLogSender {
	private static final Logger LOG = LoggerFactory.getLogger(DeviceUploadLogSender.class);
	private final int UPLOAD_LOG_REQUEST = 517;
	private static ObjectMapper objMapper = new ObjectMapper();
	@Autowired
	private WsPush wsPush;
	@Autowired
	private Sender sender;
	@Autowired
	private SequenceGenerator sequenceGenerator;
	@Autowired
	private TmpCache tmpCache;
	@Autowired
	private FTPconfigureInfo fTPconfigureInfo;

	/**
	 * 
	 * @功能：TMP发送设备上传日志请求
	 * 
	 * @param context
	 *
	 * @返回：void
	 */
	public void tmpSendUploadLogRequest(WsRequest ws) {
		Message message = new Message();
		MessageHeader header = new MessageHeader();
		DeviceUploadLogBean body = new DeviceUploadLogBean();

		header.setMsg_id(MsgType.upload_device_log_request.getType());
		header.setMsg_sn(sequenceGenerator.getMsgId());// 报文序列号

		body.setDev_sn(ws.getParams().getDevice_sn());
		body.setLog_type(ws.getParams().getLog_type());

		body.setFtp_ip(fTPconfigureInfo.getFTPconfigureInfo().getFtp_ip());
		body.setFtp_port(fTPconfigureInfo.getFTPconfigureInfo().getFtp_port());
		body.setFtp_user(fTPconfigureInfo.getFTPconfigureInfo().getFtp_user());
		body.setFtp_password(fTPconfigureInfo.getFTPconfigureInfo().getFtp_password());
		body.setFtp_path(fTPconfigureInfo.getFTPconfigureInfo().getFtp_path());

		message.setHeader(header);
		message.setBody(body);
		String msg = JSON.toJSONString(message);
		LOG.info("tmp请求终端上传日志：" + msg);
		sender.senderMessage(msg);
	}

}
