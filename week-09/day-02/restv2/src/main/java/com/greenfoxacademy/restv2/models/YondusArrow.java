package com.greenfoxacademy.restv2.models;

public class YondusArrow {
  private double distance;
  private double time;
  private double speed;

  public YondusArrow() {
  }

  public YondusArrow(double distance, double time) {
    this();
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }

  public double getDistance() {
    return distance;
  }

  public double getTime() {
    return time;
  }

  public double getSpeed() {
    return speed;
  }
}
