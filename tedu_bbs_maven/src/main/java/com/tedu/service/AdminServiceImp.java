package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.AdminMapper;
import com.tedu.pojo.Admin;
@Service
public class AdminServiceImp implements AdminService{
	@Autowired
	private AdminMapper dao;

	@Override
	public List<Admin> findAll() {
		List<Admin> list=dao.findAll();
		return list;
	}

	@Override
	public Admin findById(Integer id) {
		Admin admin=dao.findById(id);
		return admin;
	}

	@Override
	public void addAdmin(Admin admin) {
		dao.addAdmin(admin);
		
	}

	@Override
	public void adminupdata(Admin admin) {
		dao.adminupdata(admin);
		
	}

	@Override
	public void admindelete(Integer id) {
		dao.admindelete(id);
		
	}

	
		
	


}
