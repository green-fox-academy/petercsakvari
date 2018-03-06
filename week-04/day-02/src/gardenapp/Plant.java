package gardenapp;

import java.util.List;

public class Plant {

  private String color;
  private int waterAmount;
  private String type;

  public Plant(String color, int waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String checkWater() {
    if (getWaterAmount() < 5 && getType().equals("Flower")) {
      return "needs water";
    } else if (getWaterAmount() < 10 && getType().equals("Tree")) {
      return "needs water";
    } else {
      return "doesnt need water";
    }
  }

  public void watering(int wateringAmount, List<Plant> allPlants) {
    int plantsToWater = 0;
    for (Plant allPlant : allPlants) {
      if (allPlant.checkWater().equals("needs water")) {
        plantsToWater++;
      }
    }
    wateringAmount = wateringAmount / plantsToWater;
    if (checkWater().equals("needs water")) {
      if (getType().equals("Flower")) {
        setWaterAmount(getWaterAmount() + (int) (wateringAmount * 0.75));
      } else if (getType().equals("Tree")) {
        setWaterAmount(getWaterAmount() + (int) (wateringAmount * 0.40));
      }
    }
  }
}
