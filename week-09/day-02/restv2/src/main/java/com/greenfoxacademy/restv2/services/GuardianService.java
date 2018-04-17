package com.greenfoxacademy.restv2.services;

import com.greenfoxacademy.restv2.models.GrootTranslate;
import com.greenfoxacademy.restv2.models.YondusArrow;
import org.springframework.stereotype.Service;

@Service
public class GuardianService {

  public GrootTranslate grootTranslateResponse(String message) {
    return new GrootTranslate(message);
  }

  public YondusArrow yondusArrowResponse(double distance, double time) {
    return new YondusArrow(distance, time);
  }
}
