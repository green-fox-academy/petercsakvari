package com.greenfoxacademy.todowithmysql.repositories;

import com.greenfoxacademy.todowithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
