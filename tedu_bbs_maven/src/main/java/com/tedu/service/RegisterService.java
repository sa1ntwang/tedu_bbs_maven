package com.tedu.service;

import java.util.List;

import com.tedu.pojo.User;
import com.tedu.ucpaas.client.SendMessages;

public interface RegisterService {
	public List<User> findAll();
	//SendMessages.sendMessage(mobile);
}
