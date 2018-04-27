using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using ToDoApplication.models;
using ToDoApplication.Services;


namespace ToDoApplication.Controllers
{
    public class WebController : Controller
    {

        private readonly ITodoService todoService;

        public WebController(ITodoService todoService)
        {
            this.todoService = todoService;
        }

        [HttpGet("/")]
        public IActionResult Index()
        {
            var todos = todoService.GetAllTodos();
            return View(todos);
        }

        [HttpGet("/add")]
        public IActionResult AddForm()
        {
            return View();
        }

        [HttpPost("/add")]
        public IActionResult AddNewTodo(Todo todo)
        {
            todoService.AddNewTodo(todo);
            return RedirectToAction(actionName: nameof(Index));
        }

        [HttpGet("/delete/{id}")]
        public IActionResult DeleteTodo(long id)
        {
            todoService.DeleteById(id);
            return RedirectToAction(actionName: nameof(Index));
        }

        [HttpGet("/edit/{id}")]
        public IActionResult EditForm(long id)
        {
            var todo = todoService.GetTodoById(id);
            return View(todo);
        }

        [HttpPost("/edit/{id}")]
        public IActionResult EditTodo(long id, Todo todo)
        {
            todoService.EditById(todo);
            return RedirectToAction(actionName: nameof(Index));
        }
    }
}
