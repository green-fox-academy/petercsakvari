package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> listAllPostsSorted() {
    return postRepository.findAllByOrderByVoteCountDesc();
  }

  public List<Post> listTrendingPostsSorted() {
    List<Post> sortedPosts = listAllPostsSorted();
    if (sortedPosts.size() >= 9) {
      return sortedPosts.subList(0, 9);
    } else {
      return sortedPosts;
    }
  }

  public void submitPost(String title, String url) {
    postRepository.save(new Post(title, url));
  }

  public void changePostVoteCount(Long id, boolean increaseCount) {
    Optional<Post> optionalPost = postRepository.findById(id);
    if (optionalPost.isPresent()) {
      Post post = optionalPost.get();
      if (increaseCount) {
        post.setVoteCount(post.getVoteCount()+1);
      } else {
        post.setVoteCount(post.getVoteCount()-1);
      }
      postRepository.save(post);
    }
  }
}
