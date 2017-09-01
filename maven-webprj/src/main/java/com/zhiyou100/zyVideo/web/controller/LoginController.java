package com.zhiyou100.zyVideo.web.controller;

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
	public String logout(HttpSession session) {
		session.removeAttribute("name");
		return "redirect:/index.jsp";
	}
}
