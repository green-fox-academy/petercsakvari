package com.greenfoxacademy.restv2.services;

import com.greenfoxacademy.restv2.models.GrootTranslate;
import org.springframework.stereotype.Service;

@Service
public class GrootTranslateService {

  public GrootTranslate grootTranslateResponse(String message) {
    return new GrootTranslate(message);
  }
}
