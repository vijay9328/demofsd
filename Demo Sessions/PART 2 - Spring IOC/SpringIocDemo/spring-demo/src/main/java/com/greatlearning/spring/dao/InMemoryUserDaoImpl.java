package com.greatlearning.spring.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.greatlearning.spring.model.User;

//@Component("daoInmemory")
public class InMemoryUserDaoImpl implements UserDao {
	
	Set<User> users = new HashSet<User>();
	
	@Override
	public void save(User user) {
		System.out.println("****** InMemoryUserDaoImpl: Save() *********");
		users.add(user);
		System.out.println("**** User: " + user + "***** User is stored in InMemory");
	}
	
	@Override
	public Set<User> getAllUsers() {
		System.out.println("****** InMemoryUserDaoImpl: getAllUsers() *********");
		return users;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
	}
}
