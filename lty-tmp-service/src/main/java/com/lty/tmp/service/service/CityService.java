package com.lty.tmp.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.tmp.service.bean.entity.autocreate.City;
import com.lty.tmp.service.bean.entity.autocreate.CityExample;
import com.lty.tmp.service.cache.KeyGenerator;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.mapper.CityMapper;

@Service
public class CityService {
	@Autowired
	private CityMapper cityMapper;

	@Autowired
	private RedisUtils redis;

	public List<City> listAll() {
		CityExample example = new CityExample();
		List<City> list = cityMapper.selectByExample(example);
		return list;
	}

	/**
	 * 
	 * @功能：根据城市ID 获取城市信息
	 * 
	 *
	 * @返回：City
	 */
	public City getCity(String cityID) {
		City city = redis.getObject(KeyGenerator.city_key(cityID), City.class);
		return city;
	}

}
