package cn.gp1.dao;

import cn.gp1.pojo.Users;

public interface UserMapper {
	
	Integer findIdByName(String name);
	Users findUserByName(String name);
	Users findUserById(Integer id);
	
}
