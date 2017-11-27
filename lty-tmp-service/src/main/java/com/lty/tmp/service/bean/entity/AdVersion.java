package com.lty.tmp.service.bean.entity;

import java.io.Serializable;

public class AdVersion implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer companyId;
	private Integer cityId;
	private Integer tmpLineId;
	private String adVersion;
	private String filePath;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getTmpLineId() {
		return tmpLineId;
	}

	public void setTmpLineId(Integer tmpLineId) {
		this.tmpLineId = tmpLineId;
	}

	public String getAdVersion() {
		return adVersion;
	}

	public void setAdVersion(String adVersion) {
		this.adVersion = adVersion;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
