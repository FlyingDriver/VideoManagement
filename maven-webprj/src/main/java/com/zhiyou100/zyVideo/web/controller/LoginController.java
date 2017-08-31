package com.zhiyou100.zyVideo.web.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhiyou100.zyVideo.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService ls;

	@RequestMapping("/admin/Login")
	public String login(String username, String password, HttpSession session) {
		System.out.println(username + "1111111" + password);
		if (ls.login(username, password)) {
			session.setAttribute("name", username);
			return "forward:/admin/videoList.action";
		} else {
			return "forward:/adminLogin.jsp";
		}

	}

	@RequestMapping("/admin/logout")
	public String logout(HttpSession session, HttpServletRequest req, HttpServletResponse res) {
		String id = session.getId();
		Cookie cookie = new Cookie("JSESSIONID", id);
		cookie.setPath(req.getContextPath());
		cookie.setMaxAge(0);
		res.addCookie(cookie);
		return "redirect:/index.jsp";
	}
}
