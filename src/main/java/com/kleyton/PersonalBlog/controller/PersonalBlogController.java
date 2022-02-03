package com.kleyton.PersonalBlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kleyton.PersonalBlog.model.Post;
import com.kleyton.PersonalBlog.service.PersonalBlogService;

@Controller
public class PersonalBlogController {
	
	@Autowired
	PersonalBlogService personalBlogService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPosts () {
		ModelAndView mv = new ModelAndView("posts"); 
		List<Post> posts = personalBlogService.findAll();
		mv.addObject("posts", posts);
		return mv;
	}
}
