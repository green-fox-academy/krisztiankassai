package com.greenfoxacademy.programmerfoxclub.Services;

import com.greenfoxacademy.programmerfoxclub.Model.Skeleton;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class SkeletonServiceImpl implements SkeletonService {
  ArrayList<Skeleton> skeletonList;

  public SkeletonServiceImpl() {
    skeletonList = new ArrayList<>();
  }

  public void addSkeleton(Skeleton skeleton) {
    skeletonList.add(skeleton);
  }

  public Skeleton getSkeleton(String name) {
    Skeleton tempSkeleton = new Skeleton();
    for (int i = 0; i < skeletonList.size(); i++) {
      if (skeletonList.get(i).getName().equals(name)) {
        return skeletonList.get(i);
      }
    }
    return tempSkeleton;
  }

  public ArrayList<Skeleton> getSkeletonList() {
    return skeletonList;
  }

  public void setSkeletonList(ArrayList<Skeleton> skeletonList) {
    this.skeletonList = skeletonList;
  }
}
