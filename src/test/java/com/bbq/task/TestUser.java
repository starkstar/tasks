package com.bbq.task;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bbq.task.model.User;
import com.bbq.task.service.UserService;

@FixMethodOrder(MethodSorters.DEFAULT)
public class TestUser {
	
	private ApplicationContext ctx = null;
	private UserService userService = null;

	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		userService = ctx.getBean(UserService.class);	
	}
	
	

	@Test
	public void testUser(){
		User u = new User();
		u.setName("kakaxi3");
		Date date = new Date();
		u.setCreate_at(date.getTime());
		u.setUpdate_at(date.getTime());
		userService.addUser(u);
		System.out.println("新增用户成功");
	}

	
	@Test 	
	public void testUpdateUser(){
		User user = userService.getUserByName("kakaxi3");
		user.setName("fanqiexi3");
		userService.updateUser(user);
		System.out.println("编辑用户成功");
	}
	
	@Test
	public void testGetUserByName(){
		User user = userService.getUserByName("fanqiexi3");
		System.out.println("按照id获取用户成功：" + user);
	}
	
	@Test
	public void testGetAllUser(){
		List<User> users = userService.getAllUser();
		System.out.println("获取所有用户");
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testDelete(){
		User user = userService.getUserByName("fanqiexi3");
		userService.deleteUser(user.getId());
		System.out.println("删除用户成功");
	}
	
	


}
