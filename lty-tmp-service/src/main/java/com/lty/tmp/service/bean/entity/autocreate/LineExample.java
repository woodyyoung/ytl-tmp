package com.lty.tmp.service.bean.entity.autocreate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineExample() {
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

        public Criteria andStationYardConfigurationSelectedIsNull() {
            addCriterion("station_yard_configuration_selected is null");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedIsNotNull() {
            addCriterion("station_yard_configuration_selected is not null");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedEqualTo(Boolean value) {
            addCriterion("station_yard_configuration_selected =", value, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedNotEqualTo(Boolean value) {
            addCriterion("station_yard_configuration_selected <>", value, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedGreaterThan(Boolean value) {
            addCriterion("station_yard_configuration_selected >", value, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("station_yard_configuration_selected >=", value, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedLessThan(Boolean value) {
            addCriterion("station_yard_configuration_selected <", value, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedLessThanOrEqualTo(Boolean value) {
            addCriterion("station_yard_configuration_selected <=", value, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedIn(List<Boolean> values) {
            addCriterion("station_yard_configuration_selected in", values, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedNotIn(List<Boolean> values) {
            addCriterion("station_yard_configuration_selected not in", values, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedBetween(Boolean value1, Boolean value2) {
            addCriterion("station_yard_configuration_selected between", value1, value2, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andStationYardConfigurationSelectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("station_yard_configuration_selected not between", value1, value2, "stationYardConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedIsNull() {
            addCriterion("card_type_configuration_selected is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedIsNotNull() {
            addCriterion("card_type_configuration_selected is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedEqualTo(Boolean value) {
            addCriterion("card_type_configuration_selected =", value, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedNotEqualTo(Boolean value) {
            addCriterion("card_type_configuration_selected <>", value, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedGreaterThan(Boolean value) {
            addCriterion("card_type_configuration_selected >", value, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("card_type_configuration_selected >=", value, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedLessThan(Boolean value) {
            addCriterion("card_type_configuration_selected <", value, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedLessThanOrEqualTo(Boolean value) {
            addCriterion("card_type_configuration_selected <=", value, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedIn(List<Boolean> values) {
            addCriterion("card_type_configuration_selected in", values, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedNotIn(List<Boolean> values) {
            addCriterion("card_type_configuration_selected not in", values, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedBetween(Boolean value1, Boolean value2) {
            addCriterion("card_type_configuration_selected between", value1, value2, "cardTypeConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andCardTypeConfigurationSelectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("card_type_configuration_selected not between", value1, value2, "cardTypeConfigurationSelected");
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

        public Criteria andLineAttrIsNull() {
            addCriterion("line_attr is null");
            return (Criteria) this;
        }

        public Criteria andLineAttrIsNotNull() {
            addCriterion("line_attr is not null");
            return (Criteria) this;
        }

        public Criteria andLineAttrEqualTo(String value) {
            addCriterion("line_attr =", value, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrNotEqualTo(String value) {
            addCriterion("line_attr <>", value, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrGreaterThan(String value) {
            addCriterion("line_attr >", value, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrGreaterThanOrEqualTo(String value) {
            addCriterion("line_attr >=", value, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrLessThan(String value) {
            addCriterion("line_attr <", value, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrLessThanOrEqualTo(String value) {
            addCriterion("line_attr <=", value, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrLike(String value) {
            addCriterion("line_attr like", value, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrNotLike(String value) {
            addCriterion("line_attr not like", value, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrIn(List<String> values) {
            addCriterion("line_attr in", values, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrNotIn(List<String> values) {
            addCriterion("line_attr not in", values, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrBetween(String value1, String value2) {
            addCriterion("line_attr between", value1, value2, "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLineAttrNotBetween(String value1, String value2) {
            addCriterion("line_attr not between", value1, value2, "lineAttr");
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

        public Criteria andUplinkSpeedLimitIsNull() {
            addCriterion("uplink_speed_limit is null");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitIsNotNull() {
            addCriterion("uplink_speed_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitEqualTo(Integer value) {
            addCriterion("uplink_speed_limit =", value, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitNotEqualTo(Integer value) {
            addCriterion("uplink_speed_limit <>", value, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitGreaterThan(Integer value) {
            addCriterion("uplink_speed_limit >", value, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("uplink_speed_limit >=", value, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitLessThan(Integer value) {
            addCriterion("uplink_speed_limit <", value, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitLessThanOrEqualTo(Integer value) {
            addCriterion("uplink_speed_limit <=", value, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitIn(List<Integer> values) {
            addCriterion("uplink_speed_limit in", values, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitNotIn(List<Integer> values) {
            addCriterion("uplink_speed_limit not in", values, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitBetween(Integer value1, Integer value2) {
            addCriterion("uplink_speed_limit between", value1, value2, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andUplinkSpeedLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("uplink_speed_limit not between", value1, value2, "uplinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitIsNull() {
            addCriterion("non_service_speed_limit is null");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitIsNotNull() {
            addCriterion("non_service_speed_limit is not null");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitEqualTo(Integer value) {
            addCriterion("non_service_speed_limit =", value, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitNotEqualTo(Integer value) {
            addCriterion("non_service_speed_limit <>", value, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitGreaterThan(Integer value) {
            addCriterion("non_service_speed_limit >", value, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("non_service_speed_limit >=", value, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitLessThan(Integer value) {
            addCriterion("non_service_speed_limit <", value, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitLessThanOrEqualTo(Integer value) {
            addCriterion("non_service_speed_limit <=", value, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitIn(List<Integer> values) {
            addCriterion("non_service_speed_limit in", values, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitNotIn(List<Integer> values) {
            addCriterion("non_service_speed_limit not in", values, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitBetween(Integer value1, Integer value2) {
            addCriterion("non_service_speed_limit between", value1, value2, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andNonServiceSpeedLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("non_service_speed_limit not between", value1, value2, "nonServiceSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andLangEnglishIsNull() {
            addCriterion("lang_english is null");
            return (Criteria) this;
        }

        public Criteria andLangEnglishIsNotNull() {
            addCriterion("lang_english is not null");
            return (Criteria) this;
        }

        public Criteria andLangEnglishEqualTo(String value) {
            addCriterion("lang_english =", value, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishNotEqualTo(String value) {
            addCriterion("lang_english <>", value, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishGreaterThan(String value) {
            addCriterion("lang_english >", value, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("lang_english >=", value, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishLessThan(String value) {
            addCriterion("lang_english <", value, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishLessThanOrEqualTo(String value) {
            addCriterion("lang_english <=", value, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishLike(String value) {
            addCriterion("lang_english like", value, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishNotLike(String value) {
            addCriterion("lang_english not like", value, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishIn(List<String> values) {
            addCriterion("lang_english in", values, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishNotIn(List<String> values) {
            addCriterion("lang_english not in", values, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishBetween(String value1, String value2) {
            addCriterion("lang_english between", value1, value2, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangEnglishNotBetween(String value1, String value2) {
            addCriterion("lang_english not between", value1, value2, "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangMandarinIsNull() {
            addCriterion("lang_mandarin is null");
            return (Criteria) this;
        }

        public Criteria andLangMandarinIsNotNull() {
            addCriterion("lang_mandarin is not null");
            return (Criteria) this;
        }

        public Criteria andLangMandarinEqualTo(String value) {
            addCriterion("lang_mandarin =", value, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinNotEqualTo(String value) {
            addCriterion("lang_mandarin <>", value, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinGreaterThan(String value) {
            addCriterion("lang_mandarin >", value, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinGreaterThanOrEqualTo(String value) {
            addCriterion("lang_mandarin >=", value, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinLessThan(String value) {
            addCriterion("lang_mandarin <", value, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinLessThanOrEqualTo(String value) {
            addCriterion("lang_mandarin <=", value, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinLike(String value) {
            addCriterion("lang_mandarin like", value, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinNotLike(String value) {
            addCriterion("lang_mandarin not like", value, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinIn(List<String> values) {
            addCriterion("lang_mandarin in", values, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinNotIn(List<String> values) {
            addCriterion("lang_mandarin not in", values, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinBetween(String value1, String value2) {
            addCriterion("lang_mandarin between", value1, value2, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLangMandarinNotBetween(String value1, String value2) {
            addCriterion("lang_mandarin not between", value1, value2, "langMandarin");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNull() {
            addCriterion("line_code is null");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNotNull() {
            addCriterion("line_code is not null");
            return (Criteria) this;
        }

        public Criteria andLineCodeEqualTo(Integer value) {
            addCriterion("line_code =", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotEqualTo(Integer value) {
            addCriterion("line_code <>", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThan(Integer value) {
            addCriterion("line_code >", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_code >=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThan(Integer value) {
            addCriterion("line_code <", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThanOrEqualTo(Integer value) {
            addCriterion("line_code <=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeIn(List<Integer> values) {
            addCriterion("line_code in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotIn(List<Integer> values) {
            addCriterion("line_code not in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeBetween(Integer value1, Integer value2) {
            addCriterion("line_code between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("line_code not between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedIsNull() {
            addCriterion("general_configuration_selected is null");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedIsNotNull() {
            addCriterion("general_configuration_selected is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedEqualTo(Boolean value) {
            addCriterion("general_configuration_selected =", value, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedNotEqualTo(Boolean value) {
            addCriterion("general_configuration_selected <>", value, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedGreaterThan(Boolean value) {
            addCriterion("general_configuration_selected >", value, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("general_configuration_selected >=", value, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedLessThan(Boolean value) {
            addCriterion("general_configuration_selected <", value, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedLessThanOrEqualTo(Boolean value) {
            addCriterion("general_configuration_selected <=", value, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedIn(List<Boolean> values) {
            addCriterion("general_configuration_selected in", values, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedNotIn(List<Boolean> values) {
            addCriterion("general_configuration_selected not in", values, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedBetween(Boolean value1, Boolean value2) {
            addCriterion("general_configuration_selected between", value1, value2, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andGeneralConfigurationSelectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("general_configuration_selected not between", value1, value2, "generalConfigurationSelected");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitIsNull() {
            addCriterion("downlink_speed_limit is null");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitIsNotNull() {
            addCriterion("downlink_speed_limit is not null");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitEqualTo(Integer value) {
            addCriterion("downlink_speed_limit =", value, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitNotEqualTo(Integer value) {
            addCriterion("downlink_speed_limit <>", value, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitGreaterThan(Integer value) {
            addCriterion("downlink_speed_limit >", value, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("downlink_speed_limit >=", value, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitLessThan(Integer value) {
            addCriterion("downlink_speed_limit <", value, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitLessThanOrEqualTo(Integer value) {
            addCriterion("downlink_speed_limit <=", value, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitIn(List<Integer> values) {
            addCriterion("downlink_speed_limit in", values, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitNotIn(List<Integer> values) {
            addCriterion("downlink_speed_limit not in", values, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitBetween(Integer value1, Integer value2) {
            addCriterion("downlink_speed_limit between", value1, value2, "downlinkSpeedLimit");
            return (Criteria) this;
        }

        public Criteria andDownlinkSpeedLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("downlink_speed_limit not between", value1, value2, "downlinkSpeedLimit");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLangDialectIsNull() {
            addCriterion("lang_dialect is null");
            return (Criteria) this;
        }

        public Criteria andLangDialectIsNotNull() {
            addCriterion("lang_dialect is not null");
            return (Criteria) this;
        }

        public Criteria andLangDialectEqualTo(String value) {
            addCriterion("lang_dialect =", value, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectNotEqualTo(String value) {
            addCriterion("lang_dialect <>", value, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectGreaterThan(String value) {
            addCriterion("lang_dialect >", value, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectGreaterThanOrEqualTo(String value) {
            addCriterion("lang_dialect >=", value, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectLessThan(String value) {
            addCriterion("lang_dialect <", value, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectLessThanOrEqualTo(String value) {
            addCriterion("lang_dialect <=", value, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectLike(String value) {
            addCriterion("lang_dialect like", value, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectNotLike(String value) {
            addCriterion("lang_dialect not like", value, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectIn(List<String> values) {
            addCriterion("lang_dialect in", values, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectNotIn(List<String> values) {
            addCriterion("lang_dialect not in", values, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectBetween(String value1, String value2) {
            addCriterion("lang_dialect between", value1, value2, "langDialect");
            return (Criteria) this;
        }

        public Criteria andLangDialectNotBetween(String value1, String value2) {
            addCriterion("lang_dialect not between", value1, value2, "langDialect");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedIsNull() {
            addCriterion("preset_event_selected is null");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedIsNotNull() {
            addCriterion("preset_event_selected is not null");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedEqualTo(Boolean value) {
            addCriterion("preset_event_selected =", value, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedNotEqualTo(Boolean value) {
            addCriterion("preset_event_selected <>", value, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedGreaterThan(Boolean value) {
            addCriterion("preset_event_selected >", value, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("preset_event_selected >=", value, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedLessThan(Boolean value) {
            addCriterion("preset_event_selected <", value, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedLessThanOrEqualTo(Boolean value) {
            addCriterion("preset_event_selected <=", value, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedIn(List<Boolean> values) {
            addCriterion("preset_event_selected in", values, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedNotIn(List<Boolean> values) {
            addCriterion("preset_event_selected not in", values, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedBetween(Boolean value1, Boolean value2) {
            addCriterion("preset_event_selected between", value1, value2, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andPresetEventSelectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("preset_event_selected not between", value1, value2, "presetEventSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedIsNull() {
            addCriterion("line_properties_selected is null");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedIsNotNull() {
            addCriterion("line_properties_selected is not null");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedEqualTo(Boolean value) {
            addCriterion("line_properties_selected =", value, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedNotEqualTo(Boolean value) {
            addCriterion("line_properties_selected <>", value, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedGreaterThan(Boolean value) {
            addCriterion("line_properties_selected >", value, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("line_properties_selected >=", value, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedLessThan(Boolean value) {
            addCriterion("line_properties_selected <", value, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedLessThanOrEqualTo(Boolean value) {
            addCriterion("line_properties_selected <=", value, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedIn(List<Boolean> values) {
            addCriterion("line_properties_selected in", values, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedNotIn(List<Boolean> values) {
            addCriterion("line_properties_selected not in", values, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedBetween(Boolean value1, Boolean value2) {
            addCriterion("line_properties_selected between", value1, value2, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLinePropertiesSelectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("line_properties_selected not between", value1, value2, "linePropertiesSelected");
            return (Criteria) this;
        }

        public Criteria andLineAttrLikeInsensitive(String value) {
            addCriterion("upper(line_attr) like", value.toUpperCase(), "lineAttr");
            return (Criteria) this;
        }

        public Criteria andLangEnglishLikeInsensitive(String value) {
            addCriterion("upper(lang_english) like", value.toUpperCase(), "langEnglish");
            return (Criteria) this;
        }

        public Criteria andLangMandarinLikeInsensitive(String value) {
            addCriterion("upper(lang_mandarin) like", value.toUpperCase(), "langMandarin");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andLangDialectLikeInsensitive(String value) {
            addCriterion("upper(lang_dialect) like", value.toUpperCase(), "langDialect");
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