package com.example.greenfoxacademy.restpractice.Model;

public class Dountil {

  int result;

  public Dountil(String what, int until) {
    result = 0;
    if (what.equals("sum")) {
      result = getSum(until);
    } else if (what.equals("factor")) {
      result = getFactor(until);
    }
  }

  private int getFactor(int until) {
    if (until == 1) {
      return 1;
    }
    return until * getFactor(until - 1);
  }

  private int getSum(int until) {
    if (until == 0) {
      return 0;
    }
    return until + getSum(until - 1);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}