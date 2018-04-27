using System;
using System.Collections.Generic;
using Xunit;
using Moq;
using ToDoApplication.Repositories;
using ToDoApplication.Services;
using ToDoApplication.models;
using Newtonsoft.Json;

namespace ToDoApplicationTests
{
    public class TodoServiceTest
    {

        private readonly Mock<ITodoRepository> mockTodoRepository = new Mock<ITodoRepository>(MockBehavior.Strict);


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
        public void GetAllTodosTest()
        {
            var expected = CreateTodos(10);
            mockTodoRepository.Setup(t => t.Read()).Returns(expected);
            var todoService = new TodoService(mockTodoRepository.Object);

            var actual = todoService.GetAllTodos();

            mockTodoRepository.Verify(r => r.Read(), Times.Once);
            Assert.Equal(expected, actual);
        }

        [Fact]
        public void AddNewTodoPostiveTest()
        {
            mockTodoRepository.Setup(t => t.Create(It.IsAny<Todo>()));
            var todoService = new TodoService(mockTodoRepository.Object);

            todoService.AddNewTodo(CreateTodo("test"));

            mockTodoRepository.Verify(r => r.Create(It.IsAny<Todo>()), Times.Once);
        }

        [Fact]
        public void AddNewTodoNegativeTest()
        {
            mockTodoRepository.Setup(t => t.Create(It.IsAny<Todo>()));
            var todoService = new TodoService(mockTodoRepository.Object);

            Assert.Throws<Exception>(() => todoService.AddNewTodo(null));
        }

        [Fact]
        public void EditByIdTest()
        {
            mockTodoRepository.Setup(t => t.UpdateTodo(It.IsAny<Todo>()));
            var todoService = new TodoService(mockTodoRepository.Object);

            todoService.EditById(new Todo());

            mockTodoRepository.Verify(r => r.UpdateTodo(It.IsAny<Todo>()), Times.Once);
        }

        [Fact]
        public void EditByIdNegativeTest()
        {
            mockTodoRepository.Setup(t => t.UpdateTodo(It.IsAny<Todo>()));
            var todoService = new TodoService(mockTodoRepository.Object);

            Assert.Throws<Exception>(() => todoService.EditById(null));
        }

        [Fact]
        public void DeleteByIdPositiveTest()
        {
            var todo = CreateTodo("test");
            mockTodoRepository.Setup(t => t.Delete(It.IsAny<Todo>()));
            mockTodoRepository.Setup(r => r.FindById(It.IsAny<long>())).Returns(todo);
            var todoService = new TodoService(mockTodoRepository.Object);

            todoService.DeleteById(0);

            mockTodoRepository.Verify(r => r.Delete(It.IsAny<Todo>()), Times.Once);
        }

        [Fact]
        public void GetTodoByIdPositiveTest()
        {
            var expected = CreateTodo("test");

            mockTodoRepository.Setup(r => r.FindById(It.IsAny<long>())).Returns(expected);
            var todoService = new TodoService(mockTodoRepository.Object);

            var actual = todoService.GetTodoById(1);

            mockTodoRepository.Verify(x => x.FindById(It.IsAny<long>()), Times.Once());
            Assert.Equal(JsonConvert.SerializeObject(expected), JsonConvert.SerializeObject(actual));
        }
    }
}
