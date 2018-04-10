package com.greenfoxacademy.todowithmysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private boolean urgent;
  private boolean done;
  private String description;

  public Todo() {
  }

  public Todo(String description) {
    this();
    this.description = description;
  }

  public Todo(String description, boolean urgent) {
    this(description);
    this.urgent = urgent;
  }

  public Todo(String description, boolean urgent, boolean done) {
    this(description, urgent);
    this.done = done;
  }

  public String getDescription() {
    return description;
  }

  public Long getId() {
    return id;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }
}
