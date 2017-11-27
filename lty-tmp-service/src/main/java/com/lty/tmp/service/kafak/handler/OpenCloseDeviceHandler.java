package com.lty.tmp.service.kafak.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.bean.entity.autocreate.Device;
import com.lty.tmp.service.bean.entity.autocreate.DeviceExample;
import com.lty.tmp.service.cache.KeyGenerator;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.cache.TmpCache;
import com.lty.tmp.service.kafak.ReceiveHandler;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.kafak.modle.OpenCloseDeviceBean;
import com.lty.tmp.service.mapper.DeviceMapper;
import com.lty.tmp.service.socket.WsPush;

@Component
public class OpenCloseDeviceHandler implements ReceiveHandler<OpenCloseDeviceBean> {
	private static final Logger LOG = LoggerFactory.getLogger(OpenCloseDeviceHandler.class);
	@Autowired
	private WsPush wsPush;
	@Autowired
	private TmpCache tmpCache;
	@Autowired
	private RedisUtils redisUtils;
	@Autowired
	private DeviceMapper deviceMapper;

	@Override
	public void handMsg(Message msg, OpenCloseDeviceBean t) {
		LOG.info("close the device results to the page push device..." + JSON.toJSONString(t));
		Integer msn = msg.getHeader().getMsg_sn();
		Boolean open = redisUtils.exists(KeyGenerator.tmp_open_device(msn));
		Device device = new Device();
		DeviceExample example = new DeviceExample();
		if (open) {
			tmpCache.remove_tmp_open_device(msn);
			if (t.getDev_resp() == 0) {
				device.setTbpStatus(1);
				example.createCriteria().andDeviceNoEqualTo(t.getDev_sn());
				deviceMapper.updateByExampleSelective(device, example);
			}
		} else {
			tmpCache.remove_tmp_close_device(msn);
			if (t.getDev_resp() == 0) {
				device.setTbpStatus(0);
				example.createCriteria().andDeviceNoEqualTo(t.getDev_sn());
				deviceMapper.updateByExampleSelective(device, example);
			}
		}

		wsPush.pushOpenCloseDeviceResult(t.getCompany_code(), t.getLine_id(), t.getDev_sn(), t.getDev_resp());

	}

}
