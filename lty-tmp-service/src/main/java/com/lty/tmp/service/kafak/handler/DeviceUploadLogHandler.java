package com.lty.tmp.service.kafak.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.kafak.ReceiveHandler;
import com.lty.tmp.service.kafak.modle.DeviceUploadLogBean;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.socket.WsPush;

@Component
public class DeviceUploadLogHandler implements ReceiveHandler<DeviceUploadLogBean> {
	private static final Logger LOG = LoggerFactory.getLogger(DeviceLoginHandler.class);
	@Autowired
	private WsPush wsPush;

	@Override
	public void handMsg(Message msg, DeviceUploadLogBean t) {
		LOG.info("Upload the log results to the page push device..." + JSON.toJSONString(t));
		wsPush.pushLogUploadResult(t.getCompany_code(), t.getLine_id(), t.getDev_sn(), t.getDev_resp());
	}

}
