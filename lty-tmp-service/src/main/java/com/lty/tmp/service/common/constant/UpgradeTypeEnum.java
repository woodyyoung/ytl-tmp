package com.lty.tmp.service.common.constant;

public enum UpgradeTypeEnum {
	app("0x01应用程序版本", Integer.parseInt("01", 16)), //
	ad("0x200媒体广告文件", Integer.parseInt("200", 16)), //
	price("0x40000票价配置", Integer.parseInt("40000", 16)), //
	line_base_config("0x2000线路属性", Integer.parseInt("2000", 16)), //
	line_common_config("0x4000通用配置", Integer.parseInt("4000", 16)), //
	line_station_config("0x8000站场配置", Integer.parseInt("8000", 16)), //
	line_cardtype_config("0x20000卡类配置", Integer.parseInt("20000", 16)), //
	balck_list("0x80000黑名单版本号", Integer.parseInt("80000", 16)), //
	;
	private String desc;
	private int type;

	UpgradeTypeEnum(String desc, int type) {
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
