package com.bbq.task.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.bbq.task.model.User;

@Repository
public interface UserMapper {

	@Insert("insert into task1 (name, create_at, update_at) values("
			+ " #{name}, #{create_at}, #{update_at})"
			)
	public void Insert(User user);
	

	@Select("select id, name, create_at, update_at from task1 where name = #{name}")
	public User getUserByName(String name);
	
	
	public void updateUser(User user);
	

	@Delete("delete from task1 where id=#{id}")
	public void delete(Integer id);
	
	
	@Select("select id, name, create_at, update_at from task1")
	@ResultType(value=User.class)
	public List<User> getAllUser(); 
}
