package com.example.greenfoxacademy.restpractice.Service;


import org.springframework.stereotype.Service;

@Service
public class NumberService {

  public int doubler(Integer number){
    int doubled;
    doubled = number * 2;
    return doubled;
  }

}
