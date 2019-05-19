package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tedu.common.ov.JsonResult;
import com.tedu.common.ov.PageObject;
import com.tedu.common.ov.TeduNewsResult;
import com.tedu.pojo.Emp;
import com.tedu.pojo.StuNews;
import com.tedu.pojo.Suggestion;
import com.tedu.pojo.Tuition;
import com.tedu.service.TeduNewsService;

@Controller
@RequestMapping("/")
public class TeduNewsController {
	@Autowired
	private TeduNewsService teduNewsService;
	
	@RequestMapping("loadStuNewsTab")
	@ResponseBody
	public List loadStuNewsTab(Integer startIndex) {
		List<StuNews> stuNewsList = teduNewsService.findAGroupOfStuNews(startIndex);
		System.out.println(stuNewsList.size());
		return stuNewsList;
	}
	@RequestMapping("findStuNewsObjects")
	@ResponseBody
	public JsonResult findStuNewsObjects(Integer pageCurrent) {
		System.out.println("TeduNewsController.findStuNewsObjects()");
		PageObject<StuNews> pageObject = teduNewsService.findStuNewsObjects(pageCurrent);
		JsonResult jsonResult = new JsonResult(pageObject);
		return jsonResult;
	}
	
	/*=============================================================================================*/
	@RequestMapping("findEmpObjects")
	@ResponseBody
	public JsonResult findEmpObjects(Integer pageCurrent) {
		System.out.println("TeduNewsController.findEmpObjects()");
		PageObject<Emp> pageObject = teduNewsService.findEmpObjects(pageCurrent);
		JsonResult jsonResult = new JsonResult(pageObject);
		return jsonResult;
	}
	@RequestMapping("loadEmpTab")
	@ResponseBody
	public List loadEmpTab(Integer startIndex) {
		List<Emp> empList = teduNewsService.findAGroupOfEmp(startIndex);
		for (Emp emp : empList) {
			System.out.println(emp);
		}
		return empList;
	}
	
	
	
	/*=============================================================================================*/
	@RequestMapping("loadSuggestionTab")
	@ResponseBody
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public List loadSuggestionTab(Integer startIndex) {
		List<Suggestion> suggestionList = teduNewsService.findAGroupOfSuggestion(startIndex);
		for (Suggestion suggestion : suggestionList) {
			System.out.println(suggestion);
		}
		return suggestionList;
	}
	@RequestMapping("findSuggestionObjects")
	@ResponseBody
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public JsonResult findSuggestionObjects(Integer pageCurrent) {
		System.out.println("TeduNewsController.findSuggestionObjects()");
		PageObject<Suggestion> pageObject = teduNewsService.findSuggestionObjects(pageCurrent);
		JsonResult jsonResult = new JsonResult(pageObject);
		return jsonResult;
	}
	
	
	/*=============================================================================================*/
	@RequestMapping("loadTuitionTab")
	@ResponseBody
	public List loadTuitionTab(Integer startIndex) {
		List<Tuition> tuitionList = teduNewsService.findAGroupOfTuition(startIndex);
		return tuitionList;
	}
	@RequestMapping("findTuitionObjects")
	@ResponseBody
	public JsonResult findTuitionObjects(Integer pageCurrent) {
		System.out.println("TeduNewsController.findTuitionObjects()");
		PageObject<Tuition> pageObject = teduNewsService.findTuitionObjects(pageCurrent);
		JsonResult jsonResult = new JsonResult(pageObject);
		return jsonResult;
	}
	
}
