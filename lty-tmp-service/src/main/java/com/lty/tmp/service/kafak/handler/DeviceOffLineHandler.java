package com.lty.tmp.service.kafak.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.cache.TmpCache;
import com.lty.tmp.service.kafak.ReceiveHandler;
import com.lty.tmp.service.kafak.modle.DeviceOffLineRequest;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.socket.WsPush;

/**
 * 接收离线通知消息，业务处理
 * 
 * @描述:
 * @作者: PXF
 * @创建时间: 2017年10月21日
 * @版本: 1.0
 */

@Component
public class DeviceOffLineHandler implements ReceiveHandler<DeviceOffLineRequest> {

	private static final Logger LOG = LoggerFactory.getLogger(DeviceOffLineHandler.class);
	private final int OffLine_NMU = -1;

	@Autowired
	private TmpCache tmpCache;

	@Autowired
	private WsPush wsPush;

	@Override
	public void handMsg(Message msg, DeviceOffLineRequest t) {

		LOG.info("TMP 接收到设备离线消息：" + JSON.toJSONString(msg));

		String companyID = t.getCompany_code();
		Integer lineID = t.getLine_id();
		String deviceNo = t.getDev_sn();

		// 判断设备是否在线
		if (!tmpCache.isOnline(companyID, lineID, deviceNo)) {
			LOG.info("设备已离线不需要再更新缓存");
			return;
		}

		// 更新缓存
		tmpCache.deviceOffline(companyID, lineID, deviceNo);
		// 推送数据到websocket
		wsPush.deviceOffline(companyID, lineID, deviceNo);
		LOG.info("设备离线更新缓存over！");

	}

}
