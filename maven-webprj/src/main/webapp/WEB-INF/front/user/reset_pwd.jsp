<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="${BaseContext}">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta name="keywords" content="Web前端视频教程,大数据视频教程,HTML5视频教程,UI视频教程,PHP视频教程,java视频教程,python基础教程">
    <meta name="description" content="智游教育在线课程视频,为您提供java,python,HTML5,UI,PHP,大数据等学科经典视频教程在线浏览学习,精细化知识点解析,深入浅出,想学不会都难,智游教育,学习成就梦想！">
    <link rel="stylesheet" href="static/css/base.css">
    <link rel="stylesheet" href="static/css/forget_password.css">
    <link rel="icon" href="favicon.png" type="image/png">
     <link href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.servletContext.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/md5.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/jquery.validate.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/messages_zh.min.js"></script>
    
    <title>在线公开课-智游教育|java|大数据|HTML5|python|UI|PHP视频教程</title>
    
    
    <script>
    $(function(){
    	   $('#resetForm').validate({   		  
    		  submitHandler:function(form){
    				var data={
    						"email":"${email}",
    						"password":md5($("#password")[0].value),
    				};
    				  $.ajax({ 
    					type : "post",
    					url : "${pageContext.request.contextPath}/resetPwd.action", 
    					dataType:"text",
    					data : data, 
    					success : function(result){
    						 if(result=="success"){
    							window.location.href="/maven-webprj/index.jsp";
    							} 
    						} 
    					}); 
    				},   		  
    		  
  			rules:{//写校验规则的
  				password:{
  					required:true,
  					minlength:3
  					},
  				pwdAgain:{
  				  required:true,
  				  equalTo:'#password'
  				}
  			},
  		messages:{//写提示信息的
  			password:{
  				required:"此项为必填项",
  				minlength:"密码最少为3个字符"
  				},
  			pwdAgain:{
  			  required:"此项为必填项",
  			  equalTo:"两次输入不一致"
  			}
  		}
  	}); 
	}); 
    
    </script>
</head>

<body>
<%@include file="../include/script.html"%>
    <header>
        <div class="container">
            <img src="static/img/logo.png" alt="智游">
            <%-- <label>${email}</label> --%>
        </div>
    </header>
    <main>
        <div class="container">
            <form class="ma" id="resetForm" <%-- action="${pageContext.servletContext.contextPath}/resetPwd.action" method="post" --%>>
                <div class="form_header">
                    <div class="form_title">
                        <h2>重置密码</h2>
                    </div>
                    
                </div>
                <div class="form_body">
                    <input type="password" placeholder="请输入新密码" id="password" name="password">
                    <input type="password" style="width:100%" placeholder="再次输入新密码" id="password02" name="pwdAgain">
                    <input type="submit" style="margin:0px;width:100%" value="提交">
                </div>
                
            </form>
        </div>
    </main>
</body>

</html>