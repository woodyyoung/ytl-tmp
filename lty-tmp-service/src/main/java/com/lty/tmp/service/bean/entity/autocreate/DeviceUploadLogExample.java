package com.lty.tmp.service.bean.entity.autocreate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceUploadLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceUploadLogExample() {
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

        public Criteria andFtpUserIsNull() {
            addCriterion("ftp_user is null");
            return (Criteria) this;
        }

        public Criteria andFtpUserIsNotNull() {
            addCriterion("ftp_user is not null");
            return (Criteria) this;
        }

        public Criteria andFtpUserEqualTo(String value) {
            addCriterion("ftp_user =", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserNotEqualTo(String value) {
            addCriterion("ftp_user <>", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserGreaterThan(String value) {
            addCriterion("ftp_user >", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_user >=", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserLessThan(String value) {
            addCriterion("ftp_user <", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserLessThanOrEqualTo(String value) {
            addCriterion("ftp_user <=", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserLike(String value) {
            addCriterion("ftp_user like", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserNotLike(String value) {
            addCriterion("ftp_user not like", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserIn(List<String> values) {
            addCriterion("ftp_user in", values, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserNotIn(List<String> values) {
            addCriterion("ftp_user not in", values, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserBetween(String value1, String value2) {
            addCriterion("ftp_user between", value1, value2, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserNotBetween(String value1, String value2) {
            addCriterion("ftp_user not between", value1, value2, "ftpUser");
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

        public Criteria andFtpPortMoved0IsNull() {
            addCriterion("ftp_port_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0IsNotNull() {
            addCriterion("ftp_port_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0EqualTo(String value) {
            addCriterion("ftp_port_moved0 =", value, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0NotEqualTo(String value) {
            addCriterion("ftp_port_moved0 <>", value, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0GreaterThan(String value) {
            addCriterion("ftp_port_moved0 >", value, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("ftp_port_moved0 >=", value, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0LessThan(String value) {
            addCriterion("ftp_port_moved0 <", value, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0LessThanOrEqualTo(String value) {
            addCriterion("ftp_port_moved0 <=", value, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0Like(String value) {
            addCriterion("ftp_port_moved0 like", value, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0NotLike(String value) {
            addCriterion("ftp_port_moved0 not like", value, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0In(List<String> values) {
            addCriterion("ftp_port_moved0 in", values, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0NotIn(List<String> values) {
            addCriterion("ftp_port_moved0 not in", values, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0Between(String value1, String value2) {
            addCriterion("ftp_port_moved0 between", value1, value2, "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPortMoved0NotBetween(String value1, String value2) {
            addCriterion("ftp_port_moved0 not between", value1, value2, "ftpPortMoved0");
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

        public Criteria andDevRespMoved0IsNull() {
            addCriterion("dev_resp_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0IsNotNull() {
            addCriterion("dev_resp_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0EqualTo(String value) {
            addCriterion("dev_resp_moved0 =", value, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0NotEqualTo(String value) {
            addCriterion("dev_resp_moved0 <>", value, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0GreaterThan(String value) {
            addCriterion("dev_resp_moved0 >", value, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("dev_resp_moved0 >=", value, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0LessThan(String value) {
            addCriterion("dev_resp_moved0 <", value, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0LessThanOrEqualTo(String value) {
            addCriterion("dev_resp_moved0 <=", value, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0Like(String value) {
            addCriterion("dev_resp_moved0 like", value, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0NotLike(String value) {
            addCriterion("dev_resp_moved0 not like", value, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0In(List<String> values) {
            addCriterion("dev_resp_moved0 in", values, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0NotIn(List<String> values) {
            addCriterion("dev_resp_moved0 not in", values, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0Between(String value1, String value2) {
            addCriterion("dev_resp_moved0 between", value1, value2, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0NotBetween(String value1, String value2) {
            addCriterion("dev_resp_moved0 not between", value1, value2, "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpIpIsNull() {
            addCriterion("ftp_ip is null");
            return (Criteria) this;
        }

        public Criteria andFtpIpIsNotNull() {
            addCriterion("ftp_ip is not null");
            return (Criteria) this;
        }

        public Criteria andFtpIpEqualTo(String value) {
            addCriterion("ftp_ip =", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpNotEqualTo(String value) {
            addCriterion("ftp_ip <>", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpGreaterThan(String value) {
            addCriterion("ftp_ip >", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_ip >=", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpLessThan(String value) {
            addCriterion("ftp_ip <", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpLessThanOrEqualTo(String value) {
            addCriterion("ftp_ip <=", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpLike(String value) {
            addCriterion("ftp_ip like", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpNotLike(String value) {
            addCriterion("ftp_ip not like", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpIn(List<String> values) {
            addCriterion("ftp_ip in", values, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpNotIn(List<String> values) {
            addCriterion("ftp_ip not in", values, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpBetween(String value1, String value2) {
            addCriterion("ftp_ip between", value1, value2, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpNotBetween(String value1, String value2) {
            addCriterion("ftp_ip not between", value1, value2, "ftpIp");
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

        public Criteria andFtpPasswordIsNull() {
            addCriterion("ftp_password is null");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordIsNotNull() {
            addCriterion("ftp_password is not null");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordEqualTo(String value) {
            addCriterion("ftp_password =", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordNotEqualTo(String value) {
            addCriterion("ftp_password <>", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordGreaterThan(String value) {
            addCriterion("ftp_password >", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_password >=", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordLessThan(String value) {
            addCriterion("ftp_password <", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordLessThanOrEqualTo(String value) {
            addCriterion("ftp_password <=", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordLike(String value) {
            addCriterion("ftp_password like", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordNotLike(String value) {
            addCriterion("ftp_password not like", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordIn(List<String> values) {
            addCriterion("ftp_password in", values, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordNotIn(List<String> values) {
            addCriterion("ftp_password not in", values, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordBetween(String value1, String value2) {
            addCriterion("ftp_password between", value1, value2, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordNotBetween(String value1, String value2) {
            addCriterion("ftp_password not between", value1, value2, "ftpPassword");
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

        public Criteria andLogTypeMoved0IsNull() {
            addCriterion("log_type_moved0 is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0IsNotNull() {
            addCriterion("log_type_moved0 is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0EqualTo(String value) {
            addCriterion("log_type_moved0 =", value, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0NotEqualTo(String value) {
            addCriterion("log_type_moved0 <>", value, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0GreaterThan(String value) {
            addCriterion("log_type_moved0 >", value, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0GreaterThanOrEqualTo(String value) {
            addCriterion("log_type_moved0 >=", value, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0LessThan(String value) {
            addCriterion("log_type_moved0 <", value, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0LessThanOrEqualTo(String value) {
            addCriterion("log_type_moved0 <=", value, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0Like(String value) {
            addCriterion("log_type_moved0 like", value, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0NotLike(String value) {
            addCriterion("log_type_moved0 not like", value, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0In(List<String> values) {
            addCriterion("log_type_moved0 in", values, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0NotIn(List<String> values) {
            addCriterion("log_type_moved0 not in", values, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0Between(String value1, String value2) {
            addCriterion("log_type_moved0 between", value1, value2, "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0NotBetween(String value1, String value2) {
            addCriterion("log_type_moved0 not between", value1, value2, "logTypeMoved0");
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

        public Criteria andDevRespIsNull() {
            addCriterion("dev_resp is null");
            return (Criteria) this;
        }

        public Criteria andDevRespIsNotNull() {
            addCriterion("dev_resp is not null");
            return (Criteria) this;
        }

        public Criteria andDevRespEqualTo(Integer value) {
            addCriterion("dev_resp =", value, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespNotEqualTo(Integer value) {
            addCriterion("dev_resp <>", value, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespGreaterThan(Integer value) {
            addCriterion("dev_resp >", value, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_resp >=", value, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespLessThan(Integer value) {
            addCriterion("dev_resp <", value, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespLessThanOrEqualTo(Integer value) {
            addCriterion("dev_resp <=", value, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespIn(List<Integer> values) {
            addCriterion("dev_resp in", values, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespNotIn(List<Integer> values) {
            addCriterion("dev_resp not in", values, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespBetween(Integer value1, Integer value2) {
            addCriterion("dev_resp between", value1, value2, "devResp");
            return (Criteria) this;
        }

        public Criteria andDevRespNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_resp not between", value1, value2, "devResp");
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

        public Criteria andFtpPortIsNull() {
            addCriterion("ftp_port is null");
            return (Criteria) this;
        }

        public Criteria andFtpPortIsNotNull() {
            addCriterion("ftp_port is not null");
            return (Criteria) this;
        }

        public Criteria andFtpPortEqualTo(Integer value) {
            addCriterion("ftp_port =", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortNotEqualTo(Integer value) {
            addCriterion("ftp_port <>", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortGreaterThan(Integer value) {
            addCriterion("ftp_port >", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftp_port >=", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortLessThan(Integer value) {
            addCriterion("ftp_port <", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortLessThanOrEqualTo(Integer value) {
            addCriterion("ftp_port <=", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortIn(List<Integer> values) {
            addCriterion("ftp_port in", values, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortNotIn(List<Integer> values) {
            addCriterion("ftp_port not in", values, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortBetween(Integer value1, Integer value2) {
            addCriterion("ftp_port between", value1, value2, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortNotBetween(Integer value1, Integer value2) {
            addCriterion("ftp_port not between", value1, value2, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(Integer value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(Integer value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(Integer value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(Integer value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<Integer> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<Integer> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(Integer value1, Integer value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andFtpUserLikeInsensitive(String value) {
            addCriterion("upper(ftp_user) like", value.toUpperCase(), "ftpUser");
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

        public Criteria andFtpPortMoved0LikeInsensitive(String value) {
            addCriterion("upper(ftp_port_moved0) like", value.toUpperCase(), "ftpPortMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPathLikeInsensitive(String value) {
            addCriterion("upper(ftp_path) like", value.toUpperCase(), "ftpPath");
            return (Criteria) this;
        }

        public Criteria andDevRespMoved0LikeInsensitive(String value) {
            addCriterion("upper(dev_resp_moved0) like", value.toUpperCase(), "devRespMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpIpLikeInsensitive(String value) {
            addCriterion("upper(ftp_ip) like", value.toUpperCase(), "ftpIp");
            return (Criteria) this;
        }

        public Criteria andLineIdMoved0LikeInsensitive(String value) {
            addCriterion("upper(line_id_moved0) like", value.toUpperCase(), "lineIdMoved0");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordLikeInsensitive(String value) {
            addCriterion("upper(ftp_password) like", value.toUpperCase(), "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andDevSnLikeInsensitive(String value) {
            addCriterion("upper(dev_sn) like", value.toUpperCase(), "devSn");
            return (Criteria) this;
        }

        public Criteria andLogTypeMoved0LikeInsensitive(String value) {
            addCriterion("upper(log_type_moved0) like", value.toUpperCase(), "logTypeMoved0");
            return (Criteria) this;
        }

        public Criteria andCityCodeLikeInsensitive(String value) {
            addCriterion("upper(city_code) like", value.toUpperCase(), "cityCode");
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