package com.lty.tmp.service.bean.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lty.tmp.service.common.constant.Constants;

public class BasicRespondDTO<T> extends DTO {
	@JsonProperty(Constants.ResultCode)
	protected String resultCode = Constants.SuccessCode;
	@JsonProperty(Constants.ResultMsg)
	protected String resultMsg = Constants.SuccessMsg;

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

}
