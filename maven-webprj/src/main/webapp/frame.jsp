<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>frame</title>
 <link href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.servletContext.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>
    <style>
    
    </style>
    
    <script type="text/javascript">
    	$(function() {
			var viewflag=$("#viewflag")[0].value;
			$($("li")[viewflag-1]).addClass("active");
			switch (viewflag)
			{
			case "1":
				  break;
			case "4":
			  $("#charts").show();
			  break;
			default:
				$("#charts").hide();
			}

			});
    
    </script>
</head>
<body>
<div class="bs-example" data-example-id="inverted-navbar" style="margin-bottom: 0px;">
    	<nav class="navbar navbar-inverse"style="margin-bottom: 0px;">
      	<div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-9" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">视频管理系统</a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-9">
          <ul class="nav navbar-nav">
            <li ><a href="${pageContext.servletContext.contextPath}/admin/videoList.action">视频管理</a></li>
            <li ><a href="${pageContext.servletContext.contextPath}/admin/speakerList.action" >主讲人管理</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/admin/courseList.action" >课程管理</a></li>
            <li id="charts"><a href="${pageContext.servletContext.contextPath}/showChart.action">报表分析</a></li>
          </ul>
          <ul class="nav navbar-nav" style="float: right;">
            <li><a href="${pageContext.servletContext.contextPath}/admin/logout.action">${name}&nbsp;<span class="glyphicon glyphicon-log-out" aria-hidden="true"></span></a></li>
          </ul>
        </div>
      </div>
    </nav>
  </div>
 
</body>
</html>