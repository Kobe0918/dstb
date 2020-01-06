package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZwMc01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwMc01Example() {
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

        public Criteria andAab001IsNull() {
            addCriterion("AAB001 is null");
            return (Criteria) this;
        }

        public Criteria andAab001IsNotNull() {
            addCriterion("AAB001 is not null");
            return (Criteria) this;
        }

        public Criteria andAab001EqualTo(String value) {
            addCriterion("AAB001 =", value, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001NotEqualTo(String value) {
            addCriterion("AAB001 <>", value, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001GreaterThan(String value) {
            addCriterion("AAB001 >", value, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001GreaterThanOrEqualTo(String value) {
            addCriterion("AAB001 >=", value, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001LessThan(String value) {
            addCriterion("AAB001 <", value, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001LessThanOrEqualTo(String value) {
            addCriterion("AAB001 <=", value, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001Like(String value) {
            addCriterion("AAB001 like", value, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001NotLike(String value) {
            addCriterion("AAB001 not like", value, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001In(List<String> values) {
            addCriterion("AAB001 in", values, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001NotIn(List<String> values) {
            addCriterion("AAB001 not in", values, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001Between(String value1, String value2) {
            addCriterion("AAB001 between", value1, value2, "aab001");
            return (Criteria) this;
        }

        public Criteria andAab001NotBetween(String value1, String value2) {
            addCriterion("AAB001 not between", value1, value2, "aab001");
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

        public Criteria andAae036IsNull() {
            addCriterion("AAE036 is null");
            return (Criteria) this;
        }

        public Criteria andAae036IsNotNull() {
            addCriterion("AAE036 is not null");
            return (Criteria) this;
        }

        public Criteria andAae036EqualTo(Date value) {
            addCriterion("AAE036 =", value, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036NotEqualTo(Date value) {
            addCriterion("AAE036 <>", value, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036GreaterThan(Date value) {
            addCriterion("AAE036 >", value, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036GreaterThanOrEqualTo(Date value) {
            addCriterion("AAE036 >=", value, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036LessThan(Date value) {
            addCriterion("AAE036 <", value, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036LessThanOrEqualTo(Date value) {
            addCriterion("AAE036 <=", value, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036In(List<Date> values) {
            addCriterion("AAE036 in", values, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036NotIn(List<Date> values) {
            addCriterion("AAE036 not in", values, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036Between(Date value1, Date value2) {
            addCriterion("AAE036 between", value1, value2, "aae036");
            return (Criteria) this;
        }

        public Criteria andAae036NotBetween(Date value1, Date value2) {
            addCriterion("AAE036 not between", value1, value2, "aae036");
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

        public Criteria andAae031EqualTo(Integer value) {
            addCriterion("AAE031 =", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031NotEqualTo(Integer value) {
            addCriterion("AAE031 <>", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031GreaterThan(Integer value) {
            addCriterion("AAE031 >", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031GreaterThanOrEqualTo(Integer value) {
            addCriterion("AAE031 >=", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031LessThan(Integer value) {
            addCriterion("AAE031 <", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031LessThanOrEqualTo(Integer value) {
            addCriterion("AAE031 <=", value, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031In(List<Integer> values) {
            addCriterion("AAE031 in", values, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031NotIn(List<Integer> values) {
            addCriterion("AAE031 not in", values, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031Between(Integer value1, Integer value2) {
            addCriterion("AAE031 between", value1, value2, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae031NotBetween(Integer value1, Integer value2) {
            addCriterion("AAE031 not between", value1, value2, "aae031");
            return (Criteria) this;
        }

        public Criteria andAae011IsNull() {
            addCriterion("AAE011 is null");
            return (Criteria) this;
        }

        public Criteria andAae011IsNotNull() {
            addCriterion("AAE011 is not null");
            return (Criteria) this;
        }

        public Criteria andAae011EqualTo(String value) {
            addCriterion("AAE011 =", value, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011NotEqualTo(String value) {
            addCriterion("AAE011 <>", value, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011GreaterThan(String value) {
            addCriterion("AAE011 >", value, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011GreaterThanOrEqualTo(String value) {
            addCriterion("AAE011 >=", value, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011LessThan(String value) {
            addCriterion("AAE011 <", value, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011LessThanOrEqualTo(String value) {
            addCriterion("AAE011 <=", value, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011Like(String value) {
            addCriterion("AAE011 like", value, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011NotLike(String value) {
            addCriterion("AAE011 not like", value, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011In(List<String> values) {
            addCriterion("AAE011 in", values, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011NotIn(List<String> values) {
            addCriterion("AAE011 not in", values, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011Between(String value1, String value2) {
            addCriterion("AAE011 between", value1, value2, "aae011");
            return (Criteria) this;
        }

        public Criteria andAae011NotBetween(String value1, String value2) {
            addCriterion("AAE011 not between", value1, value2, "aae011");
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