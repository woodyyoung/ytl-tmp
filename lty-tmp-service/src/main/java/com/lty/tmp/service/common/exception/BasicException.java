package com.lty.tmp.service.common.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lty.tmp.service.common.constant.Constants;
import com.lty.tmp.service.common.message.CommonResult;

/**
 * 抛出RuntimeException事务才能生效
 */
public class BasicException extends RuntimeException {
	@JsonProperty(Constants.ResultCode)
	protected String resultCode;
	@JsonProperty(Constants.ResultMsg)
	protected String resultMsg;
	@JsonProperty(Constants.TraceId)
	protected String traceId;
	@JsonProperty(Constants.DATA)
	protected String data;

	public BasicException() {

	}

	public BasicException(CommonResult commonResult) {
		this.resultCode = commonResult.getResultCode();
		this.resultMsg = commonResult.getResultMsg();
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
