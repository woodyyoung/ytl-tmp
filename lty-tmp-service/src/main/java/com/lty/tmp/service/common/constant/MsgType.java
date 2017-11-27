package com.lty.tmp.service.common.constant;

public enum MsgType {

	login_request("设备登录请求(msg_id=0x104)", Integer.parseInt("104", 16)), //
	login_response("设备登录应答(msg_id=0x200)", Integer.parseInt("200", 16)), //
	device_offline("设备离线通知(msg_id=0x105)", Integer.parseInt("105", 16)), //
	device_upgrade_notice("通知设备升级(msg_id=0x201)", Integer.parseInt("201", 16)), //
	device_upgrade_response("设备升级应答(msg_id=0x106)", Integer.parseInt("106", 16)), //
	device_open_or_close_request("请求停用/启用设备(msg_id=0x202)", Integer.parseInt("202", 16)), //
	device_open_or_close_response("停用/启用设备应答(msg_id=0x107)", Integer.parseInt("107", 16)), //
	upload_device_log_request("请求终端上传日志/记录(msg_id=0x205)", Integer.parseInt("205", 16)), //
	upload_device_log_response("请求终端上传日志/记录应答(msg_id=0x109)", Integer.parseInt("109", 16)), //
	request_device_status_info("请求终端状态信息(msg_id=0x206)", Integer.parseInt("206", 16)), //

	device_upload_handware_info("设备上传硬件状态信息(msg_id=0x10A)", Integer.parseInt("10A", 16)), //
	device_upload_software_info("设备上传软件版本信息(msg_id=0x10B)", Integer.parseInt("10B", 16)), //
	device_upload_factoryout_info("设备上传出厂信息(msg_id=0x10C)", Integer.parseInt("10C", 16)), //

	;

	private String desc;
	private int type;

	MsgType(String desc, int type) {
		this.desc = desc;
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
