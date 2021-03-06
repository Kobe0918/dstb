package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZwKc99TempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwKc99TempExample() {
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

        public Criteria andAaa129IsNull() {
            addCriterion("AAA129 is null");
            return (Criteria) this;
        }

        public Criteria andAaa129IsNotNull() {
            addCriterion("AAA129 is not null");
            return (Criteria) this;
        }

        public Criteria andAaa129EqualTo(String value) {
            addCriterion("AAA129 =", value, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129NotEqualTo(String value) {
            addCriterion("AAA129 <>", value, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129GreaterThan(String value) {
            addCriterion("AAA129 >", value, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129GreaterThanOrEqualTo(String value) {
            addCriterion("AAA129 >=", value, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129LessThan(String value) {
            addCriterion("AAA129 <", value, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129LessThanOrEqualTo(String value) {
            addCriterion("AAA129 <=", value, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129Like(String value) {
            addCriterion("AAA129 like", value, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129NotLike(String value) {
            addCriterion("AAA129 not like", value, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129In(List<String> values) {
            addCriterion("AAA129 in", values, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129NotIn(List<String> values) {
            addCriterion("AAA129 not in", values, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129Between(String value1, String value2) {
            addCriterion("AAA129 between", value1, value2, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAaa129NotBetween(String value1, String value2) {
            addCriterion("AAA129 not between", value1, value2, "aaa129");
            return (Criteria) this;
        }

        public Criteria andAae140IsNull() {
            addCriterion("AAE140 is null");
            return (Criteria) this;
        }

        public Criteria andAae140IsNotNull() {
            addCriterion("AAE140 is not null");
            return (Criteria) this;
        }

        public Criteria andAae140EqualTo(String value) {
            addCriterion("AAE140 =", value, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140NotEqualTo(String value) {
            addCriterion("AAE140 <>", value, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140GreaterThan(String value) {
            addCriterion("AAE140 >", value, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140GreaterThanOrEqualTo(String value) {
            addCriterion("AAE140 >=", value, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140LessThan(String value) {
            addCriterion("AAE140 <", value, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140LessThanOrEqualTo(String value) {
            addCriterion("AAE140 <=", value, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140Like(String value) {
            addCriterion("AAE140 like", value, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140NotLike(String value) {
            addCriterion("AAE140 not like", value, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140In(List<String> values) {
            addCriterion("AAE140 in", values, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140NotIn(List<String> values) {
            addCriterion("AAE140 not in", values, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140Between(String value1, String value2) {
            addCriterion("AAE140 between", value1, value2, "aae140");
            return (Criteria) this;
        }

        public Criteria andAae140NotBetween(String value1, String value2) {
            addCriterion("AAE140 not between", value1, value2, "aae140");
            return (Criteria) this;
        }

        public Criteria andAab050IsNull() {
            addCriterion("AAB050 is null");
            return (Criteria) this;
        }

        public Criteria andAab050IsNotNull() {
            addCriterion("AAB050 is not null");
            return (Criteria) this;
        }

        public Criteria andAab050EqualTo(Integer value) {
            addCriterion("AAB050 =", value, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050NotEqualTo(Integer value) {
            addCriterion("AAB050 <>", value, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050GreaterThan(Integer value) {
            addCriterion("AAB050 >", value, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050GreaterThanOrEqualTo(Integer value) {
            addCriterion("AAB050 >=", value, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050LessThan(Integer value) {
            addCriterion("AAB050 <", value, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050LessThanOrEqualTo(Integer value) {
            addCriterion("AAB050 <=", value, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050In(List<Integer> values) {
            addCriterion("AAB050 in", values, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050NotIn(List<Integer> values) {
            addCriterion("AAB050 not in", values, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050Between(Integer value1, Integer value2) {
            addCriterion("AAB050 between", value1, value2, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab050NotBetween(Integer value1, Integer value2) {
            addCriterion("AAB050 not between", value1, value2, "aab050");
            return (Criteria) this;
        }

        public Criteria andAab004IsNull() {
            addCriterion("AAB004 is null");
            return (Criteria) this;
        }

        public Criteria andAab004IsNotNull() {
            addCriterion("AAB004 is not null");
            return (Criteria) this;
        }

        public Criteria andAab004EqualTo(String value) {
            addCriterion("AAB004 =", value, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004NotEqualTo(String value) {
            addCriterion("AAB004 <>", value, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004GreaterThan(String value) {
            addCriterion("AAB004 >", value, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004GreaterThanOrEqualTo(String value) {
            addCriterion("AAB004 >=", value, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004LessThan(String value) {
            addCriterion("AAB004 <", value, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004LessThanOrEqualTo(String value) {
            addCriterion("AAB004 <=", value, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004Like(String value) {
            addCriterion("AAB004 like", value, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004NotLike(String value) {
            addCriterion("AAB004 not like", value, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004In(List<String> values) {
            addCriterion("AAB004 in", values, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004NotIn(List<String> values) {
            addCriterion("AAB004 not in", values, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004Between(String value1, String value2) {
            addCriterion("AAB004 between", value1, value2, "aab004");
            return (Criteria) this;
        }

        public Criteria andAab004NotBetween(String value1, String value2) {
            addCriterion("AAB004 not between", value1, value2, "aab004");
            return (Criteria) this;
        }

        public Criteria andAae035IsNull() {
            addCriterion("AAE035 is null");
            return (Criteria) this;
        }

        public Criteria andAae035IsNotNull() {
            addCriterion("AAE035 is not null");
            return (Criteria) this;
        }

        public Criteria andAae035EqualTo(Date value) {
            addCriterion("AAE035 =", value, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035NotEqualTo(Date value) {
            addCriterion("AAE035 <>", value, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035GreaterThan(Date value) {
            addCriterion("AAE035 >", value, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035GreaterThanOrEqualTo(Date value) {
            addCriterion("AAE035 >=", value, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035LessThan(Date value) {
            addCriterion("AAE035 <", value, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035LessThanOrEqualTo(Date value) {
            addCriterion("AAE035 <=", value, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035In(List<Date> values) {
            addCriterion("AAE035 in", values, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035NotIn(List<Date> values) {
            addCriterion("AAE035 not in", values, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035Between(Date value1, Date value2) {
            addCriterion("AAE035 between", value1, value2, "aae035");
            return (Criteria) this;
        }

        public Criteria andAae035NotBetween(Date value1, Date value2) {
            addCriterion("AAE035 not between", value1, value2, "aae035");
            return (Criteria) this;
        }

        public Criteria andAac066IsNull() {
            addCriterion("AAC066 is null");
            return (Criteria) this;
        }

        public Criteria andAac066IsNotNull() {
            addCriterion("AAC066 is not null");
            return (Criteria) this;
        }

        public Criteria andAac066EqualTo(String value) {
            addCriterion("AAC066 =", value, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066NotEqualTo(String value) {
            addCriterion("AAC066 <>", value, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066GreaterThan(String value) {
            addCriterion("AAC066 >", value, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066GreaterThanOrEqualTo(String value) {
            addCriterion("AAC066 >=", value, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066LessThan(String value) {
            addCriterion("AAC066 <", value, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066LessThanOrEqualTo(String value) {
            addCriterion("AAC066 <=", value, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066Like(String value) {
            addCriterion("AAC066 like", value, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066NotLike(String value) {
            addCriterion("AAC066 not like", value, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066In(List<String> values) {
            addCriterion("AAC066 in", values, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066NotIn(List<String> values) {
            addCriterion("AAC066 not in", values, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066Between(String value1, String value2) {
            addCriterion("AAC066 between", value1, value2, "aac066");
            return (Criteria) this;
        }

        public Criteria andAac066NotBetween(String value1, String value2) {
            addCriterion("AAC066 not between", value1, value2, "aac066");
            return (Criteria) this;
        }

        public Criteria andNdjfjsIsNull() {
            addCriterion("NDJFJS is null");
            return (Criteria) this;
        }

        public Criteria andNdjfjsIsNotNull() {
            addCriterion("NDJFJS is not null");
            return (Criteria) this;
        }

        public Criteria andNdjfjsEqualTo(BigDecimal value) {
            addCriterion("NDJFJS =", value, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsNotEqualTo(BigDecimal value) {
            addCriterion("NDJFJS <>", value, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsGreaterThan(BigDecimal value) {
            addCriterion("NDJFJS >", value, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NDJFJS >=", value, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsLessThan(BigDecimal value) {
            addCriterion("NDJFJS <", value, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NDJFJS <=", value, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsIn(List<BigDecimal> values) {
            addCriterion("NDJFJS in", values, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsNotIn(List<BigDecimal> values) {
            addCriterion("NDJFJS not in", values, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NDJFJS between", value1, value2, "ndjfjs");
            return (Criteria) this;
        }

        public Criteria andNdjfjsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NDJFJS not between", value1, value2, "ndjfjs");
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