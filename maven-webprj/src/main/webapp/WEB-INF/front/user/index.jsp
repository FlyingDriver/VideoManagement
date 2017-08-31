<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <base href="${BaseContext}">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta name="keywords" content="Web前端视频教程,大数据视频教程,HTML5视频教程,UI视频教程,PHP视频教程,java视频教程,python基础教程">
    <meta name="description" content="智游教育在线课程视频,为您提供java,python,HTML5,UI,PHP,大数据等学科经典视频教程在线浏览学习,精细化知识点解析,深入浅出,想学不会都难,智游教育,学习成就梦想！">
    <meta name="author" content="尚忠祥">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/static/css/base.css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/static/css/profile.css">
    <link rel="icon" href="${pageContext.servletContext.contextPath}/favicon.png" type="image/png">
    <title>在线公开课-智游教育|java|大数据|HTML5|python|UI|PHP视频教程</title>
</head>

<body>
   <jsp:include page="uheader.jsp"></jsp:include>
    <main>
        <div class="container">
            <h2>我的资料</h2>
            <div id="profile_tab">
                <ul class="profile_tab_header f_left clearfix">
                    <li><a href="${pageContext.servletContext.contextPath}/front/user/profile.action">更改资料</a></li>
                    <li class="profile_tab_line">|</li>
                    <li><a href="${pageContext.servletContext.contextPath}/front/user/avatar.action">更改头像</a></li>
                    <li class="profile_tab_line">|</li>
                    <li><a href="${pageContext.servletContext.contextPath}/front/user/password.action">密码安全</a></li>
                </ul>
                <div class="proflle_tab_body">
                    
                    <div class="proflle_tab_workplace clearfix">
                        <div class="profile_avatar_area">
                            <c:if test="${empty _front_user.headUrl}">
		                         <img id="avatar" src="${pageContext.servletContext.contextPath}/static/img/avatar_lg.png" alt="">
		                      </c:if>
		                      
		                      <c:if test="${not empty _front_user.headUrl}">
		                         <img id="avatar" width="200px"  src="http://localhost:8081/pic/${_front_user.headUrl}" alt="">
		                      </c:if>
                            <p>
                            <c:if test="${not empty _front_user.nickName}">
						          <span>${_front_user.nickName}</span>
						    </c:if>
						    <c:if test="${empty _front_user.nickName}">
						          <span>${_front_user.email }</span>
						    </c:if> 
                                                                          欢迎回来！</p>
                        </div>
                        <ul class="profile_ifo_area">
                            <li><span class="dd">昵&#x3000;称：</span>${_front_user.nickName}</li>
                            <li><span class="dd">性&#x3000;别：</span>
                                <c:if test="${_front_user.sex==2}">
                                    		女
                                </c:if>
                                <c:if test="${_front_user.sex==1}">
                                    		男
                                </c:if> 
                             </li>
                            <li><span class="dd">生&#x3000;日：</span><fmt:formatDate value="${_front_user.birthday}" pattern="YYYY-MM-dd"></fmt:formatDate></li>
                            <li><span class="dd">邮&#x3000;箱：</span>${_front_user.email}</li>
                            <li><span class="dd">所在地：</span>${_front_user.province}-${_front_user.city }</li>
                            
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <footer>
        <div class="container">
            <ul>
                <li><img src="${pageContext.servletContext.contextPath}/static/img/footer_logo.png" alt="" id="foot_logo"></li>
                <li>版权所有：智游3G教育&#x3000;&#x3000;&#x3000;&copy;&nbsp;www.zhiyou100.com</li>
                <li><img src="${pageContext.servletContext.contextPath}/static/img/微信公众号.png" alt="" id="wxgzh"></li>
            </ul>
        </div>
    </footer>
</body>
</html>