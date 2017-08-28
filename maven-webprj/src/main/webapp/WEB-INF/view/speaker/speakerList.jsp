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
	<input type="hidden" id="viewflag" value="2">
  <div class="container" align="top">
  	<div class="jumbotron">
  <h3>主讲人列表-主讲人管理</h3>
	</div>
  	<div>
  		<div style="float:left;"><a href="${pageContext.servletContext.contextPath}/addSpeaker.action"><button type="button" class="btn btn-primary">添加主讲人</button></a></div>
  		<div style="float: right;">
  			<form class="form-inline" action="${pageContext.servletContext.contextPath}/speakerList.action">
				  <div class="form-group">
				    <label for="exampleInputName2">姓名</label>
				    <input type="text" class="form-control" id="exampleInputName2" placeholder="主讲人姓名" name="name" value="${name}">
				  </div>
				  <div class="form-group">
				    <label for="exampleInputEmail2">职位</label>
				    <input type="text" class="form-control" id="exampleInputEmail2" placeholder="主讲人职位" name="job" value="${job}">
				  </div>
				  <button type="submit" class="btn btn-primary">查询</button>
			</form>
  </div>	
  	</div><br/><br/><br/>
  <div class="container">
  	<div class="bs-example" data-example-id="hoverable-table">
    <table class="table table-hover table-condensed" style="vertical-align: middle;text-align: center;">
      <thead>
        <tr>
          <th class="col-sm-1" style="text-align:center;">序号</th>
          <th class="col-sm-2" style="text-align:center;">姓名</th>
          <th class="col-sm-2" style="text-align:center;">职位</th>
          <th class="col-sm-5" style="text-align:center;">简介</th>
          <th class="col-sm-1" style="text-align:center;">编辑</th>
          <th class="col-sm-1" style="text-align:center;">删除</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${page.rows}" var="speaker" varStatus="status">
        <tr>
		  <th scope="row" style="text-align:center;">${status.count+5*(page.page-1)}</th>
          <td>${speaker.speakerName}</td>
          <td>${speaker.speakerJob}</td>
          <td>${speaker.speakerDescr}</td>
          <td><a class="glyphicon glyphicon-pencil" aria-hidden="true" href="<c:url value="updateSpeaker.action?id=${speaker.id}"/>"></a></td>
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
				         	  <div class="col-md-offset-3">主讲人：${speaker.speakerName}</div>
				         	  <div class="col-md-offset-3">职位：${speaker.speakerJob}</div>
				         </div>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				        <button type="button" class="btn btn-primary" onclick="javascript:location.href='<c:url value='deleteSpeaker.action?id=${speaker.id}'/>'">确定</button>
				      </div>
				    </div><!-- /.modal-content -->
				  </div><!-- /.modal-dialog -->
				</div><!-- /.modal -->
        
        </c:forEach>
      </tbody>
    </table>
  </div>
  	 <common:page url="${pageContext.request.contextPath}/speakerList.action"/>
  </div>
  </div>
	</body>

</html>
