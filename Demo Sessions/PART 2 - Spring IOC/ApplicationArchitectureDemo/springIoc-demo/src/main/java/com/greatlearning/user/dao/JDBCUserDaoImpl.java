package com.greatlearning.user.dao;

import com.greatlearning.user.model.User;

public class JDBCUserDaoImpl implements UserDao {

	public void save(User user) {
		System.out.println("jdbc implementation");
		System.out.println("***** JDBC: User is saved ****" + user);
	}
	
}
