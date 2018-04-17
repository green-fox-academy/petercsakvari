package com.greenfoxacademy.restv2.models;

public class GrootTranslate {
  private String received;
  private String translated;

  public GrootTranslate() {
    translated = "I am Groot!";
  }

  public GrootTranslate(String received) {
    this();
    this.received = received;
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }
}
