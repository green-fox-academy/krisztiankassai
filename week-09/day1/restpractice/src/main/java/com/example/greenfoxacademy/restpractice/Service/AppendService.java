package com.example.greenfoxacademy.restpractice.Service;

import com.example.greenfoxacademy.restpractice.Model.Append;
import org.springframework.stereotype.Service;

@Service
public class AppendService {

  public Append appender(String append){
    return new Append(append + "a");
  }

}
