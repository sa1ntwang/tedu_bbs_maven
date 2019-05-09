package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.pojo.Admin;
import com.tedu.service.AdminService;


@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	@RequestMapping("/findAll")
	public String findAll(Model model){
		List<Admin> list=adminService.findAll();
		System.out.println(list);
		return "admin";
	}
	@RequestMapping("/findById")
	public String findById(Integer id, Model model){
		Admin admin=adminService.findById(id);
		System.out.println(admin);
		return "admin";
	}
	@RequestMapping("/addAdmin")
	public String addAdmin(Admin admin){
		adminService.addAdmin(admin);
		return "admin";
	}
	@RequestMapping("/adminupdata")
	public String adminupdata(Admin admin){
		adminService.adminupdata(admin);
		return "admin";
	}
	@RequestMapping("/admindelete")
	public String admindelete(Integer id){
		adminService.admindelete(id);
		return "admin";
	}
}
