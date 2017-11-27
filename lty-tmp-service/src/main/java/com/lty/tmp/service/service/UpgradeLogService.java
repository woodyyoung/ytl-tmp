package com.lty.tmp.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.tmp.service.bean.entity.autocreate.UpgradeDetail;
import com.lty.tmp.service.bean.entity.autocreate.UpgradeLog;
import com.lty.tmp.service.mapper.UpgradeDetailMapper;
import com.lty.tmp.service.mapper.UpgradeLogMapper;

@Service
public class UpgradeLogService {

	@Autowired
	private UpgradeLogMapper upgradeLogMapper;

	@Autowired
	private UpgradeDetailMapper upgradeDetailMapper;

	public void addLog(UpgradeLog log, List<UpgradeDetail> detailList) {
		upgradeLogMapper.insertSelective(log);
		for (UpgradeDetail detail : detailList) {
			upgradeDetailMapper.insertSelective(detail);
		}
	}
}
