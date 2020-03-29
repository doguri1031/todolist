package com.example.todolist2.repository;

import java.util.ArrayList;

import com.example.todolist2.dto.TodoDTO;

public interface TodoRepository {

	public ArrayList<TodoDTO> todoSearch(String user_id);
	
}
