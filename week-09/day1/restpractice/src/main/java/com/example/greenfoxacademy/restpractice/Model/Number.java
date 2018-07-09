package com.example.greenfoxacademy.restpractice.Model;


import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Number {
  int received;
  int result;
  String error;

  public Number(int received, int result, String error) {
    this.received = received;
    this.result = result;
    this.error = error;
  }

  public Number(int received, int result) {
    this.received = received;
    this.result = result;
  }

  public Number(String error) {
    this.error = error;
  }

  public Number() {
  }


  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
