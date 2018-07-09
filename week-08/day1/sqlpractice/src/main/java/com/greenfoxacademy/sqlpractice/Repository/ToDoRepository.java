package com.greenfoxacademy.sqlpractice.Repository;

import com.greenfoxacademy.sqlpractice.Model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


@org.springframework.stereotype.Repository
public interface ToDoRepository extends CrudRepository<Todo, Long > {

  List<Todo> findAllByTitle(String title);

}
