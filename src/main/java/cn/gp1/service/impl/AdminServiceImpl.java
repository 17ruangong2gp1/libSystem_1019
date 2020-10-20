package cn.gp1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gp1.dao.AdminMapper;
import cn.gp1.pojo.Admins;
import cn.gp1.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
@Autowired
private AdminMapper adminMapper;
	@Override
	public Admins findByname(String name) {
		// TODO Auto-generated method stub
		return adminMapper.findByname(name);
	}

}
