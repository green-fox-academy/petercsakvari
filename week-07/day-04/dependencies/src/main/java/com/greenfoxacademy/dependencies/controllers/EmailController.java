package com.greenfoxacademy.dependencies.controllers;

import com.greenfoxacademy.dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

  private UtilityService utilityService;

  @Autowired
  public EmailController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful/email")
  public String checkEmail(@RequestParam(name = "email", required = false) String email, Model model) {
    model.addAttribute("email", email);
    if (utilityService.validateEmail(email)) {
      model.addAttribute("validationMessage", " is a valid email address");
      model.addAttribute("textColor", "green");
    } else {
      model.addAttribute("validationMessage", " is not a valid email address");
      model.addAttribute("textColor", "red");
    }
    return "email_validation";
  }
}
