package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.List;

public class ZwKa17YpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwKa17YpExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andAka061IsNull() {
            addCriterion("AKA061 is null");
            return (Criteria) this;
        }

        public Criteria andAka061IsNotNull() {
            addCriterion("AKA061 is not null");
            return (Criteria) this;
        }

        public Criteria andAka061EqualTo(String value) {
            addCriterion("AKA061 =", value, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061NotEqualTo(String value) {
            addCriterion("AKA061 <>", value, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061GreaterThan(String value) {
            addCriterion("AKA061 >", value, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061GreaterThanOrEqualTo(String value) {
            addCriterion("AKA061 >=", value, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061LessThan(String value) {
            addCriterion("AKA061 <", value, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061LessThanOrEqualTo(String value) {
            addCriterion("AKA061 <=", value, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061Like(String value) {
            addCriterion("AKA061 like", value, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061NotLike(String value) {
            addCriterion("AKA061 not like", value, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061In(List<String> values) {
            addCriterion("AKA061 in", values, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061NotIn(List<String> values) {
            addCriterion("AKA061 not in", values, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061Between(String value1, String value2) {
            addCriterion("AKA061 between", value1, value2, "aka061");
            return (Criteria) this;
        }

        public Criteria andAka061NotBetween(String value1, String value2) {
            addCriterion("AKA061 not between", value1, value2, "aka061");
            return (Criteria) this;
        }

        public Criteria andBke043IsNull() {
            addCriterion("BKE043 is null");
            return (Criteria) this;
        }

        public Criteria andBke043IsNotNull() {
            addCriterion("BKE043 is not null");
            return (Criteria) this;
        }

        public Criteria andBke043EqualTo(String value) {
            addCriterion("BKE043 =", value, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043NotEqualTo(String value) {
            addCriterion("BKE043 <>", value, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043GreaterThan(String value) {
            addCriterion("BKE043 >", value, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043GreaterThanOrEqualTo(String value) {
            addCriterion("BKE043 >=", value, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043LessThan(String value) {
            addCriterion("BKE043 <", value, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043LessThanOrEqualTo(String value) {
            addCriterion("BKE043 <=", value, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043Like(String value) {
            addCriterion("BKE043 like", value, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043NotLike(String value) {
            addCriterion("BKE043 not like", value, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043In(List<String> values) {
            addCriterion("BKE043 in", values, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043NotIn(List<String> values) {
            addCriterion("BKE043 not in", values, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043Between(String value1, String value2) {
            addCriterion("BKE043 between", value1, value2, "bke043");
            return (Criteria) this;
        }

        public Criteria andBke043NotBetween(String value1, String value2) {
            addCriterion("BKE043 not between", value1, value2, "bke043");
            return (Criteria) this;
        }

        public Criteria andAka074IsNull() {
            addCriterion("AKA074 is null");
            return (Criteria) this;
        }

        public Criteria andAka074IsNotNull() {
            addCriterion("AKA074 is not null");
            return (Criteria) this;
        }

        public Criteria andAka074EqualTo(String value) {
            addCriterion("AKA074 =", value, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074NotEqualTo(String value) {
            addCriterion("AKA074 <>", value, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074GreaterThan(String value) {
            addCriterion("AKA074 >", value, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074GreaterThanOrEqualTo(String value) {
            addCriterion("AKA074 >=", value, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074LessThan(String value) {
            addCriterion("AKA074 <", value, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074LessThanOrEqualTo(String value) {
            addCriterion("AKA074 <=", value, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074Like(String value) {
            addCriterion("AKA074 like", value, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074NotLike(String value) {
            addCriterion("AKA074 not like", value, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074In(List<String> values) {
            addCriterion("AKA074 in", values, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074NotIn(List<String> values) {
            addCriterion("AKA074 not in", values, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074Between(String value1, String value2) {
            addCriterion("AKA074 between", value1, value2, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka074NotBetween(String value1, String value2) {
            addCriterion("AKA074 not between", value1, value2, "aka074");
            return (Criteria) this;
        }

        public Criteria andAka067IsNull() {
            addCriterion("AKA067 is null");
            return (Criteria) this;
        }

        public Criteria andAka067IsNotNull() {
            addCriterion("AKA067 is not null");
            return (Criteria) this;
        }

        public Criteria andAka067EqualTo(String value) {
            addCriterion("AKA067 =", value, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067NotEqualTo(String value) {
            addCriterion("AKA067 <>", value, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067GreaterThan(String value) {
            addCriterion("AKA067 >", value, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067GreaterThanOrEqualTo(String value) {
            addCriterion("AKA067 >=", value, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067LessThan(String value) {
            addCriterion("AKA067 <", value, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067LessThanOrEqualTo(String value) {
            addCriterion("AKA067 <=", value, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067Like(String value) {
            addCriterion("AKA067 like", value, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067NotLike(String value) {
            addCriterion("AKA067 not like", value, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067In(List<String> values) {
            addCriterion("AKA067 in", values, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067NotIn(List<String> values) {
            addCriterion("AKA067 not in", values, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067Between(String value1, String value2) {
            addCriterion("AKA067 between", value1, value2, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka067NotBetween(String value1, String value2) {
            addCriterion("AKA067 not between", value1, value2, "aka067");
            return (Criteria) this;
        }

        public Criteria andAka065IsNull() {
            addCriterion("AKA065 is null");
            return (Criteria) this;
        }

        public Criteria andAka065IsNotNull() {
            addCriterion("AKA065 is not null");
            return (Criteria) this;
        }

        public Criteria andAka065EqualTo(String value) {
            addCriterion("AKA065 =", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065NotEqualTo(String value) {
            addCriterion("AKA065 <>", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065GreaterThan(String value) {
            addCriterion("AKA065 >", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065GreaterThanOrEqualTo(String value) {
            addCriterion("AKA065 >=", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065LessThan(String value) {
            addCriterion("AKA065 <", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065LessThanOrEqualTo(String value) {
            addCriterion("AKA065 <=", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065Like(String value) {
            addCriterion("AKA065 like", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065NotLike(String value) {
            addCriterion("AKA065 not like", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065In(List<String> values) {
            addCriterion("AKA065 in", values, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065NotIn(List<String> values) {
            addCriterion("AKA065 not in", values, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065Between(String value1, String value2) {
            addCriterion("AKA065 between", value1, value2, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065NotBetween(String value1, String value2) {
            addCriterion("AKA065 not between", value1, value2, "aka065");
            return (Criteria) this;
        }

        public Criteria andSsqy00IsNull() {
            addCriterion("SSQY00 is null");
            return (Criteria) this;
        }

        public Criteria andSsqy00IsNotNull() {
            addCriterion("SSQY00 is not null");
            return (Criteria) this;
        }

        public Criteria andSsqy00EqualTo(String value) {
            addCriterion("SSQY00 =", value, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00NotEqualTo(String value) {
            addCriterion("SSQY00 <>", value, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00GreaterThan(String value) {
            addCriterion("SSQY00 >", value, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00GreaterThanOrEqualTo(String value) {
            addCriterion("SSQY00 >=", value, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00LessThan(String value) {
            addCriterion("SSQY00 <", value, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00LessThanOrEqualTo(String value) {
            addCriterion("SSQY00 <=", value, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00Like(String value) {
            addCriterion("SSQY00 like", value, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00NotLike(String value) {
            addCriterion("SSQY00 not like", value, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00In(List<String> values) {
            addCriterion("SSQY00 in", values, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00NotIn(List<String> values) {
            addCriterion("SSQY00 not in", values, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00Between(String value1, String value2) {
            addCriterion("SSQY00 between", value1, value2, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andSsqy00NotBetween(String value1, String value2) {
            addCriterion("SSQY00 not between", value1, value2, "ssqy00");
            return (Criteria) this;
        }

        public Criteria andAka060IsNull() {
            addCriterion("AKA060 is null");
            return (Criteria) this;
        }

        public Criteria andAka060IsNotNull() {
            addCriterion("AKA060 is not null");
            return (Criteria) this;
        }

        public Criteria andAka060EqualTo(String value) {
            addCriterion("AKA060 =", value, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060NotEqualTo(String value) {
            addCriterion("AKA060 <>", value, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060GreaterThan(String value) {
            addCriterion("AKA060 >", value, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060GreaterThanOrEqualTo(String value) {
            addCriterion("AKA060 >=", value, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060LessThan(String value) {
            addCriterion("AKA060 <", value, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060LessThanOrEqualTo(String value) {
            addCriterion("AKA060 <=", value, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060Like(String value) {
            addCriterion("AKA060 like", value, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060NotLike(String value) {
            addCriterion("AKA060 not like", value, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060In(List<String> values) {
            addCriterion("AKA060 in", values, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060NotIn(List<String> values) {
            addCriterion("AKA060 not in", values, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060Between(String value1, String value2) {
            addCriterion("AKA060 between", value1, value2, "aka060");
            return (Criteria) this;
        }

        public Criteria andAka060NotBetween(String value1, String value2) {
            addCriterion("AKA060 not between", value1, value2, "aka060");
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