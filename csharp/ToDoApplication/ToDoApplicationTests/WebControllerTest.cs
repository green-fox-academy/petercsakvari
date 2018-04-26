using Moq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Microsoft.AspNetCore.Mvc;
using ToDoApplication.Controllers;
using ToDoApplication.models;
using ToDoApplication.Services;
using Xunit;

namespace ToDoApplicationTests
{

    
    public class WebControllerTest
    {
        private readonly Mock<ITodoService> mockTodoService = new Mock<ITodoService>(MockBehavior.Strict);

        //FACTORIES
        private Todo CreateTodo(string s)
        {
            return new Todo(s);
        }

        private List<Todo> CreateTodos(int num)
        {
            List<Todo> todos = new List<Todo>();
            for (int i = 0; i < num; i++)
            {
                todos.Add(new Todo());
            }
            return todos;
        }

        //TESTS
        [Fact]
        public void IndexTest()
        {
            var expected = CreateTodos(10);
            mockTodoService.Setup(s => s.GetAllTodos()).Returns(expected);
            var webController = new WebController(mockTodoService.Object);

            var result = webController.Index();

            var viewResult = Assert.IsType<ViewResult>(result);
            //var model = Assert.IsAssignableFrom<IEnumerable<Index>>(
            //    viewResult.ViewData.Model);
            //Assert.Equal(10, model.Count());
        }
    }
}
