package com.example.todolist2.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist2.dto.TodoDTO;
import com.example.todolist2.repository.TodoRepository;
import com.example.todolist2.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	TodoRepository repository;
	
	
	public ArrayList<TodoDTO> todoSearch(String user_id) {
		
		
		ArrayList<TodoDTO> searchResult = repository.todoSearch(user_id);
		
		return searchResult;
	}
}
