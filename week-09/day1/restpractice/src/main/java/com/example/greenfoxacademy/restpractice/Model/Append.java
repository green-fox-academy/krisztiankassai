package com.example.greenfoxacademy.restpractice.Model;

public class Append {
  String appended;

  public Append(String appended) {
    this.appended = appended;
    System.out.println(appended);
  }

  public Append() {
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
