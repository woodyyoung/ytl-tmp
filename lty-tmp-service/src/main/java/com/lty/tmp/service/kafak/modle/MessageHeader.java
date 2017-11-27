package com.lty.tmp.service.kafak.modle;

import java.io.Serializable;

/**
 * kafka消息头
 * 
 * @描述:
 * @作者: LiuJianJun
 * @创建时间: 2017年10月16日
 * @版本: 1.0
 */
public class MessageHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer msg_sn;// 报文序列号a UINT32_T 32位无符号整型，4字节

	public Integer getMsg_sn() {
		return msg_sn;
	}

	public void setMsg_sn(Integer msg_sn) {
		this.msg_sn = msg_sn;
	}

	public Integer getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(Integer msg_id) {
		this.msg_id = msg_id;
	}

	private Integer msg_id;// 业务数据类型【指令】 32位无符号整型，4字节

}
