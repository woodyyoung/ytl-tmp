package com.lty.tmp.service.socket.util;

import java.io.Serializable;

public class WsRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private int msg_type;
	private Params params;

	public int getMsg_type() {
		return msg_type;
	}

	public WsRequest setMsg_type(int msg_type) {
		this.msg_type = msg_type;
		return this;
	}

	public Params getParams() {
		return params;
	}

	public WsRequest setParams(Params params) {
		this.params = params;
		return this;
	}

	public WsRequest setLineCode(int line_code) {
		if (this.params == null) {
			this.params = new Params();
		}
		this.params.setLine_code(line_code);
		return this;
	}

	public WsRequest setDeviceSn(String device_sn) {
		if (this.params == null) {
			this.params = new Params();
		}
		this.params.setDevice_sn(device_sn);
		return this;
	}

	public WsRequest setActive_flag(int active_flag) {
		if (this.params == null) {
			this.params = new Params();
		}
		this.params.setActive_flag(active_flag);
		return this;
	}

	public WsRequest setLog_type(int log_type) {
		if (this.params == null) {
			this.params = new Params();
		}
		this.params.setLog_type(log_type);
		return this;
	}

	public class Params implements Serializable {

		private static final long serialVersionUID = 1L;

		private int line_code;
		private String device_sn;
		private int active_flag;
		private int log_type;
		private Integer request_mask; //请求设备状态信息参数

		public Integer getRequest_mask() {
			return request_mask;
		}

		public void setRequest_mask(Integer request_mask) {
			this.request_mask = request_mask;
		}

		public int getLine_code() {
			return line_code;
		}

		public void setLine_code(int line_code) {
			this.line_code = line_code;
		}

		public String getDevice_sn() {
			return device_sn;
		}

		public void setDevice_sn(String device_sn) {
			this.device_sn = device_sn;
		}

		public int getActive_flag() {
			return active_flag;
		}

		public void setActive_flag(int active_flag) {
			this.active_flag = active_flag;
		}

		public int getLog_type() {
			return log_type;
		}

		public void setLog_type(int log_type) {
			this.log_type = log_type;
		}

	}

}
