package com.lty.tmp.service.bean.dto;

import java.util.List;


public class RespondListDTO<T> extends BasicRespondDTO {

    List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
