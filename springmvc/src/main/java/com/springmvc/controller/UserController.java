package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.User;
import com.springmvc.model.vo.LoginVO;
import com.springmvc.service.UserService;


@Controller
//@RequestMapping("/login.do") 
public class UserController {  
	@Autowired 
	private UserService userService;
	   
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String index(Model model) {
		System.out.println("¹þ¹þ¹þ¹þ¹þ¹þ");
		model.addAttribute("msg", "springmvc helloworldÀý×ÓÑÝÊ¾³É¹¦À²...");
		return "index";   
	}
     
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,LoginVO loginvo) {
		System.out.println("login.do -----.........");
		
		System.out.println("name £º "+loginvo.getName());
		boolean isValidUser = userService.validateUser(loginvo.getName(),loginvo.getPassword());
		if(!isValidUser){
			return new ModelAndView("login","error","ÓÃ»§Ãû»òÃÜÂë´íÎó¡£");
		}else{
			User user = new User();
			user.setUserName(request.getLocalAddr());
			user.setUserId(1);
		//	userService.loginSuccess(user);
			request.getSession().setAttribute("user", user);
			return new ModelAndView("main");
		}
		 
	}

	@RequestMapping(value = "/findUserList.do" ,params = "method=helloworld", method = RequestMethod.GET)
	public String helloworld(Model model) {
		System.out.println("ºÙºÙºÙºÙºÇºÇ5551155");
		model.addAttribute("msg", "springmvc helloworldÀý×ÓÑÝÊ¾³É¹¦À²...");
		User user = new User();
		user.setUserName("wesley");
		user.setUserId(1);
		userService.insertUser(user);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA");
		return "helloworld";
	}
     
}
