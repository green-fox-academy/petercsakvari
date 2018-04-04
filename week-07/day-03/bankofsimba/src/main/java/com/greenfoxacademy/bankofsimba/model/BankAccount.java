package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {

  private static final String CURRENCY = "ZEB";
  private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public BankAccount(String name, double balance, String animalType, boolean isGood) {
    this(name, balance, animalType, false, isGood);
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

  public String balanceWithDecimals() {
    return DECIMAL_FORMAT.format(balance) + " " + CURRENCY;
  }
}
