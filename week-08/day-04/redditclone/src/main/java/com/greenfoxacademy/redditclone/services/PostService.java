package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PostService {

  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> listAllPostsSorted() {
    return postRepository.findAllByOrderByVoteCountDesc();
  }

  public void submitPost(String title, String url) {
    postRepository.save(new Post(title, url));
  }

  public void changePostVoteCount(Long id, boolean increaseCount) {
    Optional<Post> optionalPost = postRepository.findById(id);
    if (optionalPost.isPresent()) {
      Post post = optionalPost.get();
      if (increaseCount) {
        post.setVoteCount(post.getVoteCount() + 1);
      } else {
        post.setVoteCount(post.getVoteCount() - 1);
      }
      postRepository.save(post);
    }
  }
}
