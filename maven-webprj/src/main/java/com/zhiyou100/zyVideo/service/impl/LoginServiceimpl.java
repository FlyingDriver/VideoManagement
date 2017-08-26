package com.zhiyou100.zyVideo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhiyou100.zyVideo.mapper.AdminMapper;
import com.zhiyou100.zyVideo.model.Admin;
import com.zhiyou100.zyVideo.model.AdminExample;
import com.zhiyou100.zyVideo.model.AdminExample.Criteria;
import com.zhiyou100.zyVideo.service.LoginService;

@Service
public class LoginServiceimpl implements LoginService {
	@Autowired
	AdminMapper am;
	
	@Override
	public boolean login(String username, String password) {
		
		AdminExample userExample= new AdminExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andLoginNameEqualTo(username).andLoginPwdEqualTo(password);
		List<Admin> list = am.selectByExample(userExample);
		if(list.isEmpty()){
			return false;
		}else{
			return true;
		}
	}

}
