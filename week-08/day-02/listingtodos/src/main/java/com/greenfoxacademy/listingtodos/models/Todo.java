package com.greenfoxacademy.listingtodos.models;

public class Todo {

  private long id;
  private boolean urgent;
  private boolean done;

  public Todo() {
    urgent = false;
    done = false;
  }

  public Todo(boolean urgent, boolean done) {
    this();
    this.urgent = urgent;
    this.done = done;
  }
}
