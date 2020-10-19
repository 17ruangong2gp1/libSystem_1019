package cn.gp1.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gp1.pojo.Users;
import cn.gp1.service.RegistService;

@Controller
public class RegistController {
		
	@Resource
	private RegistService rservice;
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(Users u){
	
	
    Users u1=this.rservice.addUser(u);
		if (u1!=null) {
			return "success";
		}
		
		return "fail";
	}
	@RequestMapping("/reg")
	public String add(){
		return "regPage";
		
	}
	
	@RequestMapping("/index")
	public String tomainpage(){
		return "mainPage";
	}
}
