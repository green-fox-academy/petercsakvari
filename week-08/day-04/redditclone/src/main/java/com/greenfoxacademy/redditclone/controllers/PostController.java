package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  @ResponseBody
  public String test() {
    return "hello world";
  }
}
