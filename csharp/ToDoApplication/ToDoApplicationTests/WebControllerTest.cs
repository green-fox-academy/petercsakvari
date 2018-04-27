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
using Newtonsoft.Json;

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
        public void Index_ReturnsAViewResult_WithAListOfTodos_CallsServiceMethod()
        {
            var expected = CreateTodos(10);
            mockTodoService.Setup(s => s.GetAllTodos()).Returns(expected).Verifiable();
            var controller = new WebController(mockTodoService.Object);

            var result = controller.Index();

            var viewResult = Assert.IsType<ViewResult>(result);
            var model = Assert.IsAssignableFrom<IEnumerable<Todo>>(viewResult.ViewData.Model);
            Assert.Equal(10, model.Count());
            mockTodoService.Verify();
        }

        [Fact]
        public void AddForm_ReturnsAViewResult()
        {
            var controller = new WebController(mockTodoService.Object);

            var result = controller.AddForm();

            Assert.IsType<ViewResult>(result);
        }

        [Fact]
        public void AddNewTodoPost_ReturnsARedirect_CallsServiceMethod()
        {
            mockTodoService.Setup(s => s.AddNewTodo(It.IsAny<Todo>())).Verifiable();
            var controller = new WebController(mockTodoService.Object);

            var result = controller.AddNewTodo(CreateTodo("test"));

            var redirectToActionResult = Assert.IsType<RedirectToActionResult>(result);
            Assert.Equal("Index", redirectToActionResult.ActionName);
            mockTodoService.Verify();
        }

        [Fact]
        public void DeleteTodo_ReturnsARedirect_CallsServiceMethod()
        {
            mockTodoService.Setup(s => s.DeleteById(It.IsAny<long>())).Verifiable();
            var controller = new WebController(mockTodoService.Object);

            var result = controller.DeleteTodo(0);

            var redirectToActionResult = Assert.IsType<RedirectToActionResult>(result);
            Assert.Equal("Index", redirectToActionResult.ActionName);
            mockTodoService.Verify();
        }

        [Fact]
        public void EditForm_ResturnsAViewResult_WithATodo_CallsServiceMethod()
        {
            var expected = CreateTodo("test");
            mockTodoService.Setup(s => s.GetTodoById(It.IsAny<long>())).Returns(expected).Verifiable();
            var controller = new WebController(mockTodoService.Object);

            var result = controller.EditForm(0);

            var viewResult = Assert.IsType<ViewResult>(result);
            var model = Assert.IsAssignableFrom<Todo>(viewResult.ViewData.Model);
            Assert.Equal(JsonConvert.SerializeObject(expected), JsonConvert.SerializeObject(model));
            mockTodoService.Verify();
        }

        [Fact]
        public void EditTodo_ReturnsARedirectToAction_CallsServiceMethod()
        {
            mockTodoService.Setup(s => s.EditById(It.IsAny<Todo>())).Verifiable();
            var controller = new WebController(mockTodoService.Object);

            var result = controller.EditTodo(0, CreateTodo("test"));

            var redirectToActionResult = Assert.IsType<RedirectToActionResult>(result);
            Assert.Equal("Index", redirectToActionResult.ActionName);
            mockTodoService.Verify();
        }
    }
}
