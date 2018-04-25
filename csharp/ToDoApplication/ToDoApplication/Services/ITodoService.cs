using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ToDoApplication.models;

namespace ToDoApplication.Services
{
    public interface ITodoService
    {
        List<Todo> GetAllTodos();
        void AddNewTodo(Todo todo);
        void EditById(Todo todo);
        void DeleteById(long id);
        Todo GetTodoById(long id);
    }
}
