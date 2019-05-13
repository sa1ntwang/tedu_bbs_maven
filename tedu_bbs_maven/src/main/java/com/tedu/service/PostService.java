package com.tedu.service;

import com.tedu.pojo.Post;

public interface PostService {
	public Post findById(Integer postId);

	public int updateById(Integer postId);

	public int addOne(Post post);

	public int deleteById(Integer postId);
}
