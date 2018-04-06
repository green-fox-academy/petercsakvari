package com.greenfoxacademy.foxclubproject.controllers;

import com.greenfoxacademy.foxclubproject.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private Fox fox;

  @Autowired
  public MainController(Fox fox) {
    this.fox = fox;
  }

  @GetMapping("/")
  public String showIndex() {
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(name = "name") String name) {
    return "login";
  }
}
