package com.greenfoxacademy.rest.models;

public class GreeterResponse {
  private String welcomeMessage;

  public GreeterResponse(String name, String title) {
    welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }
}
