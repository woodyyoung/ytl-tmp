package com.lty.tmp.service.kafak.modle;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * kafka消费消息bean
 * 
 * @描述:
 * @作者: LiuJianJun
 * @创建时间: 2017年10月16日
 * @版本: 1.0
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Message<T> implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("header")
	private MessageHeader header;//消息头
	
	@JsonProperty("body")
	private T body;//消息体
	
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	public MessageHeader getHeader() {
		return header;
	}
	public void setHeader(MessageHeader header) {
		this.header = header;
	}
	 
	
}
