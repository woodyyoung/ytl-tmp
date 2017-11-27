package com.lty.tmp.service.kafak.modle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.lty.tmp.service.bean.entity.FtpInfo;

public class DeviceUpgradeNotice extends FtpInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String dev_sn;

	private List<UpgradeContent> upgrade_list;

	private int upgrade_counts;

	public String getDev_sn() {
		return dev_sn;
	}

	public void setDev_sn(String dev_sn) {
		this.dev_sn = dev_sn;
	}

	public List<UpgradeContent> getUpgrade_list() {
		return upgrade_list;
	}

	public void setUpgrade_list(List<UpgradeContent> upgrade_list) {
		this.upgrade_list = upgrade_list;
	}

	public int getUpgrade_counts() {
		return upgrade_counts;
	}

	public void setUpgrade_counts(int upgrade_counts) {
		this.upgrade_counts = upgrade_counts;
	}

	public void addUpgradContent(int upgrade_type, String ftp_path) {
		if (this.upgrade_list == null) {
			this.upgrade_list = new ArrayList<DeviceUpgradeNotice.UpgradeContent>();
		}
		UpgradeContent upgradeContent = new UpgradeContent();
		upgradeContent.setFtp_path(ftp_path);
		upgradeContent.setUpgrade_type(upgrade_type);
		this.upgrade_list.add(upgradeContent);
	}

	public void setFtpInfo(FtpInfo ftpInfo) {
		this.setFtp_ip(ftpInfo.getFtp_ip());
		this.setFtp_port(ftpInfo.getFtp_port());
		this.setFtp_path(ftpInfo.getFtp_path());
		this.setFtp_user(ftpInfo.getFtp_user());
		this.setFtp_password(ftpInfo.getFtp_password());
	}

	public static class UpgradeContent implements Serializable {

		private static final long serialVersionUID = 1L;

		private int upgrade_type;
		private String ftp_path;

		public int getUpgrade_type() {
			return upgrade_type;
		}

		public void setUpgrade_type(int upgrade_type) {
			this.upgrade_type = upgrade_type;
		}

		public String getFtp_path() {
			return ftp_path;
		}

		public void setFtp_path(String ftp_path) {
			this.ftp_path = ftp_path;
		}

	}

}
