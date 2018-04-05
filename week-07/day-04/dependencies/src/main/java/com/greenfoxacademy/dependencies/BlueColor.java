package com.greenfoxacademy.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bluecolor")
public class BlueColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    System.out.println(printer.log("It is blue in color..."));
  }
}
