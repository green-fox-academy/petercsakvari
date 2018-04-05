package com.greenfoxacademy.dependencies.controllers;

import com.greenfoxacademy.dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    return "colored_background";
  }

  @GetMapping("/useful/email")
  public String checkEmail(@RequestParam(name = "email", required = false) String email, Model model) {
    model.addAttribute("email", email);
    model.addAttribute("isValid", utilityService.validateEmail(email));
    return "email_validation";
  }
}
