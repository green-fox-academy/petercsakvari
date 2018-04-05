package com.greenfoxacademy.dependencies;

import org.springframework.stereotype.Component;

@Component("greencolor")
public class GreenColor implements MyColor {

  @Override
  public String printColor() {
    return "It is green in color...";
  }
}
