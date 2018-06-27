package com.greenfoxacademy.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColorImpl implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor(){
    printer.log("Red");
  }
}
