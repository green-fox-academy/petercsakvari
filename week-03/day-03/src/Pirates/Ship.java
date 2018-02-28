package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  //Random Name Generator
  private String getSaltString() {
    String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 5) { // length of the random string.
      int index = (int) (rnd.nextFloat() * SALTCHARS.length());
      salt.append(SALTCHARS.charAt(index));
    }
    return salt.toString();
  }
  //^^Random Name Generator^^

  private List<Pirate> crew = new ArrayList<>();

  public void fillShip () {
    Random random = new Random();
    for (int j = 0; j < random.nextInt(29)+1; j++) {
      crew.add(new Pirate(getSaltString()));
      if (j == random.nextInt(29)+1) {
        crew.get(j).setRank("Captain");
      }
    }
  }

}
