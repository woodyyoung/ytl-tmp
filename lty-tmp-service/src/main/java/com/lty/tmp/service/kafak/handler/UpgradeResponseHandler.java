package com.lty.tmp.service.kafak.handler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lty.tmp.service.bean.entity.autocreate.UpgradeLog;
import com.lty.tmp.service.bean.entity.autocreate.UpgradeLogExample;
import com.lty.tmp.service.bean.entity.autocreate.UpgradeLogExample.Criteria;
import com.lty.tmp.service.kafak.ReceiveHandler;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.kafak.modle.UpgradeResponse;
import com.lty.tmp.service.mapper.UpgradeLogMapper;

@Component
public class UpgradeResponseHandler implements ReceiveHandler<UpgradeResponse> {
	@Autowired
	private UpgradeLogMapper upgradeLogMapper;

	@Override
	public void handMsg(Message msg, UpgradeResponse t) {
		UpgradeLogExample example = new UpgradeLogExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andDevSnEqualTo(t.getDev_sn());
		criteria.andUpgradeSnEqualTo(msg.getHeader().getMsg_sn() + "");
		List<UpgradeLog> list = upgradeLogMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return;
		}

		UpgradeLog upgradeLog = list.get(0);
		upgradeLog.setUpgradeStatus(t.getDev_resp());
		upgradeLog.setWriteDate(new Date());
		upgradeLogMapper.updateByPrimaryKeySelective(upgradeLog);
	}

}
