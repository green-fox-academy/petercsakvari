using System;
using Xunit;
using Moq;
using ToDoApplication.Repositories;
using ToDoApplication.Services;
using ToDoApplication.models;

namespace ToDoApplicationTests
{
    public class TodoServiceTest
    {
        [Fact]        
        public void EditByIdTest()
        {
            var mockTodoRepository = new Mock<ITodoRepository>();
            mockTodoRepository.Setup(x => x.UpdateTodo(It.IsAny<Todo>()));
            var todoService = new TodoService(mockTodoRepository.Object);

            Assert.NotNull(todoService);

            var desiredParam = new Todo("test");

            todoService.EditById(desiredParam);

            Assert.Throws<Exception>(() => todoService.EditById(null));
            mockTodoRepository.Verify(x => x.UpdateTodo(desiredParam), Times.Once());
        }
    }
}
