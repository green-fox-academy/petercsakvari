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

    for (Plant eachPlant : theGarden) {
      System.out.println("The " + eachPlant.getColor() + " " + eachPlant.getType() + " "
              + eachPlant.checkWater() + ".");
    }
  }
}
