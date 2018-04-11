package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = {"", "/list"})
  public String list(@RequestParam(name = "isActive", required = false) String isActive, Model model) {
    if (Boolean.parseBoolean(isActive)) {
      model.addAttribute("todos", todoService.getActiveTodos());
    } else {
      model.addAttribute("todos", todoService.getAllTodos());
    }
    return "todoslist";
  }

  @GetMapping(value = {"/{id}/delete", "/list/{id}/delete"})
  public String deleteTodo(@PathVariable(name = "id") Long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo";
  }

  @GetMapping(value = "/{id}/edit")
  public String editTodo(@PathVariable(name = "id") Long id, Model model) {
    if (todoService.getTodoById(id) != null) {
      model.addAttribute("todo", todoService.getTodoById(id));
    }
    return "todoedit";
  }


}
