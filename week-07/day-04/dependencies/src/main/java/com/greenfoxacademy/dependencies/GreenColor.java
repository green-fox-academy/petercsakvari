package com.greenfoxacademy.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("greencolor")
public class GreenColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    System.out.println(printer.log("It is green in color..."));
  }
}
