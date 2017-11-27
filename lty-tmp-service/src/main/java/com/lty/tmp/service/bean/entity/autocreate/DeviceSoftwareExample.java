package com.lty.tmp.service.bean.entity.autocreate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceSoftwareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceSoftwareExample() {
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

        public Criteria andBootVersionIsNull() {
            addCriterion("boot_version is null");
            return (Criteria) this;
        }

        public Criteria andBootVersionIsNotNull() {
            addCriterion("boot_version is not null");
            return (Criteria) this;
        }

        public Criteria andBootVersionEqualTo(String value) {
            addCriterion("boot_version =", value, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionNotEqualTo(String value) {
            addCriterion("boot_version <>", value, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionGreaterThan(String value) {
            addCriterion("boot_version >", value, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionGreaterThanOrEqualTo(String value) {
            addCriterion("boot_version >=", value, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionLessThan(String value) {
            addCriterion("boot_version <", value, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionLessThanOrEqualTo(String value) {
            addCriterion("boot_version <=", value, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionLike(String value) {
            addCriterion("boot_version like", value, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionNotLike(String value) {
            addCriterion("boot_version not like", value, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionIn(List<String> values) {
            addCriterion("boot_version in", values, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionNotIn(List<String> values) {
            addCriterion("boot_version not in", values, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionBetween(String value1, String value2) {
            addCriterion("boot_version between", value1, value2, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andBootVersionNotBetween(String value1, String value2) {
            addCriterion("boot_version not between", value1, value2, "bootVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionIsNull() {
            addCriterion("fs_version is null");
            return (Criteria) this;
        }

        public Criteria andFsVersionIsNotNull() {
            addCriterion("fs_version is not null");
            return (Criteria) this;
        }

        public Criteria andFsVersionEqualTo(String value) {
            addCriterion("fs_version =", value, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionNotEqualTo(String value) {
            addCriterion("fs_version <>", value, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionGreaterThan(String value) {
            addCriterion("fs_version >", value, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("fs_version >=", value, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionLessThan(String value) {
            addCriterion("fs_version <", value, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionLessThanOrEqualTo(String value) {
            addCriterion("fs_version <=", value, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionLike(String value) {
            addCriterion("fs_version like", value, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionNotLike(String value) {
            addCriterion("fs_version not like", value, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionIn(List<String> values) {
            addCriterion("fs_version in", values, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionNotIn(List<String> values) {
            addCriterion("fs_version not in", values, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionBetween(String value1, String value2) {
            addCriterion("fs_version between", value1, value2, "fsVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionNotBetween(String value1, String value2) {
            addCriterion("fs_version not between", value1, value2, "fsVersion");
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

        public Criteria andDoubleCamVersionIsNull() {
            addCriterion("double_cam_version is null");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionIsNotNull() {
            addCriterion("double_cam_version is not null");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionEqualTo(String value) {
            addCriterion("double_cam_version =", value, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionNotEqualTo(String value) {
            addCriterion("double_cam_version <>", value, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionGreaterThan(String value) {
            addCriterion("double_cam_version >", value, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionGreaterThanOrEqualTo(String value) {
            addCriterion("double_cam_version >=", value, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionLessThan(String value) {
            addCriterion("double_cam_version <", value, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionLessThanOrEqualTo(String value) {
            addCriterion("double_cam_version <=", value, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionLike(String value) {
            addCriterion("double_cam_version like", value, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionNotLike(String value) {
            addCriterion("double_cam_version not like", value, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionIn(List<String> values) {
            addCriterion("double_cam_version in", values, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionNotIn(List<String> values) {
            addCriterion("double_cam_version not in", values, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionBetween(String value1, String value2) {
            addCriterion("double_cam_version between", value1, value2, "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionNotBetween(String value1, String value2) {
            addCriterion("double_cam_version not between", value1, value2, "doubleCamVersion");
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

        public Criteria andMcuVersionIsNull() {
            addCriterion("mcu_version is null");
            return (Criteria) this;
        }

        public Criteria andMcuVersionIsNotNull() {
            addCriterion("mcu_version is not null");
            return (Criteria) this;
        }

        public Criteria andMcuVersionEqualTo(String value) {
            addCriterion("mcu_version =", value, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionNotEqualTo(String value) {
            addCriterion("mcu_version <>", value, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionGreaterThan(String value) {
            addCriterion("mcu_version >", value, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionGreaterThanOrEqualTo(String value) {
            addCriterion("mcu_version >=", value, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionLessThan(String value) {
            addCriterion("mcu_version <", value, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionLessThanOrEqualTo(String value) {
            addCriterion("mcu_version <=", value, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionLike(String value) {
            addCriterion("mcu_version like", value, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionNotLike(String value) {
            addCriterion("mcu_version not like", value, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionIn(List<String> values) {
            addCriterion("mcu_version in", values, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionNotIn(List<String> values) {
            addCriterion("mcu_version not in", values, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionBetween(String value1, String value2) {
            addCriterion("mcu_version between", value1, value2, "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionNotBetween(String value1, String value2) {
            addCriterion("mcu_version not between", value1, value2, "mcuVersion");
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

        public Criteria andCamera2ParamsIsNull() {
            addCriterion("camera2_params is null");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsIsNotNull() {
            addCriterion("camera2_params is not null");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsEqualTo(String value) {
            addCriterion("camera2_params =", value, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsNotEqualTo(String value) {
            addCriterion("camera2_params <>", value, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsGreaterThan(String value) {
            addCriterion("camera2_params >", value, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsGreaterThanOrEqualTo(String value) {
            addCriterion("camera2_params >=", value, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsLessThan(String value) {
            addCriterion("camera2_params <", value, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsLessThanOrEqualTo(String value) {
            addCriterion("camera2_params <=", value, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsLike(String value) {
            addCriterion("camera2_params like", value, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsNotLike(String value) {
            addCriterion("camera2_params not like", value, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsIn(List<String> values) {
            addCriterion("camera2_params in", values, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsNotIn(List<String> values) {
            addCriterion("camera2_params not in", values, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsBetween(String value1, String value2) {
            addCriterion("camera2_params between", value1, value2, "camera2Params");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsNotBetween(String value1, String value2) {
            addCriterion("camera2_params not between", value1, value2, "camera2Params");
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

        public Criteria andSrVersionIsNull() {
            addCriterion("sr_version is null");
            return (Criteria) this;
        }

        public Criteria andSrVersionIsNotNull() {
            addCriterion("sr_version is not null");
            return (Criteria) this;
        }

        public Criteria andSrVersionEqualTo(String value) {
            addCriterion("sr_version =", value, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionNotEqualTo(String value) {
            addCriterion("sr_version <>", value, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionGreaterThan(String value) {
            addCriterion("sr_version >", value, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionGreaterThanOrEqualTo(String value) {
            addCriterion("sr_version >=", value, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionLessThan(String value) {
            addCriterion("sr_version <", value, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionLessThanOrEqualTo(String value) {
            addCriterion("sr_version <=", value, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionLike(String value) {
            addCriterion("sr_version like", value, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionNotLike(String value) {
            addCriterion("sr_version not like", value, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionIn(List<String> values) {
            addCriterion("sr_version in", values, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionNotIn(List<String> values) {
            addCriterion("sr_version not in", values, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionBetween(String value1, String value2) {
            addCriterion("sr_version between", value1, value2, "srVersion");
            return (Criteria) this;
        }

        public Criteria andSrVersionNotBetween(String value1, String value2) {
            addCriterion("sr_version not between", value1, value2, "srVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionIsNull() {
            addCriterion("media_version is null");
            return (Criteria) this;
        }

        public Criteria andMediaVersionIsNotNull() {
            addCriterion("media_version is not null");
            return (Criteria) this;
        }

        public Criteria andMediaVersionEqualTo(String value) {
            addCriterion("media_version =", value, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionNotEqualTo(String value) {
            addCriterion("media_version <>", value, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionGreaterThan(String value) {
            addCriterion("media_version >", value, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionGreaterThanOrEqualTo(String value) {
            addCriterion("media_version >=", value, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionLessThan(String value) {
            addCriterion("media_version <", value, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionLessThanOrEqualTo(String value) {
            addCriterion("media_version <=", value, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionLike(String value) {
            addCriterion("media_version like", value, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionNotLike(String value) {
            addCriterion("media_version not like", value, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionIn(List<String> values) {
            addCriterion("media_version in", values, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionNotIn(List<String> values) {
            addCriterion("media_version not in", values, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionBetween(String value1, String value2) {
            addCriterion("media_version between", value1, value2, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionNotBetween(String value1, String value2) {
            addCriterion("media_version not between", value1, value2, "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andBlackListIsNull() {
            addCriterion("black_list is null");
            return (Criteria) this;
        }

        public Criteria andBlackListIsNotNull() {
            addCriterion("black_list is not null");
            return (Criteria) this;
        }

        public Criteria andBlackListEqualTo(String value) {
            addCriterion("black_list =", value, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListNotEqualTo(String value) {
            addCriterion("black_list <>", value, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListGreaterThan(String value) {
            addCriterion("black_list >", value, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListGreaterThanOrEqualTo(String value) {
            addCriterion("black_list >=", value, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListLessThan(String value) {
            addCriterion("black_list <", value, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListLessThanOrEqualTo(String value) {
            addCriterion("black_list <=", value, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListLike(String value) {
            addCriterion("black_list like", value, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListNotLike(String value) {
            addCriterion("black_list not like", value, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListIn(List<String> values) {
            addCriterion("black_list in", values, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListNotIn(List<String> values) {
            addCriterion("black_list not in", values, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListBetween(String value1, String value2) {
            addCriterion("black_list between", value1, value2, "blackList");
            return (Criteria) this;
        }

        public Criteria andBlackListNotBetween(String value1, String value2) {
            addCriterion("black_list not between", value1, value2, "blackList");
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

        public Criteria andCommunicationVersionIsNull() {
            addCriterion("communication_version is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionIsNotNull() {
            addCriterion("communication_version is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionEqualTo(String value) {
            addCriterion("communication_version =", value, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionNotEqualTo(String value) {
            addCriterion("communication_version <>", value, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionGreaterThan(String value) {
            addCriterion("communication_version >", value, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionGreaterThanOrEqualTo(String value) {
            addCriterion("communication_version >=", value, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionLessThan(String value) {
            addCriterion("communication_version <", value, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionLessThanOrEqualTo(String value) {
            addCriterion("communication_version <=", value, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionLike(String value) {
            addCriterion("communication_version like", value, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionNotLike(String value) {
            addCriterion("communication_version not like", value, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionIn(List<String> values) {
            addCriterion("communication_version in", values, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionNotIn(List<String> values) {
            addCriterion("communication_version not in", values, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionBetween(String value1, String value2) {
            addCriterion("communication_version between", value1, value2, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionNotBetween(String value1, String value2) {
            addCriterion("communication_version not between", value1, value2, "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("app_version is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("app_version is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("app_version =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("app_version <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("app_version >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("app_version >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("app_version <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("app_version <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("app_version like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("app_version not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("app_version in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("app_version not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("app_version between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("app_version not between", value1, value2, "appVersion");
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

        public Criteria andDefaultEventsIsNull() {
            addCriterion("default_events is null");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsIsNotNull() {
            addCriterion("default_events is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsEqualTo(String value) {
            addCriterion("default_events =", value, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsNotEqualTo(String value) {
            addCriterion("default_events <>", value, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsGreaterThan(String value) {
            addCriterion("default_events >", value, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsGreaterThanOrEqualTo(String value) {
            addCriterion("default_events >=", value, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsLessThan(String value) {
            addCriterion("default_events <", value, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsLessThanOrEqualTo(String value) {
            addCriterion("default_events <=", value, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsLike(String value) {
            addCriterion("default_events like", value, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsNotLike(String value) {
            addCriterion("default_events not like", value, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsIn(List<String> values) {
            addCriterion("default_events in", values, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsNotIn(List<String> values) {
            addCriterion("default_events not in", values, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsBetween(String value1, String value2) {
            addCriterion("default_events between", value1, value2, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsNotBetween(String value1, String value2) {
            addCriterion("default_events not between", value1, value2, "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andStationConfigIsNull() {
            addCriterion("station_config is null");
            return (Criteria) this;
        }

        public Criteria andStationConfigIsNotNull() {
            addCriterion("station_config is not null");
            return (Criteria) this;
        }

        public Criteria andStationConfigEqualTo(String value) {
            addCriterion("station_config =", value, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigNotEqualTo(String value) {
            addCriterion("station_config <>", value, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigGreaterThan(String value) {
            addCriterion("station_config >", value, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigGreaterThanOrEqualTo(String value) {
            addCriterion("station_config >=", value, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigLessThan(String value) {
            addCriterion("station_config <", value, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigLessThanOrEqualTo(String value) {
            addCriterion("station_config <=", value, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigLike(String value) {
            addCriterion("station_config like", value, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigNotLike(String value) {
            addCriterion("station_config not like", value, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigIn(List<String> values) {
            addCriterion("station_config in", values, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigNotIn(List<String> values) {
            addCriterion("station_config not in", values, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigBetween(String value1, String value2) {
            addCriterion("station_config between", value1, value2, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andStationConfigNotBetween(String value1, String value2) {
            addCriterion("station_config not between", value1, value2, "stationConfig");
            return (Criteria) this;
        }

        public Criteria andLineAttributesIsNull() {
            addCriterion("line_attributes is null");
            return (Criteria) this;
        }

        public Criteria andLineAttributesIsNotNull() {
            addCriterion("line_attributes is not null");
            return (Criteria) this;
        }

        public Criteria andLineAttributesEqualTo(String value) {
            addCriterion("line_attributes =", value, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesNotEqualTo(String value) {
            addCriterion("line_attributes <>", value, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesGreaterThan(String value) {
            addCriterion("line_attributes >", value, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesGreaterThanOrEqualTo(String value) {
            addCriterion("line_attributes >=", value, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesLessThan(String value) {
            addCriterion("line_attributes <", value, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesLessThanOrEqualTo(String value) {
            addCriterion("line_attributes <=", value, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesLike(String value) {
            addCriterion("line_attributes like", value, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesNotLike(String value) {
            addCriterion("line_attributes not like", value, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesIn(List<String> values) {
            addCriterion("line_attributes in", values, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesNotIn(List<String> values) {
            addCriterion("line_attributes not in", values, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesBetween(String value1, String value2) {
            addCriterion("line_attributes between", value1, value2, "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andLineAttributesNotBetween(String value1, String value2) {
            addCriterion("line_attributes not between", value1, value2, "lineAttributes");
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

        public Criteria andGpsVersionIsNull() {
            addCriterion("gps_version is null");
            return (Criteria) this;
        }

        public Criteria andGpsVersionIsNotNull() {
            addCriterion("gps_version is not null");
            return (Criteria) this;
        }

        public Criteria andGpsVersionEqualTo(String value) {
            addCriterion("gps_version =", value, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionNotEqualTo(String value) {
            addCriterion("gps_version <>", value, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionGreaterThan(String value) {
            addCriterion("gps_version >", value, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("gps_version >=", value, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionLessThan(String value) {
            addCriterion("gps_version <", value, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionLessThanOrEqualTo(String value) {
            addCriterion("gps_version <=", value, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionLike(String value) {
            addCriterion("gps_version like", value, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionNotLike(String value) {
            addCriterion("gps_version not like", value, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionIn(List<String> values) {
            addCriterion("gps_version in", values, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionNotIn(List<String> values) {
            addCriterion("gps_version not in", values, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionBetween(String value1, String value2) {
            addCriterion("gps_version between", value1, value2, "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andGpsVersionNotBetween(String value1, String value2) {
            addCriterion("gps_version not between", value1, value2, "gpsVersion");
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

        public Criteria andCommonConfigIsNull() {
            addCriterion("common_config is null");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIsNotNull() {
            addCriterion("common_config is not null");
            return (Criteria) this;
        }

        public Criteria andCommonConfigEqualTo(String value) {
            addCriterion("common_config =", value, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigNotEqualTo(String value) {
            addCriterion("common_config <>", value, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigGreaterThan(String value) {
            addCriterion("common_config >", value, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigGreaterThanOrEqualTo(String value) {
            addCriterion("common_config >=", value, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigLessThan(String value) {
            addCriterion("common_config <", value, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigLessThanOrEqualTo(String value) {
            addCriterion("common_config <=", value, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigLike(String value) {
            addCriterion("common_config like", value, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigNotLike(String value) {
            addCriterion("common_config not like", value, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIn(List<String> values) {
            addCriterion("common_config in", values, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigNotIn(List<String> values) {
            addCriterion("common_config not in", values, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigBetween(String value1, String value2) {
            addCriterion("common_config between", value1, value2, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andCommonConfigNotBetween(String value1, String value2) {
            addCriterion("common_config not between", value1, value2, "commonConfig");
            return (Criteria) this;
        }

        public Criteria andKernelVersionIsNull() {
            addCriterion("kernel_version is null");
            return (Criteria) this;
        }

        public Criteria andKernelVersionIsNotNull() {
            addCriterion("kernel_version is not null");
            return (Criteria) this;
        }

        public Criteria andKernelVersionEqualTo(String value) {
            addCriterion("kernel_version =", value, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionNotEqualTo(String value) {
            addCriterion("kernel_version <>", value, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionGreaterThan(String value) {
            addCriterion("kernel_version >", value, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionGreaterThanOrEqualTo(String value) {
            addCriterion("kernel_version >=", value, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionLessThan(String value) {
            addCriterion("kernel_version <", value, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionLessThanOrEqualTo(String value) {
            addCriterion("kernel_version <=", value, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionLike(String value) {
            addCriterion("kernel_version like", value, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionNotLike(String value) {
            addCriterion("kernel_version not like", value, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionIn(List<String> values) {
            addCriterion("kernel_version in", values, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionNotIn(List<String> values) {
            addCriterion("kernel_version not in", values, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionBetween(String value1, String value2) {
            addCriterion("kernel_version between", value1, value2, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andKernelVersionNotBetween(String value1, String value2) {
            addCriterion("kernel_version not between", value1, value2, "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andFareConfigIsNull() {
            addCriterion("fare_config is null");
            return (Criteria) this;
        }

        public Criteria andFareConfigIsNotNull() {
            addCriterion("fare_config is not null");
            return (Criteria) this;
        }

        public Criteria andFareConfigEqualTo(String value) {
            addCriterion("fare_config =", value, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigNotEqualTo(String value) {
            addCriterion("fare_config <>", value, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigGreaterThan(String value) {
            addCriterion("fare_config >", value, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigGreaterThanOrEqualTo(String value) {
            addCriterion("fare_config >=", value, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigLessThan(String value) {
            addCriterion("fare_config <", value, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigLessThanOrEqualTo(String value) {
            addCriterion("fare_config <=", value, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigLike(String value) {
            addCriterion("fare_config like", value, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigNotLike(String value) {
            addCriterion("fare_config not like", value, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigIn(List<String> values) {
            addCriterion("fare_config in", values, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigNotIn(List<String> values) {
            addCriterion("fare_config not in", values, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigBetween(String value1, String value2) {
            addCriterion("fare_config between", value1, value2, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andFareConfigNotBetween(String value1, String value2) {
            addCriterion("fare_config not between", value1, value2, "fareConfig");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionIsNull() {
            addCriterion("keyboard_version is null");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionIsNotNull() {
            addCriterion("keyboard_version is not null");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionEqualTo(String value) {
            addCriterion("keyboard_version =", value, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionNotEqualTo(String value) {
            addCriterion("keyboard_version <>", value, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionGreaterThan(String value) {
            addCriterion("keyboard_version >", value, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionGreaterThanOrEqualTo(String value) {
            addCriterion("keyboard_version >=", value, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionLessThan(String value) {
            addCriterion("keyboard_version <", value, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionLessThanOrEqualTo(String value) {
            addCriterion("keyboard_version <=", value, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionLike(String value) {
            addCriterion("keyboard_version like", value, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionNotLike(String value) {
            addCriterion("keyboard_version not like", value, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionIn(List<String> values) {
            addCriterion("keyboard_version in", values, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionNotIn(List<String> values) {
            addCriterion("keyboard_version not in", values, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionBetween(String value1, String value2) {
            addCriterion("keyboard_version between", value1, value2, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionNotBetween(String value1, String value2) {
            addCriterion("keyboard_version not between", value1, value2, "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsIsNull() {
            addCriterion("camera1_params is null");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsIsNotNull() {
            addCriterion("camera1_params is not null");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsEqualTo(String value) {
            addCriterion("camera1_params =", value, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsNotEqualTo(String value) {
            addCriterion("camera1_params <>", value, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsGreaterThan(String value) {
            addCriterion("camera1_params >", value, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsGreaterThanOrEqualTo(String value) {
            addCriterion("camera1_params >=", value, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsLessThan(String value) {
            addCriterion("camera1_params <", value, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsLessThanOrEqualTo(String value) {
            addCriterion("camera1_params <=", value, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsLike(String value) {
            addCriterion("camera1_params like", value, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsNotLike(String value) {
            addCriterion("camera1_params not like", value, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsIn(List<String> values) {
            addCriterion("camera1_params in", values, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsNotIn(List<String> values) {
            addCriterion("camera1_params not in", values, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsBetween(String value1, String value2) {
            addCriterion("camera1_params between", value1, value2, "camera1Params");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsNotBetween(String value1, String value2) {
            addCriterion("camera1_params not between", value1, value2, "camera1Params");
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

        public Criteria andIcParamVersionIsNull() {
            addCriterion("ic_param_version is null");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionIsNotNull() {
            addCriterion("ic_param_version is not null");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionEqualTo(String value) {
            addCriterion("ic_param_version =", value, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionNotEqualTo(String value) {
            addCriterion("ic_param_version <>", value, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionGreaterThan(String value) {
            addCriterion("ic_param_version >", value, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionGreaterThanOrEqualTo(String value) {
            addCriterion("ic_param_version >=", value, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionLessThan(String value) {
            addCriterion("ic_param_version <", value, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionLessThanOrEqualTo(String value) {
            addCriterion("ic_param_version <=", value, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionLike(String value) {
            addCriterion("ic_param_version like", value, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionNotLike(String value) {
            addCriterion("ic_param_version not like", value, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionIn(List<String> values) {
            addCriterion("ic_param_version in", values, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionNotIn(List<String> values) {
            addCriterion("ic_param_version not in", values, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionBetween(String value1, String value2) {
            addCriterion("ic_param_version between", value1, value2, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionNotBetween(String value1, String value2) {
            addCriterion("ic_param_version not between", value1, value2, "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigIsNull() {
            addCriterion("cardtype_config is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigIsNotNull() {
            addCriterion("cardtype_config is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigEqualTo(String value) {
            addCriterion("cardtype_config =", value, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigNotEqualTo(String value) {
            addCriterion("cardtype_config <>", value, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigGreaterThan(String value) {
            addCriterion("cardtype_config >", value, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigGreaterThanOrEqualTo(String value) {
            addCriterion("cardtype_config >=", value, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigLessThan(String value) {
            addCriterion("cardtype_config <", value, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigLessThanOrEqualTo(String value) {
            addCriterion("cardtype_config <=", value, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigLike(String value) {
            addCriterion("cardtype_config like", value, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigNotLike(String value) {
            addCriterion("cardtype_config not like", value, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigIn(List<String> values) {
            addCriterion("cardtype_config in", values, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigNotIn(List<String> values) {
            addCriterion("cardtype_config not in", values, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigBetween(String value1, String value2) {
            addCriterion("cardtype_config between", value1, value2, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigNotBetween(String value1, String value2) {
            addCriterion("cardtype_config not between", value1, value2, "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andWhiteListIsNull() {
            addCriterion("white_list is null");
            return (Criteria) this;
        }

        public Criteria andWhiteListIsNotNull() {
            addCriterion("white_list is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteListEqualTo(String value) {
            addCriterion("white_list =", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotEqualTo(String value) {
            addCriterion("white_list <>", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListGreaterThan(String value) {
            addCriterion("white_list >", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListGreaterThanOrEqualTo(String value) {
            addCriterion("white_list >=", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLessThan(String value) {
            addCriterion("white_list <", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLessThanOrEqualTo(String value) {
            addCriterion("white_list <=", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLike(String value) {
            addCriterion("white_list like", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotLike(String value) {
            addCriterion("white_list not like", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListIn(List<String> values) {
            addCriterion("white_list in", values, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotIn(List<String> values) {
            addCriterion("white_list not in", values, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListBetween(String value1, String value2) {
            addCriterion("white_list between", value1, value2, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotBetween(String value1, String value2) {
            addCriterion("white_list not between", value1, value2, "whiteList");
            return (Criteria) this;
        }

        public Criteria andBootVersionLikeInsensitive(String value) {
            addCriterion("upper(boot_version) like", value.toUpperCase(), "bootVersion");
            return (Criteria) this;
        }

        public Criteria andFsVersionLikeInsensitive(String value) {
            addCriterion("upper(fs_version) like", value.toUpperCase(), "fsVersion");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLikeInsensitive(String value) {
            addCriterion("upper(company_code) like", value.toUpperCase(), "companyCode");
            return (Criteria) this;
        }

        public Criteria andDoubleCamVersionLikeInsensitive(String value) {
            addCriterion("upper(double_cam_version) like", value.toUpperCase(), "doubleCamVersion");
            return (Criteria) this;
        }

        public Criteria andMcuVersionLikeInsensitive(String value) {
            addCriterion("upper(mcu_version) like", value.toUpperCase(), "mcuVersion");
            return (Criteria) this;
        }

        public Criteria andCamera2ParamsLikeInsensitive(String value) {
            addCriterion("upper(camera2_params) like", value.toUpperCase(), "camera2Params");
            return (Criteria) this;
        }

        public Criteria andDevSnLikeInsensitive(String value) {
            addCriterion("upper(dev_sn) like", value.toUpperCase(), "devSn");
            return (Criteria) this;
        }

        public Criteria andSrVersionLikeInsensitive(String value) {
            addCriterion("upper(sr_version) like", value.toUpperCase(), "srVersion");
            return (Criteria) this;
        }

        public Criteria andMediaVersionLikeInsensitive(String value) {
            addCriterion("upper(media_version) like", value.toUpperCase(), "mediaVersion");
            return (Criteria) this;
        }

        public Criteria andBlackListLikeInsensitive(String value) {
            addCriterion("upper(black_list) like", value.toUpperCase(), "blackList");
            return (Criteria) this;
        }

        public Criteria andCommunicationVersionLikeInsensitive(String value) {
            addCriterion("upper(communication_version) like", value.toUpperCase(), "communicationVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLikeInsensitive(String value) {
            addCriterion("upper(app_version) like", value.toUpperCase(), "appVersion");
            return (Criteria) this;
        }

        public Criteria andCityCodeLikeInsensitive(String value) {
            addCriterion("upper(city_code) like", value.toUpperCase(), "cityCode");
            return (Criteria) this;
        }

        public Criteria andDefaultEventsLikeInsensitive(String value) {
            addCriterion("upper(default_events) like", value.toUpperCase(), "defaultEvents");
            return (Criteria) this;
        }

        public Criteria andStationConfigLikeInsensitive(String value) {
            addCriterion("upper(station_config) like", value.toUpperCase(), "stationConfig");
            return (Criteria) this;
        }

        public Criteria andLineAttributesLikeInsensitive(String value) {
            addCriterion("upper(line_attributes) like", value.toUpperCase(), "lineAttributes");
            return (Criteria) this;
        }

        public Criteria andGpsVersionLikeInsensitive(String value) {
            addCriterion("upper(gps_version) like", value.toUpperCase(), "gpsVersion");
            return (Criteria) this;
        }

        public Criteria andCommonConfigLikeInsensitive(String value) {
            addCriterion("upper(common_config) like", value.toUpperCase(), "commonConfig");
            return (Criteria) this;
        }

        public Criteria andKernelVersionLikeInsensitive(String value) {
            addCriterion("upper(kernel_version) like", value.toUpperCase(), "kernelVersion");
            return (Criteria) this;
        }

        public Criteria andFareConfigLikeInsensitive(String value) {
            addCriterion("upper(fare_config) like", value.toUpperCase(), "fareConfig");
            return (Criteria) this;
        }

        public Criteria andKeyboardVersionLikeInsensitive(String value) {
            addCriterion("upper(keyboard_version) like", value.toUpperCase(), "keyboardVersion");
            return (Criteria) this;
        }

        public Criteria andCamera1ParamsLikeInsensitive(String value) {
            addCriterion("upper(camera1_params) like", value.toUpperCase(), "camera1Params");
            return (Criteria) this;
        }

        public Criteria andIcParamVersionLikeInsensitive(String value) {
            addCriterion("upper(ic_param_version) like", value.toUpperCase(), "icParamVersion");
            return (Criteria) this;
        }

        public Criteria andCardtypeConfigLikeInsensitive(String value) {
            addCriterion("upper(cardtype_config) like", value.toUpperCase(), "cardtypeConfig");
            return (Criteria) this;
        }

        public Criteria andWhiteListLikeInsensitive(String value) {
            addCriterion("upper(white_list) like", value.toUpperCase(), "whiteList");
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