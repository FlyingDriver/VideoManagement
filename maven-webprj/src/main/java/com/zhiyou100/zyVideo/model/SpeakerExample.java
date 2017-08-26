package com.zhiyou100.zyVideo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpeakerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpeakerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameIsNull() {
            addCriterion("speaker_name is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameIsNotNull() {
            addCriterion("speaker_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameEqualTo(String value) {
            addCriterion("speaker_name =", value, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameNotEqualTo(String value) {
            addCriterion("speaker_name <>", value, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameGreaterThan(String value) {
            addCriterion("speaker_name >", value, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_name >=", value, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameLessThan(String value) {
            addCriterion("speaker_name <", value, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameLessThanOrEqualTo(String value) {
            addCriterion("speaker_name <=", value, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameLike(String value) {
            addCriterion("speaker_name like", value, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameNotLike(String value) {
            addCriterion("speaker_name not like", value, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameIn(List<String> values) {
            addCriterion("speaker_name in", values, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameNotIn(List<String> values) {
            addCriterion("speaker_name not in", values, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameBetween(String value1, String value2) {
            addCriterion("speaker_name between", value1, value2, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerNameNotBetween(String value1, String value2) {
            addCriterion("speaker_name not between", value1, value2, "speakerName");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobIsNull() {
            addCriterion("speaker_job is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobIsNotNull() {
            addCriterion("speaker_job is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobEqualTo(String value) {
            addCriterion("speaker_job =", value, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobNotEqualTo(String value) {
            addCriterion("speaker_job <>", value, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobGreaterThan(String value) {
            addCriterion("speaker_job >", value, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_job >=", value, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobLessThan(String value) {
            addCriterion("speaker_job <", value, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobLessThanOrEqualTo(String value) {
            addCriterion("speaker_job <=", value, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobLike(String value) {
            addCriterion("speaker_job like", value, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobNotLike(String value) {
            addCriterion("speaker_job not like", value, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobIn(List<String> values) {
            addCriterion("speaker_job in", values, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobNotIn(List<String> values) {
            addCriterion("speaker_job not in", values, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobBetween(String value1, String value2) {
            addCriterion("speaker_job between", value1, value2, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerJobNotBetween(String value1, String value2) {
            addCriterion("speaker_job not between", value1, value2, "speakerJob");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlIsNull() {
            addCriterion("speaker_head_url is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlIsNotNull() {
            addCriterion("speaker_head_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlEqualTo(String value) {
            addCriterion("speaker_head_url =", value, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlNotEqualTo(String value) {
            addCriterion("speaker_head_url <>", value, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlGreaterThan(String value) {
            addCriterion("speaker_head_url >", value, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_head_url >=", value, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlLessThan(String value) {
            addCriterion("speaker_head_url <", value, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlLessThanOrEqualTo(String value) {
            addCriterion("speaker_head_url <=", value, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlLike(String value) {
            addCriterion("speaker_head_url like", value, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlNotLike(String value) {
            addCriterion("speaker_head_url not like", value, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlIn(List<String> values) {
            addCriterion("speaker_head_url in", values, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlNotIn(List<String> values) {
            addCriterion("speaker_head_url not in", values, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlBetween(String value1, String value2) {
            addCriterion("speaker_head_url between", value1, value2, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerHeadUrlNotBetween(String value1, String value2) {
            addCriterion("speaker_head_url not between", value1, value2, "speakerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrIsNull() {
            addCriterion("speaker_descr is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrIsNotNull() {
            addCriterion("speaker_descr is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrEqualTo(String value) {
            addCriterion("speaker_descr =", value, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrNotEqualTo(String value) {
            addCriterion("speaker_descr <>", value, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrGreaterThan(String value) {
            addCriterion("speaker_descr >", value, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_descr >=", value, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrLessThan(String value) {
            addCriterion("speaker_descr <", value, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrLessThanOrEqualTo(String value) {
            addCriterion("speaker_descr <=", value, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrLike(String value) {
            addCriterion("speaker_descr like", value, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrNotLike(String value) {
            addCriterion("speaker_descr not like", value, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrIn(List<String> values) {
            addCriterion("speaker_descr in", values, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrNotIn(List<String> values) {
            addCriterion("speaker_descr not in", values, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrBetween(String value1, String value2) {
            addCriterion("speaker_descr between", value1, value2, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andSpeakerDescrNotBetween(String value1, String value2) {
            addCriterion("speaker_descr not between", value1, value2, "speakerDescr");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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