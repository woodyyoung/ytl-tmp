package com.lty.tmp.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.tmp.service.bean.entity.autocreate.Line;
import com.lty.tmp.service.bean.entity.autocreate.LineExample;
import com.lty.tmp.service.cache.KeyGenerator;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.mapper.LineMapper;

@Service
public class LineService {
	@Autowired
	private LineMapper lineMapper;

	@Autowired
	private RedisUtils redis;

	public List<Line> listAll() {
		LineExample example = new LineExample();
		List<Line> list = lineMapper.selectByExample(example);
		return list;
	}

	/**
	 * 
	 * @功能：获取线路信息
	 * 
	 *
	 * @返回：Line
	 */
	public Line getLine(String companyID, int lineID) {
		Line line = (Line) redis.getObject(
				KeyGenerator.line_key(companyID, lineID), Line.class);
		return line;
	}

}
