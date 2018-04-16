package com.greenfoxacademy.rest.models;

public class ArrayHandler {
  private String what;
  private int[] numbers;

  public ArrayHandler() {
  }

  public ArrayHandler(String what, int[] numbers) {
    this();
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public int[] getNumbers() {
    return numbers;
  }
}
