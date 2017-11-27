package com.lty.tmp.service.kafak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.common.constant.MsgType;
import com.lty.tmp.service.kafak.handler.DevcieHardwareHandler;
import com.lty.tmp.service.kafak.handler.DeviceFactoryOutHandler;
import com.lty.tmp.service.kafak.handler.DeviceLoginHandler;
import com.lty.tmp.service.kafak.handler.DeviceOffLineHandler;
import com.lty.tmp.service.kafak.handler.DeviceSoftwareInfoHandler;
import com.lty.tmp.service.kafak.handler.DeviceUploadLogHandler;
import com.lty.tmp.service.kafak.handler.OpenCloseDeviceHandler;
import com.lty.tmp.service.kafak.handler.UpgradeResponseHandler;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.kafak.modle.MessageHeader;

@Component
public class ReceiveHandlerAdapter {
	protected static final Logger logger = LoggerFactory.getLogger(ReceiveHandlerAdapter.class);
	@Autowired
	private UpgradeResponseHandler upgradeResponseHandler;
	@Autowired
	private DeviceLoginHandler deviceLoginHandler;
	@Autowired
	private DeviceUploadLogHandler deviceUploadLogHandler;
	@Autowired
	private OpenCloseDeviceHandler openCloseDeviceHandler;

	@Autowired
	private DeviceOffLineHandler deviceOffLineHandler;
	@Autowired
	private DevcieHardwareHandler devcieHardwareHandler;
	@Autowired
	private DeviceFactoryOutHandler deviceFactoryOutHandler;
	@Autowired
	private DeviceSoftwareInfoHandler deviceSoftwareInfoHandler;

	public ReceiveHandler getHandlerAdapter(Message msg) {
		MessageHeader header = msg.getHeader();
		Integer msgType = header.getMsg_id();
		if (msgType.equals(MsgType.device_upgrade_response.getType())) {
			return upgradeResponseHandler;
		}
		if (msgType.equals(MsgType.login_request.getType())) {
			return deviceLoginHandler;
		}
		if (msgType.equals(MsgType.upload_device_log_response.getType())) {
			return deviceUploadLogHandler;
		}
		if (msgType.equals(MsgType.device_open_or_close_response.getType())) {
			return openCloseDeviceHandler;
		}
		if (msgType.equals(MsgType.device_offline.getType())) {
			return deviceOffLineHandler;
		}
		if (msgType.equals(MsgType.device_upload_handware_info.getType())) {
			return devcieHardwareHandler;
		}
		if (msgType.equals(MsgType.device_upload_factoryout_info.getType())) {
			return deviceFactoryOutHandler;
		}
		if (msgType.equals(MsgType.device_upload_software_info.getType())) {
			return deviceSoftwareInfoHandler;
		}

		logger.error("no handler find for msgtype:---" + JSON.toJSONString(msg));
		return null;
	}

}
