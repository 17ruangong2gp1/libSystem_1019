package cn.gp1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TestController2 {
	@RequestMapping("/delete")
	 @ResponseBody
	 public String delete(Integer id){
		
		return "success";
		 
	 }
}
