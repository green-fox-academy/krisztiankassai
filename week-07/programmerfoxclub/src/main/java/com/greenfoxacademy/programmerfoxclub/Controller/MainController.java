package com.greenfoxacademy.programmerfoxclub.Controller;

import com.greenfoxacademy.programmerfoxclub.Model.Skeleton;
import com.greenfoxacademy.programmerfoxclub.Services.SkeletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private SkeletonService skeletonService;


@GetMapping("/")
  public String index(@RequestParam(value = "name") String name){
  skeletonService.addSkeleton(new Skeleton(name));
  return "index";
}
@GetMapping("/login")
public String loginRender(){
  return "login";
}

}

