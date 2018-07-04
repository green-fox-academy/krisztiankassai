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
  public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive,
                     @RequestParam(name = "todo", required = false) String todo){
    model.addAttribute("istrue", isActive);
    model.addAttribute("todo", repository.findAll());
    return "list";
  }
  @GetMapping("add")
  public String addToDoRender(){
    return "redirect: list/add";
  }

  @PostMapping("add")
  public String addToDo(@RequestParam(name = "add")String add, Model model){
    model.addAttribute("addTodo", repository.save(new Todo(add)));
    return "/list";
  }
}
