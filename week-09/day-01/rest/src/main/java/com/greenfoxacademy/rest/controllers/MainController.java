package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.DoubleResponse;
import com.greenfoxacademy.rest.services.MainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private final MainServiceImpl mainService;

  @Autowired
  public MainController(MainServiceImpl mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public Object doubling(@RequestParam(name = "input") String input) {
    Integer number = mainService.parseInt(input);
    if (number != null) {
      return mainService.doubleInput(number);
    } else {
      return "{\"error\": \"Please provide an input!\"}";
    }
  }

  @GetMapping("/greeting")
  @ResponseBody
  public Object greeting(@RequestParam(name = "name") String input,
                         @RequestParam(name = "title") String title) {
    if (input != null && title != null) {
      return "{\"welcome_message\": \"Oh, hi there " + input + ", my dear " + title + "!\"}";
    } else {
      return "{\"error\": \"Please provide a name!\"}";
    }
  }
}
