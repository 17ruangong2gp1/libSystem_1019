package cn.gp1.service.impl;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gp1.dao.UserMapper;
import cn.gp1.dao.UserRepository;
import cn.gp1.pojo.Users;
import cn.gp1.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	
	@Resource
	private UserRepository uRepository;
	
	@Resource 
	private UserMapper umapper;


	@Override
	public Integer findIdByName(String name) {
		// TODO Auto-generated method stub
		return this.umapper.findIdByName(name);
	}

	@Override
	public Users findUserByName(String name) {
		// TODO Auto-generated method stub
		return this.umapper.findUserByName(name);
	}

	@Override
	public Users findUserById(Integer id) {
		// TODO Auto-generated method stub
		return this.umapper.findUserById(id);
	}

	
	
	
	
	
	
}
