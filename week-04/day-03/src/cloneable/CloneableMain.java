package cloneable;

public class CloneableMain {
  public static void main(String[] args) {

    Student student = new Student("John", 20, "male", "BME");
    Student studentClone =  student.clone();
  }
}
