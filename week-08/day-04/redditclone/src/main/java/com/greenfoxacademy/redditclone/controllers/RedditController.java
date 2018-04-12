package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {

  private PostService postService;

  @Autowired
  public RedditController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String showTrending(Model model) {
    model.addAttribute("allPosts", postService.listAllPostsSorted());
    return "index";
  }

  @GetMapping("/submit")
  public String showSubmitPage() {
    return "submit";
  }

  @PostMapping("/submit")
  public String submitPost(@ModelAttribute(name = "title") String title, @ModelAttribute(name = "url") String url) {
    postService.submitPost(title, url);
    return "redirect:/";
  }

  @GetMapping("/{id}/incr")
  public String incrVoteCount(@PathVariable(name = "id") Long id) {
    postService.changePostVoteCount(id, true);
    return "redirect:/";
  }

  @GetMapping("/{id}/decr")
  public String decrVoteCount(@PathVariable(name = "id") Long id) {
    postService.changePostVoteCount(id, false);
    return "redirect:/";
  }
}
