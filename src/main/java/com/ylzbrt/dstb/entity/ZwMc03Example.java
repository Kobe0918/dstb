package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.List;

public class ZwMc03Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwMc03Example() {
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

        public Criteria andAaz196IsNull() {
            addCriterion("AAZ196 is null");
            return (Criteria) this;
        }

        public Criteria andAaz196IsNotNull() {
            addCriterion("AAZ196 is not null");
            return (Criteria) this;
        }

        public Criteria andAaz196EqualTo(Long value) {
            addCriterion("AAZ196 =", value, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196NotEqualTo(Long value) {
            addCriterion("AAZ196 <>", value, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196GreaterThan(Long value) {
            addCriterion("AAZ196 >", value, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196GreaterThanOrEqualTo(Long value) {
            addCriterion("AAZ196 >=", value, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196LessThan(Long value) {
            addCriterion("AAZ196 <", value, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196LessThanOrEqualTo(Long value) {
            addCriterion("AAZ196 <=", value, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196In(List<Long> values) {
            addCriterion("AAZ196 in", values, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196NotIn(List<Long> values) {
            addCriterion("AAZ196 not in", values, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196Between(Long value1, Long value2) {
            addCriterion("AAZ196 between", value1, value2, "aaz196");
            return (Criteria) this;
        }

        public Criteria andAaz196NotBetween(Long value1, Long value2) {
            addCriterion("AAZ196 not between", value1, value2, "aaz196");
            return (Criteria) this;
        }

        public Criteria andBkc112IsNull() {
            addCriterion("BKC112 is null");
            return (Criteria) this;
        }

        public Criteria andBkc112IsNotNull() {
            addCriterion("BKC112 is not null");
            return (Criteria) this;
        }

        public Criteria andBkc112EqualTo(String value) {
            addCriterion("BKC112 =", value, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112NotEqualTo(String value) {
            addCriterion("BKC112 <>", value, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112GreaterThan(String value) {
            addCriterion("BKC112 >", value, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112GreaterThanOrEqualTo(String value) {
            addCriterion("BKC112 >=", value, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112LessThan(String value) {
            addCriterion("BKC112 <", value, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112LessThanOrEqualTo(String value) {
            addCriterion("BKC112 <=", value, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112Like(String value) {
            addCriterion("BKC112 like", value, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112NotLike(String value) {
            addCriterion("BKC112 not like", value, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112In(List<String> values) {
            addCriterion("BKC112 in", values, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112NotIn(List<String> values) {
            addCriterion("BKC112 not in", values, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112Between(String value1, String value2) {
            addCriterion("BKC112 between", value1, value2, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc112NotBetween(String value1, String value2) {
            addCriterion("BKC112 not between", value1, value2, "bkc112");
            return (Criteria) this;
        }

        public Criteria andBkc001IsNull() {
            addCriterion("BKC001 is null");
            return (Criteria) this;
        }

        public Criteria andBkc001IsNotNull() {
            addCriterion("BKC001 is not null");
            return (Criteria) this;
        }

        public Criteria andBkc001EqualTo(String value) {
            addCriterion("BKC001 =", value, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001NotEqualTo(String value) {
            addCriterion("BKC001 <>", value, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001GreaterThan(String value) {
            addCriterion("BKC001 >", value, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001GreaterThanOrEqualTo(String value) {
            addCriterion("BKC001 >=", value, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001LessThan(String value) {
            addCriterion("BKC001 <", value, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001LessThanOrEqualTo(String value) {
            addCriterion("BKC001 <=", value, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001Like(String value) {
            addCriterion("BKC001 like", value, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001NotLike(String value) {
            addCriterion("BKC001 not like", value, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001In(List<String> values) {
            addCriterion("BKC001 in", values, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001NotIn(List<String> values) {
            addCriterion("BKC001 not in", values, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001Between(String value1, String value2) {
            addCriterion("BKC001 between", value1, value2, "bkc001");
            return (Criteria) this;
        }

        public Criteria andBkc001NotBetween(String value1, String value2) {
            addCriterion("BKC001 not between", value1, value2, "bkc001");
            return (Criteria) this;
        }

        public Criteria andAae206IsNull() {
            addCriterion("AAE206 is null");
            return (Criteria) this;
        }

        public Criteria andAae206IsNotNull() {
            addCriterion("AAE206 is not null");
            return (Criteria) this;
        }

        public Criteria andAae206EqualTo(Integer value) {
            addCriterion("AAE206 =", value, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206NotEqualTo(Integer value) {
            addCriterion("AAE206 <>", value, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206GreaterThan(Integer value) {
            addCriterion("AAE206 >", value, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206GreaterThanOrEqualTo(Integer value) {
            addCriterion("AAE206 >=", value, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206LessThan(Integer value) {
            addCriterion("AAE206 <", value, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206LessThanOrEqualTo(Integer value) {
            addCriterion("AAE206 <=", value, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206In(List<Integer> values) {
            addCriterion("AAE206 in", values, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206NotIn(List<Integer> values) {
            addCriterion("AAE206 not in", values, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206Between(Integer value1, Integer value2) {
            addCriterion("AAE206 between", value1, value2, "aae206");
            return (Criteria) this;
        }

        public Criteria andAae206NotBetween(Integer value1, Integer value2) {
            addCriterion("AAE206 not between", value1, value2, "aae206");
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