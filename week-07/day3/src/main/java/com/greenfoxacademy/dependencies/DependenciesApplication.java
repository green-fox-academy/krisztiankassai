package com.greenfoxacademy.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

  @Autowired
  Printer printer;
  @Autowired
  MyColor color;

  public static void main(String[] args) {
    SpringApplication.run(DependenciesApplication.class, args);
  }

  public void run(String[] args) throws Exception {
    color.printColor();
  }


}
