package Pirates;

public class Pirate {

  private int pirateHealth = 100;
  private boolean isDead = false;
  private int drunkenness = 0;

  public void drinkSomeRum() {
    if (isDead) {
      System.out.println("He's dead!");
    }
    drunkenness++;
  }

  public void howsItGoingMate() {
    if (isDead) {
      System.out.println("He's dead!");
    }
    talk();
  }

  public void die() {
    isDead = true;
  }

  private void talk() {
    if (isDead) {
      System.out.println("He's dead!");
    }
    if (drunkenness >= 0 && drunkenness <= 4) {
      System.out.println("Pirate: Pour me anudder!");
    } else {
      System.out.println("Pirate: Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      sleep();
    }
  }

  private void sleep() {
    if (isDead) {
      System.out.println("He's dead!");
    }
    System.out.println("* the pirate passes out and sleeps it off *");
  }

}

