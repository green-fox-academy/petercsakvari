package com.greenfoxacademy.dependencies.controllers;

import com.greenfoxacademy.dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  private UtilityService utilityService;

  @Autowired
  public WebController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

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
