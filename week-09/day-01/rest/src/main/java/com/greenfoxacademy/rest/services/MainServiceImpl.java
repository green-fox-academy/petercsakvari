package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

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

  public DoUntilResponse doUntilResponse(String s, Until until) {
    switch (s) {
      case "sum":
        return sumUntil(until);
      case "factor":
        return factorUntil(until);
      default:
        return null;
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
    String what = arrayHandler.getWhat();
    if (what.equals("sum") || what.equals("multiply")) {
      return arrayHandlerIntResponse(arrayHandler);
    } else {
      return arrayHandlerArrayResponse(arrayHandler);
    }
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
