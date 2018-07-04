package com.greenfoxacademy.sqlpractice;

import com.greenfoxacademy.sqlpractice.Model.Todo;
import com.greenfoxacademy.sqlpractice.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlpracticeApplication implements CommandLineRunner {

  @Autowired
  Repository repository;

  public static void main(String[] args) {
    SpringApplication.run(SqlpracticeApplication.class, args);

  }

  @Override
  public void run(String... args) {
    repository.save(new Todo("My first todo", true, false));
    repository.save(new Todo("My second todo", false, false));
    repository.save(new Todo("My third todo", false, true));
    repository.save(new Todo("My fourth todo", true, true));
  }
}
