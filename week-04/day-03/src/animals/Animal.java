package animals;

public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int weight;
  private int strength;

  public Animal(String name) {
    this.name = name;
    age = 0;
    gender = "male";
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  public int getStrength() {
    return strength;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public abstract String breed();

  public abstract void eat();

  public abstract void goToGym();

}
