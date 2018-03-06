package greenfoxinheritance;

public class Mentor extends Person {

  private String level;

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public Mentor () {
    super();
    level = "intermediate";
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name +", a " + age + " year old " + gender + level + " mentor.");
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
