package com.lty.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lty.tmp.service.TmpServiceApplication;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.mapper.LineMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TmpServiceApplication.class)
public class MapperTest {
	/*
	 * @Autowired private LineMapper linemapper;
	 * 
	 * @Autowired private StationMapper stationMapper;
	 */

	@Autowired
	private LineMapper linemapper;

	@Autowired
	private RedisUtils redis;

	/*
	 * @Test public void queryStations() { // List<Map<String, Object>> stations
	 * = stationMapper.queryAllStaion(); List<Map<String, Object>> stations =
	 * Collections.emptyList(); for (Map<String, Object> station : stations) {
	 * 
	 * Point point = CoordinateConversion.google_bd_encrypt( ((BigDecimal)
	 * station.get("latitude")).doubleValue(), ((BigDecimal)
	 * station.get("longitude")).doubleValue());
	 * 
	 * station.put("latitude", point.getLat()); station.put("longitude",
	 * point.getLng()); } RespJson json = new RespJson(); json.setType(201);
	 * json.setData(stations); System.out.println(JSON.toJSONString(json)); }
	 */

	@Test
	public void redisSet() {

		/*
		 * System.out.println("-------------" + ((City)
		 * redis.get("1111")).getName());
		 */
	}

	@Test
	public void getMapper() {
		linemapper.deleteByPrimaryKey(1);
		System.out.println(11);
	}

}
