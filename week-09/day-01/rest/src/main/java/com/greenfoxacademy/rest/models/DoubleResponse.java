package com.greenfoxacademy.rest.models;

public class DoubleResponse {
  private int received;
  private int result;

  public DoubleResponse(Integer received) {
    this.received = received;
    result = 2 * received;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}
