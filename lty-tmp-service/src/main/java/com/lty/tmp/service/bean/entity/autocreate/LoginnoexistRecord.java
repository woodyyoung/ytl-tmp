package com.lty.tmp.service.bean.entity.autocreate;

import java.io.Serializable;
import java.util.Date;

public class LoginnoexistRecord implements Serializable {
    private Integer id;

    private String devIdMoved0;

    private Integer createUid;

    private Integer writeUid;

    private String lineIdMoved0;

    private Date createDate;

    private Date writeDate;

    private String devSn;

    private String cityCode;

    private Integer devId;

    private Integer lineId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevIdMoved0() {
        return devIdMoved0;
    }

    public void setDevIdMoved0(String devIdMoved0) {
        this.devIdMoved0 = devIdMoved0 == null ? null : devIdMoved0.trim();
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Integer getWriteUid() {
        return writeUid;
    }

    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    public String getLineIdMoved0() {
        return lineIdMoved0;
    }

    public void setLineIdMoved0(String lineIdMoved0) {
        this.lineIdMoved0 = lineIdMoved0 == null ? null : lineIdMoved0.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public String getDevSn() {
        return devSn;
    }

    public void setDevSn(String devSn) {
        this.devSn = devSn == null ? null : devSn.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }
}