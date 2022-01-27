package com.kleyton.PersonalBlog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleyton.PersonalBlog.model.Post;
import com.kleyton.PersonalBlog.repository.PersonalBlogRepository;
import com.kleyton.PersonalBlog.service.PersonalBlogService;

@Service
public class PersonalBlogServiceImpl implements PersonalBlogService{

	@Autowired
	PersonalBlogRepository personalBlogRepository;
	
	@Override
	public List<Post> findAll() {	
		return personalBlogRepository.findAll();
	}

	@Override
	public Post findById(long id) {		
		return personalBlogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return personalBlogRepository.save(post);
	}

}
