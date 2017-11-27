package com.lty.tmp.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.tmp.service.bean.entity.autocreate.DeviceType;
import com.lty.tmp.service.bean.entity.autocreate.DeviceTypeExample;
import com.lty.tmp.service.cache.KeyGenerator;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.mapper.DeviceTypeMapper;

@Service
public class DeviceTypeService {
	@Autowired
	private DeviceTypeMapper mapper;
	@Autowired
	private RedisUtils redis;

	public List<DeviceType> listAll() {
		DeviceTypeExample example = new DeviceTypeExample();
		return mapper.selectByExample(example);
	}

	public DeviceType getDeviceType(String deviceTypeCode) {
		DeviceType deviceType = redis.getObject(
				KeyGenerator.device_type_key(deviceTypeCode), DeviceType.class);
		return deviceType;
	}

	public String getDeviceType(int deviceTypeid) {
		String deviceTypeCode = redis.getString(KeyGenerator
				.device_type_code(deviceTypeid));
		return deviceTypeCode;
	}

}
