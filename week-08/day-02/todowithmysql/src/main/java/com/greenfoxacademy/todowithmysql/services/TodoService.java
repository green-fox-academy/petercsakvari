package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {


  private TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  public List<Todo> getAllTodos() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll()
            .forEach(todoList::add);
    return todoList;
  }

  public List<Todo> getActiveTodos() {
    return getAllTodos().stream()
            .filter(todo -> !todo.isDone())
            .collect(Collectors.toList());
  }
}
