package com.tedu.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	
	private static final long serialVersionUID = -661436307833635308L;
	private Integer userId;
	private String username;
	private String phone;
	private String password;
	private Integer userLock;
	private Integer userFreeze;
	private Date lastLogin;
	public User() {
		super();
	}
	
	public User(Integer userId, String username, String phone, String password, String salt, Integer userLock,
			Integer userFreeze, Date lastLogin) {
		super();
		this.userId = userId;
		this.username = username;
		this.phone = phone;
		this.password = password;
		
		this.userLock = userLock;
		this.userFreeze = userFreeze;
		this.lastLogin = lastLogin;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getUserLock() {
		return userLock;
	}

	public void setUserLock(Integer userLock) {
		this.userLock = userLock;
	}

	public Integer getUserFreeze() {
		return userFreeze;
	}

	public void setUserFreeze(Integer userFreeze) {
		this.userFreeze = userFreeze;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
