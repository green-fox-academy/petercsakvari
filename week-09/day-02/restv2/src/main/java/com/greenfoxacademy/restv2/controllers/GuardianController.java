package com.greenfoxacademy.restv2.controllers;

import com.greenfoxacademy.restv2.models.ErrorMessage;
import com.greenfoxacademy.restv2.models.GrootTranslate;
import com.greenfoxacademy.restv2.services.GrootTranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {
  private final GrootTranslateService grootService;

  @Autowired
  public GuardianController(GrootTranslateService grootService) {
    this.grootService = grootService;
  }

  @GetMapping("/groot")
  public GrootTranslate translateToGroot(@RequestParam(name = "message", required = false) String message) throws ErrorMessage {
    if (message == null) {
      throw new ErrorMessage("I am Groot!");
    } else {
      return grootService.grootTranslateResponse(message);
    }
  }
}
