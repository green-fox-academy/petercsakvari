package com.greenfoxacademy.foxclubproject.services;

import com.greenfoxacademy.foxclubproject.models.Fox;
import com.greenfoxacademy.foxclubproject.repositories.FoxRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl implements FoxService {

  private FoxRepositoryImpl foxRepository;

  @Autowired
  public FoxServiceImpl(FoxRepositoryImpl foxRepository) {
    this.foxRepository = foxRepository;
  }

  public Fox getFox(String name) {
    return foxRepository.findFox(name);
  }

  public boolean knowsTricks(String name) {
    return !foxRepository.findFox(name).getTricksList().isEmpty();
  }
}
