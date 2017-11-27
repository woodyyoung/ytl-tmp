package com.lty.tmp.service.kafak.modle;

import com.lty.tmp.service.bean.entity.autocreate.DeviceSoftware;

public class DeviceSoftwareResponse extends DeviceToTmpBaseModle {
	private static final long serialVersionUID = 1L;

	// app_version String 应用程序版本
	private String app_version;
	// fs_version String 根文件系统版本
	private String fs_version;
	// mcu_version String MCU程序版本
	private String mcu_version;
	// sr_version String 系统资源版本
	private String sr_version;
	// kernel_version String 内核版本
	private String kernel_version;
	// boot_version String 引导程序版本
	private String boot_version;
	// keyboard_version String 键盘程序版本
	private String keyboard_version;
	// camera1_version String CAM双目1版本
	private String camera1_params;
	// camera2_version String CAM双目2版本
	private String camera2_params;
	// line_attributes String 线路属性
	private String line_attributes;
	// common_config String 通用配置
	private String common_config;
	// station_config String 站场配置
	private String station_config;
	// default_events String 预设事件
	private String default_events;
	// cardType_config String 卡类配置
	private String cardtype_config;
	// fare_config String 票价配置
	private String fare_config;
	// media_version String 媒体文件版本
	private String media_version;
	// gps_version String GPS升级程序
	private String gps_version;
	// communication_version String 通讯模块升级程序
	private String communication_version;
	// IC_param_version String 刷卡参数文件
	private String ic_param_version;

	// black_list String 黑名单版本号
	private String black_list;
	// white_list String 白名单版本号
	private String white_list;

	// double_cam_version
	private String double_cam_version;

	public String getCardtype_config() {
		return cardtype_config;
	}

	public void setCardtype_config(String cardtype_config) {
		this.cardtype_config = cardtype_config;
	}

	public String getBlack_list() {
		return black_list;
	}

	public void setBlack_list(String black_list) {
		this.black_list = black_list;
	}

	public String getWhite_list() {
		return white_list;
	}

	public void setWhite_list(String white_list) {
		this.white_list = white_list;
	}

	public String getApp_version() {
		return app_version;
	}

	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}

	public String getFs_version() {
		return fs_version;
	}

	public void setFs_version(String fs_version) {
		this.fs_version = fs_version;
	}

	public String getMcu_version() {
		return mcu_version;
	}

	public void setMcu_version(String mcu_version) {
		this.mcu_version = mcu_version;
	}

	public String getSr_version() {
		return sr_version;
	}

	public void setSr_version(String sr_version) {
		this.sr_version = sr_version;
	}

	public String getKernel_version() {
		return kernel_version;
	}

	public void setKernel_version(String kernel_version) {
		this.kernel_version = kernel_version;
	}

	public String getBoot_version() {
		return boot_version;
	}

	public void setBoot_version(String boot_version) {
		this.boot_version = boot_version;
	}

	public String getKeyboard_version() {
		return keyboard_version;
	}

	public void setKeyboard_version(String keyboard_version) {
		this.keyboard_version = keyboard_version;
	}

	public String getCamera1_params() {
		return camera1_params;
	}

	public void setCamera1_params(String camera1_params) {
		this.camera1_params = camera1_params;
	}

	public String getCamera2_params() {
		return camera2_params;
	}

	public void setCamera2_params(String camera2_params) {
		this.camera2_params = camera2_params;
	}

	public String getDouble_cam_version() {
		return double_cam_version;
	}

	public void setDouble_cam_version(String double_cam_version) {
		this.double_cam_version = double_cam_version;
	}

	public String getLine_attributes() {
		return line_attributes;
	}

	public void setLine_attributes(String line_attributes) {
		this.line_attributes = line_attributes;
	}

	public String getCommon_config() {
		return common_config;
	}

	public void setCommon_config(String common_config) {
		this.common_config = common_config;
	}

	public String getStation_config() {
		return station_config;
	}

	public void setStation_config(String station_config) {
		this.station_config = station_config;
	}

	public String getDefault_events() {
		return default_events;
	}

	public void setDefault_events(String default_events) {
		this.default_events = default_events;
	}

	public String getFare_config() {
		return fare_config;
	}

	public void setFare_config(String fare_config) {
		this.fare_config = fare_config;
	}

	public String getMedia_version() {
		return media_version;
	}

	public void setMedia_version(String media_version) {
		this.media_version = media_version;
	}

	public String getGps_version() {
		return gps_version;
	}

	public void setGps_version(String gps_version) {
		this.gps_version = gps_version;
	}

	public String getCommunication_version() {
		return communication_version;
	}

	public void setCommunication_version(String communication_version) {
		this.communication_version = communication_version;
	}

	public String getIc_param_version() {
		return ic_param_version;
	}

	public void setIc_param_version(String ic_param_version) {
		this.ic_param_version = ic_param_version;
	}

	public DeviceSoftware buildDeviceSoftware() {
		DeviceSoftware software = new DeviceSoftware();
		software.setDevSn(this.getDev_sn());
		software.setDevId(this.getDev_id());
		software.setCityCode(this.getCity_code());
		software.setCompanyCode(this.getCompany_code());
		software.setLineId(this.getLine_id());
		software.setAppVersion(this.app_version);
		software.setFsVersion(this.fs_version);
		software.setMcuVersion(this.mcu_version);
		software.setSrVersion(this.sr_version);
		software.setKernelVersion(this.kernel_version);
		software.setBootVersion(this.boot_version);
		software.setKeyboardVersion(this.keyboard_version);
		software.setCamera1Params(this.camera1_params);
		software.setCamera2Params(this.camera2_params);
		software.setLineAttributes(this.line_attributes);
		software.setCommonConfig(this.common_config);
		software.setStationConfig(this.station_config);
		software.setDefaultEvents(this.default_events);
		software.setCardtypeConfig(this.cardtype_config);
		software.setFareConfig(this.fare_config);
		software.setMediaVersion(this.media_version);
		software.setGpsVersion(this.gps_version);
		software.setCommunicationVersion(this.communication_version);
		software.setIcParamVersion(this.ic_param_version);
		software.setBlackList(this.black_list);
		software.setWhiteList(this.white_list);
		software.setDoubleCamVersion(this.double_cam_version);

		return software;

	}

}
