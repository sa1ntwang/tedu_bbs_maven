package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.TeduNewsMapper;
import com.tedu.pojo.Emp;
import com.tedu.pojo.StuNews;
import com.tedu.pojo.Suggestion;
import com.tedu.pojo.Tuition;

@Service
public class TeduNewsServiceImpl implements TeduNewsService {
	@Autowired 
	private TeduNewsMapper teduNewsMapper;

	@Override
	public int createStuNews(StuNews stuNews) {
		int rows = teduNewsMapper.createStuNews(stuNews);
		return rows;
	}

	@Override
	public int deleteStuNewsById(Integer id) {
		int rows = teduNewsMapper.deleteStuNewsById(id);
		return rows;
	}

	@Override
	public int updateStuNewsById(StuNews stuNews) {
		int rows = teduNewsMapper.updateStuNewsById(stuNews);
		return rows;
	}

	@Override
	public StuNews findStuNewsById(Integer id) {
		StuNews stuNews = teduNewsMapper.findStuNewsById(id);
		return stuNews;
	}

	@Override
	public List<StuNews> findAllStuNews() {
		List<StuNews> list = teduNewsMapper.findAllStuNews();
		return list;
	}

	@Override
	public int createSuggestion(Suggestion suggestion) {
		int rows = teduNewsMapper.createSuggestion(suggestion);
		return rows;
	}

	@Override
	public int deleteSuggestionById(Integer id) {
		int rows = teduNewsMapper.deleteSuggestionById(id);
		return rows;
	}

	@Override
	public int updateSuggestionById(Suggestion suggestion) {
		int rows = teduNewsMapper.updateSuggestionById(suggestion);
		return rows;
	}

	@Override
	public Suggestion findSuggestionById(Integer id) {
		Suggestion suggestion = teduNewsMapper.findSuggestionById(id);
		return suggestion;
	}

	@Override
	public List<Suggestion> findAllSuggestion() {
		List<Suggestion> list = teduNewsMapper.findAllSuggestion();
		return list;
	}

	@Override
	public int createEmp(Emp emp) {
		int rows = teduNewsMapper.createEmp(emp);
		return rows;
	}

	@Override
	public int deleteEmpById(Integer id) {
		int rows = teduNewsMapper.deleteEmpById(id);
		return rows;
	}

	@Override
	public int updateEmpById(Emp emp) {
		int rows = teduNewsMapper.updateEmpById(emp);
		return rows;
	}

	@Override
	public Emp findEmpById(Integer id) {
		Emp emp = teduNewsMapper.findEmpById(id);
		return emp;
	}

	@Override
	public List<Emp> findAllEmp() {
		List<Emp> list = teduNewsMapper.findAllEmp();
		return list;
	}

	@Override
	public int createTuition(Tuition tuition) {
		int rows = teduNewsMapper.createTuition(tuition);
		return rows;
	}

	@Override
	public int deleteTuitionById(Integer id) {
		int rows = teduNewsMapper.deleteTuitionById(id);
		return rows;
	}

	@Override
	public int updateTuitionById(Tuition tuition) {
		int rows = teduNewsMapper.updateTuitionById(tuition);
		return rows;
	}

	@Override
	public Tuition findTuitionById(Integer id) {
		Tuition tuition = teduNewsMapper.findTuitionById(id);
		return tuition;
	}

	@Override
	public List<Tuition> findAllTuition() {
		List<Tuition> list = teduNewsMapper.findAllTuition();
		return list;
	}
	
}
