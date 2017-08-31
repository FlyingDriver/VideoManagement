<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <base href="${BaseContext}">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta name="keywords" content="Web前端视频教程,大数据视频教程,HTML5视频教程,UI视频教程,PHP视频教程,java视频教程,python基础教程">
    <meta name="description" content="智游教育在线课程视频,为您提供java,python,HTML5,UI,PHP,大数据等学科经典视频教程在线浏览学习,精细化知识点解析,深入浅出,想学不会都难,智游教育,学习成就梦想！">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/static/css/base.css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/static/css/profile.css">
    <title>在线公开课-智游教育|java|大数据|HTML5|python|UI|PHP视频教程</title>

</head>

<body class="w100">
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
		                         <img id="avatar"  src="${pageContext.servletContext.contextPath}/static/img/avatar_lg.png" alt="">
		                      </c:if>
		                      
		                      <c:if test="${not empty _front_user.headUrl}">
		                         <img id="avatar" width="200px" src="http://localhost:8081/pic/${_front_user.headUrl}" alt="">
		                      </c:if>
                           
                        </div>
                        
                        <div class="profile_ifo_area">
                        
                         <c:if test="${not empty message}">
				            <div>
				                <strong>${message}</strong>
				            </div>
				            </c:if>
                            <form id="resetForm">
                                <div class="form_group">
                                    <span class="dd">旧&#x3000;密&#x3000;码：</span>
                                    <input type="password" id="oldPassword" name="oldPassword"><span id="err"></span>
                                </div>
                                <div class="form_group">
                                    <span class="dd">新&#x3000;密&#x3000;码：</span>
                                    <input type="password" id="newPassword"  name="password">
                                </div>
                                <div class="form_group">
                                    <span class="dd">确认新密码：</span>
                                    <input type="password" id="newPassword02" name="newPasswordAgain">
                                </div>
                                <div class="form_submit dd">
                                <input type="hidden" name="email" value="${_front_user.email}">
                                    <input type="submit" value="保&#x3000;存" id="submit">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <jsp:include page="ufooter.jsp"></jsp:include>
    <%@include file="../include/script.html"%>
   <script type="text/javascript">
$(function() {
	$("#oldPassword").blur(function () {
		 var data={
				 "email":"${_front_user.email}",
				 "password":md5($("#oldPassword")[0].value)
		 };
		$.ajax({
			url:"/maven-webprj/front/user/checkPassword.action",
			type:"post",
			data:data,
			dataType:"text",
			success:function(msg){
				if(msg=="fail"){
					$("#err").text("密码错误，请重新输入");
					$("#submit").attr("disabled","disabled");
					
				}else{
					$("#err").text("");
					$("#submit").removeAttr("disabled");
				}
			}
		});
	});
	
	$('#resetForm').validate({
		submitHandler : function(form) {
			var data={
					 "email":"${_front_user.email}",
					 "password":md5($("#newPassword")[0].value)
			 };
			$.ajax({
				url:"/maven-webprj/front/user/password.action",
				type:"post",
				data:data,
				dataType:"text",
				success:function(msg){
					self.location.href="/maven-webprj/front/user/index.action";
				}
			});
		},
		rules : {//写校验规则的
			password : {
				required : true,
				minlength : 3
			},
			newPasswordAgain : {
				required : true,
				equalTo : '#newPassword'
			}
		},
		messages : {//写提示信息的
			password : {
				required : "此为必填项",
				minlength :"最小长度为3"
			},
			newPasswordAgain : {
				required : "此项为必填项",
				equalTo : "两次输入不同，请重新输入"
			}
		}
	});

	
});
   
   </script>
</body>
</html>