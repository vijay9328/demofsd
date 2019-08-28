package com.greatlearning.spring.dao;

import java.util.Set;


import com.greatlearning.spring.model.User;

public interface UserDao {
	
	void save(User user);
	
	void save();
	
	Set<User> getAllUsers(); 
}
