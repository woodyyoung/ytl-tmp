package com.lty.tmp.service.bean.entity.autocreate;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable {
    private Integer id;

    private String name;

    private Integer partnerId;

    private Integer currencyId;

    private String rmlFooter;

    private Date createDate;

    private String rmlHeader;

    private Integer sequence;

    private String rmlPaperFormat;

    private Integer writeUid;

    private Integer font;

    private String accountNo;

    private Integer parentId;

    private String email;

    private Integer createUid;

    private Boolean customFooter;

    private String phone;

    private String rmlHeader2;

    private String rmlHeader3;

    private Date writeDate;

    private String rmlHeader1;

    private String companyRegistry;

    private String companyCode;

    private Integer cityId;

    private Integer tbpPort;

    private String tbpProtocol;

    private Integer dispatchSendDelay;

    private String dispatchIpAddress;

    private Integer videoPort;

    private String videoProtocol;

    private Integer dispatchPort;

    private String dispatchProtocol;

    private String videoIpAddress;

    private String tbpIpAddress;

    private Integer videoSendDelay;

    private Integer tbpSendDelay;

    private Integer versionId;

    private byte[] logoWeb;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getRmlFooter() {
        return rmlFooter;
    }

    public void setRmlFooter(String rmlFooter) {
        this.rmlFooter = rmlFooter == null ? null : rmlFooter.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRmlHeader() {
        return rmlHeader;
    }

    public void setRmlHeader(String rmlHeader) {
        this.rmlHeader = rmlHeader == null ? null : rmlHeader.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getRmlPaperFormat() {
        return rmlPaperFormat;
    }

    public void setRmlPaperFormat(String rmlPaperFormat) {
        this.rmlPaperFormat = rmlPaperFormat == null ? null : rmlPaperFormat.trim();
    }

    public Integer getWriteUid() {
        return writeUid;
    }

    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    public Integer getFont() {
        return font;
    }

    public void setFont(Integer font) {
        this.font = font;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Boolean getCustomFooter() {
        return customFooter;
    }

    public void setCustomFooter(Boolean customFooter) {
        this.customFooter = customFooter;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRmlHeader2() {
        return rmlHeader2;
    }

    public void setRmlHeader2(String rmlHeader2) {
        this.rmlHeader2 = rmlHeader2 == null ? null : rmlHeader2.trim();
    }

    public String getRmlHeader3() {
        return rmlHeader3;
    }

    public void setRmlHeader3(String rmlHeader3) {
        this.rmlHeader3 = rmlHeader3 == null ? null : rmlHeader3.trim();
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public String getRmlHeader1() {
        return rmlHeader1;
    }

    public void setRmlHeader1(String rmlHeader1) {
        this.rmlHeader1 = rmlHeader1 == null ? null : rmlHeader1.trim();
    }

    public String getCompanyRegistry() {
        return companyRegistry;
    }

    public void setCompanyRegistry(String companyRegistry) {
        this.companyRegistry = companyRegistry == null ? null : companyRegistry.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getTbpPort() {
        return tbpPort;
    }

    public void setTbpPort(Integer tbpPort) {
        this.tbpPort = tbpPort;
    }

    public String getTbpProtocol() {
        return tbpProtocol;
    }

    public void setTbpProtocol(String tbpProtocol) {
        this.tbpProtocol = tbpProtocol == null ? null : tbpProtocol.trim();
    }

    public Integer getDispatchSendDelay() {
        return dispatchSendDelay;
    }

    public void setDispatchSendDelay(Integer dispatchSendDelay) {
        this.dispatchSendDelay = dispatchSendDelay;
    }

    public String getDispatchIpAddress() {
        return dispatchIpAddress;
    }

    public void setDispatchIpAddress(String dispatchIpAddress) {
        this.dispatchIpAddress = dispatchIpAddress == null ? null : dispatchIpAddress.trim();
    }

    public Integer getVideoPort() {
        return videoPort;
    }

    public void setVideoPort(Integer videoPort) {
        this.videoPort = videoPort;
    }

    public String getVideoProtocol() {
        return videoProtocol;
    }

    public void setVideoProtocol(String videoProtocol) {
        this.videoProtocol = videoProtocol == null ? null : videoProtocol.trim();
    }

    public Integer getDispatchPort() {
        return dispatchPort;
    }

    public void setDispatchPort(Integer dispatchPort) {
        this.dispatchPort = dispatchPort;
    }

    public String getDispatchProtocol() {
        return dispatchProtocol;
    }

    public void setDispatchProtocol(String dispatchProtocol) {
        this.dispatchProtocol = dispatchProtocol == null ? null : dispatchProtocol.trim();
    }

    public String getVideoIpAddress() {
        return videoIpAddress;
    }

    public void setVideoIpAddress(String videoIpAddress) {
        this.videoIpAddress = videoIpAddress == null ? null : videoIpAddress.trim();
    }

    public String getTbpIpAddress() {
        return tbpIpAddress;
    }

    public void setTbpIpAddress(String tbpIpAddress) {
        this.tbpIpAddress = tbpIpAddress == null ? null : tbpIpAddress.trim();
    }

    public Integer getVideoSendDelay() {
        return videoSendDelay;
    }

    public void setVideoSendDelay(Integer videoSendDelay) {
        this.videoSendDelay = videoSendDelay;
    }

    public Integer getTbpSendDelay() {
        return tbpSendDelay;
    }

    public void setTbpSendDelay(Integer tbpSendDelay) {
        this.tbpSendDelay = tbpSendDelay;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public byte[] getLogoWeb() {
        return logoWeb;
    }

    public void setLogoWeb(byte[] logoWeb) {
        this.logoWeb = logoWeb;
    }
}