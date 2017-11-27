package com.lty.tmp.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.tmp.service.bean.entity.autocreate.Device;
import com.lty.tmp.service.bean.entity.autocreate.DeviceExample;
import com.lty.tmp.service.cache.KeyGenerator;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.mapper.DeviceMapper;

@Service
public class DeviceService {
	@Autowired
	private DeviceMapper deviceMapper;

	@Autowired
	private RedisUtils redis;

	@Autowired
	private DeviceTypeService deviceTypeService;

	public List<Device> listAll() {
		DeviceExample example = new DeviceExample();
		List<Device> list = deviceMapper.selectByExample(example);
		return list;
	}

	public Device getDeviceBydeviceNo(String deviceSn) {
		Device object = redis.getObject(KeyGenerator.device_key(deviceSn),
				Device.class);
		return object;
	}

	public String getDeviceTypeByDevicSn(String deviceSn) {
		Device device = getDeviceBydeviceNo(deviceSn);
		if (device == null) {
			return null;
		}
		return deviceTypeService.getDeviceType(device.getDeviceTypeId());
	}

	public void updateDevice(Device device) {
		deviceMapper.updateByPrimaryKeySelective(device);
		redis.setObject(KeyGenerator.device_key(device.getDeviceNo()), device);
	}

	public boolean exist(String deviceSn) {
		return redis.exists(KeyGenerator.device_key(deviceSn));
	}

	public void setDeviceSn(String deviceSn) {
		redis.setString(KeyGenerator.device_key(deviceSn), deviceSn);
	}

}
