package com.greatlearning.spring.service;

import java.util.Set;
import com.greatlearning.spring.model.User;

public interface UserService {
	
	void save(User user);
	
	Set<User> getAllUsers();
}
