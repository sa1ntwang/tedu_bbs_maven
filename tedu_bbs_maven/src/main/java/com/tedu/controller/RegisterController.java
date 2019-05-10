package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.service.RegisterService;
import com.tedu.ucpaas.client.SendMessages;

/**
 * 	注册页面跳转
 * 	注册页面
 *	登录页面
 *	"还有没账号,立即注册"
 */

@Controller
public class RegisterController {
	
	@Autowired
	RegisterService service;
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	@RequestMapping("/VerifyCode")
	@ResponseBody
	public String sendMessage(String phone) {
		String mobile = String.valueOf(phone);
		System.out.println("手机号:"+mobile);
		//前端ajax请求的数据名:result
		String result = SendMessages.sendMessage(mobile);
		return result;
	}
}
