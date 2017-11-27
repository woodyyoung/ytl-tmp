package com.lty.tmp.service.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.bean.entity.autocreate.DeviceSoftware;
import com.lty.tmp.service.bean.entity.autocreate.DeviceSoftwareExample;
import com.lty.tmp.service.kafak.modle.DeviceSoftwareResponse;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.mapper.DeviceSoftwareMapper;
import com.lty.tmp.service.socket.WsPush;

@Service
@Transactional
public class DeviceSoftwareService {

	private static final Logger log = LoggerFactory.getLogger(DeviceSoftwareService.class);

	@Autowired
	private WsPush wsPush;

	@Autowired
	private DeviceSoftwareMapper deviceSoftwareMapper;

	public void deviceSoftwareStatusService(Message msg, DeviceSoftwareResponse t) {

		// 把消息数据推到websocket
		wsPush.pushDeviceSoftwareInfo(t.getCompany_code(), t.getLine_id(), t.getDev_sn(), t);

		DeviceSoftware deviceSoftware = t.buildDeviceSoftware();
		deviceSoftware.setCreateDate(new Date());

		DeviceSoftwareExample example = new DeviceSoftwareExample();
		example.createCriteria().andDevSnEqualTo(deviceSoftware.getDevSn());
		example.setOrderByClause("id DESC");
		List<DeviceSoftware> selectByExample = deviceSoftwareMapper.selectByExample(example);

		if (!selectByExample.isEmpty()) {
			DeviceSoftware deviceSoftware2 = selectByExample.get(0);
			if (!deviceSoftware2.getDevId().equals(t.getDev_id())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getCityCode().equals(t.getCity_code())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getCompanyCode().equals(t.getCompany_code())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getLineId().equals(t.getLine_id())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getAppVersion().equals(t.getApp_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getFsVersion().equals(t.getFs_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getMcuVersion().equals(t.getMcu_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getSrVersion().equals(t.getSr_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getKernelVersion().equals(t.getKernel_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getBootVersion().equals(t.getBoot_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getKeyboardVersion().equals(t.getKeyboard_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getCamera1Params().equals(t.getCamera1_params())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getCamera2Params().equals(t.getCamera2_params())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getLineAttributes().equals(t.getLine_attributes())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getCommonConfig().equals(t.getCommon_config())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getStationConfig().equals(t.getStation_config())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getDefaultEvents().equals(t.getDefault_events())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getCardtypeConfig().equals(t.getCardtype_config())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getFareConfig().equals(t.getFare_config())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getMediaVersion().equals(t.getMedia_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getGpsVersion().equals(t.getGps_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getCommunicationVersion().equals(t.getCommunication_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getIcParamVersion().equals(t.getIc_param_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getBlackList().equals(t.getBlack_list())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getWhiteList().equals(t.getWhite_list())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			if (!deviceSoftware2.getDoubleCamVersion().equals(t.getDouble_cam_version())) {
				deviceSoftwareMapper.insertSelective(deviceSoftware);
				return;
			}
			return;

		}

		deviceSoftwareMapper.insertSelective(deviceSoftware);

		log.info("TMP 处理的设备软件状态信息：" + JSON.toJSONString(deviceSoftware));

	}

}
