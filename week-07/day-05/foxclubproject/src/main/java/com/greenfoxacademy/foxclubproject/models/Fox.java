package com.greenfoxacademy.foxclubproject.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Fox {

  private String name;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
  }
}