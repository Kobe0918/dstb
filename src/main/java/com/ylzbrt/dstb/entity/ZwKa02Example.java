package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.List;

public class ZwKa02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwKa02Example() {
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

        public Criteria andAke002IsNull() {
            addCriterion("AKE002 is null");
            return (Criteria) this;
        }

        public Criteria andAke002IsNotNull() {
            addCriterion("AKE002 is not null");
            return (Criteria) this;
        }

        public Criteria andAke002EqualTo(String value) {
            addCriterion("AKE002 =", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002NotEqualTo(String value) {
            addCriterion("AKE002 <>", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002GreaterThan(String value) {
            addCriterion("AKE002 >", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002GreaterThanOrEqualTo(String value) {
            addCriterion("AKE002 >=", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002LessThan(String value) {
            addCriterion("AKE002 <", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002LessThanOrEqualTo(String value) {
            addCriterion("AKE002 <=", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002Like(String value) {
            addCriterion("AKE002 like", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002NotLike(String value) {
            addCriterion("AKE002 not like", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002In(List<String> values) {
            addCriterion("AKE002 in", values, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002NotIn(List<String> values) {
            addCriterion("AKE002 not in", values, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002Between(String value1, String value2) {
            addCriterion("AKE002 between", value1, value2, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002NotBetween(String value1, String value2) {
            addCriterion("AKE002 not between", value1, value2, "ake002");
            return (Criteria) this;
        }

        public Criteria andAka070IsNull() {
            addCriterion("AKA070 is null");
            return (Criteria) this;
        }

        public Criteria andAka070IsNotNull() {
            addCriterion("AKA070 is not null");
            return (Criteria) this;
        }

        public Criteria andAka070EqualTo(String value) {
            addCriterion("AKA070 =", value, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070NotEqualTo(String value) {
            addCriterion("AKA070 <>", value, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070GreaterThan(String value) {
            addCriterion("AKA070 >", value, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070GreaterThanOrEqualTo(String value) {
            addCriterion("AKA070 >=", value, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070LessThan(String value) {
            addCriterion("AKA070 <", value, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070LessThanOrEqualTo(String value) {
            addCriterion("AKA070 <=", value, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070Like(String value) {
            addCriterion("AKA070 like", value, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070NotLike(String value) {
            addCriterion("AKA070 not like", value, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070In(List<String> values) {
            addCriterion("AKA070 in", values, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070NotIn(List<String> values) {
            addCriterion("AKA070 not in", values, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070Between(String value1, String value2) {
            addCriterion("AKA070 between", value1, value2, "aka070");
            return (Criteria) this;
        }

        public Criteria andAka070NotBetween(String value1, String value2) {
            addCriterion("AKA070 not between", value1, value2, "aka070");
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

        public Criteria andBka001IsNull() {
            addCriterion("BKA001 is null");
            return (Criteria) this;
        }

        public Criteria andBka001IsNotNull() {
            addCriterion("BKA001 is not null");
            return (Criteria) this;
        }

        public Criteria andBka001EqualTo(String value) {
            addCriterion("BKA001 =", value, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001NotEqualTo(String value) {
            addCriterion("BKA001 <>", value, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001GreaterThan(String value) {
            addCriterion("BKA001 >", value, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001GreaterThanOrEqualTo(String value) {
            addCriterion("BKA001 >=", value, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001LessThan(String value) {
            addCriterion("BKA001 <", value, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001LessThanOrEqualTo(String value) {
            addCriterion("BKA001 <=", value, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001Like(String value) {
            addCriterion("BKA001 like", value, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001NotLike(String value) {
            addCriterion("BKA001 not like", value, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001In(List<String> values) {
            addCriterion("BKA001 in", values, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001NotIn(List<String> values) {
            addCriterion("BKA001 not in", values, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001Between(String value1, String value2) {
            addCriterion("BKA001 between", value1, value2, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka001NotBetween(String value1, String value2) {
            addCriterion("BKA001 not between", value1, value2, "bka001");
            return (Criteria) this;
        }

        public Criteria andBka010IsNull() {
            addCriterion("BKA010 is null");
            return (Criteria) this;
        }

        public Criteria andBka010IsNotNull() {
            addCriterion("BKA010 is not null");
            return (Criteria) this;
        }

        public Criteria andBka010EqualTo(String value) {
            addCriterion("BKA010 =", value, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010NotEqualTo(String value) {
            addCriterion("BKA010 <>", value, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010GreaterThan(String value) {
            addCriterion("BKA010 >", value, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010GreaterThanOrEqualTo(String value) {
            addCriterion("BKA010 >=", value, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010LessThan(String value) {
            addCriterion("BKA010 <", value, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010LessThanOrEqualTo(String value) {
            addCriterion("BKA010 <=", value, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010Like(String value) {
            addCriterion("BKA010 like", value, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010NotLike(String value) {
            addCriterion("BKA010 not like", value, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010In(List<String> values) {
            addCriterion("BKA010 in", values, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010NotIn(List<String> values) {
            addCriterion("BKA010 not in", values, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010Between(String value1, String value2) {
            addCriterion("BKA010 between", value1, value2, "bka010");
            return (Criteria) this;
        }

        public Criteria andBka010NotBetween(String value1, String value2) {
            addCriterion("BKA010 not between", value1, value2, "bka010");
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

        public Criteria andYpgymcIsNull() {
            addCriterion("YPGYMC is null");
            return (Criteria) this;
        }

        public Criteria andYpgymcIsNotNull() {
            addCriterion("YPGYMC is not null");
            return (Criteria) this;
        }

        public Criteria andYpgymcEqualTo(String value) {
            addCriterion("YPGYMC =", value, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcNotEqualTo(String value) {
            addCriterion("YPGYMC <>", value, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcGreaterThan(String value) {
            addCriterion("YPGYMC >", value, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcGreaterThanOrEqualTo(String value) {
            addCriterion("YPGYMC >=", value, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcLessThan(String value) {
            addCriterion("YPGYMC <", value, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcLessThanOrEqualTo(String value) {
            addCriterion("YPGYMC <=", value, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcLike(String value) {
            addCriterion("YPGYMC like", value, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcNotLike(String value) {
            addCriterion("YPGYMC not like", value, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcIn(List<String> values) {
            addCriterion("YPGYMC in", values, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcNotIn(List<String> values) {
            addCriterion("YPGYMC not in", values, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcBetween(String value1, String value2) {
            addCriterion("YPGYMC between", value1, value2, "ypgymc");
            return (Criteria) this;
        }

        public Criteria andYpgymcNotBetween(String value1, String value2) {
            addCriterion("YPGYMC not between", value1, value2, "ypgymc");
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