<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>课程管理</title>
    <link href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.servletContext.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>
    <style>
    
    </style>
  </head>
	<body>
	<%@ include file="/frame.jsp" %>
	<input type="hidden" id="viewflag" value="1">
  <div class="container" align="top">
  	<div class="jumbotron">
  <h3>添加课程-课程管理</h3>
</div>
  	<form class="form-horizontal" action="${pageContext.servletContext.contextPath}/admin/updateCourse.action" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label"><strong>课程标题</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" placeholder="请输入课程标题" name="courseName" value="${course.courseName}">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label"><strong>学科</strong></label>
    <div class="col-sm-10">
    	<select class="form-control" name="subjectId">
    	  <option>请选择学科</option>
		<c:forEach items="${subject}" var="subject">
			<option value="${subject.id}" ${course.subjectId==subject.id ?"selected":"" }>${subject.subjectName }</option>
		</c:forEach>
		</select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">课程简介</label>
    <div class="col-sm-10">
    	<textarea class="form-control" rows="3" id="inputPassword3" placeholder="请输入课程简介" name="courseDescr" >${course.courseDescr}</textarea>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
    <input type="hidden" name="id" value="${course.id}">
      <button type="submit" class="btn btn-primary">保存</button>&nbsp;&nbsp;<a href="${pageContext.servletContext.contextPath}/admin/courseList.action"><button type="button" class="btn btn-default">返回列表</button></a>
    </div>
  </div>
</form>
  </div>
	</body>
</html>
