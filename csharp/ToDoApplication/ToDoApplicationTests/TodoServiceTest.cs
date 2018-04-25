using System;
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
        [Fact]
        public void EditByIdTest()
        {
            var mockTodoRepository = new Mock<ITodoRepository>(MockBehavior.Strict);
            mockTodoRepository.Setup(r => r.UpdateTodo(null)).Throws(new Exception());
            mockTodoRepository.Setup(t => t.UpdateTodo(It.IsAny<Todo>()));
            var todoService = new TodoService(mockTodoRepository.Object);

            todoService.EditById(new Todo());

            Assert.Throws<Exception>(() => todoService.EditById(null));
            mockTodoRepository.Verify(r => r.UpdateTodo(It.IsAny<Todo>()), Times.Once);
        }

        [Fact]
        public void GetTodoByIdTest()
        {
            var mockTodoRepository = new Mock<ITodoRepository>();
            var expected = new Todo("test");
            mockTodoRepository.Setup(r => r.FindById(0)).Returns(expected);
            var todoService = new TodoService(mockTodoRepository.Object);

            var result = todoService.GetTodoById(0);

            var expectedStr = JsonConvert.SerializeObject(expected);
            var resultStr = JsonConvert.SerializeObject(result);

            mockTodoRepository.Verify(x => x.FindById(It.IsAny<long>()), Times.Once());
            Assert.Equal(expected, result);
        }
    }
}
