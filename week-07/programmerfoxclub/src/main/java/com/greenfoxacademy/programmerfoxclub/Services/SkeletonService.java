package com.greenfoxacademy.programmerfoxclub.Services;
import com.greenfoxacademy.programmerfoxclub.Model.Skeleton;

import java.util.ArrayList;

public interface SkeletonService {

   void addSkeleton(Skeleton skeleton);

   Skeleton getSkeleton(String name);
}
