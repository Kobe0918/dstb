package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZwAc43TempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwAc43TempExample() {
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

        public Criteria andAae023IsNull() {
            addCriterion("AAE023 is null");
            return (Criteria) this;
        }

        public Criteria andAae023IsNotNull() {
            addCriterion("AAE023 is not null");
            return (Criteria) this;
        }

        public Criteria andAae023EqualTo(Short value) {
            addCriterion("AAE023 =", value, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023NotEqualTo(Short value) {
            addCriterion("AAE023 <>", value, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023GreaterThan(Short value) {
            addCriterion("AAE023 >", value, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023GreaterThanOrEqualTo(Short value) {
            addCriterion("AAE023 >=", value, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023LessThan(Short value) {
            addCriterion("AAE023 <", value, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023LessThanOrEqualTo(Short value) {
            addCriterion("AAE023 <=", value, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023In(List<Short> values) {
            addCriterion("AAE023 in", values, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023NotIn(List<Short> values) {
            addCriterion("AAE023 not in", values, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023Between(Short value1, Short value2) {
            addCriterion("AAE023 between", value1, value2, "aae023");
            return (Criteria) this;
        }

        public Criteria andAae023NotBetween(Short value1, Short value2) {
            addCriterion("AAE023 not between", value1, value2, "aae023");
            return (Criteria) this;
        }

        public Criteria andAaa119IsNull() {
            addCriterion("AAA119 is null");
            return (Criteria) this;
        }

        public Criteria andAaa119IsNotNull() {
            addCriterion("AAA119 is not null");
            return (Criteria) this;
        }

        public Criteria andAaa119EqualTo(String value) {
            addCriterion("AAA119 =", value, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119NotEqualTo(String value) {
            addCriterion("AAA119 <>", value, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119GreaterThan(String value) {
            addCriterion("AAA119 >", value, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119GreaterThanOrEqualTo(String value) {
            addCriterion("AAA119 >=", value, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119LessThan(String value) {
            addCriterion("AAA119 <", value, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119LessThanOrEqualTo(String value) {
            addCriterion("AAA119 <=", value, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119Like(String value) {
            addCriterion("AAA119 like", value, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119NotLike(String value) {
            addCriterion("AAA119 not like", value, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119In(List<String> values) {
            addCriterion("AAA119 in", values, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119NotIn(List<String> values) {
            addCriterion("AAA119 not in", values, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119Between(String value1, String value2) {
            addCriterion("AAA119 between", value1, value2, "aaa119");
            return (Criteria) this;
        }

        public Criteria andAaa119NotBetween(String value1, String value2) {
            addCriterion("AAA119 not between", value1, value2, "aaa119");
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

        public Criteria andZmny00IsNull() {
            addCriterion("ZMNY00 is null");
            return (Criteria) this;
        }

        public Criteria andZmny00IsNotNull() {
            addCriterion("ZMNY00 is not null");
            return (Criteria) this;
        }

        public Criteria andZmny00EqualTo(Integer value) {
            addCriterion("ZMNY00 =", value, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00NotEqualTo(Integer value) {
            addCriterion("ZMNY00 <>", value, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00GreaterThan(Integer value) {
            addCriterion("ZMNY00 >", value, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00GreaterThanOrEqualTo(Integer value) {
            addCriterion("ZMNY00 >=", value, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00LessThan(Integer value) {
            addCriterion("ZMNY00 <", value, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00LessThanOrEqualTo(Integer value) {
            addCriterion("ZMNY00 <=", value, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00In(List<Integer> values) {
            addCriterion("ZMNY00 in", values, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00NotIn(List<Integer> values) {
            addCriterion("ZMNY00 not in", values, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00Between(Integer value1, Integer value2) {
            addCriterion("ZMNY00 between", value1, value2, "zmny00");
            return (Criteria) this;
        }

        public Criteria andZmny00NotBetween(Integer value1, Integer value2) {
            addCriterion("ZMNY00 not between", value1, value2, "zmny00");
            return (Criteria) this;
        }

        public Criteria andGrjfjeIsNull() {
            addCriterion("GRJFJE is null");
            return (Criteria) this;
        }

        public Criteria andGrjfjeIsNotNull() {
            addCriterion("GRJFJE is not null");
            return (Criteria) this;
        }

        public Criteria andGrjfjeEqualTo(BigDecimal value) {
            addCriterion("GRJFJE =", value, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeNotEqualTo(BigDecimal value) {
            addCriterion("GRJFJE <>", value, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeGreaterThan(BigDecimal value) {
            addCriterion("GRJFJE >", value, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRJFJE >=", value, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeLessThan(BigDecimal value) {
            addCriterion("GRJFJE <", value, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRJFJE <=", value, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeIn(List<BigDecimal> values) {
            addCriterion("GRJFJE in", values, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeNotIn(List<BigDecimal> values) {
            addCriterion("GRJFJE not in", values, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRJFJE between", value1, value2, "grjfje");
            return (Criteria) this;
        }

        public Criteria andGrjfjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRJFJE not between", value1, value2, "grjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeIsNull() {
            addCriterion("DWJFJE is null");
            return (Criteria) this;
        }

        public Criteria andDwjfjeIsNotNull() {
            addCriterion("DWJFJE is not null");
            return (Criteria) this;
        }

        public Criteria andDwjfjeEqualTo(BigDecimal value) {
            addCriterion("DWJFJE =", value, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeNotEqualTo(BigDecimal value) {
            addCriterion("DWJFJE <>", value, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeGreaterThan(BigDecimal value) {
            addCriterion("DWJFJE >", value, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DWJFJE >=", value, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeLessThan(BigDecimal value) {
            addCriterion("DWJFJE <", value, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DWJFJE <=", value, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeIn(List<BigDecimal> values) {
            addCriterion("DWJFJE in", values, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeNotIn(List<BigDecimal> values) {
            addCriterion("DWJFJE not in", values, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DWJFJE between", value1, value2, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andDwjfjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DWJFJE not between", value1, value2, "dwjfje");
            return (Criteria) this;
        }

        public Criteria andHbrq00IsNull() {
            addCriterion("HBRQ00 is null");
            return (Criteria) this;
        }

        public Criteria andHbrq00IsNotNull() {
            addCriterion("HBRQ00 is not null");
            return (Criteria) this;
        }

        public Criteria andHbrq00EqualTo(Integer value) {
            addCriterion("HBRQ00 =", value, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00NotEqualTo(Integer value) {
            addCriterion("HBRQ00 <>", value, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00GreaterThan(Integer value) {
            addCriterion("HBRQ00 >", value, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBRQ00 >=", value, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00LessThan(Integer value) {
            addCriterion("HBRQ00 <", value, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00LessThanOrEqualTo(Integer value) {
            addCriterion("HBRQ00 <=", value, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00In(List<Integer> values) {
            addCriterion("HBRQ00 in", values, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00NotIn(List<Integer> values) {
            addCriterion("HBRQ00 not in", values, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00Between(Integer value1, Integer value2) {
            addCriterion("HBRQ00 between", value1, value2, "hbrq00");
            return (Criteria) this;
        }

        public Criteria andHbrq00NotBetween(Integer value1, Integer value2) {
            addCriterion("HBRQ00 not between", value1, value2, "hbrq00");
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