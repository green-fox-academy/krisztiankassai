package com.greenfoxacademy.programmerfoxclub.Services;

import com.greenfoxacademy.programmerfoxclub.Model.Drinks;
import com.greenfoxacademy.programmerfoxclub.Model.Skeleton;
import com.greenfoxacademy.programmerfoxclub.Model.Tricks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrinkServiceImpl implements DrinkService {
  List<Drinks> drinksList = new ArrayList<>();

  public void addDrink(Skeleton skeleton, Drinks drink){
    drinksList.add(drink);
    skeleton.setDrink(drinksList);
  }
}
