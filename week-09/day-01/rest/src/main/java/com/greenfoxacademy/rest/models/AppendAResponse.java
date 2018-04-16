package com.greenfoxacademy.rest.models;

public class AppendAResponse {
  private String appended;

  public AppendAResponse(String appendable) {
    appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }
}
