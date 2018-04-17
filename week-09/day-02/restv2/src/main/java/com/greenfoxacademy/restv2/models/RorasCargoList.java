package com.greenfoxacademy.restv2.models;

public class RorasCargoList {
  private double caliber25;
  private double caliber30;
  private double caliber50;
  private String shipstatus;
  private boolean ready;

  {
    caliber25 = 0;
    caliber30 = 0;
    caliber50 = 0;
    shipstatus = "empty";
    ready = false;
  }

  public RorasCargoList() {
  }

  public double getCaliber25() {
    return caliber25;
  }

  public double getCaliber30() {
    return caliber30;
  }

  public double getCaliber50() {
    return caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }
}
