package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

  @GetMapping("/showaccounts")
  public String showAccount(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Simba", 9850, "lion", true, true));
    bankAccountList.add(new BankAccount("Rafiki", 3100, "baboon",true));
    bankAccountList.add(new BankAccount("Scar", 5450, "lion",false));
    bankAccountList.add(new BankAccount("Pumba", 2400, "boar",true));
    bankAccountList.add(new BankAccount("Zazu", 3900, "bird",true));
    model.addAttribute("bankAccList", bankAccountList);
    return "bankaccount";
  }

  @PostMapping("/showaccounts")
  public String balanceRaise() {
    return "raisesuccess";
  }
}
