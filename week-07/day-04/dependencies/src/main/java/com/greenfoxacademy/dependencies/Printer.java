package com.greenfoxacademy.dependencies;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("printer")
public class Printer {

  public Printer() {
  }

  public String log(String message) {
    return LocalDateTime.now() + " MY PRINTER SAYS --- " + message;
  }
}
