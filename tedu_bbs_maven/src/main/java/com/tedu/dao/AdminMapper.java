package com.tedu.dao;

import java.util.List;

import com.tedu.pojo.Admin;

public interface AdminMapper {
	List<Admin> findAll();

	Admin findById(Integer id);

	void addAdmin(Admin admin);

	void adminupdata(Admin admin);

	void admindelete(Integer id);

	

	

}
