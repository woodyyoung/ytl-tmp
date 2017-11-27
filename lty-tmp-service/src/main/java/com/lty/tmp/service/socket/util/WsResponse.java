package com.lty.tmp.service.socket.util;

import java.io.Serializable;

public class WsResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private int msg_type;

	private Result result;

	public int getMsg_type() {
		return msg_type;
	}

	public WsResponse setMsg_type(int msg_type) {
		this.msg_type = msg_type;
		return this;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public WsResponse setlineCode(int line_code) {
		if (this.result == null) {
			this.result = new Result();
		}

		this.result.setLine_code(line_code);
		return this;
	}

	public WsResponse setCompanyCode(String company_code) {
		if (this.result == null) {
			this.result = new Result();
		}

		this.result.setCompany_code(company_code);
		return this;
	}

	public WsResponse setCompnay_online_num(long online_num) {
		if (this.result == null) {
			this.result = new Result();
		}

		this.result.setCompnay_online_num(online_num);
		return this;
	}

	public WsResponse setLine_online_num(long online_num) {
		if (this.result == null) {
			this.result = new Result();
		}

		this.result.setLine_online_num(online_num);
		return this;
	}

	public WsResponse setDeviceSn(String device_sn) {
		if (this.result == null) {
			this.result = new Result();
		}
		this.result.setDevice_sn(device_sn);
		return this;
	}

	public WsResponse setData(Object data) {
		if (this.result == null) {
			this.result = new Result();
		}

		this.result.setData(data);
		return this;
	}

	public WsResponse setDeviceResult(int dev_resp) {
		if (this.result == null) {
			this.result = new Result();
		}
		this.result.setDev_resp(dev_resp);
		return this;
	}

	public class Result implements Serializable {

		private static final long serialVersionUID = 1L;

		private Integer line_code;

		private String company_code;

		private String device_sn;

		private Long compnay_online_num;

		private Long line_online_num;

		private Integer dev_resp;

		private Object data;

		public String getCompany_code() {
			return company_code;
		}

		public void setCompany_code(String company_code) {
			this.company_code = company_code;
		}

		public String getDevice_sn() {
			return device_sn;
		}

		public void setDevice_sn(String device_sn) {
			this.device_sn = device_sn;
		}

		public Integer getLine_code() {
			return line_code;
		}

		public void setLine_code(Integer line_code) {
			this.line_code = line_code;
		}

		public Long getCompnay_online_num() {
			return compnay_online_num;
		}

		public void setCompnay_online_num(Long compnay_online_num) {
			this.compnay_online_num = compnay_online_num;
		}

		public Long getLine_online_num() {
			return line_online_num;
		}

		public void setLine_online_num(Long line_online_num) {
			this.line_online_num = line_online_num;
		}

		public Integer getDev_resp() {
			return dev_resp;
		}

		public void setDev_resp(Integer dev_resp) {
			this.dev_resp = dev_resp;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

	}

	public static class DeviceOnlineStatus implements Serializable {
		private static final long serialVersionUID = 1L;
		private String device_sn;
		private int status;// "status" 0-掉线 1-在线

		public String getDevice_sn() {
			return device_sn;
		}

		public void setDevice_sn(String device_sn) {
			this.device_sn = device_sn;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

	}

}
