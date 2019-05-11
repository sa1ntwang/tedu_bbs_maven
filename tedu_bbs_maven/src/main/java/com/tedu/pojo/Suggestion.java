package com.tedu.pojo;

import java.util.Date;

public class Suggestion {
	Integer id;
	Integer uId;
	Integer eId;
	String topic;
	String context;
	Integer type;//0,投诉 1,建议
	Date sTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUId() {
		return uId;
	}
	public void setUId(Integer uId) {
		this.uId = uId;
	}
	public Integer getEId() {
		return eId;
	}
	public void setEId(Integer eId) {
		this.eId = eId;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getsTime() {
		return sTime;
	}
	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}
}
