<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="common" uri="http://zhiyou100.com/common/"%>
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
    <script src="${pageContext.servletContext.contextPath}/js/jquery.validate.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/messages_zh.min.js"></script>
    <style>
    
    </style>
  </head>
	<body>
	<%@ include file="/frame.jsp" %>
	<input type="hidden" id="viewflag" value="3">
  <div class="container" align="top">
  	<div class="jumbotron">
  <h3>课程列表-课程管理</h3>
</div>
  	<div><a href="${pageContext.servletContext.contextPath}/addCourse.action"><button type="button" class="btn btn-primary">添加课程</button></a></div>
  </div><br/>
  <div class="container">
  	<div class="bs-example" data-example-id="hoverable-table">
    <table class="table table-hover table-condensed" style="text-align:center;">
      <thead>
        <tr>
          <th style="text-align:center;">序号</th>
          <th  style="text-align:center;">标题</th>
          <th  style="text-align:center;">学科</th>
          <th  style="text-align:center;">简介</th>
          <th  style="text-align:center;">编辑</th>
          <th  style="text-align:center;">删除</th>
        </tr>
      </thead>
       <tbody>
        <c:forEach items="${course}" var="course" varStatus="status">
        <tr>
		  <th scope="row" style="text-align:center;">${status.count}</th>
          <td>${course.courseName}</td>
          <td>${course.subjectName}</td>
          <td>${course.courseDescr}</td>
          <td><a class="glyphicon glyphicon-pencil" aria-hidden="true" href="<c:url value="updateCourse.action?id=${course.id}"/>"></a></td>
          <td><a class="glyphicon glyphicon-trash" aria-hidden="true" href="" 
          		 data-toggle="modal" data-target="#deleteModal${status.count}"></a></td>
        </tr>
        
        
        
        		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel" id="deleteModal${status.count}">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="gridSystemModalLabel">警告</h4>
				      </div>
				      <div class="modal-body">
				        <div class="row">
				        	<div class="col-md-offset-1">此操作将永久删除选项，确认删除以下项目？</div>
				         </div>
				         <div class="row">
				         	  <div class="col-md-offset-3">课程名：${course.courseName}</div>
				         	  <div class="col-md-offset-3">学科：${course.subjectName}</div>
				         </div>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				        <button type="button" class="btn btn-primary" onclick="javascript:location.href='<c:url value='deleteCourse.action?id=${course.id}'/>'">确定</button>
				      </div>
				    </div><!-- /.modal-content -->
				  </div><!-- /.modal-dialog -->
				</div><!-- /.modal -->
        
        </c:forEach>
      </tbody>
    </table>
  </div>
  	
  </div>
	</body>
</html>
