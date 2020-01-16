package com.ylzbrt.dstb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZwAc01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZwAc01Example() {
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

        public Criteria andAac058IsNull() {
            addCriterion("AAC058 is null");
            return (Criteria) this;
        }

        public Criteria andAac058IsNotNull() {
            addCriterion("AAC058 is not null");
            return (Criteria) this;
        }

        public Criteria andAac058EqualTo(String value) {
            addCriterion("AAC058 =", value, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058NotEqualTo(String value) {
            addCriterion("AAC058 <>", value, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058GreaterThan(String value) {
            addCriterion("AAC058 >", value, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058GreaterThanOrEqualTo(String value) {
            addCriterion("AAC058 >=", value, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058LessThan(String value) {
            addCriterion("AAC058 <", value, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058LessThanOrEqualTo(String value) {
            addCriterion("AAC058 <=", value, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058Like(String value) {
            addCriterion("AAC058 like", value, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058NotLike(String value) {
            addCriterion("AAC058 not like", value, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058In(List<String> values) {
            addCriterion("AAC058 in", values, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058NotIn(List<String> values) {
            addCriterion("AAC058 not in", values, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058Between(String value1, String value2) {
            addCriterion("AAC058 between", value1, value2, "aac058");
            return (Criteria) this;
        }

        public Criteria andAac058NotBetween(String value1, String value2) {
            addCriterion("AAC058 not between", value1, value2, "aac058");
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

        public Criteria andAac004IsNull() {
            addCriterion("AAC004 is null");
            return (Criteria) this;
        }

        public Criteria andAac004IsNotNull() {
            addCriterion("AAC004 is not null");
            return (Criteria) this;
        }

        public Criteria andAac004EqualTo(String value) {
            addCriterion("AAC004 =", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004NotEqualTo(String value) {
            addCriterion("AAC004 <>", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004GreaterThan(String value) {
            addCriterion("AAC004 >", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004GreaterThanOrEqualTo(String value) {
            addCriterion("AAC004 >=", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004LessThan(String value) {
            addCriterion("AAC004 <", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004LessThanOrEqualTo(String value) {
            addCriterion("AAC004 <=", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004Like(String value) {
            addCriterion("AAC004 like", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004NotLike(String value) {
            addCriterion("AAC004 not like", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004In(List<String> values) {
            addCriterion("AAC004 in", values, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004NotIn(List<String> values) {
            addCriterion("AAC004 not in", values, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004Between(String value1, String value2) {
            addCriterion("AAC004 between", value1, value2, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004NotBetween(String value1, String value2) {
            addCriterion("AAC004 not between", value1, value2, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac005IsNull() {
            addCriterion("AAC005 is null");
            return (Criteria) this;
        }

        public Criteria andAac005IsNotNull() {
            addCriterion("AAC005 is not null");
            return (Criteria) this;
        }

        public Criteria andAac005EqualTo(String value) {
            addCriterion("AAC005 =", value, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005NotEqualTo(String value) {
            addCriterion("AAC005 <>", value, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005GreaterThan(String value) {
            addCriterion("AAC005 >", value, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005GreaterThanOrEqualTo(String value) {
            addCriterion("AAC005 >=", value, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005LessThan(String value) {
            addCriterion("AAC005 <", value, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005LessThanOrEqualTo(String value) {
            addCriterion("AAC005 <=", value, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005Like(String value) {
            addCriterion("AAC005 like", value, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005NotLike(String value) {
            addCriterion("AAC005 not like", value, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005In(List<String> values) {
            addCriterion("AAC005 in", values, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005NotIn(List<String> values) {
            addCriterion("AAC005 not in", values, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005Between(String value1, String value2) {
            addCriterion("AAC005 between", value1, value2, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac005NotBetween(String value1, String value2) {
            addCriterion("AAC005 not between", value1, value2, "aac005");
            return (Criteria) this;
        }

        public Criteria andAac006IsNull() {
            addCriterion("AAC006 is null");
            return (Criteria) this;
        }

        public Criteria andAac006IsNotNull() {
            addCriterion("AAC006 is not null");
            return (Criteria) this;
        }

        public Criteria andAac006EqualTo(Integer value) {
            addCriterion("AAC006 =", value, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006NotEqualTo(Integer value) {
            addCriterion("AAC006 <>", value, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006GreaterThan(Integer value) {
            addCriterion("AAC006 >", value, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006GreaterThanOrEqualTo(Integer value) {
            addCriterion("AAC006 >=", value, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006LessThan(Integer value) {
            addCriterion("AAC006 <", value, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006LessThanOrEqualTo(Integer value) {
            addCriterion("AAC006 <=", value, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006In(List<Integer> values) {
            addCriterion("AAC006 in", values, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006NotIn(List<Integer> values) {
            addCriterion("AAC006 not in", values, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006Between(Integer value1, Integer value2) {
            addCriterion("AAC006 between", value1, value2, "aac006");
            return (Criteria) this;
        }

        public Criteria andAac006NotBetween(Integer value1, Integer value2) {
            addCriterion("AAC006 not between", value1, value2, "aac006");
            return (Criteria) this;
        }

        public Criteria andAae005IsNull() {
            addCriterion("AAE005 is null");
            return (Criteria) this;
        }

        public Criteria andAae005IsNotNull() {
            addCriterion("AAE005 is not null");
            return (Criteria) this;
        }

        public Criteria andAae005EqualTo(String value) {
            addCriterion("AAE005 =", value, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005NotEqualTo(String value) {
            addCriterion("AAE005 <>", value, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005GreaterThan(String value) {
            addCriterion("AAE005 >", value, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005GreaterThanOrEqualTo(String value) {
            addCriterion("AAE005 >=", value, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005LessThan(String value) {
            addCriterion("AAE005 <", value, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005LessThanOrEqualTo(String value) {
            addCriterion("AAE005 <=", value, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005Like(String value) {
            addCriterion("AAE005 like", value, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005NotLike(String value) {
            addCriterion("AAE005 not like", value, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005In(List<String> values) {
            addCriterion("AAE005 in", values, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005NotIn(List<String> values) {
            addCriterion("AAE005 not in", values, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005Between(String value1, String value2) {
            addCriterion("AAE005 between", value1, value2, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae005NotBetween(String value1, String value2) {
            addCriterion("AAE005 not between", value1, value2, "aae005");
            return (Criteria) this;
        }

        public Criteria andAae006IsNull() {
            addCriterion("AAE006 is null");
            return (Criteria) this;
        }

        public Criteria andAae006IsNotNull() {
            addCriterion("AAE006 is not null");
            return (Criteria) this;
        }

        public Criteria andAae006EqualTo(String value) {
            addCriterion("AAE006 =", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006NotEqualTo(String value) {
            addCriterion("AAE006 <>", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006GreaterThan(String value) {
            addCriterion("AAE006 >", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006GreaterThanOrEqualTo(String value) {
            addCriterion("AAE006 >=", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006LessThan(String value) {
            addCriterion("AAE006 <", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006LessThanOrEqualTo(String value) {
            addCriterion("AAE006 <=", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006Like(String value) {
            addCriterion("AAE006 like", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006NotLike(String value) {
            addCriterion("AAE006 not like", value, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006In(List<String> values) {
            addCriterion("AAE006 in", values, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006NotIn(List<String> values) {
            addCriterion("AAE006 not in", values, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006Between(String value1, String value2) {
            addCriterion("AAE006 between", value1, value2, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae006NotBetween(String value1, String value2) {
            addCriterion("AAE006 not between", value1, value2, "aae006");
            return (Criteria) this;
        }

        public Criteria andAae007IsNull() {
            addCriterion("AAE007 is null");
            return (Criteria) this;
        }

        public Criteria andAae007IsNotNull() {
            addCriterion("AAE007 is not null");
            return (Criteria) this;
        }

        public Criteria andAae007EqualTo(String value) {
            addCriterion("AAE007 =", value, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007NotEqualTo(String value) {
            addCriterion("AAE007 <>", value, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007GreaterThan(String value) {
            addCriterion("AAE007 >", value, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007GreaterThanOrEqualTo(String value) {
            addCriterion("AAE007 >=", value, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007LessThan(String value) {
            addCriterion("AAE007 <", value, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007LessThanOrEqualTo(String value) {
            addCriterion("AAE007 <=", value, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007Like(String value) {
            addCriterion("AAE007 like", value, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007NotLike(String value) {
            addCriterion("AAE007 not like", value, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007In(List<String> values) {
            addCriterion("AAE007 in", values, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007NotIn(List<String> values) {
            addCriterion("AAE007 not in", values, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007Between(String value1, String value2) {
            addCriterion("AAE007 between", value1, value2, "aae007");
            return (Criteria) this;
        }

        public Criteria andAae007NotBetween(String value1, String value2) {
            addCriterion("AAE007 not between", value1, value2, "aae007");
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

        public Criteria andYae512IsNull() {
            addCriterion("YAE512 is null");
            return (Criteria) this;
        }

        public Criteria andYae512IsNotNull() {
            addCriterion("YAE512 is not null");
            return (Criteria) this;
        }

        public Criteria andYae512EqualTo(String value) {
            addCriterion("YAE512 =", value, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512NotEqualTo(String value) {
            addCriterion("YAE512 <>", value, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512GreaterThan(String value) {
            addCriterion("YAE512 >", value, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512GreaterThanOrEqualTo(String value) {
            addCriterion("YAE512 >=", value, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512LessThan(String value) {
            addCriterion("YAE512 <", value, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512LessThanOrEqualTo(String value) {
            addCriterion("YAE512 <=", value, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512Like(String value) {
            addCriterion("YAE512 like", value, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512NotLike(String value) {
            addCriterion("YAE512 not like", value, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512In(List<String> values) {
            addCriterion("YAE512 in", values, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512NotIn(List<String> values) {
            addCriterion("YAE512 not in", values, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512Between(String value1, String value2) {
            addCriterion("YAE512 between", value1, value2, "yae512");
            return (Criteria) this;
        }

        public Criteria andYae512NotBetween(String value1, String value2) {
            addCriterion("YAE512 not between", value1, value2, "yae512");
            return (Criteria) this;
        }

        public Criteria andAcb501IsNull() {
            addCriterion("ACB501 is null");
            return (Criteria) this;
        }

        public Criteria andAcb501IsNotNull() {
            addCriterion("ACB501 is not null");
            return (Criteria) this;
        }

        public Criteria andAcb501EqualTo(String value) {
            addCriterion("ACB501 =", value, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501NotEqualTo(String value) {
            addCriterion("ACB501 <>", value, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501GreaterThan(String value) {
            addCriterion("ACB501 >", value, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501GreaterThanOrEqualTo(String value) {
            addCriterion("ACB501 >=", value, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501LessThan(String value) {
            addCriterion("ACB501 <", value, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501LessThanOrEqualTo(String value) {
            addCriterion("ACB501 <=", value, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501Like(String value) {
            addCriterion("ACB501 like", value, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501NotLike(String value) {
            addCriterion("ACB501 not like", value, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501In(List<String> values) {
            addCriterion("ACB501 in", values, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501NotIn(List<String> values) {
            addCriterion("ACB501 not in", values, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501Between(String value1, String value2) {
            addCriterion("ACB501 between", value1, value2, "acb501");
            return (Criteria) this;
        }

        public Criteria andAcb501NotBetween(String value1, String value2) {
            addCriterion("ACB501 not between", value1, value2, "acb501");
            return (Criteria) this;
        }

        public Criteria andAae013IsNull() {
            addCriterion("AAE013 is null");
            return (Criteria) this;
        }

        public Criteria andAae013IsNotNull() {
            addCriterion("AAE013 is not null");
            return (Criteria) this;
        }

        public Criteria andAae013EqualTo(String value) {
            addCriterion("AAE013 =", value, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013NotEqualTo(String value) {
            addCriterion("AAE013 <>", value, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013GreaterThan(String value) {
            addCriterion("AAE013 >", value, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013GreaterThanOrEqualTo(String value) {
            addCriterion("AAE013 >=", value, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013LessThan(String value) {
            addCriterion("AAE013 <", value, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013LessThanOrEqualTo(String value) {
            addCriterion("AAE013 <=", value, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013Like(String value) {
            addCriterion("AAE013 like", value, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013NotLike(String value) {
            addCriterion("AAE013 not like", value, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013In(List<String> values) {
            addCriterion("AAE013 in", values, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013NotIn(List<String> values) {
            addCriterion("AAE013 not in", values, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013Between(String value1, String value2) {
            addCriterion("AAE013 between", value1, value2, "aae013");
            return (Criteria) this;
        }

        public Criteria andAae013NotBetween(String value1, String value2) {
            addCriterion("AAE013 not between", value1, value2, "aae013");
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