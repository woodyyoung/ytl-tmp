package com.lty.tmp.service.kafak.modle;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * kafka登录应答消息体
 * 
 * @描述:
 * @作者: LiuJianJun
 * @创建时间: 2017年10月16日
 * @版本: 1.0
 */
public class LoginResponse implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	private String dev_sn;// 设备序列号

	private Integer err_code;// 登录认证结果代码

	// TBP服务器IP
	private String tbp_ip;

	// TBP服务器端口
	private Integer tbp_port;

	// 流媒体服务器ip
	private String media_ip;

	// 流媒体服务器端口
	private Integer media_port;

	// 调度服务器IP
	private String dispatch_ip;

	// 调度服务器端口
	private Integer dispatch_port;

	public String getDev_sn() {
		return dev_sn;
	}

	public void setDev_sn(String dev_sn) {
		this.dev_sn = dev_sn;
	}

	public Integer getErr_code() {
		return err_code;
	}

	public void setErr_code(Integer err_code) {
		this.err_code = err_code;
	}

	public String getTbp_ip() {
		return tbp_ip;
	}

	public void setTbp_ip(String tbp_ip) {
		this.tbp_ip = tbp_ip;
	}

	public Integer getTbp_port() {
		return tbp_port;
	}

	public void setTbp_port(Integer tbp_port) {
		this.tbp_port = tbp_port;
	}

	public String getMedia_ip() {
		return media_ip;
	}

	public void setMedia_ip(String media_ip) {
		this.media_ip = media_ip;
	}

	public Integer getMedia_port() {
		return media_port;
	}

	public void setMedia_port(Integer media_port) {
		this.media_port = media_port;
	}

	public String getDispatch_ip() {
		return dispatch_ip;
	}

	public void setDispatch_ip(String dispatch_ip) {
		this.dispatch_ip = dispatch_ip;
	}

	public Integer getDispatch_port() {
		return dispatch_port;
	}

	public void setDispatch_port(Integer dispatch_port) {
		this.dispatch_port = dispatch_port;
	}

}
