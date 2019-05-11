package com.tedu.service;

import java.util.List;

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
	
	
	public int createSuggestion(Suggestion suggestion);
	public int deleteSuggestionById(Integer id);
	public int updateSuggestionById(Suggestion suggestion);
	public Suggestion findSuggestionById(Integer id);
	public List<Suggestion> findAllSuggestion();
	
	
	
	public int createEmp(Emp emp);
	public int deleteEmpById(Integer id);
	public int updateEmpById(Emp emp);
	public Emp findEmpById(Integer id);
	public List<Emp> findAllEmp();
	
	
	
	public int createTuition(Tuition tuition);
	public int deleteTuitionById(Integer id);
	public int updateTuitionById(Tuition tuition);
	public Tuition findTuitionById(Integer id);
	public List<Tuition> findAllTuition();
	
}
