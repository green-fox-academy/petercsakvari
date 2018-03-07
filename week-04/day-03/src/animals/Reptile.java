package animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    super(name);
    setStrength(5);
    setWeight(10);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void eat() {
    setWeight(getWeight() + 10);
  }

  @Override
  public void goToGym() {
    setStrength(getStrength() + 5);
  }

}
