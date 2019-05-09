package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Admin;

public interface AdminService {

	List<Admin> findAll();

	Admin findById(Integer id);

	void addAdmin(Admin admin);

	void adminupdata(Admin admin);

	void admindelete(Integer id);

	

	
}
