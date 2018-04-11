package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
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

  @RequestMapping(value = {"/{id}/delete", "/list/{id}/delete"}, method = RequestMethod.GET)
  public String delete(@PathVariable(name = "id") Long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo";
  }
}
