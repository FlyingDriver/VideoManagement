<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>主讲人</title>
    <link href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.servletContext.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>
    <style>
    
    </style>
  </head>
	<body>
	
	<%@ include file="/frame.jsp" %>
	<input type="hidden" id="viewflag" value="2">
  <div class="container" align="top">
  	<div class="jumbotron">
  <h3>编辑主讲人-主讲人管理</h3>
</div>
  	<form class="form-horizontal" action="${pageContext.servletContext.contextPath}/admin/updateSpeaker.action" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label"><strong>名字</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" placeholder="请输入名字" name="speakerName" value="${speaker.speakerName}">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label"><strong>职业</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputPassword3" placeholder="请输入职业描述" name="speakerJob" value="${speaker.speakerJob}">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label"><strong>头像图片</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputPassword3" placeholder="头像图片地址" name="speakerHeadUrl" value="${speaker.speakerHeadUrl}">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">简介</label>
    <div class="col-sm-10">
    	<textarea class="form-control" rows="3" id="inputPassword3" placeholder="请输入简介" name="speakerDescr">${speaker.speakerDescr}</textarea>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
    <input type="hidden" value="${speaker.id}" name="id">
      <button type="submit" class="btn btn-primary">保存</button>&nbsp;&nbsp;<a href="${pageContext.servletContext.contextPath}/admin/speakerList.action"><button type="button" class="btn btn-default">返回列表</button></a>
    </div>
  </div>
</form>
  </div>
	</body>
</html>
