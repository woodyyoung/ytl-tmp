package com.lty.tmp.service.kafak.modle;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenCloseDeviceBean extends DeviceToTmpBaseModle {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	private Integer active_flag;

	private Integer dev_resp;

	public Integer getActive_flag() {
		return active_flag;
	}

	public void setActive_flag(Integer active_flag) {
		this.active_flag = active_flag;
	}

	public Integer getDev_resp() {
		return dev_resp;
	}

	public void setDev_resp(Integer dev_resp) {
		this.dev_resp = dev_resp;
	}

}
