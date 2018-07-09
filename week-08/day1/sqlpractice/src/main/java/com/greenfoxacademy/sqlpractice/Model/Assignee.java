package com.greenfoxacademy.sqlpractice.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;
  private String name;
  private String email;
  //@ManyToMany(cascade = CascadeType.ALL)
  //@JoinTable
  //private List<Todo> todo;


  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Assignee() {
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  //public List<Todo> getTodo() {
    //return todo;
  //}

  //public void setTodo(List<Todo> todo) {
    //this.todo = todo;
  //}
}
