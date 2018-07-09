package com.greenfoxacademy.sqlpractice.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;
  //@ManyToMany
  //private List<Assignee> assignee;



  public Todo(Long id, String title, boolean urgent, boolean done, List<Assignee> assignee) {
      this.id = id;
      this.title = title;
      this.urgent = false;
      this.done = false;
      //this.assignee = assignee;
    }
  public Todo(String title, boolean urgent, boolean done, List<Assignee> assignee){
      this.title = title;
      this.urgent = urgent;
      this.done = done;
      //this.assignee = assignee;
  }
  public Todo(String title){
    this.title = title;
  }


  public Todo() {
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  //public List<Assignee> getAssignee() {
    //return assignee;
  //}

 // public void setAssignee(List<Assignee> assignee) {
   // this.assignee = assignee;
  //}
}
