package com.greenfoxacademy.dependencies.controller;

import com.greenfoxacademy.dependencies.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String utilityLinks() {
    return "useful_index";
  }

  @GetMapping("/useful/colored")
  public String colorBackground(Model model) {
    model.addAttribute("randColor", utilityService.randomColor());
    return "colored";
  }
}
