package teachersandstudents;

//Create Student and Teacher classes
//        Student
//        learn()
//        question(teacher) -> calls the teachers answer method
//        Teacher
//        teach(student) -> calls the students learn method
//        answer()

public class Student {

  public static void learn () {

  }

  public void question () {
    Teacher.answer();
  }

}
