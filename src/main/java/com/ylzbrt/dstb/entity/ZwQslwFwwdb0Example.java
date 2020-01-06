package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.List;

public class ZwQslwFwwdb0Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwQslwFwwdb0Example() {
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

        public Criteria andFwwdbhIsNull() {
            addCriterion("FWWDBH is null");
            return (Criteria) this;
        }

        public Criteria andFwwdbhIsNotNull() {
            addCriterion("FWWDBH is not null");
            return (Criteria) this;
        }

        public Criteria andFwwdbhEqualTo(String value) {
            addCriterion("FWWDBH =", value, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhNotEqualTo(String value) {
            addCriterion("FWWDBH <>", value, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhGreaterThan(String value) {
            addCriterion("FWWDBH >", value, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhGreaterThanOrEqualTo(String value) {
            addCriterion("FWWDBH >=", value, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhLessThan(String value) {
            addCriterion("FWWDBH <", value, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhLessThanOrEqualTo(String value) {
            addCriterion("FWWDBH <=", value, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhLike(String value) {
            addCriterion("FWWDBH like", value, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhNotLike(String value) {
            addCriterion("FWWDBH not like", value, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhIn(List<String> values) {
            addCriterion("FWWDBH in", values, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhNotIn(List<String> values) {
            addCriterion("FWWDBH not in", values, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhBetween(String value1, String value2) {
            addCriterion("FWWDBH between", value1, value2, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdbhNotBetween(String value1, String value2) {
            addCriterion("FWWDBH not between", value1, value2, "fwwdbh");
            return (Criteria) this;
        }

        public Criteria andFwwdmcIsNull() {
            addCriterion("FWWDMC is null");
            return (Criteria) this;
        }

        public Criteria andFwwdmcIsNotNull() {
            addCriterion("FWWDMC is not null");
            return (Criteria) this;
        }

        public Criteria andFwwdmcEqualTo(String value) {
            addCriterion("FWWDMC =", value, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcNotEqualTo(String value) {
            addCriterion("FWWDMC <>", value, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcGreaterThan(String value) {
            addCriterion("FWWDMC >", value, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcGreaterThanOrEqualTo(String value) {
            addCriterion("FWWDMC >=", value, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcLessThan(String value) {
            addCriterion("FWWDMC <", value, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcLessThanOrEqualTo(String value) {
            addCriterion("FWWDMC <=", value, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcLike(String value) {
            addCriterion("FWWDMC like", value, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcNotLike(String value) {
            addCriterion("FWWDMC not like", value, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcIn(List<String> values) {
            addCriterion("FWWDMC in", values, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcNotIn(List<String> values) {
            addCriterion("FWWDMC not in", values, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcBetween(String value1, String value2) {
            addCriterion("FWWDMC between", value1, value2, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andFwwdmcNotBetween(String value1, String value2) {
            addCriterion("FWWDMC not between", value1, value2, "fwwdmc");
            return (Criteria) this;
        }

        public Criteria andWdlb00IsNull() {
            addCriterion("WDLB00 is null");
            return (Criteria) this;
        }

        public Criteria andWdlb00IsNotNull() {
            addCriterion("WDLB00 is not null");
            return (Criteria) this;
        }

        public Criteria andWdlb00EqualTo(String value) {
            addCriterion("WDLB00 =", value, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00NotEqualTo(String value) {
            addCriterion("WDLB00 <>", value, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00GreaterThan(String value) {
            addCriterion("WDLB00 >", value, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00GreaterThanOrEqualTo(String value) {
            addCriterion("WDLB00 >=", value, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00LessThan(String value) {
            addCriterion("WDLB00 <", value, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00LessThanOrEqualTo(String value) {
            addCriterion("WDLB00 <=", value, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00Like(String value) {
            addCriterion("WDLB00 like", value, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00NotLike(String value) {
            addCriterion("WDLB00 not like", value, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00In(List<String> values) {
            addCriterion("WDLB00 in", values, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00NotIn(List<String> values) {
            addCriterion("WDLB00 not in", values, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00Between(String value1, String value2) {
            addCriterion("WDLB00 between", value1, value2, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWdlb00NotBetween(String value1, String value2) {
            addCriterion("WDLB00 not between", value1, value2, "wdlb00");
            return (Criteria) this;
        }

        public Criteria andWddz00IsNull() {
            addCriterion("WDDZ00 is null");
            return (Criteria) this;
        }

        public Criteria andWddz00IsNotNull() {
            addCriterion("WDDZ00 is not null");
            return (Criteria) this;
        }

        public Criteria andWddz00EqualTo(String value) {
            addCriterion("WDDZ00 =", value, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00NotEqualTo(String value) {
            addCriterion("WDDZ00 <>", value, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00GreaterThan(String value) {
            addCriterion("WDDZ00 >", value, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00GreaterThanOrEqualTo(String value) {
            addCriterion("WDDZ00 >=", value, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00LessThan(String value) {
            addCriterion("WDDZ00 <", value, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00LessThanOrEqualTo(String value) {
            addCriterion("WDDZ00 <=", value, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00Like(String value) {
            addCriterion("WDDZ00 like", value, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00NotLike(String value) {
            addCriterion("WDDZ00 not like", value, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00In(List<String> values) {
            addCriterion("WDDZ00 in", values, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00NotIn(List<String> values) {
            addCriterion("WDDZ00 not in", values, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00Between(String value1, String value2) {
            addCriterion("WDDZ00 between", value1, value2, "wddz00");
            return (Criteria) this;
        }

        public Criteria andWddz00NotBetween(String value1, String value2) {
            addCriterion("WDDZ00 not between", value1, value2, "wddz00");
            return (Criteria) this;
        }

        public Criteria andFzxmc0IsNull() {
            addCriterion("FZXMC0 is null");
            return (Criteria) this;
        }

        public Criteria andFzxmc0IsNotNull() {
            addCriterion("FZXMC0 is not null");
            return (Criteria) this;
        }

        public Criteria andFzxmc0EqualTo(String value) {
            addCriterion("FZXMC0 =", value, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0NotEqualTo(String value) {
            addCriterion("FZXMC0 <>", value, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0GreaterThan(String value) {
            addCriterion("FZXMC0 >", value, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0GreaterThanOrEqualTo(String value) {
            addCriterion("FZXMC0 >=", value, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0LessThan(String value) {
            addCriterion("FZXMC0 <", value, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0LessThanOrEqualTo(String value) {
            addCriterion("FZXMC0 <=", value, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0Like(String value) {
            addCriterion("FZXMC0 like", value, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0NotLike(String value) {
            addCriterion("FZXMC0 not like", value, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0In(List<String> values) {
            addCriterion("FZXMC0 in", values, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0NotIn(List<String> values) {
            addCriterion("FZXMC0 not in", values, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0Between(String value1, String value2) {
            addCriterion("FZXMC0 between", value1, value2, "fzxmc0");
            return (Criteria) this;
        }

        public Criteria andFzxmc0NotBetween(String value1, String value2) {
            addCriterion("FZXMC0 not between", value1, value2, "fzxmc0");
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