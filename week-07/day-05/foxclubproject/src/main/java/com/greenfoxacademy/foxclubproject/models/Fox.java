package com.greenfoxacademy.foxclubproject.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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
    this();
    this.name = name;
    tricksList = new ArrayList<>();
    food = "TestFood";
    drink = "TestDrink";
  }

  public String getName() {
    return name;
  }

  public List<Trick> getTricksList() {
    return tricksList;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }
}
