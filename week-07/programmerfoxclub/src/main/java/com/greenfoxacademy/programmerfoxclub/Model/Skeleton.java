package com.greenfoxacademy.programmerfoxclub.Model;

import java.util.List;

public class Skeleton {
  private String name;
  private List<Tricks> tricks;
  private List<Foods> food;
  private List<Drinks> drink;

  public Skeleton(String name, List<Tricks> tricks, List<Foods> food, List<Drinks> drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public Skeleton() {
  }

  public Skeleton(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Tricks> getTricks() {
    return tricks;
  }

  public void setTricks(List<Tricks> tricks) {
    this.tricks = tricks;
  }

  public List<Foods> getFood() {
    return food;
  }

  public void setFood(List<Foods> food) {
    this.food = food;
  }

  public List<Drinks> getDrink() {
    return drink;
  }

  public void setDrink(List<Drinks> drink) {
    this.drink = drink;
  }
}
