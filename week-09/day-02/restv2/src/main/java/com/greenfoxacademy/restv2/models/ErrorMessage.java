package com.greenfoxacademy.restv2.models;

public class ErrorMessage extends Exception {
  public ErrorMessage(String message) {
    super(message);
  }
}
