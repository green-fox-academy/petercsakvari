package com.greenfoxacademy.dependencies.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bluecolor")
public class BlueColor implements MyColor {

  private Printer printer;

  @Autowired
  public BlueColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    System.out.println(printer.log("It is blue in color..."));
  }
}
