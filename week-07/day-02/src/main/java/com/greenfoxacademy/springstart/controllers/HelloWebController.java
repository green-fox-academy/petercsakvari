package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private static final AtomicLong nextId = new AtomicLong();

  @RequestMapping(name = "/web/greeting", method = RequestMethod.GET)
  public String greeting(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("counter", nextId.incrementAndGet());
    return "greeting";
  }
}
