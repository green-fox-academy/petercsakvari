package com.greenfoxacademy.redditclone;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import com.greenfoxacademy.redditclone.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditcloneApplication implements CommandLineRunner {

	private PostRepository postRepository;
	private Post post;

	@Autowired
	public RedditcloneApplication(Post post, PostRepository postRepository) {
		this.post = post;
		this.postRepository = postRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(RedditcloneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
