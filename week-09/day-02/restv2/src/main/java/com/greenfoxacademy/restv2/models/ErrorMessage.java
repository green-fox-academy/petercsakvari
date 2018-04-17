package com.greenfoxacademy.restv2.models;

public class ErrorMessage {
  private String error;

  public ErrorMessage() {
  }

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }
}
