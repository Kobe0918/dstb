package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZwKY65Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwKY65Example() {
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

        public Criteria andAae340IsNull() {
            addCriterion("AAE340 is null");
            return (Criteria) this;
        }

        public Criteria andAae340IsNotNull() {
            addCriterion("AAE340 is not null");
            return (Criteria) this;
        }

        public Criteria andAae340EqualTo(BigDecimal value) {
            addCriterion("AAE340 =", value, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340NotEqualTo(BigDecimal value) {
            addCriterion("AAE340 <>", value, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340GreaterThan(BigDecimal value) {
            addCriterion("AAE340 >", value, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AAE340 >=", value, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340LessThan(BigDecimal value) {
            addCriterion("AAE340 <", value, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AAE340 <=", value, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340In(List<BigDecimal> values) {
            addCriterion("AAE340 in", values, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340NotIn(List<BigDecimal> values) {
            addCriterion("AAE340 not in", values, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AAE340 between", value1, value2, "aae340");
            return (Criteria) this;
        }

        public Criteria andAae340NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AAE340 not between", value1, value2, "aae340");
            return (Criteria) this;
        }

        public Criteria andAke505IsNull() {
            addCriterion("AKE505 is null");
            return (Criteria) this;
        }

        public Criteria andAke505IsNotNull() {
            addCriterion("AKE505 is not null");
            return (Criteria) this;
        }

        public Criteria andAke505EqualTo(BigDecimal value) {
            addCriterion("AKE505 =", value, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505NotEqualTo(BigDecimal value) {
            addCriterion("AKE505 <>", value, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505GreaterThan(BigDecimal value) {
            addCriterion("AKE505 >", value, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AKE505 >=", value, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505LessThan(BigDecimal value) {
            addCriterion("AKE505 <", value, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AKE505 <=", value, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505In(List<BigDecimal> values) {
            addCriterion("AKE505 in", values, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505NotIn(List<BigDecimal> values) {
            addCriterion("AKE505 not in", values, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AKE505 between", value1, value2, "ake505");
            return (Criteria) this;
        }

        public Criteria andAke505NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AKE505 not between", value1, value2, "ake505");
            return (Criteria) this;
        }

        public Criteria andAkc501IsNull() {
            addCriterion("AKC501 is null");
            return (Criteria) this;
        }

        public Criteria andAkc501IsNotNull() {
            addCriterion("AKC501 is not null");
            return (Criteria) this;
        }

        public Criteria andAkc501EqualTo(Integer value) {
            addCriterion("AKC501 =", value, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501NotEqualTo(Integer value) {
            addCriterion("AKC501 <>", value, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501GreaterThan(Integer value) {
            addCriterion("AKC501 >", value, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501GreaterThanOrEqualTo(Integer value) {
            addCriterion("AKC501 >=", value, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501LessThan(Integer value) {
            addCriterion("AKC501 <", value, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501LessThanOrEqualTo(Integer value) {
            addCriterion("AKC501 <=", value, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501In(List<Integer> values) {
            addCriterion("AKC501 in", values, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501NotIn(List<Integer> values) {
            addCriterion("AKC501 not in", values, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501Between(Integer value1, Integer value2) {
            addCriterion("AKC501 between", value1, value2, "akc501");
            return (Criteria) this;
        }

        public Criteria andAkc501NotBetween(Integer value1, Integer value2) {
            addCriterion("AKC501 not between", value1, value2, "akc501");
            return (Criteria) this;
        }

        public Criteria andBnydfyIsNull() {
            addCriterion("BNYDFY is null");
            return (Criteria) this;
        }

        public Criteria andBnydfyIsNotNull() {
            addCriterion("BNYDFY is not null");
            return (Criteria) this;
        }

        public Criteria andBnydfyEqualTo(BigDecimal value) {
            addCriterion("BNYDFY =", value, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyNotEqualTo(BigDecimal value) {
            addCriterion("BNYDFY <>", value, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyGreaterThan(BigDecimal value) {
            addCriterion("BNYDFY >", value, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BNYDFY >=", value, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyLessThan(BigDecimal value) {
            addCriterion("BNYDFY <", value, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BNYDFY <=", value, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyIn(List<BigDecimal> values) {
            addCriterion("BNYDFY in", values, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyNotIn(List<BigDecimal> values) {
            addCriterion("BNYDFY not in", values, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BNYDFY between", value1, value2, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnydfyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BNYDFY not between", value1, value2, "bnydfy");
            return (Criteria) this;
        }

        public Criteria andBnpmljIsNull() {
            addCriterion("BNPMLJ is null");
            return (Criteria) this;
        }

        public Criteria andBnpmljIsNotNull() {
            addCriterion("BNPMLJ is not null");
            return (Criteria) this;
        }

        public Criteria andBnpmljEqualTo(BigDecimal value) {
            addCriterion("BNPMLJ =", value, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljNotEqualTo(BigDecimal value) {
            addCriterion("BNPMLJ <>", value, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljGreaterThan(BigDecimal value) {
            addCriterion("BNPMLJ >", value, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BNPMLJ >=", value, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljLessThan(BigDecimal value) {
            addCriterion("BNPMLJ <", value, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BNPMLJ <=", value, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljIn(List<BigDecimal> values) {
            addCriterion("BNPMLJ in", values, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljNotIn(List<BigDecimal> values) {
            addCriterion("BNPMLJ not in", values, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BNPMLJ between", value1, value2, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBnpmljNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BNPMLJ not between", value1, value2, "bnpmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljIsNull() {
            addCriterion("BNTMLJ is null");
            return (Criteria) this;
        }

        public Criteria andBntmljIsNotNull() {
            addCriterion("BNTMLJ is not null");
            return (Criteria) this;
        }

        public Criteria andBntmljEqualTo(BigDecimal value) {
            addCriterion("BNTMLJ =", value, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljNotEqualTo(BigDecimal value) {
            addCriterion("BNTMLJ <>", value, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljGreaterThan(BigDecimal value) {
            addCriterion("BNTMLJ >", value, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BNTMLJ >=", value, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljLessThan(BigDecimal value) {
            addCriterion("BNTMLJ <", value, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BNTMLJ <=", value, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljIn(List<BigDecimal> values) {
            addCriterion("BNTMLJ in", values, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljNotIn(List<BigDecimal> values) {
            addCriterion("BNTMLJ not in", values, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BNTMLJ between", value1, value2, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBntmljNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BNTMLJ not between", value1, value2, "bntmlj");
            return (Criteria) this;
        }

        public Criteria andBnzyljIsNull() {
            addCriterion("BNZYLJ is null");
            return (Criteria) this;
        }

        public Criteria andBnzyljIsNotNull() {
            addCriterion("BNZYLJ is not null");
            return (Criteria) this;
        }

        public Criteria andBnzyljEqualTo(BigDecimal value) {
            addCriterion("BNZYLJ =", value, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljNotEqualTo(BigDecimal value) {
            addCriterion("BNZYLJ <>", value, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljGreaterThan(BigDecimal value) {
            addCriterion("BNZYLJ >", value, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BNZYLJ >=", value, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljLessThan(BigDecimal value) {
            addCriterion("BNZYLJ <", value, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BNZYLJ <=", value, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljIn(List<BigDecimal> values) {
            addCriterion("BNZYLJ in", values, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljNotIn(List<BigDecimal> values) {
            addCriterion("BNZYLJ not in", values, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BNZYLJ between", value1, value2, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBnzyljNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BNZYLJ not between", value1, value2, "bnzylj");
            return (Criteria) this;
        }

        public Criteria andBkc041IsNull() {
            addCriterion("BKC041 is null");
            return (Criteria) this;
        }

        public Criteria andBkc041IsNotNull() {
            addCriterion("BKC041 is not null");
            return (Criteria) this;
        }

        public Criteria andBkc041EqualTo(BigDecimal value) {
            addCriterion("BKC041 =", value, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041NotEqualTo(BigDecimal value) {
            addCriterion("BKC041 <>", value, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041GreaterThan(BigDecimal value) {
            addCriterion("BKC041 >", value, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC041 >=", value, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041LessThan(BigDecimal value) {
            addCriterion("BKC041 <", value, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC041 <=", value, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041In(List<BigDecimal> values) {
            addCriterion("BKC041 in", values, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041NotIn(List<BigDecimal> values) {
            addCriterion("BKC041 not in", values, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC041 between", value1, value2, "bkc041");
            return (Criteria) this;
        }

        public Criteria andBkc041NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC041 not between", value1, value2, "bkc041");
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

        public Criteria andBkc052IsNull() {
            addCriterion("BKC052 is null");
            return (Criteria) this;
        }

        public Criteria andBkc052IsNotNull() {
            addCriterion("BKC052 is not null");
            return (Criteria) this;
        }

        public Criteria andBkc052EqualTo(BigDecimal value) {
            addCriterion("BKC052 =", value, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052NotEqualTo(BigDecimal value) {
            addCriterion("BKC052 <>", value, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052GreaterThan(BigDecimal value) {
            addCriterion("BKC052 >", value, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC052 >=", value, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052LessThan(BigDecimal value) {
            addCriterion("BKC052 <", value, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC052 <=", value, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052In(List<BigDecimal> values) {
            addCriterion("BKC052 in", values, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052NotIn(List<BigDecimal> values) {
            addCriterion("BKC052 not in", values, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC052 between", value1, value2, "bkc052");
            return (Criteria) this;
        }

        public Criteria andBkc052NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC052 not between", value1, value2, "bkc052");
            return (Criteria) this;
        }

        public Criteria andAkc502IsNull() {
            addCriterion("AKC502 is null");
            return (Criteria) this;
        }

        public Criteria andAkc502IsNotNull() {
            addCriterion("AKC502 is not null");
            return (Criteria) this;
        }

        public Criteria andAkc502EqualTo(BigDecimal value) {
            addCriterion("AKC502 =", value, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502NotEqualTo(BigDecimal value) {
            addCriterion("AKC502 <>", value, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502GreaterThan(BigDecimal value) {
            addCriterion("AKC502 >", value, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AKC502 >=", value, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502LessThan(BigDecimal value) {
            addCriterion("AKC502 <", value, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AKC502 <=", value, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502In(List<BigDecimal> values) {
            addCriterion("AKC502 in", values, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502NotIn(List<BigDecimal> values) {
            addCriterion("AKC502 not in", values, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AKC502 between", value1, value2, "akc502");
            return (Criteria) this;
        }

        public Criteria andAkc502NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AKC502 not between", value1, value2, "akc502");
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