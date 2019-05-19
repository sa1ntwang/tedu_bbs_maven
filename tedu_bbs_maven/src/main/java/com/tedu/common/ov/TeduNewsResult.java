package com.tedu.common.ov;

import java.io.Serializable;
import java.util.List;

import com.tedu.pojo.Emp;
import com.tedu.pojo.StuNews;
import com.tedu.pojo.Suggestion;
import com.tedu.pojo.Tuition;

public class TeduNewsResult implements Serializable{
	private static final long serialVersionUID = 8262434312518089260L;
	private List<Emp> empList;
	private List<StuNews> stuNewsList;
	private List<Suggestion> suggestionList;
	private List<Tuition> tuitionList;
	public List<Emp> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
	public List<StuNews> getStuNewsList() {
		return stuNewsList;
	}
	public void setStuNewsList(List<StuNews> stuNewsList) {
		this.stuNewsList = stuNewsList;
	}
	public List<Suggestion> getSuggestionList() {
		return suggestionList;
	}
	public void setSuggestionList(List<Suggestion> suggestionList) {
		this.suggestionList = suggestionList;
	}
	public List<Tuition> getTuitionList() {
		return tuitionList;
	}
	public void setTuitionList(List<Tuition> tuitionList) {
		this.tuitionList = tuitionList;
	}
}
