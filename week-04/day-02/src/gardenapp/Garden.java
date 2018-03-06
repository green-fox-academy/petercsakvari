package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  public static void main(String[] args) {

    List<Plant> theGarden = new ArrayList<>();

    Flower flower01 = new Flower("yellow", 3);
    Flower flower02 = new Flower("blue", 15);
    Tree tree01 = new Tree("purple", 5);
    Tree tree02 = new Tree("orange", 20);

    theGarden.add(flower01);
    theGarden.add(flower02);
    theGarden.add(tree01);
    theGarden.add(tree02);

    int wateringAmount = 0;
    printGarden(theGarden, wateringAmount);
    wateringAmount = 40;
    printGarden(theGarden, wateringAmount);
    wateringAmount = 70;
    printGarden(theGarden, wateringAmount);
  }

  public static void printGarden(List<Plant> theGarden, int wateringAmount){
    System.out.println();
    System.out.println("Watering with " + wateringAmount);
    for (Plant eachPlant : theGarden) {
      eachPlant.watering(wateringAmount, theGarden);
      System.out.println("The " + eachPlant.getColor() + " " + eachPlant.getType() + " "
              + eachPlant.getWaterAmount() + ".");
    }
  }
}
