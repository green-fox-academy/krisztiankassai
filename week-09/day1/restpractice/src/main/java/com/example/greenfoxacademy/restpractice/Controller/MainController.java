package com.example.greenfoxacademy.restpractice.Controller;


import com.example.greenfoxacademy.restpractice.Service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

  @Autowired
  NumberService numberservice;

  @GetMapping("index")
  public String index(){
    return "index";
  }

}
