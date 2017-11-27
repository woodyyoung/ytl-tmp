package com.lty.tmp.service.kafak.modle;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * TMP 请求终端设备状态信息
 * @描述: 
 * @作者: PXF
 * @创建时间: 2017年10月23日
 * @版本: 1.0
 */

public class DeviceStatusResponse implements Serializable{
	
	@JsonIgnore
	private static final long serialVersionUID = 1L;
	
	private String dev_sn;	//设别序列号
	
	private Integer request_mask; //请求设备状态信息参数

	public String getDev_sn() {
		return dev_sn;
	}

	public void setDev_sn(String dev_sn) {
		this.dev_sn = dev_sn;
	}

	public Integer getRequest_mask() {
		return request_mask;
	}

	public void setRequest_mask(Integer request_mask) {
		this.request_mask = request_mask;
	}
	

}
