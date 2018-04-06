package com.greenfoxacademy.foxclubproject.controllers;

import com.greenfoxacademy.foxclubproject.models.Fox;
import com.greenfoxacademy.foxclubproject.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxServiceImpl foxService;

  @Autowired
  public MainController(FoxServiceImpl foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String showIndex(@RequestParam(name = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxService.getFox(name));
      return "index";
    }
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(name = "name") String name) {
    Fox fox = foxService.getFox(name);
    if (fox != null) {
      return "redirect:/?name=" + name;
    }
    return "redirect:/login";
  }
}
