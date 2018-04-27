using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Moq;
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
        public void IndexReturnsAViewResultWithAListOfTodos()
        {
            var expected = CreateTodos(10);
            mockTodoService.Setup(s => s.GetAllTodos()).Returns(expected);
            var controller = new WebController(mockTodoService.Object);

            var result = controller.Index();

            var viewResult = Assert.IsType<ViewResult>(result);
            var model = Assert.IsAssignableFrom<IEnumerable<Todo>>(viewResult.ViewData.Model);
            Assert.Equal(10, model.Count());
        }

        [Fact]
        public void AddFormReturnsAViewResult()
        {
            var controller = new WebController(mockTodoService.Object);

            var result = controller.AddForm();

            Assert.IsType<ViewResult>(result);
        }

        [Fact]
        public void AddNewTodoPostRetursARedirect()
        {
            mockTodoService.Setup(s => s.AddNewTodo(It.IsAny<Todo>())).Verifiable();
            var controller = new WebController(mockTodoService.Object);

            var result = controller.AddNewTodo(CreateTodo("test"));

            Assert.IsType<RedirectToActionResult>(result);
            mockTodoService.Verify();
        }
    }
}
