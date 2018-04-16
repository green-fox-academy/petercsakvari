package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.DoubleResponse;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl {

  public Integer parseInt(String s) {
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      return null;
    }
  }

  public DoubleResponse doubleInput(Integer input) {
    return new DoubleResponse(input);
  }
}
