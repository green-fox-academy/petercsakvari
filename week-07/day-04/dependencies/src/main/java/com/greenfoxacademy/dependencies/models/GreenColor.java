package com.greenfoxacademy.dependencies.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("greencolor")
public class GreenColor implements MyColor {

  private Printer printer;

  @Autowired
  public GreenColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    System.out.println(printer.log("It is green in color..."));
  }
}
