package com.lty.tmp.service.socket.util;

public enum EnumMsgType {
	TYPE_101("TMP后台服务端》推送总的在线设备数量給设备监控页面", 101), //
	TYPE_102("设备监控页面》选择或切换线路发送消息给TMP后台服务端", 102), //
	TYPE_103("TMP后台服务端》推送线路在线设备数量给设备监控页面", 103), //
	TYPE_105("设备监控页面》请求某设备的状态信息", 105), //
	TYPE_106("TMP后台服务端》响应请求设备软件状态信息", 106), //
	TYPE_107("TMP后台服务端》响应请求设备硬件状态信息", 107), //
	TYPE_108("TMP后台服务端》响应请求设备出厂状态信息", 108), //
	TYPE_109("设备监控页面》启用、停用设备", 109), //
	TYPE_110("TMP后台服务端》推送设备终端返回的启用、停用设备的消息", 110), //
	TYPE_111("设备监控页面》请求通知终端设备上传日志", 111), //
	TYPE_112("TMP后台服务端》推送终端设备上传日志结果", 112), //
	TYPE_104("TMP后台服务端》推送线路在线设备信息给设备监控页面", 104);//

	private String name;
	private int code;

	private EnumMsgType(String name, int code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
