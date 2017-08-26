<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>视频管理</title>
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
  <h3>修改视频信息-视频管理</h3>
</div>
  	<form class="form-horizontal" action="${pageContext.servletContext.contextPath}/updateVideo.action" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label"><strong>视频标题</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" placeholder="请输入视频标题" name="videoTitle" value="${video.videoTitle}">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label"><strong>主讲人</strong></label>
    <div class="col-sm-10">
    	<select class="form-control" name="speakerId">
    	  <c:forEach items="${allSpeaker}" var="speaker">
			 <option ${video.speakerId eq speaker.id ? 'selected':''} value="${speaker.id}">${speaker.speakerName }</option>
		  </c:forEach>
		</select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label"><strong>所属课程</strong></label>
    <div class="col-sm-10">
      <select class="form-control" name="courseId">
    	 <c:forEach items="${allCourse}" var="course">
			<option ${video.courseId eq course.id ? 'selected':''} value="${course.id }">${course.courseName }</option>
		</c:forEach>
		</select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">视频时长</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="inputPassword3" 
      placeholder="请输入视频时长（秒）" name="videoLength" value="${video.videoLength}">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">封面图片</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputPassword3" 
      placeholder="请输入封面图片地址" name="videoImageUrl" value="${video.videoImageUrl}">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">视频播放地址</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputPassword3" 
      placeholder="请输入视频播放地址" name="videoUrl" value="${video.videoUrl}">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">视频简介</label>
    <div class="col-sm-10">
    	<textarea class="form-control" rows="3" id="inputPassword3" 
    	placeholder="请输入视频简介" name="videoDescr">${video.videoDescr}</textarea>
    </div>
  </div>
  <div class="form-group">
  	<div><input type="hidden" value="${video.id}" name="id"></div>
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">保存</button>&nbsp;&nbsp;<a href="${pageContext.servletContext.contextPath}/videoList.action"><button type="button" class="btn btn-default">返回列表</button></a>
    </div>
  </div>
</form>
  </div>
	</body>
</html>
