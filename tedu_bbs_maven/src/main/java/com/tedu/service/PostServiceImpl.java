package com.tedu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tedu.dao.PostMapper;
import com.tedu.exception.ServiceException;
import com.tedu.pojo.Post;
@Service
public class PostServiceImpl implements PostService{
	@Autowired
	private PostMapper postMapper;
	@Override
	public Post findById(Integer postId){
		if(postId==null||postId==0)
		throw new IllegalArgumentException("参数错误");
		Post post = postMapper.findById(postId);
		if(post==null)
		throw new ServiceException("查不到数据");
		return post;
	}
	@Override
	public int addOne(Post post) {
		int rows = postMapper.addOne(post);
		return rows;
	}
	@Override
	public int deleteById(Integer postId) {
		if(postId==null||postId==0)
		throw new IllegalArgumentException("参数错误");
		int rows = postMapper.deleteById(postId);
		if(rows==0) 
		throw new ServiceException("数据可能不存在");
		return rows;
	}
	@Override
	public int updateById(Integer postId) {
		if(postId==null||postId==0)
		throw new IllegalArgumentException("参数错误");
		int rows = postMapper.updateById(postId);
		if(rows==0)
		throw new ServiceException("无法获取数据");
		return rows;
	}
}
