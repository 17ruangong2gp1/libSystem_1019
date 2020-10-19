package cn.gp1.service.impl;

import javax.annotation.Resource;

import cn.gp1.dao.UserRepository;
import cn.gp1.pojo.Users;
import cn.gp1.service.UpdateService;

public class UpdateServiceImpl implements UpdateService {
	
	@Resource
	private UserRepository ur;
	
	@Override
	public void UpdateUser(Users u) {
		// TODO Auto-generated method stub
		ur.save(u);
	}

}
