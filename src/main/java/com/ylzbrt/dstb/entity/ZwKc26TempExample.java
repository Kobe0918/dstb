package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZwKc26TempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwKc26TempExample() {
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

        public Criteria andAkb021IsNull() {
            addCriterion("AKB021 is null");
            return (Criteria) this;
        }

        public Criteria andAkb021IsNotNull() {
            addCriterion("AKB021 is not null");
            return (Criteria) this;
        }

        public Criteria andAkb021EqualTo(String value) {
            addCriterion("AKB021 =", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021NotEqualTo(String value) {
            addCriterion("AKB021 <>", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021GreaterThan(String value) {
            addCriterion("AKB021 >", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021GreaterThanOrEqualTo(String value) {
            addCriterion("AKB021 >=", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021LessThan(String value) {
            addCriterion("AKB021 <", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021LessThanOrEqualTo(String value) {
            addCriterion("AKB021 <=", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021Like(String value) {
            addCriterion("AKB021 like", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021NotLike(String value) {
            addCriterion("AKB021 not like", value, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021In(List<String> values) {
            addCriterion("AKB021 in", values, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021NotIn(List<String> values) {
            addCriterion("AKB021 not in", values, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021Between(String value1, String value2) {
            addCriterion("AKB021 between", value1, value2, "akb021");
            return (Criteria) this;
        }

        public Criteria andAkb021NotBetween(String value1, String value2) {
            addCriterion("AKB021 not between", value1, value2, "akb021");
            return (Criteria) this;
        }

        public Criteria andAae072IsNull() {
            addCriterion("AAE072 is null");
            return (Criteria) this;
        }

        public Criteria andAae072IsNotNull() {
            addCriterion("AAE072 is not null");
            return (Criteria) this;
        }

        public Criteria andAae072EqualTo(String value) {
            addCriterion("AAE072 =", value, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072NotEqualTo(String value) {
            addCriterion("AAE072 <>", value, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072GreaterThan(String value) {
            addCriterion("AAE072 >", value, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072GreaterThanOrEqualTo(String value) {
            addCriterion("AAE072 >=", value, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072LessThan(String value) {
            addCriterion("AAE072 <", value, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072LessThanOrEqualTo(String value) {
            addCriterion("AAE072 <=", value, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072Like(String value) {
            addCriterion("AAE072 like", value, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072NotLike(String value) {
            addCriterion("AAE072 not like", value, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072In(List<String> values) {
            addCriterion("AAE072 in", values, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072NotIn(List<String> values) {
            addCriterion("AAE072 not in", values, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072Between(String value1, String value2) {
            addCriterion("AAE072 between", value1, value2, "aae072");
            return (Criteria) this;
        }

        public Criteria andAae072NotBetween(String value1, String value2) {
            addCriterion("AAE072 not between", value1, value2, "aae072");
            return (Criteria) this;
        }

        public Criteria andAkc190IsNull() {
            addCriterion("AKC190 is null");
            return (Criteria) this;
        }

        public Criteria andAkc190IsNotNull() {
            addCriterion("AKC190 is not null");
            return (Criteria) this;
        }

        public Criteria andAkc190EqualTo(String value) {
            addCriterion("AKC190 =", value, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190NotEqualTo(String value) {
            addCriterion("AKC190 <>", value, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190GreaterThan(String value) {
            addCriterion("AKC190 >", value, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190GreaterThanOrEqualTo(String value) {
            addCriterion("AKC190 >=", value, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190LessThan(String value) {
            addCriterion("AKC190 <", value, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190LessThanOrEqualTo(String value) {
            addCriterion("AKC190 <=", value, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190Like(String value) {
            addCriterion("AKC190 like", value, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190NotLike(String value) {
            addCriterion("AKC190 not like", value, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190In(List<String> values) {
            addCriterion("AKC190 in", values, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190NotIn(List<String> values) {
            addCriterion("AKC190 not in", values, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190Between(String value1, String value2) {
            addCriterion("AKC190 between", value1, value2, "akc190");
            return (Criteria) this;
        }

        public Criteria andAkc190NotBetween(String value1, String value2) {
            addCriterion("AKC190 not between", value1, value2, "akc190");
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

        public Criteria andBkc008IsNull() {
            addCriterion("BKC008 is null");
            return (Criteria) this;
        }

        public Criteria andBkc008IsNotNull() {
            addCriterion("BKC008 is not null");
            return (Criteria) this;
        }

        public Criteria andBkc008EqualTo(BigDecimal value) {
            addCriterion("BKC008 =", value, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008NotEqualTo(BigDecimal value) {
            addCriterion("BKC008 <>", value, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008GreaterThan(BigDecimal value) {
            addCriterion("BKC008 >", value, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC008 >=", value, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008LessThan(BigDecimal value) {
            addCriterion("BKC008 <", value, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC008 <=", value, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008In(List<BigDecimal> values) {
            addCriterion("BKC008 in", values, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008NotIn(List<BigDecimal> values) {
            addCriterion("BKC008 not in", values, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC008 between", value1, value2, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc008NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC008 not between", value1, value2, "bkc008");
            return (Criteria) this;
        }

        public Criteria andBkc040IsNull() {
            addCriterion("BKC040 is null");
            return (Criteria) this;
        }

        public Criteria andBkc040IsNotNull() {
            addCriterion("BKC040 is not null");
            return (Criteria) this;
        }

        public Criteria andBkc040EqualTo(BigDecimal value) {
            addCriterion("BKC040 =", value, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040NotEqualTo(BigDecimal value) {
            addCriterion("BKC040 <>", value, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040GreaterThan(BigDecimal value) {
            addCriterion("BKC040 >", value, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC040 >=", value, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040LessThan(BigDecimal value) {
            addCriterion("BKC040 <", value, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BKC040 <=", value, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040In(List<BigDecimal> values) {
            addCriterion("BKC040 in", values, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040NotIn(List<BigDecimal> values) {
            addCriterion("BKC040 not in", values, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC040 between", value1, value2, "bkc040");
            return (Criteria) this;
        }

        public Criteria andBkc040NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BKC040 not between", value1, value2, "bkc040");
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

        public Criteria andBkc045EqualTo(Short value) {
            addCriterion("BKC045 =", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045NotEqualTo(Short value) {
            addCriterion("BKC045 <>", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045GreaterThan(Short value) {
            addCriterion("BKC045 >", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045GreaterThanOrEqualTo(Short value) {
            addCriterion("BKC045 >=", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045LessThan(Short value) {
            addCriterion("BKC045 <", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045LessThanOrEqualTo(Short value) {
            addCriterion("BKC045 <=", value, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045In(List<Short> values) {
            addCriterion("BKC045 in", values, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045NotIn(List<Short> values) {
            addCriterion("BKC045 not in", values, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045Between(Short value1, Short value2) {
            addCriterion("BKC045 between", value1, value2, "bkc045");
            return (Criteria) this;
        }

        public Criteria andBkc045NotBetween(Short value1, Short value2) {
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

        public Criteria andBkf010IsNull() {
            addCriterion("BKF010 is null");
            return (Criteria) this;
        }

        public Criteria andBkf010IsNotNull() {
            addCriterion("BKF010 is not null");
            return (Criteria) this;
        }

        public Criteria andBkf010EqualTo(String value) {
            addCriterion("BKF010 =", value, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010NotEqualTo(String value) {
            addCriterion("BKF010 <>", value, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010GreaterThan(String value) {
            addCriterion("BKF010 >", value, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010GreaterThanOrEqualTo(String value) {
            addCriterion("BKF010 >=", value, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010LessThan(String value) {
            addCriterion("BKF010 <", value, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010LessThanOrEqualTo(String value) {
            addCriterion("BKF010 <=", value, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010Like(String value) {
            addCriterion("BKF010 like", value, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010NotLike(String value) {
            addCriterion("BKF010 not like", value, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010In(List<String> values) {
            addCriterion("BKF010 in", values, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010NotIn(List<String> values) {
            addCriterion("BKF010 not in", values, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010Between(String value1, String value2) {
            addCriterion("BKF010 between", value1, value2, "bkf010");
            return (Criteria) this;
        }

        public Criteria andBkf010NotBetween(String value1, String value2) {
            addCriterion("BKF010 not between", value1, value2, "bkf010");
            return (Criteria) this;
        }

        public Criteria andAka035IsNull() {
            addCriterion("AKA035 is null");
            return (Criteria) this;
        }

        public Criteria andAka035IsNotNull() {
            addCriterion("AKA035 is not null");
            return (Criteria) this;
        }

        public Criteria andAka035EqualTo(String value) {
            addCriterion("AKA035 =", value, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035NotEqualTo(String value) {
            addCriterion("AKA035 <>", value, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035GreaterThan(String value) {
            addCriterion("AKA035 >", value, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035GreaterThanOrEqualTo(String value) {
            addCriterion("AKA035 >=", value, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035LessThan(String value) {
            addCriterion("AKA035 <", value, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035LessThanOrEqualTo(String value) {
            addCriterion("AKA035 <=", value, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035Like(String value) {
            addCriterion("AKA035 like", value, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035NotLike(String value) {
            addCriterion("AKA035 not like", value, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035In(List<String> values) {
            addCriterion("AKA035 in", values, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035NotIn(List<String> values) {
            addCriterion("AKA035 not in", values, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035Between(String value1, String value2) {
            addCriterion("AKA035 between", value1, value2, "aka035");
            return (Criteria) this;
        }

        public Criteria andAka035NotBetween(String value1, String value2) {
            addCriterion("AKA035 not between", value1, value2, "aka035");
            return (Criteria) this;
        }

        public Criteria andPmdylxIsNull() {
            addCriterion("PMDYLX is null");
            return (Criteria) this;
        }

        public Criteria andPmdylxIsNotNull() {
            addCriterion("PMDYLX is not null");
            return (Criteria) this;
        }

        public Criteria andPmdylxEqualTo(String value) {
            addCriterion("PMDYLX =", value, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxNotEqualTo(String value) {
            addCriterion("PMDYLX <>", value, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxGreaterThan(String value) {
            addCriterion("PMDYLX >", value, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxGreaterThanOrEqualTo(String value) {
            addCriterion("PMDYLX >=", value, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxLessThan(String value) {
            addCriterion("PMDYLX <", value, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxLessThanOrEqualTo(String value) {
            addCriterion("PMDYLX <=", value, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxLike(String value) {
            addCriterion("PMDYLX like", value, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxNotLike(String value) {
            addCriterion("PMDYLX not like", value, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxIn(List<String> values) {
            addCriterion("PMDYLX in", values, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxNotIn(List<String> values) {
            addCriterion("PMDYLX not in", values, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxBetween(String value1, String value2) {
            addCriterion("PMDYLX between", value1, value2, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andPmdylxNotBetween(String value1, String value2) {
            addCriterion("PMDYLX not between", value1, value2, "pmdylx");
            return (Criteria) this;
        }

        public Criteria andXflx00IsNull() {
            addCriterion("XFLX00 is null");
            return (Criteria) this;
        }

        public Criteria andXflx00IsNotNull() {
            addCriterion("XFLX00 is not null");
            return (Criteria) this;
        }

        public Criteria andXflx00EqualTo(String value) {
            addCriterion("XFLX00 =", value, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00NotEqualTo(String value) {
            addCriterion("XFLX00 <>", value, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00GreaterThan(String value) {
            addCriterion("XFLX00 >", value, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00GreaterThanOrEqualTo(String value) {
            addCriterion("XFLX00 >=", value, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00LessThan(String value) {
            addCriterion("XFLX00 <", value, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00LessThanOrEqualTo(String value) {
            addCriterion("XFLX00 <=", value, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00Like(String value) {
            addCriterion("XFLX00 like", value, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00NotLike(String value) {
            addCriterion("XFLX00 not like", value, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00In(List<String> values) {
            addCriterion("XFLX00 in", values, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00NotIn(List<String> values) {
            addCriterion("XFLX00 not in", values, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00Between(String value1, String value2) {
            addCriterion("XFLX00 between", value1, value2, "xflx00");
            return (Criteria) this;
        }

        public Criteria andXflx00NotBetween(String value1, String value2) {
            addCriterion("XFLX00 not between", value1, value2, "xflx00");
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