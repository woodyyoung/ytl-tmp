package com.lty.tmp.service.common.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lty.tmp.service.common.constant.Constants;

public class Result {

	@JsonProperty(Constants.ResultMsg)
	protected String resultMsg;
	@JsonProperty(Constants.ResultCode)
	protected String resultCode;

	public Result() {
		this.resultCode = Constants.ResultMsg;
		this.resultMsg = Constants.SuccessMsg;
	}

	public Result(String resultCode, String resultMsg) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}

	public Result(CommonResult commonResult) {
		this.resultCode = commonResult.getResultCode();
		this.resultMsg = commonResult.getResultMsg();
	}

	/**
	 * Title: equals
	 * 
	 * @description: 只要resultCode相等. 返回true.
	 * @see java.util.AbstractMap#equals(Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Result) {
			Result targetResult = (Result) o;
			if (this.resultCode.equals(targetResult.resultCode)) {
				return true;
			}
			return false;
		} else if (o instanceof String) {
			String resultString = (String) o;
			if (this.resultCode.equals(resultString)) {
				return true;
			}
			return false;
		}
		return false;
	}

	/**
	 * @return the resultMsg
	 */
	public String getResultMsg() {
		return resultMsg;
	}

	/**
	 * @return the resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}

	public String toString() {
		return "resultCode : " + resultCode + " == " + " resultMsg : "
				+ resultMsg;

	}

}
