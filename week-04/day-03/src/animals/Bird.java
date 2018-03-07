package animals;

public class Bird extends Animal {

  public Bird(String name) {
    super(name);
    setStrength(1);
    setWeight(2);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void eat() {
    setWeight(getWeight() + 2);
  }

  @Override
  public void goToGym() {
    setStrength(getStrength() + 1);
  }
}
