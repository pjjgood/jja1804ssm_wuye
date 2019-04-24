package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class MyHouseExample {
    /**
     * wy_house
     */
    protected String orderByClause;

    /**
     * wy_house
     */
    protected boolean distinct;

    /**
     * wy_house
     */
    protected List<Criteria> oredCriteria;

    public MyHouseExample() {
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

    /**
     * wy_house 2019-04-23
     */
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHnumberIsNull() {
            addCriterion("hNumber is null");
            return (Criteria) this;
        }

        public Criteria andHnumberIsNotNull() {
            addCriterion("hNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHnumberEqualTo(String value) {
            addCriterion("hNumber =", value, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberNotEqualTo(String value) {
            addCriterion("hNumber <>", value, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberGreaterThan(String value) {
            addCriterion("hNumber >", value, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberGreaterThanOrEqualTo(String value) {
            addCriterion("hNumber >=", value, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberLessThan(String value) {
            addCriterion("hNumber <", value, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberLessThanOrEqualTo(String value) {
            addCriterion("hNumber <=", value, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberLike(String value) {
            addCriterion("hNumber like", value, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberNotLike(String value) {
            addCriterion("hNumber not like", value, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberIn(List<String> values) {
            addCriterion("hNumber in", values, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberNotIn(List<String> values) {
            addCriterion("hNumber not in", values, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberBetween(String value1, String value2) {
            addCriterion("hNumber between", value1, value2, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHnumberNotBetween(String value1, String value2) {
            addCriterion("hNumber not between", value1, value2, "hnumber");
            return (Criteria) this;
        }

        public Criteria andHstateIsNull() {
            addCriterion("hState is null");
            return (Criteria) this;
        }

        public Criteria andHstateIsNotNull() {
            addCriterion("hState is not null");
            return (Criteria) this;
        }

        public Criteria andHstateEqualTo(String value) {
            addCriterion("hState =", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateNotEqualTo(String value) {
            addCriterion("hState <>", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateGreaterThan(String value) {
            addCriterion("hState >", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateGreaterThanOrEqualTo(String value) {
            addCriterion("hState >=", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateLessThan(String value) {
            addCriterion("hState <", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateLessThanOrEqualTo(String value) {
            addCriterion("hState <=", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateLike(String value) {
            addCriterion("hState like", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateNotLike(String value) {
            addCriterion("hState not like", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateIn(List<String> values) {
            addCriterion("hState in", values, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateNotIn(List<String> values) {
            addCriterion("hState not in", values, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateBetween(String value1, String value2) {
            addCriterion("hState between", value1, value2, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateNotBetween(String value1, String value2) {
            addCriterion("hState not between", value1, value2, "hstate");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameIsNull() {
            addCriterion("hBulidingName is null");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameIsNotNull() {
            addCriterion("hBulidingName is not null");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameEqualTo(String value) {
            addCriterion("hBulidingName =", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameNotEqualTo(String value) {
            addCriterion("hBulidingName <>", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameGreaterThan(String value) {
            addCriterion("hBulidingName >", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameGreaterThanOrEqualTo(String value) {
            addCriterion("hBulidingName >=", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameLessThan(String value) {
            addCriterion("hBulidingName <", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameLessThanOrEqualTo(String value) {
            addCriterion("hBulidingName <=", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameLike(String value) {
            addCriterion("hBulidingName like", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameNotLike(String value) {
            addCriterion("hBulidingName not like", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameIn(List<String> values) {
            addCriterion("hBulidingName in", values, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameNotIn(List<String> values) {
            addCriterion("hBulidingName not in", values, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameBetween(String value1, String value2) {
            addCriterion("hBulidingName between", value1, value2, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameNotBetween(String value1, String value2) {
            addCriterion("hBulidingName not between", value1, value2, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHunitnumberIsNull() {
            addCriterion("hUnitNumber is null");
            return (Criteria) this;
        }

        public Criteria andHunitnumberIsNotNull() {
            addCriterion("hUnitNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHunitnumberEqualTo(Integer value) {
            addCriterion("hUnitNumber =", value, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberNotEqualTo(Integer value) {
            addCriterion("hUnitNumber <>", value, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberGreaterThan(Integer value) {
            addCriterion("hUnitNumber >", value, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hUnitNumber >=", value, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberLessThan(Integer value) {
            addCriterion("hUnitNumber <", value, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberLessThanOrEqualTo(Integer value) {
            addCriterion("hUnitNumber <=", value, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberIn(List<Integer> values) {
            addCriterion("hUnitNumber in", values, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberNotIn(List<Integer> values) {
            addCriterion("hUnitNumber not in", values, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberBetween(Integer value1, Integer value2) {
            addCriterion("hUnitNumber between", value1, value2, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHunitnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hUnitNumber not between", value1, value2, "hunitnumber");
            return (Criteria) this;
        }

        public Criteria andHfloorIsNull() {
            addCriterion("hFloor is null");
            return (Criteria) this;
        }

        public Criteria andHfloorIsNotNull() {
            addCriterion("hFloor is not null");
            return (Criteria) this;
        }

        public Criteria andHfloorEqualTo(Integer value) {
            addCriterion("hFloor =", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorNotEqualTo(Integer value) {
            addCriterion("hFloor <>", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorGreaterThan(Integer value) {
            addCriterion("hFloor >", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("hFloor >=", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorLessThan(Integer value) {
            addCriterion("hFloor <", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorLessThanOrEqualTo(Integer value) {
            addCriterion("hFloor <=", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorIn(List<Integer> values) {
            addCriterion("hFloor in", values, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorNotIn(List<Integer> values) {
            addCriterion("hFloor not in", values, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorBetween(Integer value1, Integer value2) {
            addCriterion("hFloor between", value1, value2, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorNotBetween(Integer value1, Integer value2) {
            addCriterion("hFloor not between", value1, value2, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHtypeidIsNull() {
            addCriterion("hTypeid is null");
            return (Criteria) this;
        }

        public Criteria andHtypeidIsNotNull() {
            addCriterion("hTypeid is not null");
            return (Criteria) this;
        }

        public Criteria andHtypeidEqualTo(Integer value) {
            addCriterion("hTypeid =", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotEqualTo(Integer value) {
            addCriterion("hTypeid <>", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidGreaterThan(Integer value) {
            addCriterion("hTypeid >", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hTypeid >=", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidLessThan(Integer value) {
            addCriterion("hTypeid <", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("hTypeid <=", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidIn(List<Integer> values) {
            addCriterion("hTypeid in", values, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotIn(List<Integer> values) {
            addCriterion("hTypeid not in", values, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidBetween(Integer value1, Integer value2) {
            addCriterion("hTypeid between", value1, value2, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("hTypeid not between", value1, value2, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHdirectionIsNull() {
            addCriterion("hDirection is null");
            return (Criteria) this;
        }

        public Criteria andHdirectionIsNotNull() {
            addCriterion("hDirection is not null");
            return (Criteria) this;
        }

        public Criteria andHdirectionEqualTo(String value) {
            addCriterion("hDirection =", value, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionNotEqualTo(String value) {
            addCriterion("hDirection <>", value, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionGreaterThan(String value) {
            addCriterion("hDirection >", value, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionGreaterThanOrEqualTo(String value) {
            addCriterion("hDirection >=", value, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionLessThan(String value) {
            addCriterion("hDirection <", value, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionLessThanOrEqualTo(String value) {
            addCriterion("hDirection <=", value, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionLike(String value) {
            addCriterion("hDirection like", value, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionNotLike(String value) {
            addCriterion("hDirection not like", value, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionIn(List<String> values) {
            addCriterion("hDirection in", values, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionNotIn(List<String> values) {
            addCriterion("hDirection not in", values, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionBetween(String value1, String value2) {
            addCriterion("hDirection between", value1, value2, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHdirectionNotBetween(String value1, String value2) {
            addCriterion("hDirection not between", value1, value2, "hdirection");
            return (Criteria) this;
        }

        public Criteria andHareaIsNull() {
            addCriterion("hArea is null");
            return (Criteria) this;
        }

        public Criteria andHareaIsNotNull() {
            addCriterion("hArea is not null");
            return (Criteria) this;
        }

        public Criteria andHareaEqualTo(String value) {
            addCriterion("hArea =", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaNotEqualTo(String value) {
            addCriterion("hArea <>", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaGreaterThan(String value) {
            addCriterion("hArea >", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaGreaterThanOrEqualTo(String value) {
            addCriterion("hArea >=", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaLessThan(String value) {
            addCriterion("hArea <", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaLessThanOrEqualTo(String value) {
            addCriterion("hArea <=", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaLike(String value) {
            addCriterion("hArea like", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaNotLike(String value) {
            addCriterion("hArea not like", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaIn(List<String> values) {
            addCriterion("hArea in", values, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaNotIn(List<String> values) {
            addCriterion("hArea not in", values, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaBetween(String value1, String value2) {
            addCriterion("hArea between", value1, value2, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaNotBetween(String value1, String value2) {
            addCriterion("hArea not between", value1, value2, "harea");
            return (Criteria) this;
        }

        public Criteria andHremarksIsNull() {
            addCriterion("hRemarks is null");
            return (Criteria) this;
        }

        public Criteria andHremarksIsNotNull() {
            addCriterion("hRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andHremarksEqualTo(String value) {
            addCriterion("hRemarks =", value, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksNotEqualTo(String value) {
            addCriterion("hRemarks <>", value, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksGreaterThan(String value) {
            addCriterion("hRemarks >", value, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksGreaterThanOrEqualTo(String value) {
            addCriterion("hRemarks >=", value, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksLessThan(String value) {
            addCriterion("hRemarks <", value, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksLessThanOrEqualTo(String value) {
            addCriterion("hRemarks <=", value, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksLike(String value) {
            addCriterion("hRemarks like", value, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksNotLike(String value) {
            addCriterion("hRemarks not like", value, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksIn(List<String> values) {
            addCriterion("hRemarks in", values, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksNotIn(List<String> values) {
            addCriterion("hRemarks not in", values, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksBetween(String value1, String value2) {
            addCriterion("hRemarks between", value1, value2, "hremarks");
            return (Criteria) this;
        }

        public Criteria andHremarksNotBetween(String value1, String value2) {
            addCriterion("hRemarks not between", value1, value2, "hremarks");
            return (Criteria) this;
        }

        public Criteria andOlidIsNull() {
            addCriterion("olid is null");
            return (Criteria) this;
        }

        public Criteria andOlidIsNotNull() {
            addCriterion("olid is not null");
            return (Criteria) this;
        }

        public Criteria andOlidEqualTo(Integer value) {
            addCriterion("olid =", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotEqualTo(Integer value) {
            addCriterion("olid <>", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThan(Integer value) {
            addCriterion("olid >", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("olid >=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThan(Integer value) {
            addCriterion("olid <", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThanOrEqualTo(Integer value) {
            addCriterion("olid <=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidIn(List<Integer> values) {
            addCriterion("olid in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotIn(List<Integer> values) {
            addCriterion("olid not in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidBetween(Integer value1, Integer value2) {
            addCriterion("olid between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotBetween(Integer value1, Integer value2) {
            addCriterion("olid not between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andAaaIsNull() {
            addCriterion("aaa is null");
            return (Criteria) this;
        }

        public Criteria andAaaIsNotNull() {
            addCriterion("aaa is not null");
            return (Criteria) this;
        }

        public Criteria andAaaEqualTo(String value) {
            addCriterion("aaa =", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaNotEqualTo(String value) {
            addCriterion("aaa <>", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaGreaterThan(String value) {
            addCriterion("aaa >", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaGreaterThanOrEqualTo(String value) {
            addCriterion("aaa >=", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaLessThan(String value) {
            addCriterion("aaa <", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaLessThanOrEqualTo(String value) {
            addCriterion("aaa <=", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaLike(String value) {
            addCriterion("aaa like", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaNotLike(String value) {
            addCriterion("aaa not like", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaIn(List<String> values) {
            addCriterion("aaa in", values, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaNotIn(List<String> values) {
            addCriterion("aaa not in", values, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaBetween(String value1, String value2) {
            addCriterion("aaa between", value1, value2, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaNotBetween(String value1, String value2) {
            addCriterion("aaa not between", value1, value2, "aaa");
            return (Criteria) this;
        }

        public Criteria andHnumberLikeInsensitive(String value) {
            addCriterion("upper(hNumber) like", value.toUpperCase(), "hnumber");
            return (Criteria) this;
        }

        public Criteria andHstateLikeInsensitive(String value) {
            addCriterion("upper(hState) like", value.toUpperCase(), "hstate");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameLikeInsensitive(String value) {
            addCriterion("upper(hBulidingName) like", value.toUpperCase(), "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHdirectionLikeInsensitive(String value) {
            addCriterion("upper(hDirection) like", value.toUpperCase(), "hdirection");
            return (Criteria) this;
        }

        public Criteria andHareaLikeInsensitive(String value) {
            addCriterion("upper(hArea) like", value.toUpperCase(), "harea");
            return (Criteria) this;
        }

        public Criteria andHremarksLikeInsensitive(String value) {
            addCriterion("upper(hRemarks) like", value.toUpperCase(), "hremarks");
            return (Criteria) this;
        }

        public Criteria andAaaLikeInsensitive(String value) {
            addCriterion("upper(aaa) like", value.toUpperCase(), "aaa");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * wy_house 2019-04-23
     */
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