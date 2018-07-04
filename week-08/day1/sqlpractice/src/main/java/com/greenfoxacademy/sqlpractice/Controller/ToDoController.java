package com.greenfoxacademy.sqlpractice.Controller;


import com.greenfoxacademy.sqlpractice.Model.Todo;
import com.greenfoxacademy.sqlpractice.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ToDoController {

  @Autowired
  Repository repository;

  @GetMapping("/todo")
  public String todo(){
    return "todo";
  }

  @GetMapping(value = {"", "/list"})
  public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive){
    model.addAttribute("istrue", isActive);
    model.addAttribute("todos", repository.findAll());
    return "list";
  }
  @GetMapping("add")
  public String addToDoRender(Model model){
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @PostMapping("add")
  public String addToDo(@ModelAttribute Todo todo){
    repository.save(todo);
    return "redirect:/list";
  }
}
