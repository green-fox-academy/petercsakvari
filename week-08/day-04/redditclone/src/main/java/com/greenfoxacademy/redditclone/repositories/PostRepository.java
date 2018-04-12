package com.greenfoxacademy.redditclone.repositories;

import com.greenfoxacademy.redditclone.models.Post;
import javafx.geometry.Pos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Component
public interface PostRepository extends CrudRepository<Post, Long> {
  
  List<Post> findAllByOrderByVoteCountDesc();
}
