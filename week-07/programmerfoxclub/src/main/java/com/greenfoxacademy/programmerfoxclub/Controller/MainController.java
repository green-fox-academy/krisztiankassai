package com.greenfoxacademy.programmerfoxclub.Controller;

import com.greenfoxacademy.programmerfoxclub.Model.Skeleton;

import com.greenfoxacademy.programmerfoxclub.Model.Tricks;
import com.greenfoxacademy.programmerfoxclub.Services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private SkeletonService skeletonService;

  @Autowired
  private DrinkService drinkService;

  @Autowired
  private FoodService foodService;

  @Autowired
  private TrickService trickService;


@GetMapping("")
  public String index(@RequestParam(value = "name") String name, Model model){
  skeletonService.addSkeleton(new Skeleton(name));
  model.addAttribute("name", skeletonService.getSkeleton(name).getName());
  return "index";
 }
@GetMapping("/login")
public String loginRender(){
  return "login";
 }

 @PostMapping("/login")
 public String loginPost(@RequestParam(value = "name") String name){
   return "redirect:" + name;
 }

@GetMapping("/trickcenter")
  public String trickcenter(@RequestParam(value = "skeleton") String skeleton, @RequestParam(value = "trick")String trick){
  trickService.addTrick(skeletonService.getSkeleton(skeleton), new Tricks(trick));
  return "trickcenter";
 }
}



