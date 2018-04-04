package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

  @RequestMapping("/showaccounts")
  public String showAccount(Model model) {

    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Simba", 20000, "lion"));
    bankAccountList.add(new BankAccount("Rafiki", 3100, "baboon"));
    bankAccountList.add(new BankAccount("Scar", 5450, "lion"));
    bankAccountList.add(new BankAccount("Pumbaa", 2400, "boar"));
    bankAccountList.add(new BankAccount("Zazu", 3900, "bird"));

    model.addAttribute("bankAccList", bankAccountList);
    return "bankaccount";
  }
}
