package com.lty.tmp.service.bean.dto;

public class RequestDTO<T> extends BasicRequestDTO {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
