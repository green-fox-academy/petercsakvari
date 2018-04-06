package com.greenfoxacademy.foxclubproject.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Fox {

  private String name;
  private List<Trick> tricksList;
  private String food;
  private String drink;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
