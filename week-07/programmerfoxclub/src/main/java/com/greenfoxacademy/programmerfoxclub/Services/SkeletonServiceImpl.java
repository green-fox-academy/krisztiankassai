package com.greenfoxacademy.programmerfoxclub.Services;

import com.greenfoxacademy.programmerfoxclub.Model.Skeleton;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class SkeletonServiceImpl implements SkeletonService {
  ArrayList<Skeleton> skeletonList;

  public SkeletonServiceImpl(){
   skeletonList = new ArrayList<>();
  }

  public void addSkeleton(Skeleton skeleton){
    skeletonList.add(skeleton);
  }
}
