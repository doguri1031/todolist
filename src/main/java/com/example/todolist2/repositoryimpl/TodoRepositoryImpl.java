package com.example.todolist2.repositoryimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.todolist2.dto.TodoDTO;
import com.example.todolist2.mapper.TodoMapper;
import com.example.todolist2.repository.TodoRepository;

@Repository
public class TodoRepositoryImpl implements TodoRepository{

	@Autowired
	TodoMapper mapper;
	
	public ArrayList<TodoDTO> todoSearch(String user_id) {
		
		ArrayList<TodoDTO> searchResult= mapper.todoSearch(user_id);
		
		return searchResult;
	}
	
}
