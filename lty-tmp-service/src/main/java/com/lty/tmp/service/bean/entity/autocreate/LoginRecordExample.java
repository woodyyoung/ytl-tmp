package com.lty.tmp.service.bean.entity.autocreate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoginRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andResetCountsMoved0IsNull() {
            addCriterion("reset_counts_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0IsNotNull() {
            addCriterion("reset_counts_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0EqualTo(String value) {
            addCriterion("reset_counts_moved0 =", value, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0NotEqualTo(String value) {
            addCriterion("reset_counts_moved0 <>", value, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0GreaterThan(String value) {
            addCriterion("reset_counts_moved0 >", value, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("reset_counts_moved0 >=", value, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0LessThan(String value) {
            addCriterion("reset_counts_moved0 <", value, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0LessThanOrEqualTo(String value) {
            addCriterion("reset_counts_moved0 <=", value, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0Like(String value) {
            addCriterion("reset_counts_moved0 like", value, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0NotLike(String value) {
            addCriterion("reset_counts_moved0 not like", value, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0In(List<String> values) {
            addCriterion("reset_counts_moved0 in", values, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0NotIn(List<String> values) {
            addCriterion("reset_counts_moved0 not in", values, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0Between(String value1, String value2) {
            addCriterion("reset_counts_moved0 between", value1, value2, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0NotBetween(String value1, String value2) {
            addCriterion("reset_counts_moved0 not between", value1, value2, "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0IsNull() {
            addCriterion("dev_id_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0IsNotNull() {
            addCriterion("dev_id_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0EqualTo(String value) {
            addCriterion("dev_id_moved0 =", value, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0NotEqualTo(String value) {
            addCriterion("dev_id_moved0 <>", value, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0GreaterThan(String value) {
            addCriterion("dev_id_moved0 >", value, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("dev_id_moved0 >=", value, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0LessThan(String value) {
            addCriterion("dev_id_moved0 <", value, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0LessThanOrEqualTo(String value) {
            addCriterion("dev_id_moved0 <=", value, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0Like(String value) {
            addCriterion("dev_id_moved0 like", value, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0NotLike(String value) {
            addCriterion("dev_id_moved0 not like", value, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0In(List<String> values) {
            addCriterion("dev_id_moved0 in", values, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0NotIn(List<String> values) {
            addCriterion("dev_id_moved0 not in", values, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0Between(String value1, String value2) {
            addCriterion("dev_id_moved0 between", value1, value2, "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0NotBetween(String value1, String value2) {
            addCriterion("dev_id_moved0 not between", value1, value2, "devIdMoved0");
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

        public Criteria andDiscReasonMoved0IsNull() {
            addCriterion("disc_reason_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0IsNotNull() {
            addCriterion("disc_reason_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0EqualTo(String value) {
            addCriterion("disc_reason_moved0 =", value, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0NotEqualTo(String value) {
            addCriterion("disc_reason_moved0 <>", value, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0GreaterThan(String value) {
            addCriterion("disc_reason_moved0 >", value, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("disc_reason_moved0 >=", value, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0LessThan(String value) {
            addCriterion("disc_reason_moved0 <", value, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0LessThanOrEqualTo(String value) {
            addCriterion("disc_reason_moved0 <=", value, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0Like(String value) {
            addCriterion("disc_reason_moved0 like", value, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0NotLike(String value) {
            addCriterion("disc_reason_moved0 not like", value, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0In(List<String> values) {
            addCriterion("disc_reason_moved0 in", values, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0NotIn(List<String> values) {
            addCriterion("disc_reason_moved0 not in", values, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0Between(String value1, String value2) {
            addCriterion("disc_reason_moved0 between", value1, value2, "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0NotBetween(String value1, String value2) {
            addCriterion("disc_reason_moved0 not between", value1, value2, "discReasonMoved0");
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

        public Criteria andSimSnIsNull() {
            addCriterion("sim_sn is null");
            return (Criteria) this;
        }

        public Criteria andSimSnIsNotNull() {
            addCriterion("sim_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSimSnEqualTo(String value) {
            addCriterion("sim_sn =", value, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnNotEqualTo(String value) {
            addCriterion("sim_sn <>", value, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnGreaterThan(String value) {
            addCriterion("sim_sn >", value, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnGreaterThanOrEqualTo(String value) {
            addCriterion("sim_sn >=", value, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnLessThan(String value) {
            addCriterion("sim_sn <", value, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnLessThanOrEqualTo(String value) {
            addCriterion("sim_sn <=", value, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnLike(String value) {
            addCriterion("sim_sn like", value, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnNotLike(String value) {
            addCriterion("sim_sn not like", value, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnIn(List<String> values) {
            addCriterion("sim_sn in", values, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnNotIn(List<String> values) {
            addCriterion("sim_sn not in", values, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnBetween(String value1, String value2) {
            addCriterion("sim_sn between", value1, value2, "simSn");
            return (Criteria) this;
        }

        public Criteria andSimSnNotBetween(String value1, String value2) {
            addCriterion("sim_sn not between", value1, value2, "simSn");
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

        public Criteria andLineIdMoved0IsNull() {
            addCriterion("line_id_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0IsNotNull() {
            addCriterion("line_id_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0EqualTo(String value) {
            addCriterion("line_id_moved0 =", value, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0NotEqualTo(String value) {
            addCriterion("line_id_moved0 <>", value, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0GreaterThan(String value) {
            addCriterion("line_id_moved0 >", value, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("line_id_moved0 >=", value, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0LessThan(String value) {
            addCriterion("line_id_moved0 <", value, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0LessThanOrEqualTo(String value) {
            addCriterion("line_id_moved0 <=", value, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0Like(String value) {
            addCriterion("line_id_moved0 like", value, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0NotLike(String value) {
            addCriterion("line_id_moved0 not like", value, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0In(List<String> values) {
            addCriterion("line_id_moved0 in", values, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0NotIn(List<String> values) {
            addCriterion("line_id_moved0 not in", values, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0Between(String value1, String value2) {
            addCriterion("line_id_moved0 between", value1, value2, "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0NotBetween(String value1, String value2) {
            addCriterion("line_id_moved0 not between", value1, value2, "lineIdMoved0");
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
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

        public Criteria andConnCountsMoved0IsNull() {
            addCriterion("conn_counts_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0IsNotNull() {
            addCriterion("conn_counts_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0EqualTo(String value) {
            addCriterion("conn_counts_moved0 =", value, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0NotEqualTo(String value) {
            addCriterion("conn_counts_moved0 <>", value, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0GreaterThan(String value) {
            addCriterion("conn_counts_moved0 >", value, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("conn_counts_moved0 >=", value, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0LessThan(String value) {
            addCriterion("conn_counts_moved0 <", value, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0LessThanOrEqualTo(String value) {
            addCriterion("conn_counts_moved0 <=", value, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0Like(String value) {
            addCriterion("conn_counts_moved0 like", value, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0NotLike(String value) {
            addCriterion("conn_counts_moved0 not like", value, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0In(List<String> values) {
            addCriterion("conn_counts_moved0 in", values, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0NotIn(List<String> values) {
            addCriterion("conn_counts_moved0 not in", values, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0Between(String value1, String value2) {
            addCriterion("conn_counts_moved0 between", value1, value2, "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0NotBetween(String value1, String value2) {
            addCriterion("conn_counts_moved0 not between", value1, value2, "connCountsMoved0");
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

        public Criteria andEnableTbpMoved0IsNull() {
            addCriterion("enable_tbp_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0IsNotNull() {
            addCriterion("enable_tbp_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0EqualTo(String value) {
            addCriterion("enable_tbp_moved0 =", value, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0NotEqualTo(String value) {
            addCriterion("enable_tbp_moved0 <>", value, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0GreaterThan(String value) {
            addCriterion("enable_tbp_moved0 >", value, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("enable_tbp_moved0 >=", value, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0LessThan(String value) {
            addCriterion("enable_tbp_moved0 <", value, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0LessThanOrEqualTo(String value) {
            addCriterion("enable_tbp_moved0 <=", value, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0Like(String value) {
            addCriterion("enable_tbp_moved0 like", value, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0NotLike(String value) {
            addCriterion("enable_tbp_moved0 not like", value, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0In(List<String> values) {
            addCriterion("enable_tbp_moved0 in", values, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0NotIn(List<String> values) {
            addCriterion("enable_tbp_moved0 not in", values, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0Between(String value1, String value2) {
            addCriterion("enable_tbp_moved0 between", value1, value2, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0NotBetween(String value1, String value2) {
            addCriterion("enable_tbp_moved0 not between", value1, value2, "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andDevModelIsNull() {
            addCriterion("dev_model is null");
            return (Criteria) this;
        }

        public Criteria andDevModelIsNotNull() {
            addCriterion("dev_model is not null");
            return (Criteria) this;
        }

        public Criteria andDevModelEqualTo(String value) {
            addCriterion("dev_model =", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelNotEqualTo(String value) {
            addCriterion("dev_model <>", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelGreaterThan(String value) {
            addCriterion("dev_model >", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelGreaterThanOrEqualTo(String value) {
            addCriterion("dev_model >=", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelLessThan(String value) {
            addCriterion("dev_model <", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelLessThanOrEqualTo(String value) {
            addCriterion("dev_model <=", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelLike(String value) {
            addCriterion("dev_model like", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelNotLike(String value) {
            addCriterion("dev_model not like", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelIn(List<String> values) {
            addCriterion("dev_model in", values, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelNotIn(List<String> values) {
            addCriterion("dev_model not in", values, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelBetween(String value1, String value2) {
            addCriterion("dev_model between", value1, value2, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelNotBetween(String value1, String value2) {
            addCriterion("dev_model not between", value1, value2, "devModel");
            return (Criteria) this;
        }

        public Criteria andResetCountsIsNull() {
            addCriterion("reset_counts is null");
            return (Criteria) this;
        }

        public Criteria andResetCountsIsNotNull() {
            addCriterion("reset_counts is not null");
            return (Criteria) this;
        }

        public Criteria andResetCountsEqualTo(Integer value) {
            addCriterion("reset_counts =", value, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsNotEqualTo(Integer value) {
            addCriterion("reset_counts <>", value, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsGreaterThan(Integer value) {
            addCriterion("reset_counts >", value, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("reset_counts >=", value, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsLessThan(Integer value) {
            addCriterion("reset_counts <", value, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsLessThanOrEqualTo(Integer value) {
            addCriterion("reset_counts <=", value, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsIn(List<Integer> values) {
            addCriterion("reset_counts in", values, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsNotIn(List<Integer> values) {
            addCriterion("reset_counts not in", values, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsBetween(Integer value1, Integer value2) {
            addCriterion("reset_counts between", value1, value2, "resetCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("reset_counts not between", value1, value2, "resetCounts");
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

        public Criteria andDiscReasonIsNull() {
            addCriterion("disc_reason is null");
            return (Criteria) this;
        }

        public Criteria andDiscReasonIsNotNull() {
            addCriterion("disc_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDiscReasonEqualTo(Integer value) {
            addCriterion("disc_reason =", value, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonNotEqualTo(Integer value) {
            addCriterion("disc_reason <>", value, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonGreaterThan(Integer value) {
            addCriterion("disc_reason >", value, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("disc_reason >=", value, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonLessThan(Integer value) {
            addCriterion("disc_reason <", value, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonLessThanOrEqualTo(Integer value) {
            addCriterion("disc_reason <=", value, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonIn(List<Integer> values) {
            addCriterion("disc_reason in", values, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonNotIn(List<Integer> values) {
            addCriterion("disc_reason not in", values, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonBetween(Integer value1, Integer value2) {
            addCriterion("disc_reason between", value1, value2, "discReason");
            return (Criteria) this;
        }

        public Criteria andDiscReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("disc_reason not between", value1, value2, "discReason");
            return (Criteria) this;
        }

        public Criteria andEnableTbpIsNull() {
            addCriterion("enable_tbp is null");
            return (Criteria) this;
        }

        public Criteria andEnableTbpIsNotNull() {
            addCriterion("enable_tbp is not null");
            return (Criteria) this;
        }

        public Criteria andEnableTbpEqualTo(Integer value) {
            addCriterion("enable_tbp =", value, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpNotEqualTo(Integer value) {
            addCriterion("enable_tbp <>", value, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpGreaterThan(Integer value) {
            addCriterion("enable_tbp >", value, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable_tbp >=", value, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpLessThan(Integer value) {
            addCriterion("enable_tbp <", value, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpLessThanOrEqualTo(Integer value) {
            addCriterion("enable_tbp <=", value, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpIn(List<Integer> values) {
            addCriterion("enable_tbp in", values, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpNotIn(List<Integer> values) {
            addCriterion("enable_tbp not in", values, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpBetween(Integer value1, Integer value2) {
            addCriterion("enable_tbp between", value1, value2, "enableTbp");
            return (Criteria) this;
        }

        public Criteria andEnableTbpNotBetween(Integer value1, Integer value2) {
            addCriterion("enable_tbp not between", value1, value2, "enableTbp");
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

        public Criteria andConnCountsIsNull() {
            addCriterion("conn_counts is null");
            return (Criteria) this;
        }

        public Criteria andConnCountsIsNotNull() {
            addCriterion("conn_counts is not null");
            return (Criteria) this;
        }

        public Criteria andConnCountsEqualTo(Integer value) {
            addCriterion("conn_counts =", value, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsNotEqualTo(Integer value) {
            addCriterion("conn_counts <>", value, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsGreaterThan(Integer value) {
            addCriterion("conn_counts >", value, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("conn_counts >=", value, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsLessThan(Integer value) {
            addCriterion("conn_counts <", value, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsLessThanOrEqualTo(Integer value) {
            addCriterion("conn_counts <=", value, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsIn(List<Integer> values) {
            addCriterion("conn_counts in", values, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsNotIn(List<Integer> values) {
            addCriterion("conn_counts not in", values, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsBetween(Integer value1, Integer value2) {
            addCriterion("conn_counts between", value1, value2, "connCounts");
            return (Criteria) this;
        }

        public Criteria andConnCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("conn_counts not between", value1, value2, "connCounts");
            return (Criteria) this;
        }

        public Criteria andResetCountsMoved0LikeInsensitive(String value) {
            addCriterion("upper(reset_counts_moved0) like", value.toUpperCase(), "resetCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andDevIdMoved0LikeInsensitive(String value) {
            addCriterion("upper(dev_id_moved0) like", value.toUpperCase(), "devIdMoved0");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLikeInsensitive(String value) {
            addCriterion("upper(company_code) like", value.toUpperCase(), "companyCode");
            return (Criteria) this;
        }

        public Criteria andDiscReasonMoved0LikeInsensitive(String value) {
            addCriterion("upper(disc_reason_moved0) like", value.toUpperCase(), "discReasonMoved0");
            return (Criteria) this;
        }

        public Criteria andSimSnLikeInsensitive(String value) {
            addCriterion("upper(sim_sn) like", value.toUpperCase(), "simSn");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0LikeInsensitive(String value) {
            addCriterion("upper(line_id_moved0) like", value.toUpperCase(), "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andDevSnLikeInsensitive(String value) {
            addCriterion("upper(dev_sn) like", value.toUpperCase(), "devSn");
            return (Criteria) this;
        }

        public Criteria andConnCountsMoved0LikeInsensitive(String value) {
            addCriterion("upper(conn_counts_moved0) like", value.toUpperCase(), "connCountsMoved0");
            return (Criteria) this;
        }

        public Criteria andCityCodeLikeInsensitive(String value) {
            addCriterion("upper(city_code) like", value.toUpperCase(), "cityCode");
            return (Criteria) this;
        }

        public Criteria andEnableTbpMoved0LikeInsensitive(String value) {
            addCriterion("upper(enable_tbp_moved0) like", value.toUpperCase(), "enableTbpMoved0");
            return (Criteria) this;
        }

        public Criteria andDevModelLikeInsensitive(String value) {
            addCriterion("upper(dev_model) like", value.toUpperCase(), "devModel");
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