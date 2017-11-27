package com.lty.tmp.service.bean.dto;

import java.util.List;

/**
 * Created by hx78 on 2017/7/9 0009.
 */
public class RequestListDTO<T> extends BasicRequestDTO {
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
