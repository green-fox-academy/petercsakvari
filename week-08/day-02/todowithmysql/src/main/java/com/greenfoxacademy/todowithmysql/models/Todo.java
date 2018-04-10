package com.greenfoxacademy.todowithmysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private boolean urgent;
  private boolean done;
  private String description;

  public Todo() {
  }

  public Todo(String description) {
    this();
    this.description = description;
    urgent = false;
    done = false;
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
