package dice;

public class MainDice {
  public static void main(String[] args) {

    Dice myDice = new Dice();

    myDice.roll();
    myDice.getCurrent();
    for (int i = 0; i < myDice.dices.length; i++) {
      if (myDice.getCurrent(i) != 6) {
        while (myDice.getCurrent(i) != 6) {
          myDice.reroll(i);
        }
        }
    }
    System.out.println(myDice.toString());
  }
}
