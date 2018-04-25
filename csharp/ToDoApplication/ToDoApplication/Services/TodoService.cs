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

        private ITodoRepository todoRepository;

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
            todoRepository.Create(todo);
        }

        public void EditById(Todo todo)
        {
            if (todo != null)
            {
                todoRepository.UpdateTodo(todo);
            }
        }

        public void DeleteById(long id)
        {
            var todo = GetTodoById(id);
            if (todo != null)
            {
                todoRepository.Delete(todo);
            }
        }

        public Todo GetTodoById(long id)
        {
            return todoRepository.FindById(id);
        }
    }
}
