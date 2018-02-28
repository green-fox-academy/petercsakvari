package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private String randomPirateName() {
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
    StringBuilder pirateName = new StringBuilder();
    Random random = new Random();
    while (pirateName.length() < 5) {
      int index = (int) (random.nextFloat() * abc.length());
      pirateName.append(abc.charAt(index));
    }
    return pirateName.toString();
  }

  private List<Pirate> crew = new ArrayList<>();

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
