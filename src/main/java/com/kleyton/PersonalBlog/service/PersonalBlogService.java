package com.kleyton.PersonalBlog.service;

import java.util.List;

import com.kleyton.PersonalBlog.model.Post;

public interface PersonalBlogService {

	List<Post> findAll();
	Post findById(long id);
	Post save (Post post);
}
