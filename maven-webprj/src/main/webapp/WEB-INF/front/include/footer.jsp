<%@ page language="java" pageEncoding="UTF-8"%>
<!--页脚-->
<footer>
	<ul>
		<li>
			<img src="${pageContext.servletContext.contextPath}/static/img/footer_logo.png" alt="" draggable="false">
		</li>
		<li class="mt25">
			<h3>各校区地址</h3>
			<ul>
				<li>总部地址<br>中国-郑州经济技术开发区河南省通信产业园六层</li>
				<li>郑州校区一<br>中国-郑州经济技术开发区第一大街与经北一路</li>
				<li>郑州校区二<br>中国-郑州经济技术开发区第四大街经开人才市场七楼</li>
				<li>郑州校区三<br>中国-郑州经济技术开发区第八大街河南省留学生创业园九层、十层</li>
				<li>西安分校<br>中国-西安莲湖区&#X3000;联系人：梁老师 13201570801</li>
			</ul>
		</li>
		<li class="mt25">
			<h3>联系我们</h3>
			<ul id="foo_icon">
				<li>中国-郑州经济技术开发区经北三路河南通信产业园六层</li>
				<li>e-mail:zy@zhiyou100.com</li>
				<li>电话:4006-371-555 0371-88888598</li>
				<li class="erwei">
					<br>
					<div>
						<img class="weixin" src="/maven-webprj/static/img/微信公众号.png" alt="" draggable="false">
						<img class="weibo" src="/maven-webprj/static/img/微博公众号.png" alt="" draggable="false">
					</div>
				</li>
			</ul>
		</li>
	</ul>
	<div class="record">智游教育 &copy; 豫ICP备17000832号-1 &#X3000;河南智游臻龙教育科技有限公司</div>
</footer>


<!--登录注册弹出框-->
<div class="mask hidden" id="loginDiv">
	<div class="mask_content">
		<div class="mask_content_header">
			<img src="/maven-webprj/static/img/logo.png" alt="" class="ma">
		</div>
		<div class="mask_content_body">
			<form id="loginForm" <%-- action="${pageContext.servletContext.contextPath}/front/user/login.action" method="post"--%> >
				<h3>快速登录</h3>
				<input type="email" id="loginEmail" placeholder="请输入邮箱" name="email">
				<input type="password" id="loginPassword" placeholder="请输入密码" name="password">
				<span id="errormsg"></span>
				<div id="forget">
					<a href="${pageContext.servletContext.contextPath}/forgetpwd.action">忘记密码？</a>
				</div>
				<input type="submit" value="登&#x3000;录">
			</form>
		</div>
		<div class="mask_content_footer">
			<span id="login_close">关&#x3000;闭</span>
		</div>
	</div>
</div>
<div class="mask hidden" id="regDiv">
	<div class="mask_content">
		<div class="mask_content_header">
			<img src="/maven-webprj/static/img/logo.png" alt="" class="ma">
		</div>
		<div class="mask_content_body">
			<form id="regForm" <%-- action="${pageContext.servletContext.contextPath}front/user/regist.action" method="post" --%>>
				<h3>新用户注册</h3>
				<input type="email" id="regEmail" placeholder="请输入邮箱" name="email"><span id="span"></span> 
				<input type="password" id="regPsw" placeholder="请输入密码" name="password">
				<input type="password" id="regPswAgain" placeholder="请再次输入密码" name="pswAgain">
				<!-- <div id="yzm" class="form-inline">
					<input type="text" name="yzm" style="width: 45%; display: inline-block;">
					<div id="v_container" style="width: 45%;height: 40px;float:right;"></div>
				</div> -->
				<input type="submit" value="注册"><!-- 注&#x3000;册 -->
			</form>
		</div>
		<div class="mask_content_footer">
			<span id="reg_close">关&#x3000;闭</span>
		</div>
	</div>
</div>

