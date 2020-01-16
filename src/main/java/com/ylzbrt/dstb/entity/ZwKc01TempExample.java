package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZwKc01TempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwKc01TempExample() {
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

        public Criteria andAaz501IsNull() {
            addCriterion("AAZ501 is null");
            return (Criteria) this;
        }

        public Criteria andAaz501IsNotNull() {
            addCriterion("AAZ501 is not null");
            return (Criteria) this;
        }

        public Criteria andAaz501EqualTo(String value) {
            addCriterion("AAZ501 =", value, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501NotEqualTo(String value) {
            addCriterion("AAZ501 <>", value, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501GreaterThan(String value) {
            addCriterion("AAZ501 >", value, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501GreaterThanOrEqualTo(String value) {
            addCriterion("AAZ501 >=", value, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501LessThan(String value) {
            addCriterion("AAZ501 <", value, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501LessThanOrEqualTo(String value) {
            addCriterion("AAZ501 <=", value, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501Like(String value) {
            addCriterion("AAZ501 like", value, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501NotLike(String value) {
            addCriterion("AAZ501 not like", value, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501In(List<String> values) {
            addCriterion("AAZ501 in", values, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501NotIn(List<String> values) {
            addCriterion("AAZ501 not in", values, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501Between(String value1, String value2) {
            addCriterion("AAZ501 between", value1, value2, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz501NotBetween(String value1, String value2) {
            addCriterion("AAZ501 not between", value1, value2, "aaz501");
            return (Criteria) this;
        }

        public Criteria andAaz502IsNull() {
            addCriterion("AAZ502 is null");
            return (Criteria) this;
        }

        public Criteria andAaz502IsNotNull() {
            addCriterion("AAZ502 is not null");
            return (Criteria) this;
        }

        public Criteria andAaz502EqualTo(String value) {
            addCriterion("AAZ502 =", value, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502NotEqualTo(String value) {
            addCriterion("AAZ502 <>", value, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502GreaterThan(String value) {
            addCriterion("AAZ502 >", value, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502GreaterThanOrEqualTo(String value) {
            addCriterion("AAZ502 >=", value, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502LessThan(String value) {
            addCriterion("AAZ502 <", value, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502LessThanOrEqualTo(String value) {
            addCriterion("AAZ502 <=", value, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502Like(String value) {
            addCriterion("AAZ502 like", value, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502NotLike(String value) {
            addCriterion("AAZ502 not like", value, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502In(List<String> values) {
            addCriterion("AAZ502 in", values, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502NotIn(List<String> values) {
            addCriterion("AAZ502 not in", values, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502Between(String value1, String value2) {
            addCriterion("AAZ502 between", value1, value2, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAaz502NotBetween(String value1, String value2) {
            addCriterion("AAZ502 not between", value1, value2, "aaz502");
            return (Criteria) this;
        }

        public Criteria andAkc087IsNull() {
            addCriterion("AKC087 is null");
            return (Criteria) this;
        }

        public Criteria andAkc087IsNotNull() {
            addCriterion("AKC087 is not null");
            return (Criteria) this;
        }

        public Criteria andAkc087EqualTo(BigDecimal value) {
            addCriterion("AKC087 =", value, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087NotEqualTo(BigDecimal value) {
            addCriterion("AKC087 <>", value, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087GreaterThan(BigDecimal value) {
            addCriterion("AKC087 >", value, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AKC087 >=", value, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087LessThan(BigDecimal value) {
            addCriterion("AKC087 <", value, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AKC087 <=", value, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087In(List<BigDecimal> values) {
            addCriterion("AKC087 in", values, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087NotIn(List<BigDecimal> values) {
            addCriterion("AKC087 not in", values, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AKC087 between", value1, value2, "akc087");
            return (Criteria) this;
        }

        public Criteria andAkc087NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AKC087 not between", value1, value2, "akc087");
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

        public Criteria andSsxq00IsNull() {
            addCriterion("SSXQ00 is null");
            return (Criteria) this;
        }

        public Criteria andSsxq00IsNotNull() {
            addCriterion("SSXQ00 is not null");
            return (Criteria) this;
        }

        public Criteria andSsxq00EqualTo(String value) {
            addCriterion("SSXQ00 =", value, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00NotEqualTo(String value) {
            addCriterion("SSXQ00 <>", value, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00GreaterThan(String value) {
            addCriterion("SSXQ00 >", value, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00GreaterThanOrEqualTo(String value) {
            addCriterion("SSXQ00 >=", value, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00LessThan(String value) {
            addCriterion("SSXQ00 <", value, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00LessThanOrEqualTo(String value) {
            addCriterion("SSXQ00 <=", value, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00Like(String value) {
            addCriterion("SSXQ00 like", value, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00NotLike(String value) {
            addCriterion("SSXQ00 not like", value, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00In(List<String> values) {
            addCriterion("SSXQ00 in", values, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00NotIn(List<String> values) {
            addCriterion("SSXQ00 not in", values, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00Between(String value1, String value2) {
            addCriterion("SSXQ00 between", value1, value2, "ssxq00");
            return (Criteria) this;
        }

        public Criteria andSsxq00NotBetween(String value1, String value2) {
            addCriterion("SSXQ00 not between", value1, value2, "ssxq00");
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