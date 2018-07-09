package com.example.greenfoxacademy.restpractice.Model;

public class Greet {
  String welcome_message;
  String error;


  public Greet(String error) {
    this.error = error;
  }

  public Greet(String name, String title){
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public Greet() {
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
