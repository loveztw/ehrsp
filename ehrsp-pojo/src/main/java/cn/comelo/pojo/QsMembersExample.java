package cn.comelo.pojo;

import java.util.ArrayList;
import java.util.List;

public class QsMembersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QsMembersExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNull() {
            addCriterion("utype is null");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNotNull() {
            addCriterion("utype is not null");
            return (Criteria) this;
        }

        public Criteria andUtypeEqualTo(Boolean value) {
            addCriterion("utype =", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotEqualTo(Boolean value) {
            addCriterion("utype <>", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThan(Boolean value) {
            addCriterion("utype >", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("utype >=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThan(Boolean value) {
            addCriterion("utype <", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThanOrEqualTo(Boolean value) {
            addCriterion("utype <=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeIn(List<Boolean> values) {
            addCriterion("utype in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotIn(List<Boolean> values) {
            addCriterion("utype not in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeBetween(Boolean value1, Boolean value2) {
            addCriterion("utype between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("utype not between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailAuditIsNull() {
            addCriterion("email_audit is null");
            return (Criteria) this;
        }

        public Criteria andEmailAuditIsNotNull() {
            addCriterion("email_audit is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAuditEqualTo(Boolean value) {
            addCriterion("email_audit =", value, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditNotEqualTo(Boolean value) {
            addCriterion("email_audit <>", value, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditGreaterThan(Boolean value) {
            addCriterion("email_audit >", value, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_audit >=", value, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditLessThan(Boolean value) {
            addCriterion("email_audit <", value, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("email_audit <=", value, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditIn(List<Boolean> values) {
            addCriterion("email_audit in", values, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditNotIn(List<Boolean> values) {
            addCriterion("email_audit not in", values, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("email_audit between", value1, value2, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andEmailAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_audit not between", value1, value2, "emailAudit");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileAuditIsNull() {
            addCriterion("mobile_audit is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuditIsNotNull() {
            addCriterion("mobile_audit is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuditEqualTo(Boolean value) {
            addCriterion("mobile_audit =", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditNotEqualTo(Boolean value) {
            addCriterion("mobile_audit <>", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditGreaterThan(Boolean value) {
            addCriterion("mobile_audit >", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mobile_audit >=", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditLessThan(Boolean value) {
            addCriterion("mobile_audit <", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("mobile_audit <=", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditIn(List<Boolean> values) {
            addCriterion("mobile_audit in", values, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditNotIn(List<Boolean> values) {
            addCriterion("mobile_audit not in", values, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("mobile_audit between", value1, value2, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mobile_audit not between", value1, value2, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPwdHashIsNull() {
            addCriterion("pwd_hash is null");
            return (Criteria) this;
        }

        public Criteria andPwdHashIsNotNull() {
            addCriterion("pwd_hash is not null");
            return (Criteria) this;
        }

        public Criteria andPwdHashEqualTo(String value) {
            addCriterion("pwd_hash =", value, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashNotEqualTo(String value) {
            addCriterion("pwd_hash <>", value, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashGreaterThan(String value) {
            addCriterion("pwd_hash >", value, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_hash >=", value, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashLessThan(String value) {
            addCriterion("pwd_hash <", value, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashLessThanOrEqualTo(String value) {
            addCriterion("pwd_hash <=", value, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashLike(String value) {
            addCriterion("pwd_hash like", value, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashNotLike(String value) {
            addCriterion("pwd_hash not like", value, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashIn(List<String> values) {
            addCriterion("pwd_hash in", values, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashNotIn(List<String> values) {
            addCriterion("pwd_hash not in", values, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashBetween(String value1, String value2) {
            addCriterion("pwd_hash between", value1, value2, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andPwdHashNotBetween(String value1, String value2) {
            addCriterion("pwd_hash not between", value1, value2, "pwdHash");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Integer value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Integer value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Integer value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Integer value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Integer value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Integer> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Integer> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Integer value1, Integer value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("reg_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("reg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(String value) {
            addCriterion("reg_ip =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(String value) {
            addCriterion("reg_ip <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(String value) {
            addCriterion("reg_ip >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(String value) {
            addCriterion("reg_ip >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(String value) {
            addCriterion("reg_ip <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(String value) {
            addCriterion("reg_ip <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLike(String value) {
            addCriterion("reg_ip like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotLike(String value) {
            addCriterion("reg_ip not like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<String> values) {
            addCriterion("reg_ip in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<String> values) {
            addCriterion("reg_ip not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(String value1, String value2) {
            addCriterion("reg_ip between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(String value1, String value2) {
            addCriterion("reg_ip not between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegAddressIsNull() {
            addCriterion("reg_address is null");
            return (Criteria) this;
        }

        public Criteria andRegAddressIsNotNull() {
            addCriterion("reg_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegAddressEqualTo(String value) {
            addCriterion("reg_address =", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotEqualTo(String value) {
            addCriterion("reg_address <>", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressGreaterThan(String value) {
            addCriterion("reg_address >", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reg_address >=", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLessThan(String value) {
            addCriterion("reg_address <", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLessThanOrEqualTo(String value) {
            addCriterion("reg_address <=", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLike(String value) {
            addCriterion("reg_address like", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotLike(String value) {
            addCriterion("reg_address not like", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressIn(List<String> values) {
            addCriterion("reg_address in", values, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotIn(List<String> values) {
            addCriterion("reg_address not in", values, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressBetween(String value1, String value2) {
            addCriterion("reg_address between", value1, value2, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotBetween(String value1, String value2) {
            addCriterion("reg_address not between", value1, value2, "regAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Integer value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Integer value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Integer value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Integer value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Integer> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Integer> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAvatarsIsNull() {
            addCriterion("avatars is null");
            return (Criteria) this;
        }

        public Criteria andAvatarsIsNotNull() {
            addCriterion("avatars is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarsEqualTo(String value) {
            addCriterion("avatars =", value, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsNotEqualTo(String value) {
            addCriterion("avatars <>", value, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsGreaterThan(String value) {
            addCriterion("avatars >", value, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsGreaterThanOrEqualTo(String value) {
            addCriterion("avatars >=", value, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsLessThan(String value) {
            addCriterion("avatars <", value, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsLessThanOrEqualTo(String value) {
            addCriterion("avatars <=", value, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsLike(String value) {
            addCriterion("avatars like", value, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsNotLike(String value) {
            addCriterion("avatars not like", value, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsIn(List<String> values) {
            addCriterion("avatars in", values, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsNotIn(List<String> values) {
            addCriterion("avatars not in", values, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsBetween(String value1, String value2) {
            addCriterion("avatars between", value1, value2, "avatars");
            return (Criteria) this;
        }

        public Criteria andAvatarsNotBetween(String value1, String value2) {
            addCriterion("avatars not between", value1, value2, "avatars");
            return (Criteria) this;
        }

        public Criteria andRobotIsNull() {
            addCriterion("robot is null");
            return (Criteria) this;
        }

        public Criteria andRobotIsNotNull() {
            addCriterion("robot is not null");
            return (Criteria) this;
        }

        public Criteria andRobotEqualTo(Byte value) {
            addCriterion("robot =", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotEqualTo(Byte value) {
            addCriterion("robot <>", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotGreaterThan(Byte value) {
            addCriterion("robot >", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotGreaterThanOrEqualTo(Byte value) {
            addCriterion("robot >=", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotLessThan(Byte value) {
            addCriterion("robot <", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotLessThanOrEqualTo(Byte value) {
            addCriterion("robot <=", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotIn(List<Byte> values) {
            addCriterion("robot in", values, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotIn(List<Byte> values) {
            addCriterion("robot not in", values, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotBetween(Byte value1, Byte value2) {
            addCriterion("robot between", value1, value2, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotBetween(Byte value1, Byte value2) {
            addCriterion("robot not between", value1, value2, "robot");
            return (Criteria) this;
        }

        public Criteria andConsultantIsNull() {
            addCriterion("consultant is null");
            return (Criteria) this;
        }

        public Criteria andConsultantIsNotNull() {
            addCriterion("consultant is not null");
            return (Criteria) this;
        }

        public Criteria andConsultantEqualTo(Short value) {
            addCriterion("consultant =", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantNotEqualTo(Short value) {
            addCriterion("consultant <>", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantGreaterThan(Short value) {
            addCriterion("consultant >", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantGreaterThanOrEqualTo(Short value) {
            addCriterion("consultant >=", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantLessThan(Short value) {
            addCriterion("consultant <", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantLessThanOrEqualTo(Short value) {
            addCriterion("consultant <=", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantIn(List<Short> values) {
            addCriterion("consultant in", values, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantNotIn(List<Short> values) {
            addCriterion("consultant not in", values, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantBetween(Short value1, Short value2) {
            addCriterion("consultant between", value1, value2, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantNotBetween(Short value1, Short value2) {
            addCriterion("consultant not between", value1, value2, "consultant");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andSmsNumIsNull() {
            addCriterion("sms_num is null");
            return (Criteria) this;
        }

        public Criteria andSmsNumIsNotNull() {
            addCriterion("sms_num is not null");
            return (Criteria) this;
        }

        public Criteria andSmsNumEqualTo(Integer value) {
            addCriterion("sms_num =", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumNotEqualTo(Integer value) {
            addCriterion("sms_num <>", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumGreaterThan(Integer value) {
            addCriterion("sms_num >", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sms_num >=", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumLessThan(Integer value) {
            addCriterion("sms_num <", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumLessThanOrEqualTo(Integer value) {
            addCriterion("sms_num <=", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumIn(List<Integer> values) {
            addCriterion("sms_num in", values, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumNotIn(List<Integer> values) {
            addCriterion("sms_num not in", values, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumBetween(Integer value1, Integer value2) {
            addCriterion("sms_num between", value1, value2, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sms_num not between", value1, value2, "smsNum");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNull() {
            addCriterion("invitation_code is null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNotNull() {
            addCriterion("invitation_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeEqualTo(String value) {
            addCriterion("invitation_code =", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotEqualTo(String value) {
            addCriterion("invitation_code <>", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThan(String value) {
            addCriterion("invitation_code >", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invitation_code >=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThan(String value) {
            addCriterion("invitation_code <", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThanOrEqualTo(String value) {
            addCriterion("invitation_code <=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLike(String value) {
            addCriterion("invitation_code like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotLike(String value) {
            addCriterion("invitation_code not like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIn(List<String> values) {
            addCriterion("invitation_code in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotIn(List<String> values) {
            addCriterion("invitation_code not in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeBetween(String value1, String value2) {
            addCriterion("invitation_code between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotBetween(String value1, String value2) {
            addCriterion("invitation_code not between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidIsNull() {
            addCriterion("sitegroup_uid is null");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidIsNotNull() {
            addCriterion("sitegroup_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidEqualTo(Integer value) {
            addCriterion("sitegroup_uid =", value, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidNotEqualTo(Integer value) {
            addCriterion("sitegroup_uid <>", value, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidGreaterThan(Integer value) {
            addCriterion("sitegroup_uid >", value, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sitegroup_uid >=", value, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidLessThan(Integer value) {
            addCriterion("sitegroup_uid <", value, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidLessThanOrEqualTo(Integer value) {
            addCriterion("sitegroup_uid <=", value, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidIn(List<Integer> values) {
            addCriterion("sitegroup_uid in", values, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidNotIn(List<Integer> values) {
            addCriterion("sitegroup_uid not in", values, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidBetween(Integer value1, Integer value2) {
            addCriterion("sitegroup_uid between", value1, value2, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andSitegroupUidNotBetween(Integer value1, Integer value2) {
            addCriterion("sitegroup_uid not between", value1, value2, "sitegroupUid");
            return (Criteria) this;
        }

        public Criteria andRegSourceIsNull() {
            addCriterion("reg_source is null");
            return (Criteria) this;
        }

        public Criteria andRegSourceIsNotNull() {
            addCriterion("reg_source is not null");
            return (Criteria) this;
        }

        public Criteria andRegSourceEqualTo(Boolean value) {
            addCriterion("reg_source =", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotEqualTo(Boolean value) {
            addCriterion("reg_source <>", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceGreaterThan(Boolean value) {
            addCriterion("reg_source >", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_source >=", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLessThan(Boolean value) {
            addCriterion("reg_source <", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_source <=", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceIn(List<Boolean> values) {
            addCriterion("reg_source in", values, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotIn(List<Boolean> values) {
            addCriterion("reg_source not in", values, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_source between", value1, value2, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_source not between", value1, value2, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnIsNull() {
            addCriterion("reg_source_cn is null");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnIsNotNull() {
            addCriterion("reg_source_cn is not null");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnEqualTo(String value) {
            addCriterion("reg_source_cn =", value, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnNotEqualTo(String value) {
            addCriterion("reg_source_cn <>", value, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnGreaterThan(String value) {
            addCriterion("reg_source_cn >", value, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnGreaterThanOrEqualTo(String value) {
            addCriterion("reg_source_cn >=", value, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnLessThan(String value) {
            addCriterion("reg_source_cn <", value, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnLessThanOrEqualTo(String value) {
            addCriterion("reg_source_cn <=", value, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnLike(String value) {
            addCriterion("reg_source_cn like", value, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnNotLike(String value) {
            addCriterion("reg_source_cn not like", value, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnIn(List<String> values) {
            addCriterion("reg_source_cn in", values, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnNotIn(List<String> values) {
            addCriterion("reg_source_cn not in", values, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnBetween(String value1, String value2) {
            addCriterion("reg_source_cn between", value1, value2, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andRegSourceCnNotBetween(String value1, String value2) {
            addCriterion("reg_source_cn not between", value1, value2, "regSourceCn");
            return (Criteria) this;
        }

        public Criteria andSecretkeyIsNull() {
            addCriterion("secretkey is null");
            return (Criteria) this;
        }

        public Criteria andSecretkeyIsNotNull() {
            addCriterion("secretkey is not null");
            return (Criteria) this;
        }

        public Criteria andSecretkeyEqualTo(String value) {
            addCriterion("secretkey =", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyNotEqualTo(String value) {
            addCriterion("secretkey <>", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyGreaterThan(String value) {
            addCriterion("secretkey >", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyGreaterThanOrEqualTo(String value) {
            addCriterion("secretkey >=", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyLessThan(String value) {
            addCriterion("secretkey <", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyLessThanOrEqualTo(String value) {
            addCriterion("secretkey <=", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyLike(String value) {
            addCriterion("secretkey like", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyNotLike(String value) {
            addCriterion("secretkey not like", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyIn(List<String> values) {
            addCriterion("secretkey in", values, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyNotIn(List<String> values) {
            addCriterion("secretkey not in", values, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyBetween(String value1, String value2) {
            addCriterion("secretkey between", value1, value2, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyNotBetween(String value1, String value2) {
            addCriterion("secretkey not between", value1, value2, "secretkey");
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