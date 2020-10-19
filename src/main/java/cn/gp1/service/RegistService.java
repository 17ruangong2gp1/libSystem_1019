package cn.gp1.service;

import java.util.List;

import cn.gp1.pojo.Books;
import cn.gp1.pojo.Users;

public interface RegistService {
	
	Users addUser(Users u);
	List<Books> findAllBook();
	List<Users> findAllUser();
	
	void deleteUserById(Integer id);
}
