package com.example.todolist2.repositoryimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.todolist2.dto.UserDTO;
import com.example.todolist2.mapper.UserMapper;
import com.example.todolist2.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	UserMapper mapper;
	
	public int signup(UserDTO user) {
		
		int signupResult = mapper.signup(user);
		
		
		return signupResult;
	}
	
	public UserDTO login(UserDTO user) {
		
		UserDTO loginResult = mapper.login(user);
		
		
		return loginResult;
	}
}
