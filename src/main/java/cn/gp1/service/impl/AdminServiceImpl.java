package cn.gp1.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gp1.dao.AdminMapper;
import cn.gp1.pojo.Admins;
import cn.gp1.service.AdminService;
@Service
@Transactional
public class AdminServiceImpl implements AdminService{
@Autowired
private AdminMapper adminMapper;
	@Override
	public Admins findByname(String name) {
		// TODO Auto-generated method stub
		return adminMapper.findByname(name);
	}
	@Override
	public boolean delete(Integer aid) {
		// TODO Auto-generated method stub
		return  this.adminMapper.delete(aid);
	}
	@Override
	public boolean update(Integer aid) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean add(Integer aid) {
		// TODO Auto-generated method stub
		return false;
	}

}
