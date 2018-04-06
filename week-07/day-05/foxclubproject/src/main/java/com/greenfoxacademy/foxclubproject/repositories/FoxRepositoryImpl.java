package com.greenfoxacademy.foxclubproject.repositories;

import com.greenfoxacademy.foxclubproject.databases.FoxDB;
import com.greenfoxacademy.foxclubproject.models.Fox;
import org.springframework.stereotype.Component;

@Component
public class FoxRepositoryImpl implements FoxRepository {

  public Fox findFox(String name) {
    for (Fox fox : FoxDB.FOXES) {
      if (fox.getName().equalsIgnoreCase(name)) {
        return fox;
      }
    }
    return null;
  }
}
