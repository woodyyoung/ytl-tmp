package com.lty.tmp.service.kafak.handler;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.bean.entity.autocreate.DeviceFactoryOut;
import com.lty.tmp.service.bean.entity.autocreate.DeviceFactoryOutExample;
import com.lty.tmp.service.bean.entity.autocreate.DeviceFactoryOutExample.Criteria;
import com.lty.tmp.service.kafak.ReceiveHandler;
import com.lty.tmp.service.kafak.modle.DeviceFactoryOutResponse;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.mapper.DeviceFactoryOutMapper;
import com.lty.tmp.service.socket.WsPush;

/**
 * 设备出厂状态信息业务处理
 * 
 * @描述:
 * @作者: PXF
 * @创建时间: 2017年10月23日
 * @版本: 1.0
 */

@Component
public class DeviceFactoryOutHandler implements ReceiveHandler<DeviceFactoryOutResponse> {

	private static final Logger LOG = LoggerFactory.getLogger(DeviceFactoryOutHandler.class);

	@Autowired
	private WsPush wsPush;

	@Autowired
	private DeviceFactoryOutMapper deviceFactoryOutMapper;

	@Override
	public void handMsg(Message msg, DeviceFactoryOutResponse t) {

		LOG.info("TMP 接收到设备的出厂状态消息：" + JSON.toJSONString(msg));

		// 先把消息里的数据推送给websocket
		wsPush.pushDeviceFactoryOutInfo(t.getCompany_code(), t.getLine_id(), t.getDev_sn(), t);

		// 然后开始数据库，看是否有数据，如果有数据则不进行保存，没有数据则进行数据库的插入操作
		DeviceFactoryOut deviceFactoryOut = t.buildDeviceFactoryOut();
		deviceFactoryOut.setCreateDate(new Date());
		DeviceFactoryOutExample example = new DeviceFactoryOutExample();
		Criteria createCriteria = example.createCriteria();

		createCriteria.andDevSnEqualTo(t.getDev_sn());
		example.setOrderByClause("id DESC");
		List<DeviceFactoryOut> selectByExample = deviceFactoryOutMapper.selectByExample(example);

		if (!selectByExample.isEmpty()) {
			DeviceFactoryOut deviceFactoryOut2 = selectByExample.get(0);
			if (!deviceFactoryOut2.getDevId().equals(t.getDev_id())) {
				deviceFactoryOutMapper.insertSelective(deviceFactoryOut);
				return;
			}
			if (!deviceFactoryOut2.getCityCode().equals(t.getCity_code())) {
				deviceFactoryOutMapper.insertSelective(deviceFactoryOut);
				return;
			}
			if (!deviceFactoryOut2.getCompanyCode().equals(t.getCompany_code())) {
				deviceFactoryOutMapper.insertSelective(deviceFactoryOut);
				return;
			}
			if (!deviceFactoryOut2.getLineId().equals(t.getLine_id())) {
				deviceFactoryOutMapper.insertSelective(deviceFactoryOut);
				return;
			}
			if (!deviceFactoryOut2.getDateOfProduction().equals(t.getDate_of_production())) {
				deviceFactoryOutMapper.insertSelective(deviceFactoryOut);
				return;
			}
			if (!deviceFactoryOut2.getFirstOnline().equals(t.getFirst_online())) {
				deviceFactoryOutMapper.insertSelective(deviceFactoryOut);
				return;
			}
			if (!deviceFactoryOut2.getGpsModel().equals(t.getGps_model())) {
				deviceFactoryOutMapper.insertSelective(deviceFactoryOut);
				return;
			}
			if (!deviceFactoryOut2.getLteModel().equals(t.getLte_model())) {
				deviceFactoryOutMapper.insertSelective(deviceFactoryOut);
				return;
			}

			return;
		}
		// 数据库没有数据直接存入数据库
		deviceFactoryOutMapper.insertSelective(deviceFactoryOut);

		LOG.info("设备出厂状态信息处理完毕！");
	}

}
