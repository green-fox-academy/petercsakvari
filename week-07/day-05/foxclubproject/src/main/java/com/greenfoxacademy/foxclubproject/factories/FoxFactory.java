package com.greenfoxacademy.foxclubproject.factories;

import com.greenfoxacademy.foxclubproject.models.Fox;
import org.springframework.stereotype.Component;

@Component
public class FoxFactory {

  public Fox createFox(String name) {
    return new Fox(name);
  }
}
