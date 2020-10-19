package cn.gp1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gp1.pojo.Users;
import cn.gp1.service.impl.FindServiceImpl;

@Controller
public class FindController {
 @Resource
 private FindServiceImpl findServiceImpl;
 @RequestMapping("/findUser")
 public String findAll(HttpServletRequest request, HttpSession session){
   List<Users> list=findServiceImpl.findAll();
   request.setAttribute("list",list );
   request.getSession().setAttribute("session", list);
	return "Users";
	 
 }
 @RequestMapping("/findBook")
 public String findBook(HttpServletRequest request,HttpSession session){
	 request.setAttribute("list", findServiceImpl.findBook());
	 request.getSession().setAttribute("session",findServiceImpl.findBook() );
	return "Books";
 }
 @RequestMapping("/delete")
 @ResponseBody
 public String delete(Integer id){
	
	return "success    ";
	 
 }
}
