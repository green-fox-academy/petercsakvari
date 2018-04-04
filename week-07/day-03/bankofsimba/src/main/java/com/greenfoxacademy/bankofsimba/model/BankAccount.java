package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {

  private static final String CURRENCY = "ZEB";
  private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");
  private String name;
  private double balance;
  private String balanceWithCurrency;
  private String animalType;

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    balanceWithCurrency = DECIMAL_FORMAT.format(this.balance) + " " + CURRENCY;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getBalanceWithCurrency() {
    return balanceWithCurrency;
  }
}
