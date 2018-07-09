package com.example.greenfoxacademy.restpractice.Controller;

import com.example.greenfoxacademy.restpractice.Model.*;

import com.example.greenfoxacademy.restpractice.Model.Number;
import com.example.greenfoxacademy.restpractice.Service.AppendService;
import com.example.greenfoxacademy.restpractice.Service.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  //@Autowired
  //NumberService numberService;
  @Autowired
  AppendService appendService;
  @Autowired
  DoUntilService doUntilService;

  @GetMapping("doubling")
  public Number doubling(@RequestParam( name = "input", required = false) Integer number) {
    if (number == null) {
      return new Number("Please provide an input!");
    } else {
      return new Number(number, number * 2);
    }
  }
  @GetMapping("greeter")
  public Greet greeter(@RequestParam(name = "name", required = false) String name,
                       @RequestParam(name = "title", required = false) String title) {
    if (name != null && title != null) {
      return new Greet(name, title);
    } else if (name == null) {
      return new Greet("Please provide a name!");
    } else {
      return new Greet("Please provide a title!");
    }
  }
  @GetMapping("/appenda/{appendable}")
  public Append appender(@PathVariable(value = "appendable") String append){
  return appendService.appender(append);
  }
  @PostMapping("/dountil/{what}")
  public Object getWhat(@RequestBody(required = false) DoUntilUntil doUntilUntil, @PathVariable(value = "what") String what) {
    if (doUntilUntil == null) {
      return new ErrorMessage("Please provide a number!");
    }
    return new Dountil(what, doUntilUntil.getUntil());
  }
}
