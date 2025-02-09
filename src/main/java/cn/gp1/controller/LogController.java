package cn.gp1.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gp1.pojo.Users;
import cn.gp1.service.LoginService;

@Controller
public class LogController {

	@Resource
	private LoginService lservice;

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/dologin")
	public String dologin(String id, String pwd, HttpServletRequest req) {

		Users u = this.lservice.findUserByName(id);
		System.out.println(u);
		if (u != null) {

			String upwd = u.getUpwd();
			if (upwd.equals(pwd)) {

				req.getSession().setAttribute("user", u);
				return "redirect:findBook";
			}
		}
		return "redirect:login";
	}

	@RequestMapping("/main")
	public String mainPage() {
		return "mainPage";
	}
}
