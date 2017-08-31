package com.zhiyou100.zyVideo.web.front.user;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.zhiyou100.zyVideo.model.User;
import com.zhiyou100.zyVideo.service.UserService;
import com.zhiyou100.zyVideo.util.MailUtil;

@Controller
public class UserController {

	@Autowired
	UserService us;

	@ResponseBody
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String userRegist(User u, Model m) {
		System.out.println(u);
		if (us.regist(u)) {
			return "success";
		}
		return "faile";
	}

	@ResponseBody
	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public String userRegist(String email) {
		User u = new User();
		u.setEmail(email);
		if (us.checkName(u)) {
			return "success";
		} else {
			return "fail";
		}
	}

	@ResponseBody
	@RequestMapping("/user/login")
	public String userLogin(HttpSession session, User u) {
		System.out.println(u);
		List<User> list = us.login(u);
		if (list.isEmpty()) {
			return "fail";
		} else {
			session.setAttribute("_front_user", list.get(0));
			return "success";
		}
	}
	
	@RequestMapping("/front/user/Logout")
	public String userlogout(HttpSession session, HttpServletRequest req, HttpServletResponse res) {
		String id = session.getId();
		Cookie cookie = new Cookie("JSESSIONID", id);
		cookie.setPath(req.getContextPath());
		cookie.setMaxAge(0);
		res.addCookie(cookie);
		return "redirect:/index.jsp";
	}
	

	@RequestMapping(value = "/forgetpwd", method = RequestMethod.GET)
	public String forgetPwd() {
		return "forward:/WEB-INF/front/user/forget_pwd.jsp";
	}

	@RequestMapping(value = "/resetPwd", method = RequestMethod.GET)
	public String resetPwd(String email, String captcha, Model m) {
		m.addAttribute("email", email);
		System.out.println(email);
		return "forward:/WEB-INF/front/user/reset_pwd.jsp";
	}

	@ResponseBody
	@RequestMapping(value = "/resetPwd", method = RequestMethod.POST)
	public String resetPwd(User u, Model m) {
		System.out.println("00000000" + u.getPassword());
		if (us.resetPWd(u)) {
			return "success";
		}
		return "fail";
	}

	@ResponseBody
	@RequestMapping("/sendEmail")
	public String sendEmail(String email) throws Exception {
		String checkCode = us.getcheckCodeByEmail(email);
		MailUtil.send(email, "验证码", checkCode);
		return "success";
	}

	@ResponseBody
	@RequestMapping(value = "/checkCode", method = RequestMethod.POST)
	public String checkCode(User u) {
		if (us.getcheckCodeByEmail(u.getEmail()).equals(u.getCaptcha())) {
			return "success";
		} else {
			return "fail";
		}
	}
	@ResponseBody
	@RequestMapping("/front/user/checkPassword")
	public String checkPassword(User u){
		if(us.login(u).isEmpty()){
			return "fail";
		}else{
			return "success";
		}
		
	}
	
	
	@RequestMapping("/front/user/index")
	public String index(HttpSession session) {
		User u = (User) session.getAttribute("_front_user");
		List<User> list = us.login(u);
		session.setAttribute("_front_user", list.get(0));
		return "forward:/WEB-INF/front/user/index.jsp";
	}
	
	

	@RequestMapping(value = "/front/user/profile", method = RequestMethod.POST)
	public String updateProfile(User u, String birthdayStr) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		u.setBirthday(dateFormat.parse(birthdayStr));
		us.updeteProfile(u);
		return "redirect:/front/user/index.action";

	}

	@RequestMapping(value="/front/user/avatar",method = RequestMethod.POST)
	public String updateAvatar(Integer id,MultipartFile image_file,HttpServletRequest req) throws IllegalStateException, IOException {
		String fileName=FilenameUtils.getExtension(image_file.getOriginalFilename());
		String file=UUID.randomUUID().toString().replaceAll("-", "");
		String upload="D:\\upload";
		fileName=file+"."+fileName;
		System.out.println(fileName+"*****************************"+id);
		image_file.transferTo(new File(upload+"\\"+fileName));
		us.setAvatar(id,fileName);
		return "redirect:/front/user/index.action";
	}
	
	@ResponseBody
	@RequestMapping(value="/front/user/password",method = RequestMethod.POST)
	public String password(HttpSession session,User u) {
		User user = us.updatePassword(u);
		session.setAttribute("_front_user", user);
		return "redirect:/front/user/index.action";
	}
	
	

	@RequestMapping(value = "/front/user/profile", method = RequestMethod.GET)
	public String profile(HttpSession session, Model m) {
		User u = (User) session.getAttribute("_front_user");
		List<User> list = us.login(u);
		Date birthday = list.get(0).getBirthday();
		if(birthday==null){
			birthday=new Date(0);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(birthday);
		m.addAttribute("birthdayStr", date);
		return "forward:/WEB-INF/front/user/profile.jsp";
	}

	@RequestMapping(value="/front/user/avatar",method = RequestMethod.GET)
	public String avatar() {
		return "forward:/WEB-INF/front/user/avatar.jsp";
	}
	

	
	@RequestMapping(value="/front/user/password",method = RequestMethod.GET)
	public String reserPassword() {
		return "forward:/WEB-INF/front/user/password.jsp";
	}

}
