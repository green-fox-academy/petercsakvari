package gardenapp;

public class Plant {

  private String color;
  private int waterAmount;
  private int amountOfPlants;
  String type;

  public Plant(String color, int waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
    amountOfPlants++;
  }

  public String getColor() {
    return color;
  }

  public int getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(int waterAmount) {
    this.waterAmount = waterAmount;
  }

  public int getAmountOfPlants() {
    return amountOfPlants;
  }

  public String getType() {
    return type;
  }

  public String checkWater () {
    if (getWaterAmount() < 5 && getType().equals("Flower")) {
      return "needs water";
    } else if (getWaterAmount() < 10 && getType().equals("Tree")) {
      return "needs water";
    } else {
      return "doesnt need water";
    }
  }

  public void watering(int wateringAmount) {
    if (getWaterAmount() < 10) {
      setWaterAmount(getWaterAmount() + (int)((wateringAmount / getAmountOfPlants()) * 0.4));
    }
  }
}
