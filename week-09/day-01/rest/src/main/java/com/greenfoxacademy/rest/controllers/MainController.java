package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.ArrayHandler;
import com.greenfoxacademy.rest.models.ErrorMessage;
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
    return mainService.doublingResponse(input);
  }

  @GetMapping("/greeting")
  @ResponseBody
  public Object greeting(@RequestParam(name = "name", required = false) String input,
                         @RequestParam(name = "title", required = false) String title) {
    return mainService.greetingResponse(input, title);
  }

  @GetMapping("/appenda/{appendable}")
  @ResponseBody
  public Object appendA(@PathVariable(name = "appendable", required = false) String s) {
    return mainService.appendWithA(s);
  }

  @PostMapping("/dountil/{what}")
  @ResponseBody
  public Object doUntil(@PathVariable(name = "what") String s, @RequestBody(required = false) Until until) {
    return mainService.doUntilResponse(s, until);
  }

  @PostMapping("/arrays")
  @ResponseBody
  public Object arrayHandler(@RequestBody(required = false) ArrayHandler arrayHandler) {
    return mainService.arrayHandlerResponse(arrayHandler);
  }
}
