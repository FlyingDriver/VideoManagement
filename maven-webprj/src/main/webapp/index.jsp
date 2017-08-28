<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎登陆</title>
 <link href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.servletContext.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/md5.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/jquery.validate.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/messages_zh.min.js"></script>
    <style>
    
    </style>
    <script>
    	function checker(){
    		var flag= $("#form").validate({
    			rules:{
    				username:{
    					required:true
    				},
    				password:{
    					required:true
    				}
    			},
    			messages:{
    				username:{
    					required:"用户名不能为空！"
    				},
    				password:{
    					required:"密码不能为空！"
    				}
    			}
		}).form();	
    		return flag;
    }  
    function recode() {
		if(checker()){
			var $password=$("#inputPassword");
    		$password.val(md5($password[0].value));
    		return true;
		}
		return false;
	}  
    </script>
</head>
<body>
<div class="container" style="margin-top: 255px;">
		 	<div align="center"><img src="${pageContext.servletContext.contextPath}/img/logo.png"></div>
		 	<div style="width:400px; margin-top: 20px;margin-left:375px;">
		 		<form class="form-horizontal" action="${pageContext.servletContext.contextPath}/Login.action" onsubmit="return recode()" method="post" id="form">
				  <div class="form-group">
				    <label for="inputEmail3" class="col-lg-2 control-label">UserName:</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="inputUsername" placeholder="UserName" name="username">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputPassword3" class="col-lg-2 control-label">PassWord:</label>
				    <div class="col-sm-10">
				      <input type="password" class="form-control" id="inputPassword" placeholder="Password" name="password">
				    </div>
				  </div>
				 <!--  <div class="form-group">
				    <div class="col-lg-offset-2 col-lg-10">
				      <div class="checkbox">
				        <label>
				          <input type="checkbox" name="rememberflag"> Remember Me
				        </label>
				      </div>
				    </div>
				  </div> -->
				  <div class="form-group">
				    <div class="col-lg-12">
				      <button type="submit" id="sub" class="btn btn-primary btn-lg btn-block" style="width:400px; margin-left:0px;" >Sign in</button>
				    </div>
				  </div>
				</form>
		 		
		 	</div>
		</div>
</body>
</html>