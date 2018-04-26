using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ToDoApplication.models;
using ToDoApplication.Repositories;

namespace ToDoApplication.Services
{
    public class TodoService : ITodoService
    {

        private readonly ITodoRepository todoRepository;

        public TodoService(ITodoRepository todoRepository)
        {
            this.todoRepository = todoRepository;
        }

        public List<Todo> GetAllTodos()
        {
            return todoRepository.Read();
        }

        public void AddNewTodo(Todo todo)
        {
            if (todo == null)
            {
                throw new Exception();
            }
            else
            {
                todoRepository.Create(todo);
            }
        }

        public void EditById(Todo todo)
        {
            if (todo == null)
            {
                throw new Exception();
            }
            else
            {
                todoRepository.UpdateTodo(todo);
            }
        }

        public void DeleteById(long id)
        {
            var todo = GetTodoById(id);
            todoRepository.Delete(todo);
        }

        public Todo GetTodoById(long id)
        {
            return todoRepository.FindById(id);
        }
    }
}
