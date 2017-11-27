package com.lty.tmp.service.bean.entity.autocreate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andPartnerIdIsNull() {
            addCriterion("partner_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNotNull() {
            addCriterion("partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdEqualTo(Integer value) {
            addCriterion("partner_id =", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotEqualTo(Integer value) {
            addCriterion("partner_id <>", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThan(Integer value) {
            addCriterion("partner_id >", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_id >=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThan(Integer value) {
            addCriterion("partner_id <", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("partner_id <=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIn(List<Integer> values) {
            addCriterion("partner_id in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotIn(List<Integer> values) {
            addCriterion("partner_id not in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdBetween(Integer value1, Integer value2) {
            addCriterion("partner_id between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_id not between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(Integer value) {
            addCriterion("currency_id =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(Integer value) {
            addCriterion("currency_id <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(Integer value) {
            addCriterion("currency_id >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("currency_id >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(Integer value) {
            addCriterion("currency_id <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(Integer value) {
            addCriterion("currency_id <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<Integer> values) {
            addCriterion("currency_id in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<Integer> values) {
            addCriterion("currency_id not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(Integer value1, Integer value2) {
            addCriterion("currency_id between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("currency_id not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andRmlFooterIsNull() {
            addCriterion("rml_footer is null");
            return (Criteria) this;
        }

        public Criteria andRmlFooterIsNotNull() {
            addCriterion("rml_footer is not null");
            return (Criteria) this;
        }

        public Criteria andRmlFooterEqualTo(String value) {
            addCriterion("rml_footer =", value, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterNotEqualTo(String value) {
            addCriterion("rml_footer <>", value, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterGreaterThan(String value) {
            addCriterion("rml_footer >", value, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterGreaterThanOrEqualTo(String value) {
            addCriterion("rml_footer >=", value, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterLessThan(String value) {
            addCriterion("rml_footer <", value, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterLessThanOrEqualTo(String value) {
            addCriterion("rml_footer <=", value, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterLike(String value) {
            addCriterion("rml_footer like", value, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterNotLike(String value) {
            addCriterion("rml_footer not like", value, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterIn(List<String> values) {
            addCriterion("rml_footer in", values, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterNotIn(List<String> values) {
            addCriterion("rml_footer not in", values, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterBetween(String value1, String value2) {
            addCriterion("rml_footer between", value1, value2, "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlFooterNotBetween(String value1, String value2) {
            addCriterion("rml_footer not between", value1, value2, "rmlFooter");
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

        public Criteria andRmlHeaderIsNull() {
            addCriterion("rml_header is null");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderIsNotNull() {
            addCriterion("rml_header is not null");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderEqualTo(String value) {
            addCriterion("rml_header =", value, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderNotEqualTo(String value) {
            addCriterion("rml_header <>", value, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderGreaterThan(String value) {
            addCriterion("rml_header >", value, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("rml_header >=", value, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderLessThan(String value) {
            addCriterion("rml_header <", value, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderLessThanOrEqualTo(String value) {
            addCriterion("rml_header <=", value, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderLike(String value) {
            addCriterion("rml_header like", value, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderNotLike(String value) {
            addCriterion("rml_header not like", value, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderIn(List<String> values) {
            addCriterion("rml_header in", values, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderNotIn(List<String> values) {
            addCriterion("rml_header not in", values, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderBetween(String value1, String value2) {
            addCriterion("rml_header between", value1, value2, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderNotBetween(String value1, String value2) {
            addCriterion("rml_header not between", value1, value2, "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatIsNull() {
            addCriterion("rml_paper_format is null");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatIsNotNull() {
            addCriterion("rml_paper_format is not null");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatEqualTo(String value) {
            addCriterion("rml_paper_format =", value, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatNotEqualTo(String value) {
            addCriterion("rml_paper_format <>", value, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatGreaterThan(String value) {
            addCriterion("rml_paper_format >", value, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatGreaterThanOrEqualTo(String value) {
            addCriterion("rml_paper_format >=", value, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatLessThan(String value) {
            addCriterion("rml_paper_format <", value, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatLessThanOrEqualTo(String value) {
            addCriterion("rml_paper_format <=", value, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatLike(String value) {
            addCriterion("rml_paper_format like", value, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatNotLike(String value) {
            addCriterion("rml_paper_format not like", value, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatIn(List<String> values) {
            addCriterion("rml_paper_format in", values, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatNotIn(List<String> values) {
            addCriterion("rml_paper_format not in", values, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatBetween(String value1, String value2) {
            addCriterion("rml_paper_format between", value1, value2, "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatNotBetween(String value1, String value2) {
            addCriterion("rml_paper_format not between", value1, value2, "rmlPaperFormat");
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

        public Criteria andFontIsNull() {
            addCriterion("font is null");
            return (Criteria) this;
        }

        public Criteria andFontIsNotNull() {
            addCriterion("font is not null");
            return (Criteria) this;
        }

        public Criteria andFontEqualTo(Integer value) {
            addCriterion("font =", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotEqualTo(Integer value) {
            addCriterion("font <>", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontGreaterThan(Integer value) {
            addCriterion("font >", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontGreaterThanOrEqualTo(Integer value) {
            addCriterion("font >=", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontLessThan(Integer value) {
            addCriterion("font <", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontLessThanOrEqualTo(Integer value) {
            addCriterion("font <=", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontIn(List<Integer> values) {
            addCriterion("font in", values, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotIn(List<Integer> values) {
            addCriterion("font not in", values, "font");
            return (Criteria) this;
        }

        public Criteria andFontBetween(Integer value1, Integer value2) {
            addCriterion("font between", value1, value2, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotBetween(Integer value1, Integer value2) {
            addCriterion("font not between", value1, value2, "font");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("account_no =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("account_no <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("account_no >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("account_no <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("account_no like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("account_no not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("account_no in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("account_no not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andCustomFooterIsNull() {
            addCriterion("custom_footer is null");
            return (Criteria) this;
        }

        public Criteria andCustomFooterIsNotNull() {
            addCriterion("custom_footer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomFooterEqualTo(Boolean value) {
            addCriterion("custom_footer =", value, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterNotEqualTo(Boolean value) {
            addCriterion("custom_footer <>", value, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterGreaterThan(Boolean value) {
            addCriterion("custom_footer >", value, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("custom_footer >=", value, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterLessThan(Boolean value) {
            addCriterion("custom_footer <", value, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterLessThanOrEqualTo(Boolean value) {
            addCriterion("custom_footer <=", value, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterIn(List<Boolean> values) {
            addCriterion("custom_footer in", values, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterNotIn(List<Boolean> values) {
            addCriterion("custom_footer not in", values, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterBetween(Boolean value1, Boolean value2) {
            addCriterion("custom_footer between", value1, value2, "customFooter");
            return (Criteria) this;
        }

        public Criteria andCustomFooterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("custom_footer not between", value1, value2, "customFooter");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2IsNull() {
            addCriterion("rml_header2 is null");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2IsNotNull() {
            addCriterion("rml_header2 is not null");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2EqualTo(String value) {
            addCriterion("rml_header2 =", value, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2NotEqualTo(String value) {
            addCriterion("rml_header2 <>", value, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2GreaterThan(String value) {
            addCriterion("rml_header2 >", value, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2GreaterThanOrEqualTo(String value) {
            addCriterion("rml_header2 >=", value, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2LessThan(String value) {
            addCriterion("rml_header2 <", value, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2LessThanOrEqualTo(String value) {
            addCriterion("rml_header2 <=", value, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2Like(String value) {
            addCriterion("rml_header2 like", value, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2NotLike(String value) {
            addCriterion("rml_header2 not like", value, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2In(List<String> values) {
            addCriterion("rml_header2 in", values, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2NotIn(List<String> values) {
            addCriterion("rml_header2 not in", values, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2Between(String value1, String value2) {
            addCriterion("rml_header2 between", value1, value2, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2NotBetween(String value1, String value2) {
            addCriterion("rml_header2 not between", value1, value2, "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3IsNull() {
            addCriterion("rml_header3 is null");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3IsNotNull() {
            addCriterion("rml_header3 is not null");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3EqualTo(String value) {
            addCriterion("rml_header3 =", value, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3NotEqualTo(String value) {
            addCriterion("rml_header3 <>", value, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3GreaterThan(String value) {
            addCriterion("rml_header3 >", value, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3GreaterThanOrEqualTo(String value) {
            addCriterion("rml_header3 >=", value, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3LessThan(String value) {
            addCriterion("rml_header3 <", value, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3LessThanOrEqualTo(String value) {
            addCriterion("rml_header3 <=", value, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3Like(String value) {
            addCriterion("rml_header3 like", value, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3NotLike(String value) {
            addCriterion("rml_header3 not like", value, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3In(List<String> values) {
            addCriterion("rml_header3 in", values, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3NotIn(List<String> values) {
            addCriterion("rml_header3 not in", values, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3Between(String value1, String value2) {
            addCriterion("rml_header3 between", value1, value2, "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3NotBetween(String value1, String value2) {
            addCriterion("rml_header3 not between", value1, value2, "rmlHeader3");
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

        public Criteria andRmlHeader1IsNull() {
            addCriterion("rml_header1 is null");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1IsNotNull() {
            addCriterion("rml_header1 is not null");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1EqualTo(String value) {
            addCriterion("rml_header1 =", value, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1NotEqualTo(String value) {
            addCriterion("rml_header1 <>", value, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1GreaterThan(String value) {
            addCriterion("rml_header1 >", value, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1GreaterThanOrEqualTo(String value) {
            addCriterion("rml_header1 >=", value, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1LessThan(String value) {
            addCriterion("rml_header1 <", value, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1LessThanOrEqualTo(String value) {
            addCriterion("rml_header1 <=", value, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1Like(String value) {
            addCriterion("rml_header1 like", value, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1NotLike(String value) {
            addCriterion("rml_header1 not like", value, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1In(List<String> values) {
            addCriterion("rml_header1 in", values, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1NotIn(List<String> values) {
            addCriterion("rml_header1 not in", values, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1Between(String value1, String value2) {
            addCriterion("rml_header1 between", value1, value2, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1NotBetween(String value1, String value2) {
            addCriterion("rml_header1 not between", value1, value2, "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryIsNull() {
            addCriterion("company_registry is null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryIsNotNull() {
            addCriterion("company_registry is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryEqualTo(String value) {
            addCriterion("company_registry =", value, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryNotEqualTo(String value) {
            addCriterion("company_registry <>", value, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryGreaterThan(String value) {
            addCriterion("company_registry >", value, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryGreaterThanOrEqualTo(String value) {
            addCriterion("company_registry >=", value, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryLessThan(String value) {
            addCriterion("company_registry <", value, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryLessThanOrEqualTo(String value) {
            addCriterion("company_registry <=", value, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryLike(String value) {
            addCriterion("company_registry like", value, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryNotLike(String value) {
            addCriterion("company_registry not like", value, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryIn(List<String> values) {
            addCriterion("company_registry in", values, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryNotIn(List<String> values) {
            addCriterion("company_registry not in", values, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryBetween(String value1, String value2) {
            addCriterion("company_registry between", value1, value2, "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryNotBetween(String value1, String value2) {
            addCriterion("company_registry not between", value1, value2, "companyRegistry");
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

        public Criteria andTbpPortIsNull() {
            addCriterion("tbp_port is null");
            return (Criteria) this;
        }

        public Criteria andTbpPortIsNotNull() {
            addCriterion("tbp_port is not null");
            return (Criteria) this;
        }

        public Criteria andTbpPortEqualTo(Integer value) {
            addCriterion("tbp_port =", value, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortNotEqualTo(Integer value) {
            addCriterion("tbp_port <>", value, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortGreaterThan(Integer value) {
            addCriterion("tbp_port >", value, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbp_port >=", value, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortLessThan(Integer value) {
            addCriterion("tbp_port <", value, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortLessThanOrEqualTo(Integer value) {
            addCriterion("tbp_port <=", value, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortIn(List<Integer> values) {
            addCriterion("tbp_port in", values, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortNotIn(List<Integer> values) {
            addCriterion("tbp_port not in", values, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortBetween(Integer value1, Integer value2) {
            addCriterion("tbp_port between", value1, value2, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpPortNotBetween(Integer value1, Integer value2) {
            addCriterion("tbp_port not between", value1, value2, "tbpPort");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolIsNull() {
            addCriterion("tbp_protocol is null");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolIsNotNull() {
            addCriterion("tbp_protocol is not null");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolEqualTo(String value) {
            addCriterion("tbp_protocol =", value, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolNotEqualTo(String value) {
            addCriterion("tbp_protocol <>", value, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolGreaterThan(String value) {
            addCriterion("tbp_protocol >", value, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_protocol >=", value, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolLessThan(String value) {
            addCriterion("tbp_protocol <", value, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolLessThanOrEqualTo(String value) {
            addCriterion("tbp_protocol <=", value, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolLike(String value) {
            addCriterion("tbp_protocol like", value, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolNotLike(String value) {
            addCriterion("tbp_protocol not like", value, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolIn(List<String> values) {
            addCriterion("tbp_protocol in", values, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolNotIn(List<String> values) {
            addCriterion("tbp_protocol not in", values, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolBetween(String value1, String value2) {
            addCriterion("tbp_protocol between", value1, value2, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolNotBetween(String value1, String value2) {
            addCriterion("tbp_protocol not between", value1, value2, "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayIsNull() {
            addCriterion("dispatch_send_delay is null");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayIsNotNull() {
            addCriterion("dispatch_send_delay is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayEqualTo(Integer value) {
            addCriterion("dispatch_send_delay =", value, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayNotEqualTo(Integer value) {
            addCriterion("dispatch_send_delay <>", value, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayGreaterThan(Integer value) {
            addCriterion("dispatch_send_delay >", value, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatch_send_delay >=", value, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayLessThan(Integer value) {
            addCriterion("dispatch_send_delay <", value, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayLessThanOrEqualTo(Integer value) {
            addCriterion("dispatch_send_delay <=", value, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayIn(List<Integer> values) {
            addCriterion("dispatch_send_delay in", values, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayNotIn(List<Integer> values) {
            addCriterion("dispatch_send_delay not in", values, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_send_delay between", value1, value2, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchSendDelayNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_send_delay not between", value1, value2, "dispatchSendDelay");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressIsNull() {
            addCriterion("dispatch_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressIsNotNull() {
            addCriterion("dispatch_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressEqualTo(String value) {
            addCriterion("dispatch_ip_address =", value, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressNotEqualTo(String value) {
            addCriterion("dispatch_ip_address <>", value, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressGreaterThan(String value) {
            addCriterion("dispatch_ip_address >", value, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dispatch_ip_address >=", value, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressLessThan(String value) {
            addCriterion("dispatch_ip_address <", value, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressLessThanOrEqualTo(String value) {
            addCriterion("dispatch_ip_address <=", value, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressLike(String value) {
            addCriterion("dispatch_ip_address like", value, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressNotLike(String value) {
            addCriterion("dispatch_ip_address not like", value, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressIn(List<String> values) {
            addCriterion("dispatch_ip_address in", values, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressNotIn(List<String> values) {
            addCriterion("dispatch_ip_address not in", values, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressBetween(String value1, String value2) {
            addCriterion("dispatch_ip_address between", value1, value2, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressNotBetween(String value1, String value2) {
            addCriterion("dispatch_ip_address not between", value1, value2, "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoPortIsNull() {
            addCriterion("video_port is null");
            return (Criteria) this;
        }

        public Criteria andVideoPortIsNotNull() {
            addCriterion("video_port is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPortEqualTo(Integer value) {
            addCriterion("video_port =", value, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortNotEqualTo(Integer value) {
            addCriterion("video_port <>", value, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortGreaterThan(Integer value) {
            addCriterion("video_port >", value, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_port >=", value, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortLessThan(Integer value) {
            addCriterion("video_port <", value, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortLessThanOrEqualTo(Integer value) {
            addCriterion("video_port <=", value, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortIn(List<Integer> values) {
            addCriterion("video_port in", values, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortNotIn(List<Integer> values) {
            addCriterion("video_port not in", values, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortBetween(Integer value1, Integer value2) {
            addCriterion("video_port between", value1, value2, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoPortNotBetween(Integer value1, Integer value2) {
            addCriterion("video_port not between", value1, value2, "videoPort");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolIsNull() {
            addCriterion("video_protocol is null");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolIsNotNull() {
            addCriterion("video_protocol is not null");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolEqualTo(String value) {
            addCriterion("video_protocol =", value, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolNotEqualTo(String value) {
            addCriterion("video_protocol <>", value, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolGreaterThan(String value) {
            addCriterion("video_protocol >", value, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("video_protocol >=", value, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolLessThan(String value) {
            addCriterion("video_protocol <", value, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolLessThanOrEqualTo(String value) {
            addCriterion("video_protocol <=", value, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolLike(String value) {
            addCriterion("video_protocol like", value, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolNotLike(String value) {
            addCriterion("video_protocol not like", value, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolIn(List<String> values) {
            addCriterion("video_protocol in", values, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolNotIn(List<String> values) {
            addCriterion("video_protocol not in", values, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolBetween(String value1, String value2) {
            addCriterion("video_protocol between", value1, value2, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolNotBetween(String value1, String value2) {
            addCriterion("video_protocol not between", value1, value2, "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchPortIsNull() {
            addCriterion("dispatch_port is null");
            return (Criteria) this;
        }

        public Criteria andDispatchPortIsNotNull() {
            addCriterion("dispatch_port is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchPortEqualTo(Integer value) {
            addCriterion("dispatch_port =", value, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortNotEqualTo(Integer value) {
            addCriterion("dispatch_port <>", value, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortGreaterThan(Integer value) {
            addCriterion("dispatch_port >", value, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatch_port >=", value, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortLessThan(Integer value) {
            addCriterion("dispatch_port <", value, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortLessThanOrEqualTo(Integer value) {
            addCriterion("dispatch_port <=", value, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortIn(List<Integer> values) {
            addCriterion("dispatch_port in", values, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortNotIn(List<Integer> values) {
            addCriterion("dispatch_port not in", values, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_port between", value1, value2, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchPortNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_port not between", value1, value2, "dispatchPort");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolIsNull() {
            addCriterion("dispatch_protocol is null");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolIsNotNull() {
            addCriterion("dispatch_protocol is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolEqualTo(String value) {
            addCriterion("dispatch_protocol =", value, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolNotEqualTo(String value) {
            addCriterion("dispatch_protocol <>", value, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolGreaterThan(String value) {
            addCriterion("dispatch_protocol >", value, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("dispatch_protocol >=", value, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolLessThan(String value) {
            addCriterion("dispatch_protocol <", value, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolLessThanOrEqualTo(String value) {
            addCriterion("dispatch_protocol <=", value, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolLike(String value) {
            addCriterion("dispatch_protocol like", value, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolNotLike(String value) {
            addCriterion("dispatch_protocol not like", value, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolIn(List<String> values) {
            addCriterion("dispatch_protocol in", values, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolNotIn(List<String> values) {
            addCriterion("dispatch_protocol not in", values, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolBetween(String value1, String value2) {
            addCriterion("dispatch_protocol between", value1, value2, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolNotBetween(String value1, String value2) {
            addCriterion("dispatch_protocol not between", value1, value2, "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressIsNull() {
            addCriterion("video_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressIsNotNull() {
            addCriterion("video_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressEqualTo(String value) {
            addCriterion("video_ip_address =", value, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressNotEqualTo(String value) {
            addCriterion("video_ip_address <>", value, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressGreaterThan(String value) {
            addCriterion("video_ip_address >", value, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("video_ip_address >=", value, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressLessThan(String value) {
            addCriterion("video_ip_address <", value, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressLessThanOrEqualTo(String value) {
            addCriterion("video_ip_address <=", value, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressLike(String value) {
            addCriterion("video_ip_address like", value, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressNotLike(String value) {
            addCriterion("video_ip_address not like", value, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressIn(List<String> values) {
            addCriterion("video_ip_address in", values, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressNotIn(List<String> values) {
            addCriterion("video_ip_address not in", values, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressBetween(String value1, String value2) {
            addCriterion("video_ip_address between", value1, value2, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressNotBetween(String value1, String value2) {
            addCriterion("video_ip_address not between", value1, value2, "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressIsNull() {
            addCriterion("tbp_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressIsNotNull() {
            addCriterion("tbp_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressEqualTo(String value) {
            addCriterion("tbp_ip_address =", value, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressNotEqualTo(String value) {
            addCriterion("tbp_ip_address <>", value, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressGreaterThan(String value) {
            addCriterion("tbp_ip_address >", value, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_ip_address >=", value, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressLessThan(String value) {
            addCriterion("tbp_ip_address <", value, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressLessThanOrEqualTo(String value) {
            addCriterion("tbp_ip_address <=", value, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressLike(String value) {
            addCriterion("tbp_ip_address like", value, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressNotLike(String value) {
            addCriterion("tbp_ip_address not like", value, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressIn(List<String> values) {
            addCriterion("tbp_ip_address in", values, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressNotIn(List<String> values) {
            addCriterion("tbp_ip_address not in", values, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressBetween(String value1, String value2) {
            addCriterion("tbp_ip_address between", value1, value2, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressNotBetween(String value1, String value2) {
            addCriterion("tbp_ip_address not between", value1, value2, "tbpIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayIsNull() {
            addCriterion("video_send_delay is null");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayIsNotNull() {
            addCriterion("video_send_delay is not null");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayEqualTo(Integer value) {
            addCriterion("video_send_delay =", value, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayNotEqualTo(Integer value) {
            addCriterion("video_send_delay <>", value, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayGreaterThan(Integer value) {
            addCriterion("video_send_delay >", value, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_send_delay >=", value, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayLessThan(Integer value) {
            addCriterion("video_send_delay <", value, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayLessThanOrEqualTo(Integer value) {
            addCriterion("video_send_delay <=", value, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayIn(List<Integer> values) {
            addCriterion("video_send_delay in", values, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayNotIn(List<Integer> values) {
            addCriterion("video_send_delay not in", values, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayBetween(Integer value1, Integer value2) {
            addCriterion("video_send_delay between", value1, value2, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andVideoSendDelayNotBetween(Integer value1, Integer value2) {
            addCriterion("video_send_delay not between", value1, value2, "videoSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayIsNull() {
            addCriterion("tbp_send_delay is null");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayIsNotNull() {
            addCriterion("tbp_send_delay is not null");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayEqualTo(Integer value) {
            addCriterion("tbp_send_delay =", value, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayNotEqualTo(Integer value) {
            addCriterion("tbp_send_delay <>", value, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayGreaterThan(Integer value) {
            addCriterion("tbp_send_delay >", value, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbp_send_delay >=", value, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayLessThan(Integer value) {
            addCriterion("tbp_send_delay <", value, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayLessThanOrEqualTo(Integer value) {
            addCriterion("tbp_send_delay <=", value, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayIn(List<Integer> values) {
            addCriterion("tbp_send_delay in", values, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayNotIn(List<Integer> values) {
            addCriterion("tbp_send_delay not in", values, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayBetween(Integer value1, Integer value2) {
            addCriterion("tbp_send_delay between", value1, value2, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andTbpSendDelayNotBetween(Integer value1, Integer value2) {
            addCriterion("tbp_send_delay not between", value1, value2, "tbpSendDelay");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Integer value) {
            addCriterion("version_id =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Integer value) {
            addCriterion("version_id <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Integer value) {
            addCriterion("version_id >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_id >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Integer value) {
            addCriterion("version_id <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("version_id <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Integer> values) {
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Integer> values) {
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("version_id between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("version_id not between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andRmlFooterLikeInsensitive(String value) {
            addCriterion("upper(rml_footer) like", value.toUpperCase(), "rmlFooter");
            return (Criteria) this;
        }

        public Criteria andRmlHeaderLikeInsensitive(String value) {
            addCriterion("upper(rml_header) like", value.toUpperCase(), "rmlHeader");
            return (Criteria) this;
        }

        public Criteria andRmlPaperFormatLikeInsensitive(String value) {
            addCriterion("upper(rml_paper_format) like", value.toUpperCase(), "rmlPaperFormat");
            return (Criteria) this;
        }

        public Criteria andAccountNoLikeInsensitive(String value) {
            addCriterion("upper(account_no) like", value.toUpperCase(), "accountNo");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andRmlHeader2LikeInsensitive(String value) {
            addCriterion("upper(rml_header2) like", value.toUpperCase(), "rmlHeader2");
            return (Criteria) this;
        }

        public Criteria andRmlHeader3LikeInsensitive(String value) {
            addCriterion("upper(rml_header3) like", value.toUpperCase(), "rmlHeader3");
            return (Criteria) this;
        }

        public Criteria andRmlHeader1LikeInsensitive(String value) {
            addCriterion("upper(rml_header1) like", value.toUpperCase(), "rmlHeader1");
            return (Criteria) this;
        }

        public Criteria andCompanyRegistryLikeInsensitive(String value) {
            addCriterion("upper(company_registry) like", value.toUpperCase(), "companyRegistry");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLikeInsensitive(String value) {
            addCriterion("upper(company_code) like", value.toUpperCase(), "companyCode");
            return (Criteria) this;
        }

        public Criteria andTbpProtocolLikeInsensitive(String value) {
            addCriterion("upper(tbp_protocol) like", value.toUpperCase(), "tbpProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchIpAddressLikeInsensitive(String value) {
            addCriterion("upper(dispatch_ip_address) like", value.toUpperCase(), "dispatchIpAddress");
            return (Criteria) this;
        }

        public Criteria andVideoProtocolLikeInsensitive(String value) {
            addCriterion("upper(video_protocol) like", value.toUpperCase(), "videoProtocol");
            return (Criteria) this;
        }

        public Criteria andDispatchProtocolLikeInsensitive(String value) {
            addCriterion("upper(dispatch_protocol) like", value.toUpperCase(), "dispatchProtocol");
            return (Criteria) this;
        }

        public Criteria andVideoIpAddressLikeInsensitive(String value) {
            addCriterion("upper(video_ip_address) like", value.toUpperCase(), "videoIpAddress");
            return (Criteria) this;
        }

        public Criteria andTbpIpAddressLikeInsensitive(String value) {
            addCriterion("upper(tbp_ip_address) like", value.toUpperCase(), "tbpIpAddress");
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