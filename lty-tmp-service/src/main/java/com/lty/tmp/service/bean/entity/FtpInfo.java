package com.lty.tmp.service.bean.entity;

import java.io.Serializable;

public class FtpInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String ftp_ip;
	private int ftp_port;
	private String ftp_user;
	private String ftp_password;
	private String ftp_path;

	public String getFtp_ip() {
		return ftp_ip;
	}

	public void setFtp_ip(String ftp_ip) {
		this.ftp_ip = ftp_ip;
	}

	public int getFtp_port() {
		return ftp_port;
	}

	public void setFtp_port(int ftp_port) {
		this.ftp_port = ftp_port;
	}

	public String getFtp_user() {
		return ftp_user;
	}

	public void setFtp_user(String ftp_user) {
		this.ftp_user = ftp_user;
	}

	public String getFtp_password() {
		return ftp_password;
	}

	public void setFtp_password(String ftp_password) {
		this.ftp_password = ftp_password;
	}

	public String getFtp_path() {
		return ftp_path;
	}

	public void setFtp_path(String ftp_path) {
		this.ftp_path = ftp_path;
	}

}
