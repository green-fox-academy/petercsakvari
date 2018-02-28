package Pirates;

public class MainPirate {
  public static void main(String[] args) {

    Pirate John = new Pirate("John");
    Pirate Bob = new Pirate("Bob");

    John.brawl(John, Bob);

  }
}
