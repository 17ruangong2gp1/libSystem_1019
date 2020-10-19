package cn.gp1.service;

import cn.gp1.pojo.Users;

public interface LoginService {
	
	
	Integer findIdByName(String name);
	Users findUserByName(String name);
	Users findUserById(Integer id);
	void saveUser(Users u);
}
