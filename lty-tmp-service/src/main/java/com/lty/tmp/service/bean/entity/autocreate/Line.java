package com.lty.tmp.service.bean.entity.autocreate;

import java.io.Serializable;
import java.util.Date;

public class Line implements Serializable {
    private Integer id;

    private Boolean stationYardConfigurationSelected;

    private Integer cityId;

    private Boolean cardTypeConfigurationSelected;

    private Integer writeUid;

    private String lineAttr;

    private Date createDate;

    private Integer createUid;

    private Integer uplinkSpeedLimit;

    private Integer companyId;

    private Integer nonServiceSpeedLimit;

    private String langEnglish;

    private String langMandarin;

    private Integer lineCode;

    private Boolean generalConfigurationSelected;

    private Integer downlinkSpeedLimit;

    private Date writeDate;

    private String name;

    private String langDialect;

    private Boolean presetEventSelected;

    private Boolean linePropertiesSelected;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStationYardConfigurationSelected() {
        return stationYardConfigurationSelected;
    }

    public void setStationYardConfigurationSelected(Boolean stationYardConfigurationSelected) {
        this.stationYardConfigurationSelected = stationYardConfigurationSelected;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Boolean getCardTypeConfigurationSelected() {
        return cardTypeConfigurationSelected;
    }

    public void setCardTypeConfigurationSelected(Boolean cardTypeConfigurationSelected) {
        this.cardTypeConfigurationSelected = cardTypeConfigurationSelected;
    }

    public Integer getWriteUid() {
        return writeUid;
    }

    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    public String getLineAttr() {
        return lineAttr;
    }

    public void setLineAttr(String lineAttr) {
        this.lineAttr = lineAttr == null ? null : lineAttr.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Integer getUplinkSpeedLimit() {
        return uplinkSpeedLimit;
    }

    public void setUplinkSpeedLimit(Integer uplinkSpeedLimit) {
        this.uplinkSpeedLimit = uplinkSpeedLimit;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getNonServiceSpeedLimit() {
        return nonServiceSpeedLimit;
    }

    public void setNonServiceSpeedLimit(Integer nonServiceSpeedLimit) {
        this.nonServiceSpeedLimit = nonServiceSpeedLimit;
    }

    public String getLangEnglish() {
        return langEnglish;
    }

    public void setLangEnglish(String langEnglish) {
        this.langEnglish = langEnglish == null ? null : langEnglish.trim();
    }

    public String getLangMandarin() {
        return langMandarin;
    }

    public void setLangMandarin(String langMandarin) {
        this.langMandarin = langMandarin == null ? null : langMandarin.trim();
    }

    public Integer getLineCode() {
        return lineCode;
    }

    public void setLineCode(Integer lineCode) {
        this.lineCode = lineCode;
    }

    public Boolean getGeneralConfigurationSelected() {
        return generalConfigurationSelected;
    }

    public void setGeneralConfigurationSelected(Boolean generalConfigurationSelected) {
        this.generalConfigurationSelected = generalConfigurationSelected;
    }

    public Integer getDownlinkSpeedLimit() {
        return downlinkSpeedLimit;
    }

    public void setDownlinkSpeedLimit(Integer downlinkSpeedLimit) {
        this.downlinkSpeedLimit = downlinkSpeedLimit;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLangDialect() {
        return langDialect;
    }

    public void setLangDialect(String langDialect) {
        this.langDialect = langDialect == null ? null : langDialect.trim();
    }

    public Boolean getPresetEventSelected() {
        return presetEventSelected;
    }

    public void setPresetEventSelected(Boolean presetEventSelected) {
        this.presetEventSelected = presetEventSelected;
    }

    public Boolean getLinePropertiesSelected() {
        return linePropertiesSelected;
    }

    public void setLinePropertiesSelected(Boolean linePropertiesSelected) {
        this.linePropertiesSelected = linePropertiesSelected;
    }
}