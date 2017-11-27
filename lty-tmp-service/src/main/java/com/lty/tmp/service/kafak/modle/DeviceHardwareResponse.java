package com.lty.tmp.service.kafak.modle;

import com.lty.tmp.service.bean.entity.autocreate.DeviceHardware;

public class DeviceHardwareResponse extends DeviceToTmpBaseModle {

	private static final long serialVersionUID = 1L;

	// network_signal UINT 通信信号强度(0~255)
	private Integer network_signal;
	// gps_state UINT GPS模块(0-有效，1-无效，2-不存在，3-异常)
	private Integer gps_state;
	// disk_state UINT 硬盘状态(0-存在，1-不存在，其它-故障编码(2~255))
	private Integer disk_state;
	// SD_state UINT SD卡(0-存在，1-不存在)
	private Integer sd_state;
	// EMMC_state UINT 板载EMMC状态(0-存在，1-不存在)
	private Integer emmc_state;
	// input_voltage UINT 输入电压(0~255)
	private Integer input_voltage;
	// ACC_state UINT ACC状态(0-关闭，1-开启)
	private Integer acc_state;
	// dev_temperature UINT 设备内温(0~255)
	private Integer dev_temperature;
	// fan_speed UINT 风扇转速(0~65535)
	private Integer fan_speed;
	// IC_state UINT IC卡模块状态(0-异常，1-正常)
	private Integer ic_state;
	// QRCode_state UINT 二维码模组状态(0-异常，1-正常)
	private Integer qrcode_state;
	// disaster_preparedness UINT 灾备接口(0-未使用，1正常)
	private Integer disaster_preparedness;
	// camera1_state UINT CAM1双目状态(0-未连接，1-正常)
	private Integer camera1_state;
	// camera2_state UINT CAM2双目状态(0-未连接，1-正常)
	private Integer camera2_state;

	public Integer getNetwork_signal() {
		return network_signal;
	}

	public void setNetwork_signal(Integer network_signal) {
		this.network_signal = network_signal;
	}

	public Integer getGps_state() {
		return gps_state;
	}

	public void setGps_state(Integer gps_state) {
		this.gps_state = gps_state;
	}

	public Integer getDisk_state() {
		return disk_state;
	}

	public void setDisk_state(Integer disk_state) {
		this.disk_state = disk_state;
	}

	public Integer getSd_state() {
		return sd_state;
	}

	public void setSd_state(Integer sd_state) {
		this.sd_state = sd_state;
	}

	public Integer getEmmc_state() {
		return emmc_state;
	}

	public void setEmmc_state(Integer emmc_state) {
		this.emmc_state = emmc_state;
	}

	public Integer getInput_voltage() {
		return input_voltage;
	}

	public void setInput_voltage(Integer input_voltage) {
		this.input_voltage = input_voltage;
	}

	public Integer getAcc_state() {
		return acc_state;
	}

	public void setAcc_state(Integer acc_state) {
		this.acc_state = acc_state;
	}

	public Integer getDev_temperature() {
		return dev_temperature;
	}

	public void setDev_temperature(Integer dev_temperature) {
		this.dev_temperature = dev_temperature;
	}

	public Integer getFan_speed() {
		return fan_speed;
	}

	public void setFan_speed(Integer fan_speed) {
		this.fan_speed = fan_speed;
	}

	public Integer getIc_state() {
		return ic_state;
	}

	public void setIc_state(Integer ic_state) {
		this.ic_state = ic_state;
	}

	public Integer getQrcode_state() {
		return qrcode_state;
	}

	public void setQrcode_state(Integer qrcode_state) {
		this.qrcode_state = qrcode_state;
	}

	public Integer getDisaster_preparedness() {
		return disaster_preparedness;
	}

	public void setDisaster_preparedness(Integer disaster_preparedness) {
		this.disaster_preparedness = disaster_preparedness;
	}

	public Integer getCamera1_state() {
		return camera1_state;
	}

	public void setCamera1_state(Integer camera1_state) {
		this.camera1_state = camera1_state;
	}

	public Integer getCamera2_state() {
		return camera2_state;
	}

	public void setCamera2_state(Integer camera2_state) {
		this.camera2_state = camera2_state;
	}

	public DeviceHardware buildDeviceHardware() {
		DeviceHardware deviceHardware = new DeviceHardware();
		deviceHardware.setDevSn(this.getDev_sn());
		deviceHardware.setDevId(this.getDev_id());
		deviceHardware.setCityCode(this.getCity_code());
		deviceHardware.setCompanyCode(this.getCompany_code());
		deviceHardware.setLineId(this.getLine_id());
		deviceHardware.setNetworkSignal(this.network_signal);
		deviceHardware.setGpsState(this.gps_state);
		deviceHardware.setDiskState(this.disk_state);
		deviceHardware.setSdState(this.sd_state);
		deviceHardware.setEmmcState(this.emmc_state);
		deviceHardware.setInputVoltage(this.input_voltage);
		deviceHardware.setAccState(this.acc_state);
		deviceHardware.setDevTemperature(this.dev_temperature);
		deviceHardware.setFanSpeed(this.fan_speed);
		deviceHardware.setIcState(this.ic_state);
		deviceHardware.setQrcodeState(this.qrcode_state);
		deviceHardware.setDisasterPreparedness(this.disaster_preparedness);
		deviceHardware.setCamera1State(this.camera1_state);
		deviceHardware.setCamera2State(this.camera2_state);
		return deviceHardware;

	}

}
