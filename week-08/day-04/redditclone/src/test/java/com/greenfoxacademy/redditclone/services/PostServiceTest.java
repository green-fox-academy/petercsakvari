package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PostServiceTest {

  @InjectMocks
  private PostService postService;
  @Mock
  private PostRepository postRepository;
  @Mock
  private Post post;

  @Before
  public void setupMock() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testMock() {
    assertNotNull(post);
    assertNotNull(postRepository);
  }

  @Test
  public void listAllPostsSortedTest() {
    List<Post> testPost = Collections.singletonList(new Post("Test Title"));
    when(postRepository.findAllByOrderByVoteCountDesc()).thenReturn(testPost);
    assertEquals(testPost, postRepository.findAllByOrderByVoteCountDesc());
    postService.listAllPostsSorted();
    verify(postRepository, atLeastOnce()).findAllByOrderByVoteCountDesc();
  }
}