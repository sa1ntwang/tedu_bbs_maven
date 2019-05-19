package com.tedu.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 	对应达内新闻板块的学费优惠
 */
public class Tuition {
	Integer id;
	String course;
	Double costs;
	Integer discounting;
	String content;
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	Date start;
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	Date end;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Double getCosts() {
		return costs;
	}
	public void setCosts(Double costs) {
		this.costs = costs;
	}
	public Integer getDiscounting() {
		return discounting;
	}
	public void setDiscounting(Integer discounting) {
		this.discounting = discounting;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
}
