package com.bbq.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbq.task.exception.UserHasRegistException;
import com.bbq.task.model.User;
import com.bbq.task.mybatis.UserMapper;
import com.bbq.task.service.UserService;

@Service
public class UserServieImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	public void addUser(User user) {
		User u = userMapper.getUserByName(user.getName());
		if (u != null){
			throw new UserHasRegistException("用户已经注册");
		} 
		userMapper.Insert(user);
	}

	public User getUserByName(String name) {
		User user = userMapper.getUserByName(name);
		return user;
	}

	/**
	 * 更新用户信息
	 */
	public void updateUser(User user) {
		userMapper.updateUser(user);
		
	}
	
	/**
	 * 获取所有的用户信息
	 */
	
	public List<User> getAllUser(){
		List<User> allUser = userMapper.getAllUser();
		return allUser;
	}

	public void deleteUser(Integer id) {
		userMapper.delete(id);
		
	}
}