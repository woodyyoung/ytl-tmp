package com.lty.tmp.service.kafak.modle;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 设备离线 终端发送离线通知请求消息
 * 
 * @描述:
 * @作者: PXF
 * @创建时间: 2017年10月19日
 * @版本: 1.0
 */

public class DeviceOffLineRequest extends DeviceToTmpBaseModle {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date time;// 离线时间

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		if (time != null) {
			long newTime = time.getTime() * 1000;
			this.time = new Date(newTime);
		}
	}

}
