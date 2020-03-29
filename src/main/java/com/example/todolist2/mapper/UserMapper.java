package com.example.todolist2.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.todolist2.dto.UserDTO;

@Mapper
public interface UserMapper {

	public int signup(UserDTO user);
	
}
