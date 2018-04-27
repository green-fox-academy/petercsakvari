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
    public class TodoServiceTest : IClassFixture<RepoFixture>
    {

        RepoFixture fixture;

        public TodoServiceTest(RepoFixture fixture)
        {
            this.fixture = fixture;
        }

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
            fixture.MockRepo.Setup(t => t.Read()).Returns(expected);
            var todoService = new TodoService(fixture.MockRepo.Object);

            var actual = todoService.GetAllTodos();

            fixture.MockRepo.Verify(r => r.Read(), Times.Once);
            Assert.Equal(expected, actual);
        }

        [Fact]
        public void AddNewTodoPostiveTest()
        {
            fixture.MockRepo.Setup(t => t.Create(It.IsAny<Todo>()));
            var todoService = new TodoService(fixture.MockRepo.Object);

            todoService.AddNewTodo(CreateTodo("test"));

            fixture.MockRepo.Verify(r => r.Create(It.IsAny<Todo>()), Times.Once);
        }

        [Fact]
        public void AddNewTodoNegativeTest()
        {
            fixture.MockRepo.Setup(t => t.Create(It.IsAny<Todo>()));
            var todoService = new TodoService(fixture.MockRepo.Object);

            Assert.Throws<Exception>(() => todoService.AddNewTodo(null));
        }

        [Fact]
        public void EditByIdTest()
        {
            fixture.MockRepo.Setup(t => t.UpdateTodo(It.IsAny<Todo>()));
            var todoService = new TodoService(fixture.MockRepo.Object);

            todoService.EditById(new Todo());

            fixture.MockRepo.Verify(r => r.UpdateTodo(It.IsAny<Todo>()), Times.Once);
        }

        [Fact]
        public void EditByIdNegativeTest()
        {
            fixture.MockRepo.Setup(t => t.UpdateTodo(It.IsAny<Todo>()));
            var todoService = new TodoService(fixture.MockRepo.Object);

            Assert.Throws<Exception>(() => todoService.EditById(null));
        }

        [Fact]
        public void DeleteByIdPositiveTest()
        {
            var todo = CreateTodo("test");
            fixture.MockRepo.Setup(t => t.Delete(It.IsAny<Todo>()));
            fixture.MockRepo.Setup(r => r.FindById(It.IsAny<long>())).Returns(todo);
            var todoService = new TodoService(fixture.MockRepo.Object);

            todoService.DeleteById(0);

            fixture.MockRepo.Verify(r => r.Delete(It.IsAny<Todo>()), Times.Once);
        }

        [Fact]
        public void GetTodoByIdPositiveTest()
        {
            var expected = CreateTodo("test");

            fixture.MockRepo.Setup(r => r.FindById(It.IsAny<long>())).Returns(expected);
            var todoService = new TodoService(fixture.MockRepo.Object);

            var actual = todoService.GetTodoById(1);

            fixture.MockRepo.Verify(x => x.FindById(It.IsAny<long>()), Times.AtLeastOnce);
            Assert.Equal(JsonConvert.SerializeObject(expected), JsonConvert.SerializeObject(actual));
        }
    }
}
