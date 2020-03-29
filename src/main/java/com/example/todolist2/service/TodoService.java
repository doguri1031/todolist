package com.example.todolist2.service;

import java.util.ArrayList;

import com.example.todolist2.dto.TodoDTO;

public interface TodoService {

	public ArrayList<TodoDTO> todoSearch(String user_id);
	
}
