package com.zhiyou100.zyVideo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.zyVideo.mapper.UserMapper;
import com.zhiyou100.zyVideo.model.User;
import com.zhiyou100.zyVideo.model.UserExample;
import com.zhiyou100.zyVideo.model.UserExample.Criteria;
import com.zhiyou100.zyVideo.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper um;
	
	@Override
	public boolean regist(User u) {
	if(um.insertSelective(u)>0){
		return true;
	}
		return false;
	}

	@Override
	public boolean checkName(User u) {
		UserExample example =new UserExample();
		Criteria criteria =example.createCriteria();
		criteria.andEmailEqualTo(u.getEmail());
		if(um.selectByExample(example).isEmpty()){
			return true;
		}
		return false;
	}

	@Override
	public List<User> login(User u) {
		UserExample example =new UserExample();
		Criteria criteria =example.createCriteria();
		criteria.andEmailEqualTo(u.getEmail()).andPasswordEqualTo(u.getPassword());
		return um.selectByExample(example);
		
	}

	@Override
	public String getcheckCodeByEmail(String email) {
		UserExample example =new UserExample();
		Criteria criteria =example.createCriteria();
		criteria.andEmailEqualTo(email);
		return um.selectByExample(example).get(0).getPassword();
	}

	@Override
	public boolean resetPWd(User u) {
		UserExample example =new UserExample();
		Criteria criteria =example.createCriteria();
		criteria.andEmailEqualTo(u.getEmail());
		if(um.updateByExampleSelective(u, example)>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean updeteProfile(User u) {
		if(um.updateByPrimaryKeySelective(u)>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean setAvatar(Integer id, String fileName) {
		User user=new User();
		user.setId(id);
		user.setHeadUrl(fileName);
		if(um.updateByPrimaryKeySelective(user)>0){
			return true;
		}
		return false;
	}

	@Override
	public User updatePassword(User u) {
		UserExample example =new UserExample();
		Criteria criteria =example.createCriteria();
		criteria.andEmailEqualTo(u.getEmail());
		um.updateByExampleSelective(u, example);
		return um.selectByExample(example).get(0);
	}

}
