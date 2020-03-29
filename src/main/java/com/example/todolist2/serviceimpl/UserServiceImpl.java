package com.example.todolist2.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist2.dto.UserDTO;
import com.example.todolist2.repository.UserRepository;
import com.example.todolist2.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;
	
	public boolean signup(UserDTO user) {
		
		int signupResult = repository.signup(user);
		
		if(signupResult == 0) {
			
			return false;
		}
		
		return true;
	}
	
	
}
