package com.example.todolist2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.todolist2.dto.UserDTO;
import com.example.todolist2.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping(value ="/login" , method=RequestMethod.GET)
	public ModelAndView loginPage(ModelAndView mv) {
		
		mv.setViewName("login");
		
		return mv;
	}
	
	@PostMapping("/login")
	public ModelAndView doLogin(ModelAndView mv, UserDTO user, HttpSession session) {
		
		UserDTO loginResult = service.login(user);
		
		if(loginResult == null) {
			
			String errorMsg = "로그인 실패";
			mv.addObject("errorMsg", errorMsg);
			mv.setViewName("login");
		
		}else {
			session.setAttribute("userId", loginResult.getId());
			mv.setViewName("index");
		}
		
		
		
		return mv;
		
	}
	
	@GetMapping("/signup")
	public ModelAndView signupPage(ModelAndView mv) {

		mv.setViewName("signup");

		return mv;
	}

	@PostMapping("/signup")
	public ModelAndView doSignup(ModelAndView mv, UserDTO user) {
		boolean signupResult = service.signup(user);

		if (signupResult) {
			
			String successMsg = "가입이 잘 되었습니다.";
			mv.addObject("successMsg", successMsg);
		} else {

			String errorMsg = "가입이 실패하였습니다";
			mv.addObject("errorMsg", errorMsg);
		}
		mv.setViewName("index");

		return mv;
	}

}
