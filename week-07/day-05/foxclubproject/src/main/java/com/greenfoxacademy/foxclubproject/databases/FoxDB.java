package com.greenfoxacademy.foxclubproject.databases;

import com.greenfoxacademy.foxclubproject.models.Fox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoxDB {

  public static final List<Fox> FOXES = new ArrayList<>(Arrays.asList(
          new Fox("Karak"),
          new Fox("Zoltan"),
          new Fox("Eke"),
          new Fox("Kappa")
  ));
}
