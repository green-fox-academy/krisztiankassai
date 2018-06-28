package com.greenfoxacademy.dependencies;

import com.greenfoxacademy.dependencies.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.awt.ModalityListener;

import javax.websocket.server.PathParam;


@org.springframework.stereotype.Controller
public class Controller{

  @Autowired
  UtilityService service;
  @Autowired
  StudentService studentService;

  @GetMapping("/useful")
  public String useful(Model model){
    model.addAttribute("link", "http://localhost:8080/useful/colored");
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model){
    model.addAttribute("color", service.randomColor());
    return "colored";
  }
  @GetMapping("useful/email")
  public String email(@RequestParam ("address") String address,Model model){
    model.addAttribute("validator", service.validateEmail(address));
    model.addAttribute("address", address);
    return "email";
  }
  @GetMapping("useful/encoder")
  public String encoder(@RequestParam("number") int number, @RequestParam("text") String text, Model model){
    model.addAttribute("encoder", service.caesar(text, number));
    return "encoder";
  }
  @GetMapping("useful/decoder")
  public String decoder(@RequestParam("number") int number, @RequestParam("text") String text, Model model){
    model.addAttribute("decoder", service.caesar(text, - number));
    return "decoder";
  }
  @GetMapping("/gfa")
  public String gfa(Model model){
    return "gfa";
  }
  @GetMapping("/gfa/list")
  public String gfalist(Model model){
    model.addAttribute("student",studentService.names);
    return "list";
  }
  @GetMapping("/gfa/add")
  public String addstudnet(Model model) {
    model.addAttribute("save",studentService.names);
    return "add";
  }
  @GetMapping("/gfa/save")
  public String saveStudent(@RequestParam("name")String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }
}

