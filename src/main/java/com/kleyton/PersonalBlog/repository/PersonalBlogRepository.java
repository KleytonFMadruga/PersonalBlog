package com.kleyton.PersonalBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kleyton.PersonalBlog.model.Post;

public interface PersonalBlogRepository extends JpaRepository<Post, Long> {

}
