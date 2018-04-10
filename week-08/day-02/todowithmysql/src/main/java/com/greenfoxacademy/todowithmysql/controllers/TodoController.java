package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.repositories.TodoRepository;
import com.greenfoxacademy.todowithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;
  private TodoService todoService;

  @Autowired
  public TodoController(TodoRepository todoRepository, TodoService todoService) {
    this.todoRepository = todoRepository;
    this.todoService = todoService;
  }

  @RequestMapping(value = {"", "/list"}, method = RequestMethod.GET)
  public String list(@RequestParam(name = "isActive", required = false) String isActive, Model model) {
    if (Boolean.parseBoolean(isActive)) {
      model.addAttribute("todos", todoService.getActiveTodos());
    } else {
      model.addAttribute("todos", todoService.getAllTodos());
    }
    return "todoslist";
  }
}
