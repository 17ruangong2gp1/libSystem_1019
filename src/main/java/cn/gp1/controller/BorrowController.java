package cn.gp1.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.gp1.pojo.BorrowData;
import cn.gp1.service.BorrowService;

@Controller
public class BorrowController {
	
		@Resource
		private BorrowService borrowservice;
		
		@RequestMapping("/findBorrow")
		public String findBorrow(){
			System.out.println("是否调用");
			//return "borrowDataPage";
			return "mainPage";
		}
		
		@RequestMapping("/getData")
		@ResponseBody
		public JSONObject getData(){
			return this.borrowservice.getDataList(1, 5);
		}
		
		
		@RequestMapping(value="/findAllData",method=RequestMethod.GET)
		@ResponseBody
		public JSONObject findAllData(@RequestParam(value="pageNum",required=false,defaultValue="1") int pageNum,@RequestParam(value="pageSize",required=false,defaultValue="10")int pageSize){
			return this.borrowservice.getDataList(pageNum, pageSize);
		}
}
