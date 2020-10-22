package cn.gp1.controller;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gp1.pojo.Admins;
import cn.gp1.service.AdminService;

@Controller
public class AdminController {
@Resource
	private AdminService adminService;
@RequestMapping("/admin")
  public String Admin(){
	return "AdminLogin";
	 
 }
 @RequestMapping("/AdminL")
 public String AdminLogin(String name,String password,HttpServletRequest request){
	  Admins admin=adminService.findByname(name);
	 if(admin!=null){
		 if(admin.getApwd().equals(password)){
			 return "redirect:findUser";
		 } 
	 }
		 return "AdminLogin";	 
 }
 //删除
 @RequestMapping("/Adelete")
 public String Adelete(Integer aid){
	 System.out.println(aid);
	 if(adminService.delete(aid)){
		 return "redirect:findUser";
	 }
	 return "AdminLogin";
	 
 }
 /*//修改
 @RequestMapping("/Aupdate")
 public String Aupdate(Integer aid){
	return null;
	 
 }
 //添加
 @RequestMapping("/Aadd")
 public String Aadd(Integer aid){
	return null;
	 
 }*/
}
