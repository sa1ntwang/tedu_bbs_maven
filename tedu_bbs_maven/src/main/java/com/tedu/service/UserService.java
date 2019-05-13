package com.tedu.service;

import java.util.List;

import com.tedu.common.ov.JsonResult;
import com.tedu.pojo.User;

public interface UserService {
	public User findByUserName(String username,String password) throws Exception;

	

	public JsonResult addUser(String username, String password, String phone) throws Exception;



	public User findByuserPhone(String phone);



	public User findByUser(String username);
	
	/**---------------------------贺昌-------------------------------------------*/
	public User findByPhone(String phone);

		public void updateByPhone(String phone, String password);



		public void checkPasswordformat(String password);



		

}
