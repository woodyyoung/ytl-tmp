package com.lty.tmp.service.common.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lty.tmp.service.common.constant.Constants;

/**
 * XXX XXX XXX 项目 业务 错误码
 */
public enum CommonResult {
	// 系统相关
	UNKNOWN_SYSTEM_ERROR("001000001", "未知系统错误"), JSON_INVALID("001000002",
			"json数据格式错误"), PARAMETER_ERROR("001000003", "无效或者错误的参数类型"), REQUEST_OFTEN(
			"001000004", "请求过于频繁"), PARAMETER_MISSING("001000005", "缺少必要的参数"), REQUEST_OUT_SIZE(
			"001000006", "请求体过大"), REDIRECT_URL("001000007", "发生重定向"), NOT_SUPPORT_FORMAT(
			"001000008", "不支持的数据格式"), DUPLICATE_RECORD("001000009", "重复的记录"),

	// 账号相关
	ACCOUNT_NOT_EXIST("001001001", "用户不存在"), WRONG_ACCOUNT_PWD("001001002",
			"账号或密码不正确"), ACCOUNT_REGISTERED("001001003", "用户已注册"), INVALID_MOBILE(
			"001001004", "手机号码不合法"), INVALID_EMAIL("001001005", "邮箱不合法"), PWD_MUST_32BIT(
			"001001006", "密码长度必须为32位字符串"), INVALID_CODE("001001007", "验证码不正确");

	@JsonProperty(Constants.ResultCode)
	protected String resultCode;

	@JsonProperty(Constants.ResultMsg)
	protected String resultMsg;

	CommonResult(String resultCode, String resultMsg) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}

	public String getResultCode() {
		return resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

}
