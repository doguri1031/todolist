package com.example.todolist2.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.todolist2.dto.TodoDTO;

@Mapper
public interface TodoMapper {

	public ArrayList<TodoDTO> todoSearch(String user_id);
	
}
