package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 	主页跳转
 * 	板块跳转
 */

@Controller
public class PageController {
	/** 是一个跳转。。用于打开首页 */
	@RequestMapping("/zhuce")
	public String retister(){

	return "register";
	}
	@RequestMapping("/denglu")
	public String login(){

	return "login";
	}
	@RequestMapping("/theme")
	public String theme(){

	return "theme";
	}
	@RequestMapping("/personal_zone")
	public String personal_zone(){

	return "personal_zone";
	}
	@RequestMapping("/{page}")
	public String page(@PathVariable String page) {
		return page;
	}
}
