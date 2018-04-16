package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.ArrayHandler;
import com.greenfoxacademy.rest.models.Until;
import com.greenfoxacademy.rest.services.MainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
  public Object greeting(@RequestParam(name = "name", required = false) String input,
                         @RequestParam(name = "title", required = false) String title) {
    if (input != null && title != null) {
      return mainService.greeterResponse(input, title);
    } else {
      return "{\"error\": \"Please provide a name!\"}";
    }
  }

  @GetMapping("/appenda/{appendable}")
  @ResponseBody
  public Object appendA(@PathVariable(name = "appendable", required = false) String s) {
    return mainService.appendWithA(s);
  }

  @PostMapping("/dountil/{what}")
  @ResponseBody
  public Object doUntil(@PathVariable(name = "what") String s, @RequestBody Until until) {
    if (s.equals("sum")) {
      return mainService.sumUntil(until);
    } else if (s.equals("factor")) {
      return mainService.factorUntil(until);
    }
    return null;
  }

  @PostMapping("/arrays")
  @ResponseBody
  public Object arrayHandler(@RequestBody ArrayHandler arrayHandler) {
    String what = arrayHandler.getWhat();
    if (what.equals("sum") || what.equals("multiply")) {
      return mainService.arrayHandlerIntResponse(arrayHandler);
    } else {
      return mainService.arrayHandlerArrayResponse(arrayHandler);
    }
  }
}
