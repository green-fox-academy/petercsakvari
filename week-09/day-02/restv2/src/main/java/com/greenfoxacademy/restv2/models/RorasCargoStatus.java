package com.greenfoxacademy.restv2.models;

public class RorasCargoStatus {
  private double received;
  private int amount;
  private String shipstatus;
  private boolean ready;

  public RorasCargoStatus() {
  }

  public RorasCargoStatus(double received, int amount) {
    this();
    this.received = received;
    this.amount = amount;
  }

  public double getReceived() {
    return received;
  }

  public int getAmount() {
    return amount;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }
}
