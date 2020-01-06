package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.List;

public class ZwKb01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwKb01Example() {
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

        public Criteria andAkb020IsNull() {
            addCriterion("AKB020 is null");
            return (Criteria) this;
        }

        public Criteria andAkb020IsNotNull() {
            addCriterion("AKB020 is not null");
            return (Criteria) this;
        }

        public Criteria andAkb020EqualTo(String value) {
            addCriterion("AKB020 =", value, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020NotEqualTo(String value) {
            addCriterion("AKB020 <>", value, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020GreaterThan(String value) {
            addCriterion("AKB020 >", value, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020GreaterThanOrEqualTo(String value) {
            addCriterion("AKB020 >=", value, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020LessThan(String value) {
            addCriterion("AKB020 <", value, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020LessThanOrEqualTo(String value) {
            addCriterion("AKB020 <=", value, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020Like(String value) {
            addCriterion("AKB020 like", value, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020NotLike(String value) {
            addCriterion("AKB020 not like", value, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020In(List<String> values) {
            addCriterion("AKB020 in", values, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020NotIn(List<String> values) {
            addCriterion("AKB020 not in", values, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020Between(String value1, String value2) {
            addCriterion("AKB020 between", value1, value2, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb020NotBetween(String value1, String value2) {
            addCriterion("AKB020 not between", value1, value2, "akb020");
            return (Criteria) this;
        }

        public Criteria andAkb022IsNull() {
            addCriterion("AKB022 is null");
            return (Criteria) this;
        }

        public Criteria andAkb022IsNotNull() {
            addCriterion("AKB022 is not null");
            return (Criteria) this;
        }

        public Criteria andAkb022EqualTo(String value) {
            addCriterion("AKB022 =", value, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022NotEqualTo(String value) {
            addCriterion("AKB022 <>", value, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022GreaterThan(String value) {
            addCriterion("AKB022 >", value, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022GreaterThanOrEqualTo(String value) {
            addCriterion("AKB022 >=", value, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022LessThan(String value) {
            addCriterion("AKB022 <", value, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022LessThanOrEqualTo(String value) {
            addCriterion("AKB022 <=", value, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022Like(String value) {
            addCriterion("AKB022 like", value, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022NotLike(String value) {
            addCriterion("AKB022 not like", value, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022In(List<String> values) {
            addCriterion("AKB022 in", values, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022NotIn(List<String> values) {
            addCriterion("AKB022 not in", values, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022Between(String value1, String value2) {
            addCriterion("AKB022 between", value1, value2, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb022NotBetween(String value1, String value2) {
            addCriterion("AKB022 not between", value1, value2, "akb022");
            return (Criteria) this;
        }

        public Criteria andAkb021IsNull() {
            addCriterion("AKB021 is null");
            return (Criteria) this;
        }

        public Criteria andAkb021IsNotNull() {
            addCriterion("AKB021 is not null");
            return (Criteria) this;
        }

        public Criteria andAkb021EqualTo(String value) {
            addCriterion("AKB021 =", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021NotEqualTo(String value) {
            addCriterion("AKB021 <>", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021GreaterThan(String value) {
            addCriterion("AKB021 >", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021GreaterThanOrEqualTo(String value) {
            addCriterion("AKB021 >=", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021LessThan(String value) {
            addCriterion("AKB021 <", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021LessThanOrEqualTo(String value) {
            addCriterion("AKB021 <=", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021Like(String value) {
            addCriterion("AKB021 like", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021NotLike(String value) {
            addCriterion("AKB021 not like", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021In(List<String> values) {
            addCriterion("AKB021 in", values, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021NotIn(List<String> values) {
            addCriterion("AKB021 not in", values, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021Between(String value1, String value2) {
            addCriterion("AKB021 between", value1, value2, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021NotBetween(String value1, String value2) {
            addCriterion("AKB021 not between", value1, value2, "akb021");
            return (Criteria) this;
        }

        public Criteria andAae006IsNull() {
            addCriterion("AAE006 is null");
            return (Criteria) this;
        }

        public Criteria andAae006IsNotNull() {
            addCriterion("AAE006 is not null");
            return (Criteria) this;
        }

        public Criteria andAae006EqualTo(String value) {
            addCriterion("AAE006 =", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006NotEqualTo(String value) {
            addCriterion("AAE006 <>", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006GreaterThan(String value) {
            addCriterion("AAE006 >", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006GreaterThanOrEqualTo(String value) {
            addCriterion("AAE006 >=", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006LessThan(String value) {
            addCriterion("AAE006 <", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006LessThanOrEqualTo(String value) {
            addCriterion("AAE006 <=", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006Like(String value) {
            addCriterion("AAE006 like", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006NotLike(String value) {
            addCriterion("AAE006 not like", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006In(List<String> values) {
            addCriterion("AAE006 in", values, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006NotIn(List<String> values) {
            addCriterion("AAE006 not in", values, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006Between(String value1, String value2) {
            addCriterion("AAE006 between", value1, value2, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006NotBetween(String value1, String value2) {
            addCriterion("AAE006 not between", value1, value2, "aae006");
            return (Criteria) this;
        }

        public Criteria andFsfzx0IsNull() {
            addCriterion("FSFZX0 is null");
            return (Criteria) this;
        }

        public Criteria andFsfzx0IsNotNull() {
            addCriterion("FSFZX0 is not null");
            return (Criteria) this;
        }

        public Criteria andFsfzx0EqualTo(String value) {
            addCriterion("FSFZX0 =", value, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0NotEqualTo(String value) {
            addCriterion("FSFZX0 <>", value, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0GreaterThan(String value) {
            addCriterion("FSFZX0 >", value, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0GreaterThanOrEqualTo(String value) {
            addCriterion("FSFZX0 >=", value, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0LessThan(String value) {
            addCriterion("FSFZX0 <", value, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0LessThanOrEqualTo(String value) {
            addCriterion("FSFZX0 <=", value, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0Like(String value) {
            addCriterion("FSFZX0 like", value, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0NotLike(String value) {
            addCriterion("FSFZX0 not like", value, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0In(List<String> values) {
            addCriterion("FSFZX0 in", values, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0NotIn(List<String> values) {
            addCriterion("FSFZX0 not in", values, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0Between(String value1, String value2) {
            addCriterion("FSFZX0 between", value1, value2, "fsfzx0");
            return (Criteria) this;
        }

        public Criteria andFsfzx0NotBetween(String value1, String value2) {
            addCriterion("FSFZX0 not between", value1, value2, "fsfzx0");
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