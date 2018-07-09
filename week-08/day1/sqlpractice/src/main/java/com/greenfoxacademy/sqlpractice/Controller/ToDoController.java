package com.greenfoxacademy.sqlpractice.Controller;


import com.greenfoxacademy.sqlpractice.Model.Assignee;
import com.greenfoxacademy.sqlpractice.Model.Todo;
import com.greenfoxacademy.sqlpractice.Repository.AssigneeRepository;
import com.greenfoxacademy.sqlpractice.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ToDoController {

  @Autowired
  ToDoRepository toDoRepository;
  //@Autowired
  //AssigneeRepository assigneeRepository;

  @GetMapping("/todo")
  public String todo(){
    return "todo";
  }

  @GetMapping(value = {"", "/list"})
  public String list(Model model){
    model.addAttribute("todos", toDoRepository.findAll());
    return "list";
  }
  @GetMapping("add")
  public String addToDoRender(Model model){
    model.addAttribute("newTodo", new Todo());
    //model.addAttribute("assignee", new Assignee());
    return "add";
  }

  @PostMapping("add")
  public String addToDo(@ModelAttribute Todo todo){
    //List<Assignee> assignees = new ArrayList<>();
    //assignees.add(assignee);
    //todo.setAssignee(assignees);
    toDoRepository.save(todo);
    //assigneeRepository.save(assignee);
    return "redirect:/list";
  }
  @GetMapping("{id}/delete")
  public String delete(@PathVariable("id") Long id){
    toDoRepository.deleteById(id);
  return "redirect:/list";
  }
  @GetMapping("/{id}/edit")
  public String edit(@PathVariable("id") Long id, Model model){
    model.addAttribute("todo", toDoRepository.findById(id));
    model.addAttribute("id", id);
    return "edit";
  }
  @PostMapping("/{id}/edit")
  public String sendEdit(@PathVariable("id") Long id, @ModelAttribute Todo todo){
    toDoRepository.save(todo);
    return "redirect:/list";
  }
  @GetMapping("/result")
  public String searchResult(@RequestParam("byTitle") String title, Model model){
    model.addAttribute("title", toDoRepository.findAllByTitle(title));
    model.addAttribute("todos", toDoRepository.findAll());
    return "result";
  }
}
