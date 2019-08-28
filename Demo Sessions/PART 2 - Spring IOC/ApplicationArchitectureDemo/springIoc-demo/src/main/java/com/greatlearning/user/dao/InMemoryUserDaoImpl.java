package com.greatlearning.user.dao;

import java.util.HashSet;
import java.util.Set;

import com.greatlearning.user.model.User;

public class InMemoryUserDaoImpl implements UserDao {

	private Set<User> users = new HashSet<User>();
	
	public void save(User user) {
		users.add(user);
		System.out.println("***** InMemory: User is saved ****" + user);
	}
}
