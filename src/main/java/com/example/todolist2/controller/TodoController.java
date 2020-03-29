package com.example.todolist2.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.todolist2.dto.TodoDTO;
import com.example.todolist2.service.TodoService;

@RequestMapping("/todo")
@Controller
public class TodoController {

	@Autowired
	TodoService service;
	 
	@GetMapping("/search")
	public ModelAndView todoSearch(ModelAndView mv, HttpSession session) {
		
		String user_id = (String)session.getAttribute("userId");
		
		ArrayList<TodoDTO> searchResult = service.todoSearch(user_id);
		
		mv.addObject("todolist", searchResult);
		mv.setViewName("todo");
		
		return mv;
	}
	
	
}
