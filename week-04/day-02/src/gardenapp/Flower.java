package gardenapp;

public class Flower extends Plant {

  public Flower(String color, int waterAmount) {
    super(color, waterAmount);
    setType("Flower");
  }
}
