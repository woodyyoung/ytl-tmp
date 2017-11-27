package com.lty.tmp.service.bean.entity.autocreate;

import java.io.Serializable;
import java.util.Date;

public class DeviceUploadLog implements Serializable {
    private Integer id;

    private String ftpUser;

    private String devIdMoved0;

    private String companyCode;

    private String ftpPortMoved0;

    private Integer createUid;

    private String ftpPath;

    private String devRespMoved0;

    private String ftpIp;

    private String lineIdMoved0;

    private String ftpPassword;

    private Date writeDate;

    private String devSn;

    private Date createDate;

    private Integer writeUid;

    private String logTypeMoved0;

    private String cityCode;

    private Integer devId;

    private Integer devResp;

    private Integer lineId;

    private Integer ftpPort;

    private Integer logType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser == null ? null : ftpUser.trim();
    }

    public String getDevIdMoved0() {
        return devIdMoved0;
    }

    public void setDevIdMoved0(String devIdMoved0) {
        this.devIdMoved0 = devIdMoved0 == null ? null : devIdMoved0.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getFtpPortMoved0() {
        return ftpPortMoved0;
    }

    public void setFtpPortMoved0(String ftpPortMoved0) {
        this.ftpPortMoved0 = ftpPortMoved0 == null ? null : ftpPortMoved0.trim();
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public String getFtpPath() {
        return ftpPath;
    }

    public void setFtpPath(String ftpPath) {
        this.ftpPath = ftpPath == null ? null : ftpPath.trim();
    }

    public String getDevRespMoved0() {
        return devRespMoved0;
    }

    public void setDevRespMoved0(String devRespMoved0) {
        this.devRespMoved0 = devRespMoved0 == null ? null : devRespMoved0.trim();
    }

    public String getFtpIp() {
        return ftpIp;
    }

    public void setFtpIp(String ftpIp) {
        this.ftpIp = ftpIp == null ? null : ftpIp.trim();
    }

    public String getLineIdMoved0() {
        return lineIdMoved0;
    }

    public void setLineIdMoved0(String lineIdMoved0) {
        this.lineIdMoved0 = lineIdMoved0 == null ? null : lineIdMoved0.trim();
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword == null ? null : ftpPassword.trim();
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getWriteUid() {
        return writeUid;
    }

    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    public String getLogTypeMoved0() {
        return logTypeMoved0;
    }

    public void setLogTypeMoved0(String logTypeMoved0) {
        this.logTypeMoved0 = logTypeMoved0 == null ? null : logTypeMoved0.trim();
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

    public Integer getDevResp() {
        return devResp;
    }

    public void setDevResp(Integer devResp) {
        this.devResp = devResp;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(Integer ftpPort) {
        this.ftpPort = ftpPort;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }
}