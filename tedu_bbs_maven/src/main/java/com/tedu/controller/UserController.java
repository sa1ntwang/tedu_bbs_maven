package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/userList")
	public String userList() {
		List<User> list = userService.findAll();
		for(User u:list) {
			System.out.println(u);
		}
		return "register";
	}
}
