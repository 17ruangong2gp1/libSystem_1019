package cn.gp1.service;

import cn.gp1.pojo.Admins;

public interface AdminService {
	 Admins findByname(String name);
	 boolean delete(Integer aid);
	 boolean update(Integer aid);
	 boolean add(Integer aid);
	 
}
