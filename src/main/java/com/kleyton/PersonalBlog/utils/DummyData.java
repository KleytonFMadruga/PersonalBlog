package com.kleyton.PersonalBlog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kleyton.PersonalBlog.model.Post;
import com.kleyton.PersonalBlog.repository.PersonalBlogRepository;

@Component
public class DummyData {
	
	@Autowired
	PersonalBlogRepository personalBlogRepository;

	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Creitin");
		post1.setData(LocalDate.now());
		post1.setTitulo("Spring Boot");
		post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Amet est placerat in egestas erat imperdiet sed euismod. Nisl pretium fusce id velit ut tortor pretium viverra suspendisse. In nisl nisi scelerisque eu ultrices vitae auctor eu augue. Elit eget gravida cum sociis natoque penatibus et magnis dis. Eget dolor morbi non arcu risus quis. Eget duis at tellus at urna condimentum mattis pellentesque. Varius quam quisque id diam. Mollis nunc sed id semper risus. Viverra mauris in aliquam sem fringilla ut morbi tincidunt. Varius quam quisque id diam. Adipiscing commodo elit at imperdiet dui accumsan sit. Eu sem integer vitae justo eget magna. Eu mi bibendum neque egestas congue. Facilisi morbi tempus iaculis urna id volutpat. Quis varius quam quisque id diam vel. Diam volutpat commodo sed egestas egestas fringilla phasellus. Semper risus in hendrerit gravida rutrum quisque non tellus. Vulputate mi sit amet mauris. Rhoncus dolor purus non enim praesent elementum facilisis leo vel.\r\n"
				+ "\r\n"
				+ "Mattis vulputate enim nulla aliquet porttitor lacus luctus accumsan tortor. In tellus integer feugiat scelerisque varius morbi enim nunc faucibus. Nisl suscipit adipiscing bibendum est ultricies integer quis auctor elit. Sagittis vitae et leo duis ut diam. Praesent semper feugiat nibh sed pulvinar proin gravida hendrerit lectus. Aliquam sem fringilla ut morbi tincidunt augue interdum. Et magnis dis parturient montes. Tortor at risus viverra adipiscing at in tellus integer. In fermentum et sollicitudin ac orci. Feugiat nisl pretium fusce id velit ut tortor pretium viverra. Lorem sed risus ultricies tristique nulla aliquet enim. Sit amet nulla facilisi morbi tempus iaculis urna. Mattis vulputate enim nulla aliquet porttitor lacus luctus. Egestas purus viverra accumsan in nisl nisi scelerisque. Malesuada fames ac turpis egestas maecenas pharetra.");
	
		postList.add(post1);
		
		for(Post post: postList) {
			Post postSaved = personalBlogRepository.save(post);
			System.out.println("Id Post: " + postSaved.getId());
		}
	}
	
		
}
