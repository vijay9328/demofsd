package com.greatlearning.spring.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.greatlearning.spring.model.User;

@Aspect
public class LogginAspect {
	
	//- * - bydefault it will look for some methods which is having a parameter/arguments
	//- .. - it will look for both methods which may or maynot contain parameter/arguments
	@Before("savemethodJDBC()")
	public void dbStartedAdvice() {
		System.out.println("DB connection req started.");
	}
	
	@After("savemethodJDBC()")
	public void dbClosedAdvice() {
		System.out.println("DB connection req closed.");
	}
	
	@Pointcut("execution(* com.greatlearning.spring.dao.JdbcUserDaoImpl.save(*))")
	public void savemethodJDBC() {}
	
}
