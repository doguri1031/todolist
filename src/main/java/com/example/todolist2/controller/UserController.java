package com.example.todolist2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.todolist2.dto.UserDTO;
import com.example.todolist2.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;

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
