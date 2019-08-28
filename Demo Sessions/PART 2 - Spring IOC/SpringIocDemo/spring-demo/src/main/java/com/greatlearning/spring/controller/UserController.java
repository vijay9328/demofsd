package com.greatlearning.spring.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.spring.model.User;
import com.greatlearning.spring.service.SecondaryUserServiceImpl;
import com.greatlearning.spring.service.UserService;

@Component("controller")
public class UserController {
	@Autowired
	private UserService service;
	
	public void saveUser(User user) {
		this.service.save(user);
	}
	
	public Set<User> getAllUsers() {
		return this.service.getAllUsers();
	}
}
