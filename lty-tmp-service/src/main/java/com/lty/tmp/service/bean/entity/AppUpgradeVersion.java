package com.lty.tmp.service.bean.entity;

import java.io.Serializable;
import java.util.List;

public class AppUpgradeVersion implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer companyId;
	private Integer cityId;
	private Integer tmpLineId;
	private Integer deviceType; 
	private String version;
	private String filePath;
	private List<String> deviceList;
	public Integer getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<String> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<String> deviceList) {
		this.deviceList = deviceList;
	}

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

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
