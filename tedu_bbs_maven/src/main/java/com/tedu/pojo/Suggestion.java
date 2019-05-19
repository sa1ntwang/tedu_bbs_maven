package com.tedu.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Suggestion {
	private Integer id;
	private Integer uId;
	private Integer eId;
	private String topic;
	private String context;
	private Integer type;//0,投诉 1,建议
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date sTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public Date getsTime() {
		return this.sTime;
	}
	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}
	@Override
	public String toString() {
		return "Suggestion [id=" + id + ", uId=" + uId + ", eId=" + eId + ", topic=" + topic + ", context=" + context
				+ ", type=" + type + ", sTime=" + sTime + "]";
	}
	
}
