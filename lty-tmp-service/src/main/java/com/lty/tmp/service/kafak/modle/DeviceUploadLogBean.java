package com.lty.tmp.service.kafak.modle;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceUploadLogBean extends DeviceToTmpBaseModle {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	private String ftp_user;

	private String ftp_path;

	private String ftp_ip;

	private String ftp_password;

	private Integer dev_resp;

	private Integer ftp_port;

	private Integer log_type;

	public String getFtp_user() {
		return ftp_user;
	}

	public void setFtp_user(String ftp_user) {
		this.ftp_user = ftp_user;
	}

	public String getFtp_path() {
		return ftp_path;
	}

	public void setFtp_path(String ftp_path) {
		this.ftp_path = ftp_path;
	}

	public String getFtp_ip() {
		return ftp_ip;
	}

	public void setFtp_ip(String ftp_ip) {
		this.ftp_ip = ftp_ip;
	}

	public String getFtp_password() {
		return ftp_password;
	}

	public void setFtp_password(String ftp_password) {
		this.ftp_password = ftp_password;
	}

	public Integer getDev_resp() {
		return dev_resp;
	}

	public void setDev_resp(Integer dev_resp) {
		this.dev_resp = dev_resp;
	}

	public Integer getFtp_port() {
		return ftp_port;
	}

	public void setFtp_port(Integer ftp_port) {
		this.ftp_port = ftp_port;
	}

	public Integer getLog_type() {
		return log_type;
	}

	public void setLog_type(Integer log_type) {
		this.log_type = log_type;
	}

}
