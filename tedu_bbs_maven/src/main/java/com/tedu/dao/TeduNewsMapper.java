package com.tedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tedu.pojo.Emp;
import com.tedu.pojo.StuNews;
import com.tedu.pojo.Suggestion;
import com.tedu.pojo.Tuition;

public interface TeduNewsMapper {
	public int createStuNews(StuNews stuNews);
	public int deleteStuNewsById(Integer id);
	public int updateStuNewsById(StuNews stuNews);
	public StuNews findStuNewsById(Integer id);
	public List<StuNews> findAllStuNews();
	public List<StuNews> findAGroupOfStuNews(Integer startIndex);
	public List<StuNews> findStuNewsObjects( @Param("startIndex")Integer startIndex,  @Param("pageSize")Integer pageSize);
	public int getStuNewsRowCount();
	
	
	public int createSuggestion(Suggestion suggestion);
	public int deleteSuggestionById(Integer id);
	public int updateSuggestionById(Suggestion suggestion);
	public Suggestion findSuggestionById(Integer id);
	public List<Suggestion> findAllSuggestion();
	public List<Suggestion> findAGroupOfSuggestion(Integer startIndex);
	public List<Suggestion> findSuggestionObjects(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize);
	public int getSuggestionRowCount();
	
	
	
	public int createEmp(Emp emp);
	public int deleteEmpById(Integer id);
	public int updateEmpById(Emp emp);
	public Emp findEmpById(Integer id);
	public List<Emp> findAllEmp();
	public List<Emp> findAGroupOfEmp(Integer startIndex);
	public List<Emp> findEmpObjects(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize);
	public int getEmpRowCount();
	
	
	
	public int createTuition(Tuition tuition);
	public int deleteTuitionById(Integer id);
	public int updateTuitionById(Tuition tuition);
	public Tuition findTuitionById(Integer id);
	public List<Tuition> findAllTuition();
	public List<Tuition> findAGroupOfTuition(Integer startIndex);
	public List<Tuition> findTuitionObjects(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize);
	public int getTuitionRowCount();
	
}
