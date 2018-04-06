package com.greenfoxacademy.foxclubproject.controllers;

import com.greenfoxacademy.foxclubproject.factories.FoxFactory;
import com.greenfoxacademy.foxclubproject.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxFactory foxFactory;

  @Autowired
  public MainController(FoxFactory foxFactory) {
    this.foxFactory = foxFactory;
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
  public String login(@ModelAttribute(name = "name") String name, Model model) {
    System.out.println(name);
    model.addAttribute("fox", foxFactory.createFox(name));
    return "login";
  }
}
