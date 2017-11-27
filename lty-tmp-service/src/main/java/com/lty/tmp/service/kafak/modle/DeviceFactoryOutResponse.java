package com.lty.tmp.service.kafak.modle;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lty.tmp.service.bean.entity.autocreate.DeviceFactoryOut;

public class DeviceFactoryOutResponse extends DeviceToTmpBaseModle {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	// date_of_production ULONG 出厂时间
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date date_of_production;
	// first_online ULONG 第一次联网时间
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date first_online;
	// gps_model String GPS模块型号
	private String gps_model;
	// LTE_model String LTE模块型号
	private String lte_model;

	public Date getDate_of_production() {
		return date_of_production;
	}

	public void setDate_of_production(Date date_of_production) {
		if (date_of_production != null) {
			long newTime = date_of_production.getTime() * 1000;
			this.date_of_production = new Date(newTime);
		}
	}

	public Date getFirst_online() {
		return first_online;
	}

	public void setFirst_online(Date first_online) {
		if (first_online != null && first_online.getTime() != 0) {
			long newTime = first_online.getTime() * 1000;
			this.first_online = new Date(newTime);
		}
	}

	public String getGps_model() {
		return gps_model;
	}

	public void setGps_model(String gps_model) {
		this.gps_model = gps_model;
	}

	public String getLte_model() {
		return lte_model;
	}

	public void setLte_model(String lte_model) {
		this.lte_model = lte_model;
	}

	public DeviceFactoryOut buildDeviceFactoryOut() {
		DeviceFactoryOut deviceFactoryOut = new DeviceFactoryOut();
		deviceFactoryOut.setDevSn(this.getDev_sn());
		deviceFactoryOut.setDevId(this.getDev_id());
		deviceFactoryOut.setCityCode(this.getCity_code());
		deviceFactoryOut.setCompanyCode(this.getCompany_code());
		deviceFactoryOut.setLineId(this.getLine_id());
		deviceFactoryOut.setDateOfProduction(this.date_of_production);
		deviceFactoryOut.setFirstOnline(this.first_online);
		deviceFactoryOut.setGpsModel(this.gps_model);
		deviceFactoryOut.setLteModel(this.lte_model);
		return deviceFactoryOut;
	}

}
