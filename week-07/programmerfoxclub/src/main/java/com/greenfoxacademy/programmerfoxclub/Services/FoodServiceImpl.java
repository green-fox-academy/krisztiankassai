package com.greenfoxacademy.programmerfoxclub.Services;

import com.greenfoxacademy.programmerfoxclub.Model.Foods;
import com.greenfoxacademy.programmerfoxclub.Model.Skeleton;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

  List<Foods> foodList = new ArrayList<>();

  public void addDrink(Skeleton skeleton, Foods food){
    foodList = new ArrayList<>();
    foodList.add(food);
    skeleton.setFood(foodList);
  }
}
