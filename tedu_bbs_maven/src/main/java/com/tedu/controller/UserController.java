package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.common.ov.JsonResult;
import com.tedu.md5.MD5;
import com.tedu.pojo.User;
import com.tedu.service.UserService;

/**
 * 	个人中心
 *
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/findByUserName")
	@ResponseBody
	public JsonResult findByUserName(String username,String password) throws Exception{
		
		
		User user= userService.findByUserName(username, password);
		System.out.println(user);
		
		return new JsonResult(user);
	}
	@RequestMapping("findByuserPhone")
	@ResponseBody
	public JsonResult findByuserPhone(String phone){
		return new JsonResult(userService.findByuserPhone(phone));
		
	}
	@RequestMapping("findByUser")
	@ResponseBody
	public JsonResult findByUser(String username){
		return new JsonResult(userService.findByUser(username));
		
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public JsonResult addUser(String username,
								String password,
									String phone){
			try {
				userService.addUser(username,password,phone);
			} catch (Exception e) {
				return new JsonResult(e);
			}
		
		return new JsonResult("创建成功");
	}
	
	@RequestMapping("doLogListUI")
	public String doLogListUI(){
		return "theme";
		
	}
	/*	------------------------------------------------------------------------------------*/
	                         /* 贺昌*/
	@RequestMapping("findByPhone")
	@ResponseBody
	public JsonResult findByPhone(String phone){
		return new JsonResult(userService.findByPhone(phone));
		
	}
		@ResponseBody
		@RequestMapping("updateByPhone")
		public  JsonResult updateByPhone(String phone,String password){
			userService.updateByPhone(phone,password);
			System.out.println(1);
			
			return new JsonResult("密码重置成功!");
		}
		@ResponseBody
		@RequestMapping("checkPasswordformat")
		public  JsonResult checkPasswordformat(String password) {
			userService.checkPasswordformat(password);
			return new JsonResult("密码格式正确");
		}
		

}
