package com.greenfoxacademy.sqlpractice.Repository;

import com.greenfoxacademy.sqlpractice.Model.Todo;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Todo, Long > {
}
