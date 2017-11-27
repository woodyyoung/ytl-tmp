package com.lty.tmp.service.kafak.handler;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lty.tmp.service.bean.entity.autocreate.DeviceHardware;
import com.lty.tmp.service.kafak.ReceiveHandler;
import com.lty.tmp.service.kafak.modle.DeviceHardwareResponse;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.mapper.DeviceHardwareMapper;
import com.lty.tmp.service.socket.WsPush;

/**
 * 设备上报硬件状态信息
 * 
 * @描述:
 * @作者: PXF
 * @创建时间: 2017年10月21日
 * @版本: 1.0
 */
@Component
public class DevcieHardwareHandler implements ReceiveHandler<DeviceHardwareResponse> {

	private static final Logger LOG = LoggerFactory.getLogger(DevcieHardwareHandler.class);

	@Autowired
	private DeviceHardwareMapper deviceHardwareMapper;

	@Autowired
	private WsPush wsPush;

	@Override
	public void handMsg(Message msg, DeviceHardwareResponse t) {
		// 先把硬件状态信息推到websocket 中：
		wsPush.pushDeviceHardwareInfo(t.getCompany_code(), t.getLine_id(), t.getDev_sn(), t);

		// 然后存储到数据库
		DeviceHardware deviceHardware = t.buildDeviceHardware();
		deviceHardware.setCreateDate(new Date());
		deviceHardwareMapper.insertSelective(deviceHardware);

	}

}
