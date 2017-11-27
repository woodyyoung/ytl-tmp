package com.lty.tmp.service.bean.entity.autocreate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UpgradeDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpgradeDetailExample() {
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

        public Criteria andFtpPathIsNull() {
            addCriterion("ftp_path is null");
            return (Criteria) this;
        }

        public Criteria andFtpPathIsNotNull() {
            addCriterion("ftp_path is not null");
            return (Criteria) this;
        }

        public Criteria andFtpPathEqualTo(String value) {
            addCriterion("ftp_path =", value, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathNotEqualTo(String value) {
            addCriterion("ftp_path <>", value, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathGreaterThan(String value) {
            addCriterion("ftp_path >", value, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_path >=", value, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathLessThan(String value) {
            addCriterion("ftp_path <", value, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathLessThanOrEqualTo(String value) {
            addCriterion("ftp_path <=", value, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathLike(String value) {
            addCriterion("ftp_path like", value, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathNotLike(String value) {
            addCriterion("ftp_path not like", value, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathIn(List<String> values) {
            addCriterion("ftp_path in", values, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathNotIn(List<String> values) {
            addCriterion("ftp_path not in", values, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathBetween(String value1, String value2) {
            addCriterion("ftp_path between", value1, value2, "ftpPath");
            return (Criteria) this;
        }

        public Criteria andFtpPathNotBetween(String value1, String value2) {
            addCriterion("ftp_path not between", value1, value2, "ftpPath");
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

        public Criteria andUpgradeTypeIsNull() {
            addCriterion("upgrade_type is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeIsNotNull() {
            addCriterion("upgrade_type is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeEqualTo(Integer value) {
            addCriterion("upgrade_type =", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeNotEqualTo(Integer value) {
            addCriterion("upgrade_type <>", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeGreaterThan(Integer value) {
            addCriterion("upgrade_type >", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("upgrade_type >=", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeLessThan(Integer value) {
            addCriterion("upgrade_type <", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("upgrade_type <=", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeIn(List<Integer> values) {
            addCriterion("upgrade_type in", values, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeNotIn(List<Integer> values) {
            addCriterion("upgrade_type not in", values, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("upgrade_type between", value1, value2, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("upgrade_type not between", value1, value2, "upgradeType");
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

        public Criteria andUpgradeSnIsNull() {
            addCriterion("upgrade_sn is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnIsNotNull() {
            addCriterion("upgrade_sn is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnEqualTo(String value) {
            addCriterion("upgrade_sn =", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnNotEqualTo(String value) {
            addCriterion("upgrade_sn <>", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnGreaterThan(String value) {
            addCriterion("upgrade_sn >", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnGreaterThanOrEqualTo(String value) {
            addCriterion("upgrade_sn >=", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnLessThan(String value) {
            addCriterion("upgrade_sn <", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnLessThanOrEqualTo(String value) {
            addCriterion("upgrade_sn <=", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnLike(String value) {
            addCriterion("upgrade_sn like", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnNotLike(String value) {
            addCriterion("upgrade_sn not like", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnIn(List<String> values) {
            addCriterion("upgrade_sn in", values, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnNotIn(List<String> values) {
            addCriterion("upgrade_sn not in", values, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnBetween(String value1, String value2) {
            addCriterion("upgrade_sn between", value1, value2, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnNotBetween(String value1, String value2) {
            addCriterion("upgrade_sn not between", value1, value2, "upgradeSn");
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

        public Criteria andFtpPathLikeInsensitive(String value) {
            addCriterion("upper(ftp_path) like", value.toUpperCase(), "ftpPath");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnLikeInsensitive(String value) {
            addCriterion("upper(upgrade_sn) like", value.toUpperCase(), "upgradeSn");
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