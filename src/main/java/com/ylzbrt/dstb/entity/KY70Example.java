package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class KY70Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KY70Example() {
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

        public Criteria andAac001IsNull() {
            addCriterion("AAC001 is null");
            return (Criteria) this;
        }

        public Criteria andAac001IsNotNull() {
            addCriterion("AAC001 is not null");
            return (Criteria) this;
        }

        public Criteria andAac001EqualTo(BigDecimal value) {
            addCriterion("AAC001 =", value, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001NotEqualTo(BigDecimal value) {
            addCriterion("AAC001 <>", value, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001GreaterThan(BigDecimal value) {
            addCriterion("AAC001 >", value, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AAC001 >=", value, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001LessThan(BigDecimal value) {
            addCriterion("AAC001 <", value, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AAC001 <=", value, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001In(List<BigDecimal> values) {
            addCriterion("AAC001 in", values, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001NotIn(List<BigDecimal> values) {
            addCriterion("AAC001 not in", values, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AAC001 between", value1, value2, "aac001");
            return (Criteria) this;
        }

        public Criteria andAac001NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AAC001 not between", value1, value2, "aac001");
            return (Criteria) this;
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

        public Criteria andAke007IsNull() {
            addCriterion("AKE007 is null");
            return (Criteria) this;
        }

        public Criteria andAke007IsNotNull() {
            addCriterion("AKE007 is not null");
            return (Criteria) this;
        }

        public Criteria andAke007EqualTo(Integer value) {
            addCriterion("AKE007 =", value, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007NotEqualTo(Integer value) {
            addCriterion("AKE007 <>", value, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007GreaterThan(Integer value) {
            addCriterion("AKE007 >", value, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007GreaterThanOrEqualTo(Integer value) {
            addCriterion("AKE007 >=", value, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007LessThan(Integer value) {
            addCriterion("AKE007 <", value, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007LessThanOrEqualTo(Integer value) {
            addCriterion("AKE007 <=", value, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007In(List<Integer> values) {
            addCriterion("AKE007 in", values, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007NotIn(List<Integer> values) {
            addCriterion("AKE007 not in", values, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007Between(Integer value1, Integer value2) {
            addCriterion("AKE007 between", value1, value2, "ake007");
            return (Criteria) this;
        }

        public Criteria andAke007NotBetween(Integer value1, Integer value2) {
            addCriterion("AKE007 not between", value1, value2, "ake007");
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

        public Criteria andAkc227IsNull() {
            addCriterion("AKC227 is null");
            return (Criteria) this;
        }

        public Criteria andAkc227IsNotNull() {
            addCriterion("AKC227 is not null");
            return (Criteria) this;
        }

        public Criteria andAkc227EqualTo(BigDecimal value) {
            addCriterion("AKC227 =", value, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227NotEqualTo(BigDecimal value) {
            addCriterion("AKC227 <>", value, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227GreaterThan(BigDecimal value) {
            addCriterion("AKC227 >", value, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AKC227 >=", value, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227LessThan(BigDecimal value) {
            addCriterion("AKC227 <", value, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AKC227 <=", value, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227In(List<BigDecimal> values) {
            addCriterion("AKC227 in", values, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227NotIn(List<BigDecimal> values) {
            addCriterion("AKC227 not in", values, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AKC227 between", value1, value2, "akc227");
            return (Criteria) this;
        }

        public Criteria andAkc227NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AKC227 not between", value1, value2, "akc227");
            return (Criteria) this;
        }

        public Criteria andBkc045IsNull() {
            addCriterion("BKC045 is null");
            return (Criteria) this;
        }

        public Criteria andBkc045IsNotNull() {
            addCriterion("BKC045 is not null");
            return (Criteria) this;
        }

        public Criteria andBkc045EqualTo(BigDecimal value) {
            addCriterion("BKC045 =", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045NotEqualTo(BigDecimal value) {
            addCriterion("BKC045 <>", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045GreaterThan(BigDecimal value) {
            addCriterion("BKC045 >", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC045 >=", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045LessThan(BigDecimal value) {
            addCriterion("BKC045 <", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC045 <=", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045In(List<BigDecimal> values) {
            addCriterion("BKC045 in", values, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045NotIn(List<BigDecimal> values) {
            addCriterion("BKC045 not in", values, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC045 between", value1, value2, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC045 not between", value1, value2, "bkc045");
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