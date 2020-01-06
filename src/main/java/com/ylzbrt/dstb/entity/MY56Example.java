package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MY56Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MY56Example() {
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

        public Criteria andAae001IsNull() {
            addCriterion("AAE001 is null");
            return (Criteria) this;
        }

        public Criteria andAae001IsNotNull() {
            addCriterion("AAE001 is not null");
            return (Criteria) this;
        }

        public Criteria andAae001EqualTo(Short value) {
            addCriterion("AAE001 =", value, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001NotEqualTo(Short value) {
            addCriterion("AAE001 <>", value, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001GreaterThan(Short value) {
            addCriterion("AAE001 >", value, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001GreaterThanOrEqualTo(Short value) {
            addCriterion("AAE001 >=", value, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001LessThan(Short value) {
            addCriterion("AAE001 <", value, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001LessThanOrEqualTo(Short value) {
            addCriterion("AAE001 <=", value, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001In(List<Short> values) {
            addCriterion("AAE001 in", values, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001NotIn(List<Short> values) {
            addCriterion("AAE001 not in", values, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001Between(Short value1, Short value2) {
            addCriterion("AAE001 between", value1, value2, "aae001");
            return (Criteria) this;
        }

        public Criteria andAae001NotBetween(Short value1, Short value2) {
            addCriterion("AAE001 not between", value1, value2, "aae001");
            return (Criteria) this;
        }

        public Criteria andAme501IsNull() {
            addCriterion("AME501 is null");
            return (Criteria) this;
        }

        public Criteria andAme501IsNotNull() {
            addCriterion("AME501 is not null");
            return (Criteria) this;
        }

        public Criteria andAme501EqualTo(Long value) {
            addCriterion("AME501 =", value, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501NotEqualTo(Long value) {
            addCriterion("AME501 <>", value, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501GreaterThan(Long value) {
            addCriterion("AME501 >", value, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501GreaterThanOrEqualTo(Long value) {
            addCriterion("AME501 >=", value, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501LessThan(Long value) {
            addCriterion("AME501 <", value, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501LessThanOrEqualTo(Long value) {
            addCriterion("AME501 <=", value, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501In(List<Long> values) {
            addCriterion("AME501 in", values, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501NotIn(List<Long> values) {
            addCriterion("AME501 not in", values, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501Between(Long value1, Long value2) {
            addCriterion("AME501 between", value1, value2, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme501NotBetween(Long value1, Long value2) {
            addCriterion("AME501 not between", value1, value2, "ame501");
            return (Criteria) this;
        }

        public Criteria andAme502IsNull() {
            addCriterion("AME502 is null");
            return (Criteria) this;
        }

        public Criteria andAme502IsNotNull() {
            addCriterion("AME502 is not null");
            return (Criteria) this;
        }

        public Criteria andAme502EqualTo(BigDecimal value) {
            addCriterion("AME502 =", value, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502NotEqualTo(BigDecimal value) {
            addCriterion("AME502 <>", value, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502GreaterThan(BigDecimal value) {
            addCriterion("AME502 >", value, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AME502 >=", value, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502LessThan(BigDecimal value) {
            addCriterion("AME502 <", value, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AME502 <=", value, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502In(List<BigDecimal> values) {
            addCriterion("AME502 in", values, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502NotIn(List<BigDecimal> values) {
            addCriterion("AME502 not in", values, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AME502 between", value1, value2, "ame502");
            return (Criteria) this;
        }

        public Criteria andAme502NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AME502 not between", value1, value2, "ame502");
            return (Criteria) this;
        }

        public Criteria andAmc030IsNull() {
            addCriterion("AMC030 is null");
            return (Criteria) this;
        }

        public Criteria andAmc030IsNotNull() {
            addCriterion("AMC030 is not null");
            return (Criteria) this;
        }

        public Criteria andAmc030EqualTo(BigDecimal value) {
            addCriterion("AMC030 =", value, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030NotEqualTo(BigDecimal value) {
            addCriterion("AMC030 <>", value, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030GreaterThan(BigDecimal value) {
            addCriterion("AMC030 >", value, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMC030 >=", value, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030LessThan(BigDecimal value) {
            addCriterion("AMC030 <", value, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMC030 <=", value, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030In(List<BigDecimal> values) {
            addCriterion("AMC030 in", values, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030NotIn(List<BigDecimal> values) {
            addCriterion("AMC030 not in", values, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMC030 between", value1, value2, "amc030");
            return (Criteria) this;
        }

        public Criteria andAmc030NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMC030 not between", value1, value2, "amc030");
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