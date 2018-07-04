package com.greenfoxacademy.programmerfoxclub.Services;

import com.greenfoxacademy.programmerfoxclub.Model.Skeleton;
import com.greenfoxacademy.programmerfoxclub.Model.Tricks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrickServiceImpl implements TrickService {

  List<Tricks> trickList = new ArrayList<>();

  public void addTrick(Skeleton skeleton, Tricks trick){
    trickList.add(trick);
    skeleton.setTricks(trickList);
  }
}
