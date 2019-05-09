package com.tedu.pojo;

import java.util.Date;

public class User {
	private Integer userId;
	private String userName;
	private String phone;
	private String password;
	private Integer userLock;
	private Integer userFreeze;
	private Date lastLogin;
	public User() {
		super();
	}
	public User(Integer userId, String userName, String phone, String password, Integer userLock, Integer userFreeze,
			Date lastLogin) {
		super();
		this.userId = userId;
		this.userName = userName;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", phone=" + phone + ", password=" + password
				+ ", userLock=" + userLock + ", userFreeze=" + userFreeze + ", lastLogin=" + lastLogin + "]";
	}
	
}
