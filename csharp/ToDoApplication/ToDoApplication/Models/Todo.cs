using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ToDoApplication.models
{
    public class Todo
    {

        public long Id{ get; set; }
        public string Content { get; set; }
        public bool IsDone { get; set; }
        public bool IsUrgent { get; set; }

        public Todo()
        {
        }

        public Todo(string Content) : this()
        {
            this.Content = Content;
        }
    }
}
