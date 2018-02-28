package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> crew = new ArrayList<>();

  private String randomPirateName() {
    String upperCaseABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCaseABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
    StringBuilder pirateName = new StringBuilder();
    Random random = new Random();
    while (pirateName.length() < 5) {
      int index = (int) (random.nextFloat() * upperCaseABC.length());
      if (pirateName.length() == 0) {
        pirateName.append(upperCaseABC.charAt(index));
      } else {
        pirateName.append(lowerCaseABC.charAt(index));
      }
    }
    return pirateName.toString();
  }

  public void fillShip () {
    Random random = new Random();
    for (int j = 0; j < random.nextInt(29)+1; j++) {
      crew.add(new Pirate(randomPirateName()));
      if (j == random.nextInt(29)+1) {
        crew.get(j).setRank("Captain");
      }
    }
  }

}
