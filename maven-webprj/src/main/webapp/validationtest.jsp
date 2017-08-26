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
    
    <script type="text/javascript">
    $(function() {
		$('form[name=form]').validate({
			rules:{
				user:{
					required:true,
					minlength:5
				},
				pa:{
					required:true,
					maxlength:10
				},
				ch:{
					required:true
				},
				ra:{
					required:true
				}
			},
			messages:{
				user:{
					required:"用户名不能为空",
					minlength:"用户名不能少于5个字符"
				},
				pa:{
					required:"密码不能为空",
					maxlength:"密码最大长度为10个字符"
				},
				ch:{
					required:"此为必选项"
				},
				ra:{
					requored:"此为必选项"
				}
			}
		});
	});
    
    </script>
  </head>
<body>

<form name="form" action="#"><br>
<input type="text" name="user"><br>
<input type="password" name="pa"><br>
<input type="checkbox" name="ch"><br>
<input type="radio" name="ra"><br>
<input type="submit">
</form>
</body>
</html>