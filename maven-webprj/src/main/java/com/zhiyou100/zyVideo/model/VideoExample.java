package com.zhiyou100.zyVideo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoTitleIsNull() {
            addCriterion("video_title is null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIsNotNull() {
            addCriterion("video_title is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleEqualTo(String value) {
            addCriterion("video_title =", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotEqualTo(String value) {
            addCriterion("video_title <>", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThan(String value) {
            addCriterion("video_title >", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("video_title >=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThan(String value) {
            addCriterion("video_title <", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThanOrEqualTo(String value) {
            addCriterion("video_title <=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLike(String value) {
            addCriterion("video_title like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotLike(String value) {
            addCriterion("video_title not like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIn(List<String> values) {
            addCriterion("video_title in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotIn(List<String> values) {
            addCriterion("video_title not in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleBetween(String value1, String value2) {
            addCriterion("video_title between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotBetween(String value1, String value2) {
            addCriterion("video_title not between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdIsNull() {
            addCriterion("speaker_id is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdIsNotNull() {
            addCriterion("speaker_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdEqualTo(Integer value) {
            addCriterion("speaker_id =", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdNotEqualTo(Integer value) {
            addCriterion("speaker_id <>", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdGreaterThan(Integer value) {
            addCriterion("speaker_id >", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("speaker_id >=", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdLessThan(Integer value) {
            addCriterion("speaker_id <", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdLessThanOrEqualTo(Integer value) {
            addCriterion("speaker_id <=", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdIn(List<Integer> values) {
            addCriterion("speaker_id in", values, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdNotIn(List<Integer> values) {
            addCriterion("speaker_id not in", values, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdBetween(Integer value1, Integer value2) {
            addCriterion("speaker_id between", value1, value2, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("speaker_id not between", value1, value2, "speakerId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andVideoLengthIsNull() {
            addCriterion("video_length is null");
            return (Criteria) this;
        }

        public Criteria andVideoLengthIsNotNull() {
            addCriterion("video_length is not null");
            return (Criteria) this;
        }

        public Criteria andVideoLengthEqualTo(Integer value) {
            addCriterion("video_length =", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthNotEqualTo(Integer value) {
            addCriterion("video_length <>", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthGreaterThan(Integer value) {
            addCriterion("video_length >", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_length >=", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthLessThan(Integer value) {
            addCriterion("video_length <", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthLessThanOrEqualTo(Integer value) {
            addCriterion("video_length <=", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthIn(List<Integer> values) {
            addCriterion("video_length in", values, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthNotIn(List<Integer> values) {
            addCriterion("video_length not in", values, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthBetween(Integer value1, Integer value2) {
            addCriterion("video_length between", value1, value2, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("video_length not between", value1, value2, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlIsNull() {
            addCriterion("video_image_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlIsNotNull() {
            addCriterion("video_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlEqualTo(String value) {
            addCriterion("video_image_url =", value, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlNotEqualTo(String value) {
            addCriterion("video_image_url <>", value, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlGreaterThan(String value) {
            addCriterion("video_image_url >", value, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_image_url >=", value, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlLessThan(String value) {
            addCriterion("video_image_url <", value, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlLessThanOrEqualTo(String value) {
            addCriterion("video_image_url <=", value, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlLike(String value) {
            addCriterion("video_image_url like", value, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlNotLike(String value) {
            addCriterion("video_image_url not like", value, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlIn(List<String> values) {
            addCriterion("video_image_url in", values, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlNotIn(List<String> values) {
            addCriterion("video_image_url not in", values, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlBetween(String value1, String value2) {
            addCriterion("video_image_url between", value1, value2, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageUrlNotBetween(String value1, String value2) {
            addCriterion("video_image_url not between", value1, value2, "videoImageUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoDescrIsNull() {
            addCriterion("video_descr is null");
            return (Criteria) this;
        }

        public Criteria andVideoDescrIsNotNull() {
            addCriterion("video_descr is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDescrEqualTo(String value) {
            addCriterion("video_descr =", value, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrNotEqualTo(String value) {
            addCriterion("video_descr <>", value, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrGreaterThan(String value) {
            addCriterion("video_descr >", value, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrGreaterThanOrEqualTo(String value) {
            addCriterion("video_descr >=", value, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrLessThan(String value) {
            addCriterion("video_descr <", value, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrLessThanOrEqualTo(String value) {
            addCriterion("video_descr <=", value, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrLike(String value) {
            addCriterion("video_descr like", value, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrNotLike(String value) {
            addCriterion("video_descr not like", value, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrIn(List<String> values) {
            addCriterion("video_descr in", values, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrNotIn(List<String> values) {
            addCriterion("video_descr not in", values, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrBetween(String value1, String value2) {
            addCriterion("video_descr between", value1, value2, "videoDescr");
            return (Criteria) this;
        }

        public Criteria andVideoDescrNotBetween(String value1, String value2) {
            addCriterion("video_descr not between", value1, value2, "videoDescr");
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

        public Criteria andVideoPlayTimesIsNull() {
            addCriterion("video_play_times is null");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesIsNotNull() {
            addCriterion("video_play_times is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesEqualTo(Integer value) {
            addCriterion("video_play_times =", value, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesNotEqualTo(Integer value) {
            addCriterion("video_play_times <>", value, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesGreaterThan(Integer value) {
            addCriterion("video_play_times >", value, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_play_times >=", value, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesLessThan(Integer value) {
            addCriterion("video_play_times <", value, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesLessThanOrEqualTo(Integer value) {
            addCriterion("video_play_times <=", value, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesIn(List<Integer> values) {
            addCriterion("video_play_times in", values, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesNotIn(List<Integer> values) {
            addCriterion("video_play_times not in", values, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesBetween(Integer value1, Integer value2) {
            addCriterion("video_play_times between", value1, value2, "videoPlayTimes");
            return (Criteria) this;
        }

        public Criteria andVideoPlayTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("video_play_times not between", value1, value2, "videoPlayTimes");
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