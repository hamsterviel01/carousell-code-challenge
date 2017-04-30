package com.hamsterviel01.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hamsterviel01.www.entity.PostEntity;
import com.hamsterviel01.www.service.PostService;

@RestController
public class HomePageController {
	@Autowired
	PostService postService;
	
	@RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
	
	@RequestMapping(value="/createNewPost")
	@ResponseBody
	public List<PostEntity> createNewPost(@RequestParam String content) {
		return postService.createNewPostService(content);
	}
	
	@RequestMapping(value="/upvote")
	@ResponseBody
	public List<PostEntity> upvote(@RequestParam String id) {
		return postService.upvoteService(id);
	}
	
	@RequestMapping(value="/downvote")
	@ResponseBody
	public List<PostEntity> downvote(@RequestParam String id) {
		return postService.downvoteService(id);
	}
	
	@RequestMapping(value="/returnTop20Posts")
	@ResponseBody
	public List<PostEntity> returnTop20Posts() {
		return postService.returnTop20Posts();
	}
}
