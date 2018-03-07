package cloneable;

public class CloneableMain {
  public static void main(String[] args) {

    Student student1 = new Student("John", 20, "male", "BME");
    student1.clone();
  }
}
