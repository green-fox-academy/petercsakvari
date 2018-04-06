package com.greenfoxacademy.foxclubproject.repositories;

import com.greenfoxacademy.foxclubproject.models.Fox;

public interface FoxRepository {
  Fox findFox(String name);
}
