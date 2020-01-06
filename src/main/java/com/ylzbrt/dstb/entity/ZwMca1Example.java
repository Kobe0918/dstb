package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.List;

public class ZwMca1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwMca1Example() {
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

        public Criteria andAaa027IsNull() {
            addCriterion("AAA027 is null");
            return (Criteria) this;
        }

        public Criteria andAaa027IsNotNull() {
            addCriterion("AAA027 is not null");
            return (Criteria) this;
        }

        public Criteria andAaa027EqualTo(String value) {
            addCriterion("AAA027 =", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027NotEqualTo(String value) {
            addCriterion("AAA027 <>", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027GreaterThan(String value) {
            addCriterion("AAA027 >", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027GreaterThanOrEqualTo(String value) {
            addCriterion("AAA027 >=", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027LessThan(String value) {
            addCriterion("AAA027 <", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027LessThanOrEqualTo(String value) {
            addCriterion("AAA027 <=", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027Like(String value) {
            addCriterion("AAA027 like", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027NotLike(String value) {
            addCriterion("AAA027 not like", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027In(List<String> values) {
            addCriterion("AAA027 in", values, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027NotIn(List<String> values) {
            addCriterion("AAA027 not in", values, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027Between(String value1, String value2) {
            addCriterion("AAA027 between", value1, value2, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027NotBetween(String value1, String value2) {
            addCriterion("AAA027 not between", value1, value2, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAac003IsNull() {
            addCriterion("AAC003 is null");
            return (Criteria) this;
        }

        public Criteria andAac003IsNotNull() {
            addCriterion("AAC003 is not null");
            return (Criteria) this;
        }

        public Criteria andAac003EqualTo(String value) {
            addCriterion("AAC003 =", value, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003NotEqualTo(String value) {
            addCriterion("AAC003 <>", value, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003GreaterThan(String value) {
            addCriterion("AAC003 >", value, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003GreaterThanOrEqualTo(String value) {
            addCriterion("AAC003 >=", value, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003LessThan(String value) {
            addCriterion("AAC003 <", value, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003LessThanOrEqualTo(String value) {
            addCriterion("AAC003 <=", value, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003Like(String value) {
            addCriterion("AAC003 like", value, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003NotLike(String value) {
            addCriterion("AAC003 not like", value, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003In(List<String> values) {
            addCriterion("AAC003 in", values, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003NotIn(List<String> values) {
            addCriterion("AAC003 not in", values, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003Between(String value1, String value2) {
            addCriterion("AAC003 between", value1, value2, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac003NotBetween(String value1, String value2) {
            addCriterion("AAC003 not between", value1, value2, "aac003");
            return (Criteria) this;
        }

        public Criteria andAac002IsNull() {
            addCriterion("AAC002 is null");
            return (Criteria) this;
        }

        public Criteria andAac002IsNotNull() {
            addCriterion("AAC002 is not null");
            return (Criteria) this;
        }

        public Criteria andAac002EqualTo(String value) {
            addCriterion("AAC002 =", value, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002NotEqualTo(String value) {
            addCriterion("AAC002 <>", value, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002GreaterThan(String value) {
            addCriterion("AAC002 >", value, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002GreaterThanOrEqualTo(String value) {
            addCriterion("AAC002 >=", value, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002LessThan(String value) {
            addCriterion("AAC002 <", value, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002LessThanOrEqualTo(String value) {
            addCriterion("AAC002 <=", value, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002Like(String value) {
            addCriterion("AAC002 like", value, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002NotLike(String value) {
            addCriterion("AAC002 not like", value, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002In(List<String> values) {
            addCriterion("AAC002 in", values, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002NotIn(List<String> values) {
            addCriterion("AAC002 not in", values, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002Between(String value1, String value2) {
            addCriterion("AAC002 between", value1, value2, "aac002");
            return (Criteria) this;
        }

        public Criteria andAac002NotBetween(String value1, String value2) {
            addCriterion("AAC002 not between", value1, value2, "aac002");
            return (Criteria) this;
        }

        public Criteria andSylsh0IsNull() {
            addCriterion("SYLSH0 is null");
            return (Criteria) this;
        }

        public Criteria andSylsh0IsNotNull() {
            addCriterion("SYLSH0 is not null");
            return (Criteria) this;
        }

        public Criteria andSylsh0EqualTo(String value) {
            addCriterion("SYLSH0 =", value, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0NotEqualTo(String value) {
            addCriterion("SYLSH0 <>", value, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0GreaterThan(String value) {
            addCriterion("SYLSH0 >", value, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0GreaterThanOrEqualTo(String value) {
            addCriterion("SYLSH0 >=", value, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0LessThan(String value) {
            addCriterion("SYLSH0 <", value, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0LessThanOrEqualTo(String value) {
            addCriterion("SYLSH0 <=", value, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0Like(String value) {
            addCriterion("SYLSH0 like", value, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0NotLike(String value) {
            addCriterion("SYLSH0 not like", value, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0In(List<String> values) {
            addCriterion("SYLSH0 in", values, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0NotIn(List<String> values) {
            addCriterion("SYLSH0 not in", values, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0Between(String value1, String value2) {
            addCriterion("SYLSH0 between", value1, value2, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andSylsh0NotBetween(String value1, String value2) {
            addCriterion("SYLSH0 not between", value1, value2, "sylsh0");
            return (Criteria) this;
        }

        public Criteria andAmc020IsNull() {
            addCriterion("AMC020 is null");
            return (Criteria) this;
        }

        public Criteria andAmc020IsNotNull() {
            addCriterion("AMC020 is not null");
            return (Criteria) this;
        }

        public Criteria andAmc020EqualTo(Integer value) {
            addCriterion("AMC020 =", value, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020NotEqualTo(Integer value) {
            addCriterion("AMC020 <>", value, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020GreaterThan(Integer value) {
            addCriterion("AMC020 >", value, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020GreaterThanOrEqualTo(Integer value) {
            addCriterion("AMC020 >=", value, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020LessThan(Integer value) {
            addCriterion("AMC020 <", value, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020LessThanOrEqualTo(Integer value) {
            addCriterion("AMC020 <=", value, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020In(List<Integer> values) {
            addCriterion("AMC020 in", values, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020NotIn(List<Integer> values) {
            addCriterion("AMC020 not in", values, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020Between(Integer value1, Integer value2) {
            addCriterion("AMC020 between", value1, value2, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc020NotBetween(Integer value1, Integer value2) {
            addCriterion("AMC020 not between", value1, value2, "amc020");
            return (Criteria) this;
        }

        public Criteria andAmc021IsNull() {
            addCriterion("AMC021 is null");
            return (Criteria) this;
        }

        public Criteria andAmc021IsNotNull() {
            addCriterion("AMC021 is not null");
            return (Criteria) this;
        }

        public Criteria andAmc021EqualTo(String value) {
            addCriterion("AMC021 =", value, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021NotEqualTo(String value) {
            addCriterion("AMC021 <>", value, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021GreaterThan(String value) {
            addCriterion("AMC021 >", value, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021GreaterThanOrEqualTo(String value) {
            addCriterion("AMC021 >=", value, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021LessThan(String value) {
            addCriterion("AMC021 <", value, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021LessThanOrEqualTo(String value) {
            addCriterion("AMC021 <=", value, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021Like(String value) {
            addCriterion("AMC021 like", value, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021NotLike(String value) {
            addCriterion("AMC021 not like", value, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021In(List<String> values) {
            addCriterion("AMC021 in", values, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021NotIn(List<String> values) {
            addCriterion("AMC021 not in", values, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021Between(String value1, String value2) {
            addCriterion("AMC021 between", value1, value2, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc021NotBetween(String value1, String value2) {
            addCriterion("AMC021 not between", value1, value2, "amc021");
            return (Criteria) this;
        }

        public Criteria andAmc026IsNull() {
            addCriterion("AMC026 is null");
            return (Criteria) this;
        }

        public Criteria andAmc026IsNotNull() {
            addCriterion("AMC026 is not null");
            return (Criteria) this;
        }

        public Criteria andAmc026EqualTo(String value) {
            addCriterion("AMC026 =", value, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026NotEqualTo(String value) {
            addCriterion("AMC026 <>", value, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026GreaterThan(String value) {
            addCriterion("AMC026 >", value, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026GreaterThanOrEqualTo(String value) {
            addCriterion("AMC026 >=", value, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026LessThan(String value) {
            addCriterion("AMC026 <", value, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026LessThanOrEqualTo(String value) {
            addCriterion("AMC026 <=", value, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026Like(String value) {
            addCriterion("AMC026 like", value, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026NotLike(String value) {
            addCriterion("AMC026 not like", value, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026In(List<String> values) {
            addCriterion("AMC026 in", values, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026NotIn(List<String> values) {
            addCriterion("AMC026 not in", values, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026Between(String value1, String value2) {
            addCriterion("AMC026 between", value1, value2, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc026NotBetween(String value1, String value2) {
            addCriterion("AMC026 not between", value1, value2, "amc026");
            return (Criteria) this;
        }

        public Criteria andAmc027IsNull() {
            addCriterion("AMC027 is null");
            return (Criteria) this;
        }

        public Criteria andAmc027IsNotNull() {
            addCriterion("AMC027 is not null");
            return (Criteria) this;
        }

        public Criteria andAmc027EqualTo(String value) {
            addCriterion("AMC027 =", value, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027NotEqualTo(String value) {
            addCriterion("AMC027 <>", value, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027GreaterThan(String value) {
            addCriterion("AMC027 >", value, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027GreaterThanOrEqualTo(String value) {
            addCriterion("AMC027 >=", value, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027LessThan(String value) {
            addCriterion("AMC027 <", value, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027LessThanOrEqualTo(String value) {
            addCriterion("AMC027 <=", value, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027Like(String value) {
            addCriterion("AMC027 like", value, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027NotLike(String value) {
            addCriterion("AMC027 not like", value, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027In(List<String> values) {
            addCriterion("AMC027 in", values, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027NotIn(List<String> values) {
            addCriterion("AMC027 not in", values, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027Between(String value1, String value2) {
            addCriterion("AMC027 between", value1, value2, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc027NotBetween(String value1, String value2) {
            addCriterion("AMC027 not between", value1, value2, "amc027");
            return (Criteria) this;
        }

        public Criteria andAmc031IsNull() {
            addCriterion("AMC031 is null");
            return (Criteria) this;
        }

        public Criteria andAmc031IsNotNull() {
            addCriterion("AMC031 is not null");
            return (Criteria) this;
        }

        public Criteria andAmc031EqualTo(Short value) {
            addCriterion("AMC031 =", value, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031NotEqualTo(Short value) {
            addCriterion("AMC031 <>", value, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031GreaterThan(Short value) {
            addCriterion("AMC031 >", value, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031GreaterThanOrEqualTo(Short value) {
            addCriterion("AMC031 >=", value, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031LessThan(Short value) {
            addCriterion("AMC031 <", value, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031LessThanOrEqualTo(Short value) {
            addCriterion("AMC031 <=", value, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031In(List<Short> values) {
            addCriterion("AMC031 in", values, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031NotIn(List<Short> values) {
            addCriterion("AMC031 not in", values, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031Between(Short value1, Short value2) {
            addCriterion("AMC031 between", value1, value2, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc031NotBetween(Short value1, Short value2) {
            addCriterion("AMC031 not between", value1, value2, "amc031");
            return (Criteria) this;
        }

        public Criteria andAmc032IsNull() {
            addCriterion("AMC032 is null");
            return (Criteria) this;
        }

        public Criteria andAmc032IsNotNull() {
            addCriterion("AMC032 is not null");
            return (Criteria) this;
        }

        public Criteria andAmc032EqualTo(Short value) {
            addCriterion("AMC032 =", value, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032NotEqualTo(Short value) {
            addCriterion("AMC032 <>", value, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032GreaterThan(Short value) {
            addCriterion("AMC032 >", value, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032GreaterThanOrEqualTo(Short value) {
            addCriterion("AMC032 >=", value, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032LessThan(Short value) {
            addCriterion("AMC032 <", value, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032LessThanOrEqualTo(Short value) {
            addCriterion("AMC032 <=", value, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032In(List<Short> values) {
            addCriterion("AMC032 in", values, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032NotIn(List<Short> values) {
            addCriterion("AMC032 not in", values, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032Between(Short value1, Short value2) {
            addCriterion("AMC032 between", value1, value2, "amc032");
            return (Criteria) this;
        }

        public Criteria andAmc032NotBetween(Short value1, Short value2) {
            addCriterion("AMC032 not between", value1, value2, "amc032");
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