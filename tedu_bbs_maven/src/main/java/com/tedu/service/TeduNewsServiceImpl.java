package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.TeduNewsMapper;
import com.tedu.pojo.Emp;
import com.tedu.pojo.StuNews;
import com.tedu.pojo.Suggestion;
import com.tedu.pojo.Tuition;
import com.tedu.common.ServiceException;
import com.tedu.common.ov.PageObject;;

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
	public List<StuNews> findAGroupOfStuNews(Integer startIndex) {
		List<StuNews> list = teduNewsMapper.findAGroupOfStuNews(startIndex);
		return list;
	}
	@Override
	public PageObject<StuNews> findStuNewsObjects(Integer pageCurrent) {
		//1.判定pageCurrent参数合法性
		if(pageCurrent==null||pageCurrent<1) 
		throw new IllegalArgumentException("当前页码值不正确");
		//2.查询日志总记录数,并进行判定
		int rowCount=teduNewsMapper.getStuNewsRowCount();
		if(rowCount==0)
		throw new ServiceException("没有找到对应记录");
		//3.查询当前页日志记录
		int pageSize=10;
		int startIndex=(pageCurrent-1)*pageSize;
		List<StuNews> records=
				teduNewsMapper.findStuNewsObjects(startIndex, pageSize);
		//4.对查询结果进行封装并返回
		PageObject<StuNews> po=new PageObject<>();
		po.setRowCount(rowCount);
		po.setRecords(records);
		po.setPageCurrent(pageCurrent);
		po.setPageSize(pageSize);
		/*int pageCount=rowCount/pageSize;
		if(rowCount%pageSize!=0) {
			pageCount++;
		}*/
		int pageCount=(rowCount-1)/pageSize+1;
		po.setPageCount(pageCount);
		return po;
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
	public List<Suggestion> findAGroupOfSuggestion(Integer startIndex) {
		List<Suggestion> list = teduNewsMapper.findAGroupOfSuggestion(startIndex);
		return list;
	}
	@Override
	public PageObject<Suggestion> findSuggestionObjects(Integer pageCurrent) {
		//1.判定pageCurrent参数合法性
		if(pageCurrent==null||pageCurrent<1) 
		throw new IllegalArgumentException("当前页码值不正确");
		//2.查询日志总记录数,并进行判定
		int rowCount=teduNewsMapper.getSuggestionRowCount();
		if(rowCount==0)
		throw new ServiceException("没有找到对应记录");
		//3.查询当前页日志记录
		int pageSize=10;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Suggestion> records=
				teduNewsMapper.findSuggestionObjects(startIndex, pageSize);
		//4.对查询结果进行封装并返回
		PageObject<Suggestion> po=new PageObject<>();
		po.setRowCount(rowCount);
		po.setRecords(records);
		po.setPageCurrent(pageCurrent);
		po.setPageSize(pageSize);
		/*int pageCount=rowCount/pageSize;
		if(rowCount%pageSize!=0) {
			pageCount++;
		}*/
		int pageCount=(rowCount-1)/pageSize+1;
		po.setPageCount(pageCount);
		return po;
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
	public List<Emp> findAGroupOfEmp(Integer startIndex) {
		List<Emp> list = teduNewsMapper.findAGroupOfEmp(startIndex);
		return list;
	}
	@Override
	public PageObject<Emp> findEmpObjects(Integer pageCurrent) {
		//1.判定pageCurrent参数合法性
		if(pageCurrent==null||pageCurrent<1) 
		throw new IllegalArgumentException("当前页码值不正确");
		//2.查询日志总记录数,并进行判定
		int rowCount=teduNewsMapper.getEmpRowCount();
		if(rowCount==0)
		throw new ServiceException("没有找到对应记录");
		//3.查询当前页日志记录
		int pageSize=10;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Emp> records=
				teduNewsMapper.findEmpObjects(startIndex, pageSize);
		//4.对查询结果进行封装并返回
		PageObject<Emp> po=new PageObject<>();
		po.setRowCount(rowCount);
		po.setRecords(records);
		po.setPageCurrent(pageCurrent);
		po.setPageSize(pageSize);
		/*int pageCount=rowCount/pageSize;
		if(rowCount%pageSize!=0) {
			pageCount++;
		}*/
		int pageCount=(rowCount-1)/pageSize+1;
		po.setPageCount(pageCount);
		return po;
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
	@Override
	public List<Tuition> findAGroupOfTuition(Integer startIndex) {
		List<Tuition> list = teduNewsMapper.findAGroupOfTuition(startIndex);
		return list;
	}
	@Override
	public PageObject<Tuition> findTuitionObjects(Integer pageCurrent) {
		//1.判定pageCurrent参数合法性
		if(pageCurrent==null||pageCurrent<1) 
		throw new IllegalArgumentException("当前页码值不正确");
		//2.查询日志总记录数,并进行判定
		int rowCount=teduNewsMapper.getTuitionRowCount();
		if(rowCount==0)
		throw new ServiceException("没有找到对应记录");
		//3.查询当前页日志记录
		int pageSize=10;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Tuition> records=
				teduNewsMapper.findTuitionObjects(startIndex, pageSize);
		//4.对查询结果进行封装并返回
		PageObject<Tuition> po=new PageObject<>();
		po.setRowCount(rowCount);
		po.setRecords(records);
		po.setPageCurrent(pageCurrent);
		po.setPageSize(pageSize);
		/*int pageCount=rowCount/pageSize;
		if(rowCount%pageSize!=0) {
			pageCount++;
		}*/
		int pageCount=(rowCount-1)/pageSize+1;
		po.setPageCount(pageCount);
		return po;
	}
}
