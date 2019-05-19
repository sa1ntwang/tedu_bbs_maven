package com.tedu.service;

import java.util.List;

import com.tedu.common.ov.PageObject;
import com.tedu.pojo.Emp;
import com.tedu.pojo.StuNews;
import com.tedu.pojo.Suggestion;
import com.tedu.pojo.Tuition;

public interface TeduNewsService {
	public int createStuNews(StuNews stuNews);
	public int deleteStuNewsById(Integer id);
	public int updateStuNewsById(StuNews stuNews);
	public StuNews findStuNewsById(Integer id);
	public List<StuNews> findAllStuNews();
	public List<StuNews> findAGroupOfStuNews(Integer startIndex);
	public PageObject<StuNews> findStuNewsObjects(Integer pageCurrent);
	
	
	public int createSuggestion(Suggestion suggestion);
	public int deleteSuggestionById(Integer id);
	public int updateSuggestionById(Suggestion suggestion);
	public Suggestion findSuggestionById(Integer id);
	public List<Suggestion> findAllSuggestion();
	public List<Suggestion> findAGroupOfSuggestion(Integer startIndex);
	public PageObject<Suggestion> findSuggestionObjects(Integer pageCurrent);
	
	
	
	public int createEmp(Emp emp);
	public int deleteEmpById(Integer id);
	public int updateEmpById(Emp emp);
	public Emp findEmpById(Integer id);
	public List<Emp> findAllEmp();
	public List<Emp> findAGroupOfEmp(Integer startIndex);
	public PageObject<Emp> findEmpObjects(Integer pageCurrent);
	
	
	
	public int createTuition(Tuition tuition);
	public int deleteTuitionById(Integer id);
	public int updateTuitionById(Tuition tuition);
	public Tuition findTuitionById(Integer id);
	public List<Tuition> findAllTuition();
	public List<Tuition> findAGroupOfTuition(Integer startIndex);
	public PageObject<Tuition> findTuitionObjects(Integer pageCurrent);
	
}
