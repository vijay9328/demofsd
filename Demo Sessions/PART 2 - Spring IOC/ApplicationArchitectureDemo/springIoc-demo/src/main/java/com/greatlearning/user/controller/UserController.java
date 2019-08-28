package com.greatlearning.user.controller;

import com.greatlearning.user.model.User;
import com.greatlearning.user.service.UserService;

public class UserController {
	
	private UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}

	public void save(User user) {
		this.service.save(user);
	}
	
	public User getUser() {
		return null;
	}
}
