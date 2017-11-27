package com.lty.tmp.service.bean.entity.autocreate;

import java.io.Serializable;
import java.util.Date;

public class DeviceHardware implements Serializable {
    private Integer id;

    private Integer devId;

    private String companyCode;

    private Date createDate;

    private Integer emmcState;

    private Integer writeUid;

    private Integer accState;

    private Integer createUid;

    private Integer qrcodeState;

    private Integer networkSignal;

    private Integer icState;

    private Integer camera1State;

    private String cityCode;

    private Integer devTemperature;

    private Integer gpsState;

    private Integer lineId;

    private Integer camera2State;

    private Integer diskState;

    private Date writeDate;

    private String devSn;

    private Integer sdState;

    private Integer fanSpeed;

    private Integer disasterPreparedness;

    private Integer inputVoltage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getEmmcState() {
        return emmcState;
    }

    public void setEmmcState(Integer emmcState) {
        this.emmcState = emmcState;
    }

    public Integer getWriteUid() {
        return writeUid;
    }

    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    public Integer getAccState() {
        return accState;
    }

    public void setAccState(Integer accState) {
        this.accState = accState;
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Integer getQrcodeState() {
        return qrcodeState;
    }

    public void setQrcodeState(Integer qrcodeState) {
        this.qrcodeState = qrcodeState;
    }

    public Integer getNetworkSignal() {
        return networkSignal;
    }

    public void setNetworkSignal(Integer networkSignal) {
        this.networkSignal = networkSignal;
    }

    public Integer getIcState() {
        return icState;
    }

    public void setIcState(Integer icState) {
        this.icState = icState;
    }

    public Integer getCamera1State() {
        return camera1State;
    }

    public void setCamera1State(Integer camera1State) {
        this.camera1State = camera1State;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Integer getDevTemperature() {
        return devTemperature;
    }

    public void setDevTemperature(Integer devTemperature) {
        this.devTemperature = devTemperature;
    }

    public Integer getGpsState() {
        return gpsState;
    }

    public void setGpsState(Integer gpsState) {
        this.gpsState = gpsState;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getCamera2State() {
        return camera2State;
    }

    public void setCamera2State(Integer camera2State) {
        this.camera2State = camera2State;
    }

    public Integer getDiskState() {
        return diskState;
    }

    public void setDiskState(Integer diskState) {
        this.diskState = diskState;
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

    public Integer getSdState() {
        return sdState;
    }

    public void setSdState(Integer sdState) {
        this.sdState = sdState;
    }

    public Integer getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(Integer fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public Integer getDisasterPreparedness() {
        return disasterPreparedness;
    }

    public void setDisasterPreparedness(Integer disasterPreparedness) {
        this.disasterPreparedness = disasterPreparedness;
    }

    public Integer getInputVoltage() {
        return inputVoltage;
    }

    public void setInputVoltage(Integer inputVoltage) {
        this.inputVoltage = inputVoltage;
    }
}