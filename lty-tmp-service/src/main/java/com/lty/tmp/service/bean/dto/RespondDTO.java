package com.lty.tmp.service.bean.dto;

public class RespondDTO<T> extends BasicRespondDTO {
    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
