package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.IntStream;

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

  public GreeterResponse greeterResponse(String name, String title) {
    return new GreeterResponse(name, title);
  }

  public AppendAResponse appendWithA(String s) {
    return new AppendAResponse(s);
  }

  public DoUntilResponse sumUntil(Until until) {
    int num = until.getUntil();
    int sum = 0;
    for (int i = num; i > 0; i--) {
      sum += i;
    }
    return new DoUntilResponse(sum);
  }

  public DoUntilResponse factorUntil(Until until) {
    int num = until.getUntil();
    int factor = num;
    for (int i = num - 1; i > 0; i--) {
      factor *= i;
    }
    return new DoUntilResponse(factor);
  }

  public ArrayHandlerIntResponse arrayHandlerIntResponse(ArrayHandler arrayHandler) {
    String what = arrayHandler.getWhat();
    int[] numbers = arrayHandler.getNumbers();
    if (what.equals("sum")) {
    return new ArrayHandlerIntResponse(Arrays.stream(numbers).sum());
    } else  {
      int multiply = 1;
      for (int num : numbers) {
        multiply *= num;
      }
      return new ArrayHandlerIntResponse(multiply);
    }
  }

  public ArrayHandlerArrayResponse arrayHandlerArrayResponse(ArrayHandler arrayHandler) {
    int[] numbers = arrayHandler.getNumbers();
    int[] response = Arrays.stream(numbers).map(i -> i * 2).toArray();
    return new ArrayHandlerArrayResponse(response);
  }
}
