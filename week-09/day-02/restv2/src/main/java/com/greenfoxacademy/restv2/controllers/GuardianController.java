package com.greenfoxacademy.restv2.controllers;

import com.greenfoxacademy.restv2.models.ErrorMessage;
import com.greenfoxacademy.restv2.models.GrootTranslate;
import com.greenfoxacademy.restv2.services.GrootTranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.NestedServletException;

@RestController
public class GuardianController {
  private final GrootTranslateService grootService;

  @Autowired
  public GuardianController(GrootTranslateService grootService) {
    this.grootService = grootService;
  }

  @GetMapping("/groot")
  public Object translateToGroot(@RequestParam(name = "message", required = false) String message) {
    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"I am Groot!\"}");
    } else {
      return grootService.grootTranslateResponse(message);
    }
  }
}
