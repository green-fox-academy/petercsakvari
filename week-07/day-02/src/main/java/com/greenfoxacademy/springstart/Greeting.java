package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  private static final AtomicLong nextId = new AtomicLong();
  private long id;
  private String content;

  public Greeting(String content) {
    id = nextId.incrementAndGet();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
