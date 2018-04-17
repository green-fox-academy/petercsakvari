package com.greenfoxacademy.restv2.controllers;

import com.greenfoxacademy.restv2.services.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  private final GuardianService guardianService;

  @Autowired
  public GuardianController(GuardianService guardianService) {
    this.guardianService = guardianService;
  }

  @GetMapping("/groot")
  public Object translateToGroot(@RequestParam(name = "message", required = false) String message) {
    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"I am Groot!\"}");
    } else {
      return guardianService.grootTranslateResponse(message);
    }
  }

  @GetMapping("/yondu")
  public Object yondusArrow(@RequestParam(name = "distance") double distance,
                            @RequestParam(name = "time") double time) {
    return guardianService.yondusArrowResponse(distance, time);
  }

  @GetMapping("/rocket")
  public Object listCargo() {
    return guardianService.rorasCargoListResponse();
  }

  @GetMapping("/rocket/fill")
  public Object cargoStatus(@RequestParam(name = "caliber") double caliber,
                            @RequestParam(name = "amount") int amount) {
    return guardianService.rorasCargoStatusResponse(caliber, amount);
  }
}
