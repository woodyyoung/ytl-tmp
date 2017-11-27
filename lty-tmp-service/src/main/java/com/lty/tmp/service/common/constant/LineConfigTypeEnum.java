package com.lty.tmp.service.common.constant;

public enum LineConfigTypeEnum {
	LINE_BASE_CONFIG("线路基本属性配置","001"),//
	LINE_COMMON_CONFIG("线路通用属性配置","002"),//
	LINE_STATION_YARD_CONFIG("线路站场配置","003"),//
	LINE_PRE_EVENT_CONFIG("预设事件配置","004"),//
	LINE_CARD_CONFIG("卡类配置","005"),//
	LINE_PRICE_CONFIG("线路票价配置","006");//
	private String name;
	private String code;
	LineConfigTypeEnum(String name,String code){
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
