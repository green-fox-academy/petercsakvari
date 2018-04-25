using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ToDoApplication.Entities;
using ToDoApplication.models;

namespace ToDoApplication.Repositories
{
    public class TodoRepository : ITodoRepository
    {
        private readonly TodoContext todoContext;

        public TodoRepository(TodoContext todoContext)
        {
            this.todoContext = todoContext;
        }

        public void Create(Todo todo)
        {
            todoContext.Add(todo);
            todoContext.SaveChanges();
        }

        public List<Todo> Read()
        {
            return todoContext.Todos.ToList();
        }

        public void UpdateTodo(Todo todo)
        {
            todoContext.Update(todo);
            todoContext.SaveChanges();
        }

        public void Delete(Todo todo)
        {
            todoContext.Remove(todo);
            todoContext.SaveChanges();
        }

        public Todo FindById(long id)
        {
            return todoContext.Todos.FirstOrDefault(todo => todo.Id == id);
        }
    }
}
