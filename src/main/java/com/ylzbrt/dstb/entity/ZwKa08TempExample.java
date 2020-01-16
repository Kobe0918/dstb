package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZwKa08TempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwKa08TempExample() {
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

        public Criteria andAae030IsNull() {
            addCriterion("AAE030 is null");
            return (Criteria) this;
        }

        public Criteria andAae030IsNotNull() {
            addCriterion("AAE030 is not null");
            return (Criteria) this;
        }

        public Criteria andAae030EqualTo(Long value) {
            addCriterion("AAE030 =", value, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030NotEqualTo(Long value) {
            addCriterion("AAE030 <>", value, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030GreaterThan(Long value) {
            addCriterion("AAE030 >", value, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030GreaterThanOrEqualTo(Long value) {
            addCriterion("AAE030 >=", value, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030LessThan(Long value) {
            addCriterion("AAE030 <", value, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030LessThanOrEqualTo(Long value) {
            addCriterion("AAE030 <=", value, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030In(List<Long> values) {
            addCriterion("AAE030 in", values, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030NotIn(List<Long> values) {
            addCriterion("AAE030 not in", values, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030Between(Long value1, Long value2) {
            addCriterion("AAE030 between", value1, value2, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae030NotBetween(Long value1, Long value2) {
            addCriterion("AAE030 not between", value1, value2, "aae030");
            return (Criteria) this;
        }

        public Criteria andAae031IsNull() {
            addCriterion("AAE031 is null");
            return (Criteria) this;
        }

        public Criteria andAae031IsNotNull() {
            addCriterion("AAE031 is not null");
            return (Criteria) this;
        }

        public Criteria andAae031EqualTo(Long value) {
            addCriterion("AAE031 =", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031NotEqualTo(Long value) {
            addCriterion("AAE031 <>", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031GreaterThan(Long value) {
            addCriterion("AAE031 >", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031GreaterThanOrEqualTo(Long value) {
            addCriterion("AAE031 >=", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031LessThan(Long value) {
            addCriterion("AAE031 <", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031LessThanOrEqualTo(Long value) {
            addCriterion("AAE031 <=", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031In(List<Long> values) {
            addCriterion("AAE031 in", values, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031NotIn(List<Long> values) {
            addCriterion("AAE031 not in", values, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031Between(Long value1, Long value2) {
            addCriterion("AAE031 between", value1, value2, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031NotBetween(Long value1, Long value2) {
            addCriterion("AAE031 not between", value1, value2, "aae031");
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