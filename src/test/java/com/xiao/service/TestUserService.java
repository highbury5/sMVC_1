package com.xiao.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"/applicationContext.xml"})
@ContextConfiguration({"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class TestUserService {

	@Autowired
	private UserService userService;
	
	@Test
	public void hasMatchUser(){
		boolean b1 = userService.hasMatchUser("xiao", "123");
		assertTrue(b1);
	}
}
