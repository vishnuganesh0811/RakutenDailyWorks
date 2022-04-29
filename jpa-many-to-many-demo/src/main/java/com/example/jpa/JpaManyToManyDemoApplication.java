package com.example.jpa;

import com.example.jpa.model.Post;
import com.example.jpa.model.Tag;
import com.example.jpa.repository.PostRepository;
import com.example.jpa.repository.TagRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class JpaManyToManyDemoApplication implements CommandLineRunner {

	@Autowired
	private TagRepository tagRepository;

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaManyToManyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postRepository.deleteAllInBatch();
		tagRepository.deleteAllInBatch();


		Post post = new Post("Example with Spring Boot",
				"Learn how to map a many to many relationship using hibernate",
				"Entire Post content with Sample code");

		Tag tag1 = new Tag("Spring Boot");
		Tag tag2 = new Tag("Hibernate");


		post.getTags().add(tag1);
		post.getTags().add(tag2);

		tag1.getPosts().add(post);
		tag2.getPosts().add(post);

		postRepository.save(post);
		
		Optional<Post> post1 = postRepository.findById(1L);
		System.out.println(post1.get().getTags());
	}
}
