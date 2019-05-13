package com.tedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tedu.pojo.User;

public interface UserMapper {
	public List<User> findAll();
	public User findByUserName(
			@Param("username")String username);
	public void updateTime(String username);
	public void addUser(
			@Param("username")String username, 
			@Param("password")String password, 
			@Param("phone")String phone);
	public User findByPhone(@Param("phone")String phone);
	
	public User findByUser(@Param("username")String username);
	
	/*----------------------------------------------*/
		
		
		
		public void updateByPhone(
				@Param("phone")String phone, 
				@Param("password")String password);
		


	
	
}
