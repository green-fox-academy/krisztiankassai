package com.greenfoxacademy.sqlpractice.Repository;

import com.greenfoxacademy.sqlpractice.Model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
