package greenfoxinheritance;

public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student (String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student () {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void introduce() {
    System.out.println( "Hi, I'm " + name + ", a " + age + " year old gender from " + previousOrganization + " who " +
            "skipped " + skippedDays + " days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

}
