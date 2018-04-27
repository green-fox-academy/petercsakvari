using System;
using System.Collections.Generic;
using System.Text;
using Moq;
using ToDoApplication.Repositories;
using Xunit;

namespace ToDoApplicationTests
{
    public class RepoFixture
    {
        public Mock<ITodoRepository> MockRepo { get; private set; }

        public RepoFixture()
        {
            MockRepo = new Mock<ITodoRepository>(MockBehavior.Strict);
        }
    }
}
