package com.tedu.pojo;

public class Zone {
	private Integer zoneId;
	private Integer uId;
	private String postIdList;
	private String messageBoard;
	private String friends;
	private String sign;
	public Zone() {
		super();
	}
	public Zone(Integer zoneId, Integer uId, String postIdList, String messageBoard, String friends, String sign) {
		super();
		this.zoneId = zoneId;
		this.uId = uId;
		this.postIdList = postIdList;
		this.messageBoard = messageBoard;
		this.friends = friends;
		this.sign = sign;
	}
	public Integer getZoneId() {
		return zoneId;
	}
	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getPostIdList() {
		return postIdList;
	}
	public void setPostIdList(String postIdList) {
		this.postIdList = postIdList;
	}
	public String getMessageBoard() {
		return messageBoard;
	}
	public void setMessageBoard(String messageBoard) {
		this.messageBoard = messageBoard;
	}
	public String getFriends() {
		return friends;
	}
	public void setFriends(String friends) {
		this.friends = friends;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		return "Zone [zoneId=" + zoneId + ", uId=" + uId + ", postIdList=" + postIdList + ", messageBoard="
				+ messageBoard + ", friends=" + friends + ", sign=" + sign + "]";
	}
	
}
