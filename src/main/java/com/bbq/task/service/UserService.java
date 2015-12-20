package com.bbq.task.service;

import java.util.List;

import com.bbq.task.model.User;

public interface UserService {
	
	/**
	 * 增加用户
	 */
	void addUser(User user);
	
	/**
	 * 修改用户
	 */
	void updateUser(User user);
	/**
	 * 删除用户
	 */
	void deleteUser(Integer id);
	/**
	 * 查询用户根据name
	 */
	User getUserByName(String name);
	
	/**
	 * 查询所有的用户
	 */
	
	List<User> getAllUser(); 
}
