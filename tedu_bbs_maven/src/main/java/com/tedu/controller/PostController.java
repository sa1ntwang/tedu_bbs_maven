package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.pojo.Post;
import com.tedu.service.PostService;
//import com.tedu.vo.JsonResult;

/**
 * 	帖子控制器
 *	发帖
 *	评论
 *	举报
 *	点赞
 */
@Controller
@RequestMapping("/")
public class PostController {
	@Autowired
	private PostService postService;
	
	@RequestMapping("findById")
	public String findById(Integer postId,Model model) {
		Post post = postService.findById(postId);
		model.addAttribute("post",post);
		return "forward:/localhost/tedu_bbs_maven/post.jsp";
	}
	@RequestMapping("updateById")
	public String updateById(Integer postId) {
		postService.updateById(postId);
		return null;
	}
	@RequestMapping("addOne")
	public String addOne(Post post) {
		postService.addOne(post);
		return null;
	}
	@RequestMapping("deleteById")
	public String deleteById(Integer postId){
		postService.deleteById(postId);
		return null;
	}
}
