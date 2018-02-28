package Pirates;

import java.util.Random;

public class Pirate {

  private boolean isDead = false;
  private int drunkenness = 0;

  public void brawl (Pirate pirate1, Pirate pirate2) {
    if (!pirate1.isDead && !pirate2.isDead) {
      Random random = new Random();
      int randomWin = random.nextInt(2) + 1;
      if (randomWin == 1) {
        System.out.println(pirate1 + " won!");
      } else if (randomWin == 2) {
        System.out.println(pirate2 + " won!");
      } else if (randomWin == 3) {
        pirate1.passOut();
        pirate2.passOut();
      }
    } else {
      System.out.println("One of the pirates is dead!");
    }
  }

  public void drinkSomeRum() {
    checkIfDead();
    drunkenness++;
  }

  public void howsItGoingMate() {
    checkIfDead();
    talk();
  }

  public void die() {
    isDead = true;
  }

  private void checkIfDead() {
    if (isDead) {
      System.out.println("He's dead!");
    }
  }

  private void talk() {
    checkIfDead();
    if (drunkenness >= 0 && drunkenness <= 4) {
      System.out.println("Pirate: Pour me anudder!");
    } else {
      System.out.println("Pirate: Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passOut();
    }
  }

  private void passOut() {
    checkIfDead();
    System.out.println("* the pirate passes out and sleeps it off *");
  }

}

