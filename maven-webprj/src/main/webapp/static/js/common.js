/*
	这里放置前台功能通用的一些js方法
	主要有：登录窗口的切换、注册窗口的切换、登录功能(ajax)、注册功能(ajax)
 */

$(function() {

	//显示登录窗口
	$('#login_open').click(function() {
		$('#loginDiv').removeClass('hidden');
	});
	//显示注册窗口
	$('#reg_open').click(function() {
		$('#regDiv').removeClass('hidden');
	});
	//隐藏登录窗口
	$('#login_close').click(function() {
		$('#loginDiv').addClass('hidden');
	});
	//隐藏注册窗口
	$('#reg_close').click(function() {
		$('#regDiv').addClass('hidden');
	});

	//登录请求的处理
	$('#loginForm').validate({
			
			//ajax提交登录信息，并且返回登录结果
			//			var email = $('#loginEmail').val();
			//			var pwd = $('#loginPassword').val();
			//使用ajax的post方法提交登录信息
			/*$.ajax({
				url : '/maven-webprj/login.action',
				type : "post",
				dada : {
					"email" : $email,
					"password" : $password
				},
				datatype : "text",
				success : function(msg) {
					if (msg == "fail") {
						$("#errormsg")[0].innerHTML = "账户密码不匹配，请重试！";
					} else {
						location.reload();
					}
				}
			});*/

			submitHandler:function(form){
				var $email = $("#loginEmail")[0].value;
				var password=$("#loginPassword")[0].value;
				var $password = md5(password);
				//ajax提交登录信息，并且返回登录结果
//				var email = $('#loginEmail').val();
//				var pwd = $('#loginPassword').val();
				console.log($('#loginForm').serialize());
				//使用ajax的post方法提交登录信息
				$.post('/maven-webprj/user/login.action',
						
						//$('#loginForm').serialize(),
						{
							"email":$email,
							"password":$password
						},
						
						function(msg){
							if (msg == "fail") {
								$("#errormsg")[0].innerHTML = "账户密码不匹配，请重试！";
							} else {
								location.reload();
							}
				},'text');
			},
		rules : {//写校验规则的
			email : {
				required : true,
				email : true,
				minlength : 3
			},
			password : {
				required : true,
				minlength : 3
			}
		},
		messages : {//写提示信息的
			email : "登录名称必须是已注册邮箱",
			password : '密码是必须填写的，3-30个字符'
		}
	});

	//注册请求的处理
	$('#regForm').validate({
		submitHandler : function(form) {
			var email = $("#regEmail")[0].value;
			var password = md5($("#regPsw")[0].value);

			//ajax提交注册信息，并且返回注册结果
			//使用ajax的post方法提交注册信息
			$.post('/maven-webprj/regist.action', {
				email : email,
				password : password
			}, function(result) {
				if (result == "success") {
					//注册成功,刷新页面
					location.reload();
				} else {
					alert("注册失败，请重试");
				}
			}, 'text');
		},
		rules : {//写校验规则的
			email : {
				required : true,
				email : true,
				minlength : 3
			},
			password : {
				required : true,
				minlength : 3
			},
			pswAgain : {
				required : true,
				equalTo : '#regPsw'
			}
		},
		messages : {//写提示信息的
			email : "注册账户必须是邮箱",
			password : '密码是必须填写的，3-30个字符',
			pswAgain : '两次密码必须输入一致'
		}
	});

	$("#regEmail").blur(function() {
		var email = $("#regEmail")[0].value;
		$.ajax({
			url : "/maven-webprj/regist.action",
			type : "get",
			dataType : "text",
			data : {
				"email" : email
			},
			success : function(msg) {
				if (msg == "success") {
					$("#span")[0].innerHTML = "";
				} else {
					$("#span")[0].innerHTML = "用户名已存在！";
				}
			}
		});
	});

});
