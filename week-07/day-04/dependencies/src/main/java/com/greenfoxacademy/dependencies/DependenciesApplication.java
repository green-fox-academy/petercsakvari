package com.greenfoxacademy.dependencies;

import com.greenfoxacademy.dependencies.models.MyColor;
import com.greenfoxacademy.dependencies.models.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  public DependenciesApplication(Printer printer, @Qualifier("bluecolor") MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependenciesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(printer.log("This no!"));
    myColor.printColor();
  }
}
