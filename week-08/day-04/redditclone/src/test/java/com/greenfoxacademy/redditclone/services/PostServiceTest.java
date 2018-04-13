package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.hibernate.service.spi.InjectService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PostServiceTest {

  @Mock
  private PostRepository postRepository;
  @InjectMocks
  private PostService postService;

  private List<Post> generateTestPosts(int num) {
    List<Post> testPosts = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      testPosts.add(new Post("test title", i+1));
    }
    return testPosts;
  }

  @Before
  public void setupMock() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testMock() {
    assertNotNull(postRepository);
  }

  @Test
  public void listAllPostsSortedTest() {
    List<Post> expectedResult = generateTestPosts(6);
    when(postRepository.findAllByOrderByVoteCountDesc()).thenReturn(expectedResult);
    List<Post> actualResult = postService.listAllPostsSorted();
    verify(postRepository, atLeastOnce()).findAllByOrderByVoteCountDesc();
    assertThat(actualResult, IsIterableContainingInOrder.contains(expectedResult.toArray()));
  }

  @Test
  public void listTrendingPostsSortedTest() {
    List<Post> testDB = generateTestPosts(12);
    List<Post> expectedResult = testDB.subList(0, 9);
    when(postRepository.findAllByOrderByVoteCountDesc()).thenReturn(testDB);
    List<Post> actualResult = postService.listTrendingPostsSorted();
    verify(postRepository, atLeastOnce()).findAllByOrderByVoteCountDesc();
    assertThat(actualResult, IsIterableContainingInOrder.contains(expectedResult.toArray()));
  }
}