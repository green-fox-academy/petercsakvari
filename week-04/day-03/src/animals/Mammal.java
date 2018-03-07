package animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
    setStrength(10);
    setWeight(20);
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }

  @Override
  public void eat() {
    setWeight(getWeight() + 20);
  }

  @Override
  public void goToGym() {
    setStrength(getStrength() + 10);
  }
}
