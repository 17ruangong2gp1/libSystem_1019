package cn.gp1.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gp1.pojo.BorrowData;
import cn.gp1.service.BorrowService;

@Controller
public class BorrowController {
	
		@Resource
		private BorrowService borrowservice;
		
		@RequestMapping("/findBorrow")
		public String findBorrow(){
			return "borrowDataPage";
		}
		
		@RequestMapping("/findAllData")
		@ResponseBody
		public List findAllData(HttpServletRequest req){
			List <BorrowData> list=this.borrowservice.findAllData();
			try{
				req.getSession().setAttribute("list", list);
				return list;
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return null;
			
		}
}
