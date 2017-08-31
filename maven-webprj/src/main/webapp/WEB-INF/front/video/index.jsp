<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <base href="${BaseContext}">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta name="keywords" content="Web前端视频教程,大数据视频教程,HTML5视频教程,UI视频教程,PHP视频教程,java视频教程,python基础教程">
    <meta name="description" content="智游教育在线课程视频,为您提供java,python,HTML5,UI,PHP,大数据等学科经典视频教程在线浏览学习,精细化知识点解析,深入浅出,想学不会都难,智游教育,学习成就梦想！">
    <%@include file="/WEB-INF/front/include/style.html"%>
    <link href="${pageContext.servletContext.contextPath}/static/css/video-js.css" rel="stylesheet" type="text/css">
    <title>在线公开课-智游教育|java|大数据|HTML5|python|UI|PHP视频教程</title>

</head>

<body class="w100">
<jsp:include page="/WEB-INF/front/include/header.jsp"></jsp:include>

    <%--<div id="detail"></div>--%>
<div>
<a href="javascript :history.go(-1)"><span class="glyphicon glyphicon-circle-arrow-left" ></span></a>

<a href="javascript :history.go(1)"><span class="glyphicon glyphicon-circle-arrow-right" ></span></a>
    <!--面包屑导航-->
    <div class="container mian-nav"><a href="/maven-webprj/index.jsp">首页</a><a href="javascript:history.go(-1)">/公开课</a> / ${FrontData.subName}</div>
    <input type="hidden" id="videoId" value="${FrontData.id}">
    <div id="content">
		<%@include file="/WEB-INF/front/video/content.jsp"%>
    </div>
</div>
    <%@include file="/WEB-INF/front/include/footer.jsp"%>

    <%@include file="/WEB-INF/front/include/script.html"%>
    <script src="${pageContext.servletContext.contextPath}/static/js/video.js"></script>
    <script>
        $(function () {
        	$("#video").click(function() {
        		var id = $('#videoId').val();
                $('#content').load('/maven-webprj/front/video/index.action?videoId='+id+'&subjectId=${FrontData.subId}');
                
                //播放量统计,不需要返回结果处理
               // $.get('/maven-webprj/front/video/state.action?videoId='+id);
			});
        	
        	$("#left").click(function() {
        		var id = $('#videoId').val();
        		$.get('/maven-webprj/front/video/state.action?videoId='+id);
			});
		});
    </script>
</body>

</html>
