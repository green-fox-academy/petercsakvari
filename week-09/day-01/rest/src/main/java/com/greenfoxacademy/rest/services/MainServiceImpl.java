package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MainServiceImpl {

  public Object doublingResponse(String input) {
    Integer number = parseInt(input);
    if (number != null) {
      return new DoubleResponse(number);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  private Integer parseInt(String s) {
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      return null;
    }
  }

  public Object greetingResponse(String name, String title) {
    if (name != null && title != null) {
      return new GreeterResponse(name, title);
    } else {
      return new ErrorMessage("Please provide a name!");
    }
  }

  public AppendAResponse appendWithA(String s) {
    return new AppendAResponse(s);
  }

  public Object doUntilResponse(String s, Until until) {
    if (until != null) {
      switch (s) {
        case "sum":
          return sumUntil(until);
        case "factor":
          return factorUntil(until);
        default:
          return null;
      }
    } else {
      return new ErrorMessage("Please provide a number!");
    }
  }

  private DoUntilResponse sumUntil(Until until) {
    int num = until.getUntil();
    int sum = 0;
    for (int i = num; i > 0; i--) {
      sum += i;
    }
    return new DoUntilResponse(sum);
  }

  private DoUntilResponse factorUntil(Until until) {
    int num = until.getUntil();
    int factor = num;
    for (int i = num - 1; i > 0; i--) {
      factor *= i;
    }
    return new DoUntilResponse(factor);
  }

  public Object arrayHandlerResponse(ArrayHandler arrayHandler) {
    if (arrayHandler != null && arrayHandler.getWhat() != null) {
      String what = arrayHandler.getWhat();
      switch (what) {
        case "sum":
        case "multiply":
          return arrayHandlerIntResponse(arrayHandler);
        case "double":
          return arrayHandlerArrayResponse(arrayHandler);
      }
    }
    return new ErrorMessage("Please provide what to do with the numbers!");
  }

  private ArrayHandlerIntResponse arrayHandlerIntResponse(ArrayHandler arrayHandler) {
    String what = arrayHandler.getWhat();
    int[] numbers = arrayHandler.getNumbers();
    if (what.equals("sum")) {
      return new ArrayHandlerIntResponse(Arrays.stream(numbers).sum());
    } else {
      int multiply = 1;
      for (int num : numbers) {
        multiply *= num;
      }
      return new ArrayHandlerIntResponse(multiply);
    }
  }

  private ArrayHandlerArrayResponse arrayHandlerArrayResponse(ArrayHandler arrayHandler) {
    int[] numbers = arrayHandler.getNumbers();
    int[] response = Arrays.stream(numbers).map(i -> i * 2).toArray();
    return new ArrayHandlerArrayResponse(response);
  }
}
