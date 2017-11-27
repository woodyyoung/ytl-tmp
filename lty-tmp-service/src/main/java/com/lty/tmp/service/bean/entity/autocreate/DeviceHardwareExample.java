package com.lty.tmp.service.bean.entity.autocreate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceHardwareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceHardwareExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDevIdIsNull() {
            addCriterion("dev_id is null");
            return (Criteria) this;
        }

        public Criteria andDevIdIsNotNull() {
            addCriterion("dev_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevIdEqualTo(Integer value) {
            addCriterion("dev_id =", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotEqualTo(Integer value) {
            addCriterion("dev_id <>", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdGreaterThan(Integer value) {
            addCriterion("dev_id >", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_id >=", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLessThan(Integer value) {
            addCriterion("dev_id <", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLessThanOrEqualTo(Integer value) {
            addCriterion("dev_id <=", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdIn(List<Integer> values) {
            addCriterion("dev_id in", values, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotIn(List<Integer> values) {
            addCriterion("dev_id not in", values, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdBetween(Integer value1, Integer value2) {
            addCriterion("dev_id between", value1, value2, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_id not between", value1, value2, "devId");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andEmmcStateIsNull() {
            addCriterion("emmc_state is null");
            return (Criteria) this;
        }

        public Criteria andEmmcStateIsNotNull() {
            addCriterion("emmc_state is not null");
            return (Criteria) this;
        }

        public Criteria andEmmcStateEqualTo(Integer value) {
            addCriterion("emmc_state =", value, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateNotEqualTo(Integer value) {
            addCriterion("emmc_state <>", value, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateGreaterThan(Integer value) {
            addCriterion("emmc_state >", value, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("emmc_state >=", value, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateLessThan(Integer value) {
            addCriterion("emmc_state <", value, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateLessThanOrEqualTo(Integer value) {
            addCriterion("emmc_state <=", value, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateIn(List<Integer> values) {
            addCriterion("emmc_state in", values, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateNotIn(List<Integer> values) {
            addCriterion("emmc_state not in", values, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateBetween(Integer value1, Integer value2) {
            addCriterion("emmc_state between", value1, value2, "emmcState");
            return (Criteria) this;
        }

        public Criteria andEmmcStateNotBetween(Integer value1, Integer value2) {
            addCriterion("emmc_state not between", value1, value2, "emmcState");
            return (Criteria) this;
        }

        public Criteria andWriteUidIsNull() {
            addCriterion("write_uid is null");
            return (Criteria) this;
        }

        public Criteria andWriteUidIsNotNull() {
            addCriterion("write_uid is not null");
            return (Criteria) this;
        }

        public Criteria andWriteUidEqualTo(Integer value) {
            addCriterion("write_uid =", value, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidNotEqualTo(Integer value) {
            addCriterion("write_uid <>", value, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidGreaterThan(Integer value) {
            addCriterion("write_uid >", value, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("write_uid >=", value, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidLessThan(Integer value) {
            addCriterion("write_uid <", value, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidLessThanOrEqualTo(Integer value) {
            addCriterion("write_uid <=", value, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidIn(List<Integer> values) {
            addCriterion("write_uid in", values, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidNotIn(List<Integer> values) {
            addCriterion("write_uid not in", values, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidBetween(Integer value1, Integer value2) {
            addCriterion("write_uid between", value1, value2, "writeUid");
            return (Criteria) this;
        }

        public Criteria andWriteUidNotBetween(Integer value1, Integer value2) {
            addCriterion("write_uid not between", value1, value2, "writeUid");
            return (Criteria) this;
        }

        public Criteria andAccStateIsNull() {
            addCriterion("acc_state is null");
            return (Criteria) this;
        }

        public Criteria andAccStateIsNotNull() {
            addCriterion("acc_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccStateEqualTo(Integer value) {
            addCriterion("acc_state =", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateNotEqualTo(Integer value) {
            addCriterion("acc_state <>", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateGreaterThan(Integer value) {
            addCriterion("acc_state >", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("acc_state >=", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateLessThan(Integer value) {
            addCriterion("acc_state <", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateLessThanOrEqualTo(Integer value) {
            addCriterion("acc_state <=", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateIn(List<Integer> values) {
            addCriterion("acc_state in", values, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateNotIn(List<Integer> values) {
            addCriterion("acc_state not in", values, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateBetween(Integer value1, Integer value2) {
            addCriterion("acc_state between", value1, value2, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateNotBetween(Integer value1, Integer value2) {
            addCriterion("acc_state not between", value1, value2, "accState");
            return (Criteria) this;
        }

        public Criteria andCreateUidIsNull() {
            addCriterion("create_uid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUidIsNotNull() {
            addCriterion("create_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUidEqualTo(Integer value) {
            addCriterion("create_uid =", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotEqualTo(Integer value) {
            addCriterion("create_uid <>", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidGreaterThan(Integer value) {
            addCriterion("create_uid >", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_uid >=", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidLessThan(Integer value) {
            addCriterion("create_uid <", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidLessThanOrEqualTo(Integer value) {
            addCriterion("create_uid <=", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidIn(List<Integer> values) {
            addCriterion("create_uid in", values, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotIn(List<Integer> values) {
            addCriterion("create_uid not in", values, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidBetween(Integer value1, Integer value2) {
            addCriterion("create_uid between", value1, value2, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotBetween(Integer value1, Integer value2) {
            addCriterion("create_uid not between", value1, value2, "createUid");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateIsNull() {
            addCriterion("qrcode_state is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateIsNotNull() {
            addCriterion("qrcode_state is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateEqualTo(Integer value) {
            addCriterion("qrcode_state =", value, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateNotEqualTo(Integer value) {
            addCriterion("qrcode_state <>", value, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateGreaterThan(Integer value) {
            addCriterion("qrcode_state >", value, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("qrcode_state >=", value, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateLessThan(Integer value) {
            addCriterion("qrcode_state <", value, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateLessThanOrEqualTo(Integer value) {
            addCriterion("qrcode_state <=", value, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateIn(List<Integer> values) {
            addCriterion("qrcode_state in", values, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateNotIn(List<Integer> values) {
            addCriterion("qrcode_state not in", values, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateBetween(Integer value1, Integer value2) {
            addCriterion("qrcode_state between", value1, value2, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andQrcodeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("qrcode_state not between", value1, value2, "qrcodeState");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalIsNull() {
            addCriterion("network_signal is null");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalIsNotNull() {
            addCriterion("network_signal is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalEqualTo(Integer value) {
            addCriterion("network_signal =", value, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalNotEqualTo(Integer value) {
            addCriterion("network_signal <>", value, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalGreaterThan(Integer value) {
            addCriterion("network_signal >", value, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalGreaterThanOrEqualTo(Integer value) {
            addCriterion("network_signal >=", value, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalLessThan(Integer value) {
            addCriterion("network_signal <", value, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalLessThanOrEqualTo(Integer value) {
            addCriterion("network_signal <=", value, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalIn(List<Integer> values) {
            addCriterion("network_signal in", values, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalNotIn(List<Integer> values) {
            addCriterion("network_signal not in", values, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalBetween(Integer value1, Integer value2) {
            addCriterion("network_signal between", value1, value2, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andNetworkSignalNotBetween(Integer value1, Integer value2) {
            addCriterion("network_signal not between", value1, value2, "networkSignal");
            return (Criteria) this;
        }

        public Criteria andIcStateIsNull() {
            addCriterion("ic_state is null");
            return (Criteria) this;
        }

        public Criteria andIcStateIsNotNull() {
            addCriterion("ic_state is not null");
            return (Criteria) this;
        }

        public Criteria andIcStateEqualTo(Integer value) {
            addCriterion("ic_state =", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotEqualTo(Integer value) {
            addCriterion("ic_state <>", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateGreaterThan(Integer value) {
            addCriterion("ic_state >", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ic_state >=", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateLessThan(Integer value) {
            addCriterion("ic_state <", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateLessThanOrEqualTo(Integer value) {
            addCriterion("ic_state <=", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateIn(List<Integer> values) {
            addCriterion("ic_state in", values, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotIn(List<Integer> values) {
            addCriterion("ic_state not in", values, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateBetween(Integer value1, Integer value2) {
            addCriterion("ic_state between", value1, value2, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ic_state not between", value1, value2, "icState");
            return (Criteria) this;
        }

        public Criteria andCamera1StateIsNull() {
            addCriterion("camera1_state is null");
            return (Criteria) this;
        }

        public Criteria andCamera1StateIsNotNull() {
            addCriterion("camera1_state is not null");
            return (Criteria) this;
        }

        public Criteria andCamera1StateEqualTo(Integer value) {
            addCriterion("camera1_state =", value, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateNotEqualTo(Integer value) {
            addCriterion("camera1_state <>", value, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateGreaterThan(Integer value) {
            addCriterion("camera1_state >", value, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateGreaterThanOrEqualTo(Integer value) {
            addCriterion("camera1_state >=", value, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateLessThan(Integer value) {
            addCriterion("camera1_state <", value, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateLessThanOrEqualTo(Integer value) {
            addCriterion("camera1_state <=", value, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateIn(List<Integer> values) {
            addCriterion("camera1_state in", values, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateNotIn(List<Integer> values) {
            addCriterion("camera1_state not in", values, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateBetween(Integer value1, Integer value2) {
            addCriterion("camera1_state between", value1, value2, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCamera1StateNotBetween(Integer value1, Integer value2) {
            addCriterion("camera1_state not between", value1, value2, "camera1State");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureIsNull() {
            addCriterion("dev_temperature is null");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureIsNotNull() {
            addCriterion("dev_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureEqualTo(Integer value) {
            addCriterion("dev_temperature =", value, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureNotEqualTo(Integer value) {
            addCriterion("dev_temperature <>", value, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureGreaterThan(Integer value) {
            addCriterion("dev_temperature >", value, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_temperature >=", value, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureLessThan(Integer value) {
            addCriterion("dev_temperature <", value, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureLessThanOrEqualTo(Integer value) {
            addCriterion("dev_temperature <=", value, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureIn(List<Integer> values) {
            addCriterion("dev_temperature in", values, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureNotIn(List<Integer> values) {
            addCriterion("dev_temperature not in", values, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureBetween(Integer value1, Integer value2) {
            addCriterion("dev_temperature between", value1, value2, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andDevTemperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_temperature not between", value1, value2, "devTemperature");
            return (Criteria) this;
        }

        public Criteria andGpsStateIsNull() {
            addCriterion("gps_state is null");
            return (Criteria) this;
        }

        public Criteria andGpsStateIsNotNull() {
            addCriterion("gps_state is not null");
            return (Criteria) this;
        }

        public Criteria andGpsStateEqualTo(Integer value) {
            addCriterion("gps_state =", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateNotEqualTo(Integer value) {
            addCriterion("gps_state <>", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateGreaterThan(Integer value) {
            addCriterion("gps_state >", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("gps_state >=", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateLessThan(Integer value) {
            addCriterion("gps_state <", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateLessThanOrEqualTo(Integer value) {
            addCriterion("gps_state <=", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateIn(List<Integer> values) {
            addCriterion("gps_state in", values, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateNotIn(List<Integer> values) {
            addCriterion("gps_state not in", values, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateBetween(Integer value1, Integer value2) {
            addCriterion("gps_state between", value1, value2, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("gps_state not between", value1, value2, "gpsState");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(Integer value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(Integer value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(Integer value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(Integer value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<Integer> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<Integer> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(Integer value1, Integer value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andCamera2StateIsNull() {
            addCriterion("camera2_state is null");
            return (Criteria) this;
        }

        public Criteria andCamera2StateIsNotNull() {
            addCriterion("camera2_state is not null");
            return (Criteria) this;
        }

        public Criteria andCamera2StateEqualTo(Integer value) {
            addCriterion("camera2_state =", value, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateNotEqualTo(Integer value) {
            addCriterion("camera2_state <>", value, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateGreaterThan(Integer value) {
            addCriterion("camera2_state >", value, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateGreaterThanOrEqualTo(Integer value) {
            addCriterion("camera2_state >=", value, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateLessThan(Integer value) {
            addCriterion("camera2_state <", value, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateLessThanOrEqualTo(Integer value) {
            addCriterion("camera2_state <=", value, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateIn(List<Integer> values) {
            addCriterion("camera2_state in", values, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateNotIn(List<Integer> values) {
            addCriterion("camera2_state not in", values, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateBetween(Integer value1, Integer value2) {
            addCriterion("camera2_state between", value1, value2, "camera2State");
            return (Criteria) this;
        }

        public Criteria andCamera2StateNotBetween(Integer value1, Integer value2) {
            addCriterion("camera2_state not between", value1, value2, "camera2State");
            return (Criteria) this;
        }

        public Criteria andDiskStateIsNull() {
            addCriterion("disk_state is null");
            return (Criteria) this;
        }

        public Criteria andDiskStateIsNotNull() {
            addCriterion("disk_state is not null");
            return (Criteria) this;
        }

        public Criteria andDiskStateEqualTo(Integer value) {
            addCriterion("disk_state =", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateNotEqualTo(Integer value) {
            addCriterion("disk_state <>", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateGreaterThan(Integer value) {
            addCriterion("disk_state >", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("disk_state >=", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateLessThan(Integer value) {
            addCriterion("disk_state <", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateLessThanOrEqualTo(Integer value) {
            addCriterion("disk_state <=", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateIn(List<Integer> values) {
            addCriterion("disk_state in", values, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateNotIn(List<Integer> values) {
            addCriterion("disk_state not in", values, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateBetween(Integer value1, Integer value2) {
            addCriterion("disk_state between", value1, value2, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateNotBetween(Integer value1, Integer value2) {
            addCriterion("disk_state not between", value1, value2, "diskState");
            return (Criteria) this;
        }

        public Criteria andWriteDateIsNull() {
            addCriterion("write_date is null");
            return (Criteria) this;
        }

        public Criteria andWriteDateIsNotNull() {
            addCriterion("write_date is not null");
            return (Criteria) this;
        }

        public Criteria andWriteDateEqualTo(Date value) {
            addCriterion("write_date =", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotEqualTo(Date value) {
            addCriterion("write_date <>", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateGreaterThan(Date value) {
            addCriterion("write_date >", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("write_date >=", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLessThan(Date value) {
            addCriterion("write_date <", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLessThanOrEqualTo(Date value) {
            addCriterion("write_date <=", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateIn(List<Date> values) {
            addCriterion("write_date in", values, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotIn(List<Date> values) {
            addCriterion("write_date not in", values, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateBetween(Date value1, Date value2) {
            addCriterion("write_date between", value1, value2, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotBetween(Date value1, Date value2) {
            addCriterion("write_date not between", value1, value2, "writeDate");
            return (Criteria) this;
        }

        public Criteria andDevSnIsNull() {
            addCriterion("dev_sn is null");
            return (Criteria) this;
        }

        public Criteria andDevSnIsNotNull() {
            addCriterion("dev_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDevSnEqualTo(String value) {
            addCriterion("dev_sn =", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotEqualTo(String value) {
            addCriterion("dev_sn <>", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnGreaterThan(String value) {
            addCriterion("dev_sn >", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnGreaterThanOrEqualTo(String value) {
            addCriterion("dev_sn >=", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnLessThan(String value) {
            addCriterion("dev_sn <", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnLessThanOrEqualTo(String value) {
            addCriterion("dev_sn <=", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnLike(String value) {
            addCriterion("dev_sn like", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotLike(String value) {
            addCriterion("dev_sn not like", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnIn(List<String> values) {
            addCriterion("dev_sn in", values, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotIn(List<String> values) {
            addCriterion("dev_sn not in", values, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnBetween(String value1, String value2) {
            addCriterion("dev_sn between", value1, value2, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotBetween(String value1, String value2) {
            addCriterion("dev_sn not between", value1, value2, "devSn");
            return (Criteria) this;
        }

        public Criteria andSdStateIsNull() {
            addCriterion("sd_state is null");
            return (Criteria) this;
        }

        public Criteria andSdStateIsNotNull() {
            addCriterion("sd_state is not null");
            return (Criteria) this;
        }

        public Criteria andSdStateEqualTo(Integer value) {
            addCriterion("sd_state =", value, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateNotEqualTo(Integer value) {
            addCriterion("sd_state <>", value, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateGreaterThan(Integer value) {
            addCriterion("sd_state >", value, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_state >=", value, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateLessThan(Integer value) {
            addCriterion("sd_state <", value, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateLessThanOrEqualTo(Integer value) {
            addCriterion("sd_state <=", value, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateIn(List<Integer> values) {
            addCriterion("sd_state in", values, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateNotIn(List<Integer> values) {
            addCriterion("sd_state not in", values, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateBetween(Integer value1, Integer value2) {
            addCriterion("sd_state between", value1, value2, "sdState");
            return (Criteria) this;
        }

        public Criteria andSdStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_state not between", value1, value2, "sdState");
            return (Criteria) this;
        }

        public Criteria andFanSpeedIsNull() {
            addCriterion("fan_speed is null");
            return (Criteria) this;
        }

        public Criteria andFanSpeedIsNotNull() {
            addCriterion("fan_speed is not null");
            return (Criteria) this;
        }

        public Criteria andFanSpeedEqualTo(Integer value) {
            addCriterion("fan_speed =", value, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedNotEqualTo(Integer value) {
            addCriterion("fan_speed <>", value, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedGreaterThan(Integer value) {
            addCriterion("fan_speed >", value, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("fan_speed >=", value, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedLessThan(Integer value) {
            addCriterion("fan_speed <", value, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("fan_speed <=", value, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedIn(List<Integer> values) {
            addCriterion("fan_speed in", values, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedNotIn(List<Integer> values) {
            addCriterion("fan_speed not in", values, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedBetween(Integer value1, Integer value2) {
            addCriterion("fan_speed between", value1, value2, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andFanSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("fan_speed not between", value1, value2, "fanSpeed");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessIsNull() {
            addCriterion("disaster_preparedness is null");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessIsNotNull() {
            addCriterion("disaster_preparedness is not null");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessEqualTo(Integer value) {
            addCriterion("disaster_preparedness =", value, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessNotEqualTo(Integer value) {
            addCriterion("disaster_preparedness <>", value, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessGreaterThan(Integer value) {
            addCriterion("disaster_preparedness >", value, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessGreaterThanOrEqualTo(Integer value) {
            addCriterion("disaster_preparedness >=", value, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessLessThan(Integer value) {
            addCriterion("disaster_preparedness <", value, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessLessThanOrEqualTo(Integer value) {
            addCriterion("disaster_preparedness <=", value, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessIn(List<Integer> values) {
            addCriterion("disaster_preparedness in", values, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessNotIn(List<Integer> values) {
            addCriterion("disaster_preparedness not in", values, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessBetween(Integer value1, Integer value2) {
            addCriterion("disaster_preparedness between", value1, value2, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andDisasterPreparednessNotBetween(Integer value1, Integer value2) {
            addCriterion("disaster_preparedness not between", value1, value2, "disasterPreparedness");
            return (Criteria) this;
        }

        public Criteria andInputVoltageIsNull() {
            addCriterion("input_voltage is null");
            return (Criteria) this;
        }

        public Criteria andInputVoltageIsNotNull() {
            addCriterion("input_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andInputVoltageEqualTo(Integer value) {
            addCriterion("input_voltage =", value, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageNotEqualTo(Integer value) {
            addCriterion("input_voltage <>", value, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageGreaterThan(Integer value) {
            addCriterion("input_voltage >", value, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageGreaterThanOrEqualTo(Integer value) {
            addCriterion("input_voltage >=", value, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageLessThan(Integer value) {
            addCriterion("input_voltage <", value, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageLessThanOrEqualTo(Integer value) {
            addCriterion("input_voltage <=", value, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageIn(List<Integer> values) {
            addCriterion("input_voltage in", values, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageNotIn(List<Integer> values) {
            addCriterion("input_voltage not in", values, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageBetween(Integer value1, Integer value2) {
            addCriterion("input_voltage between", value1, value2, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andInputVoltageNotBetween(Integer value1, Integer value2) {
            addCriterion("input_voltage not between", value1, value2, "inputVoltage");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLikeInsensitive(String value) {
            addCriterion("upper(company_code) like", value.toUpperCase(), "companyCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLikeInsensitive(String value) {
            addCriterion("upper(city_code) like", value.toUpperCase(), "cityCode");
            return (Criteria) this;
        }

        public Criteria andDevSnLikeInsensitive(String value) {
            addCriterion("upper(dev_sn) like", value.toUpperCase(), "devSn");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}