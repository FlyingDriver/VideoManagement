package com.zhiyou100.zyVideo.web.intercepter;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyou100.zyVideo.model.User;

public class MyAdminInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("马后炮");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("666");
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		if(arg0.getRequestURI().indexOf("/admin/Login.action")>=0||arg0.getRequestURI().indexOf("/admin/Logout.action")>=0){
			return true;
		}
		if(arg0.getSession().getAttribute("name")==null){
			
			arg1.setHeader("refresh", "1;url='/maven-webprj/index.jsp'");
			arg1.setContentType("text/html; charset=UTF-8");
			arg1.getWriter().write("未登录,请登录！");
			return false;
		}
		else{
			return true;
		}
	}

}
