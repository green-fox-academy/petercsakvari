using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ToDoApplication.models;

namespace ToDoApplication.Repositories
{
    public interface ITodoRepository
    {
        void Create(Todo todo);
        List<Todo> Read();
        void UpdateTodo(Todo todo);
        void Delete(Todo todo);
        Todo FindById(long id);
    }
}
