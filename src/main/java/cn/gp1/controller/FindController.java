package cn.gp1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gp1.pojo.Books;
import cn.gp1.pojo.BorrowData;
import cn.gp1.pojo.Users;
import cn.gp1.service.BorrowService;
import cn.gp1.service.FindService;
import cn.gp1.service.LoginService;
import cn.gp1.service.impl.FindServiceImpl;

@Controller
public class FindController {
	@Resource
	private FindService findService;
	
	@Resource
	private BorrowService bservice;
	
	@RequestMapping("/findUser")
	public String findAll(HttpServletRequest request, HttpSession session) {
		List<Users> list = findService.findAll();
		request.setAttribute("list", list);
		request.getSession().setAttribute("session", list);
		return "Users";

	}

	@RequestMapping("/findBook")
	public String findBook(HttpServletRequest request, HttpSession session) {
		List<Books> list=findService.findBook();
	
		request.setAttribute("list",list);
		request.getSession().setAttribute("session", list);
		return "Books";
	}

	@RequestMapping("/delete")
	public String delete(Integer bid, HttpSession ss) {
		Users u = (Users) ss.getAttribute("user");
		if (!u.getState()){
			findService.updateBook(bid);
			u.setState(true);
			findService.save(u);
			BorrowData bd= new BorrowData(new Date(),u,this.findService.findBookById(bid));
			bservice.saveBook(bd);
			System.out.println(bd);
			return "redirect:/findBook";
		} 
			
			return "redirect:/findAllData";
		

	}

}
