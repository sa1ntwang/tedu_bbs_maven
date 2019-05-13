package com.tedu.dao;

import org.apache.ibatis.annotations.Param;

import com.tedu.pojo.Post;

public interface PostMapper {
	public Post findById(@Param("postId")Integer postId);

	public int updateById(Integer postId);

	public int addOne(Post post);

	public int deleteById(Integer postId);
}
