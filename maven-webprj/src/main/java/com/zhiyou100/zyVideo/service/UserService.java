package com.zhiyou100.zyVideo.service;

import java.util.List;

import com.zhiyou100.zyVideo.model.User;

public interface UserService {

	boolean regist(User u);

	boolean checkName(User u);

	List<User> login(User u);

	String getcheckCodeByEmail(String email);

	boolean resetPWd(User u);

	boolean updeteProfile(User u);

	boolean setAvatar(Integer id, String fileName);

	User updatePassword(User u);
}
