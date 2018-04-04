package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {

  private static final String CURRENCY = "ZEB";
  private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");
  private String name;
  private double balance;
  private String animalType;

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String balanceWithDecimals() {
    return DECIMAL_FORMAT.format(balance) + " " + CURRENCY;
  }
}
