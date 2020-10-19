package cn.gp1.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gp1.pojo.Users;
import cn.gp1.service.UpdateService;

@Controller
public class UpdateController {
	
		@Resource 
		private UpdateService uservice;
		
		@RequestMapping("/edituser")
		public String updatePage(){
			return "editUser";
		}
		
		@RequestMapping
		@ResponseBody
		public String updateUser(Users u){
			uservice.UpdateUser(u);
			return "更新成功";
		}
}
