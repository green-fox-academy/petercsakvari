package com.greenfoxacademy.todowithmysql;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodowithmysqlApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public TodowithmysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodowithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("daily task"));
    todoRepository.save(new Todo("make the beds", true, true));
    todoRepository.save(new Todo("do the washing up", false, true));
    todoRepository.save(new Todo("clean the bathroom and the kitchen", true, true));
    todoRepository.save(new Todo("wipe all the surfaces with a cloth", false, true));
    todoRepository.save(new Todo("remove the grease", true, true));
    todoRepository.save(new Todo("tidy up"));
    todoRepository.save(new Todo("throw away the rubbish", true, true));
    todoRepository.save(new Todo("broom", false, true));
    todoRepository.save(new Todo("sweep the floor", true, true));
    todoRepository.save(new Todo("wash the floors", false, true));
    todoRepository.save(new Todo("mop", true, true));
    todoRepository.save(new Todo("vacuum the carpet"));
    todoRepository.save(new Todo("vacuum cleaner / hoover", true, true));
    todoRepository.save(new Todo("dust the furniture", false, true));
  }
}
