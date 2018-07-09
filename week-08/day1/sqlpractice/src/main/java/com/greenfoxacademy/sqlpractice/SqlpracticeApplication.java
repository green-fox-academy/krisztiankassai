package com.greenfoxacademy.sqlpractice;

import com.greenfoxacademy.sqlpractice.Model.Assignee;
import com.greenfoxacademy.sqlpractice.Model.Todo;
import com.greenfoxacademy.sqlpractice.Repository.AssigneeRepository;
import com.greenfoxacademy.sqlpractice.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlpracticeApplication implements CommandLineRunner {


  private ToDoRepository toDoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public SqlpracticeApplication(ToDoRepository toDoRepository, AssigneeRepository assigneeRepository) {
    this.toDoRepository = toDoRepository;
    this.assigneeRepository = assigneeRepository;
  }


  public static void main(String[] args) {
    SpringApplication.run(SqlpracticeApplication.class, args);

  }

  @Override
  public void run(String... args) {

  }
}
