package com.lty.tmp.service.kafak.modle;

import java.io.Serializable;

public class DeviceToTmpBaseModle implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer dev_id;// 设备ID(自编号)

	// 设备序列号
	private String dev_sn;

	private String city_code;

	private String company_code;

	private Integer line_id;

	public Integer getDev_id() {
		return dev_id;
	}

	public void setDev_id(Integer dev_id) {
		this.dev_id = dev_id;
	}

	public String getDev_sn() {
		return dev_sn;
	}

	public void setDev_sn(String dev_sn) {
		this.dev_sn = dev_sn;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
		if (this.company_code != null && !this.company_code.startsWith(this.city_code)) {
			this.company_code = this.city_code + this.company_code;
		}
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		if (this.city_code != null) {
			this.company_code = this.city_code + company_code;
		} else {
			this.company_code = company_code;
		}
	}

	public Integer getLine_id() {
		return line_id;
	}

	public void setLine_id(Integer line_id) {
		this.line_id = line_id;
	}

}
