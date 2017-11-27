package com.lty.tmp.service.kafak.modle;

import java.util.Date;

import com.lty.tmp.service.bean.entity.autocreate.UpgradeLog;

public class UpgradeResponse extends DeviceToTmpBaseModle {
	private static final long serialVersionUID = 1L;

	private Integer dev_resp;

	public Integer getDev_resp() {
		return dev_resp;
	}

	public void setDev_resp(Integer dev_resp) {
		this.dev_resp = dev_resp;
	}

	public UpgradeLog buildUpgradeLog() {
		UpgradeLog log = new UpgradeLog();
		log.setCompanyCode(this.getCompany_code());
		log.setDevId(this.getDev_id() + "");
		log.setDevSn(this.getDev_sn());
		log.setLineCode(this.getLine_id());
		log.setCityCode(this.getCity_code());
		log.setUpgradeStatus(this.dev_resp);
		log.setWriteDate(new Date());
		return log;
	}

}
