package cowsandbulls;

import java.util.*;

public class CAB {

  private String state;
  private int counter;

  public CAB() {
    state = "playing";
    counter = 0;
  }

  public String getState() {
    return state;
  }

  public int getCounter() {
    return counter;
  }

  public String mainGame(int number, int guessedNum) {

    List<Integer> digits = new ArrayList<>(breakUpNum(number));
    List<Integer> guessDigits = new ArrayList<>(breakUpNum(guessedNum));
    List<String> result = new ArrayList<>();

    for (int i = 0; i < 4; i++) {
      if (digits.get(i).equals(guessDigits.get(i))) {
        result.add("cow");
      } else if (digits.contains(guessDigits.get(i))) {
        result.add("bull");
      } else {
        result.add("nope");
      }
    }
    return result.toString();
  }

  public int generateRandomNum() {
    Random rand = new Random();
    return rand.nextInt(8999) + 1000;
  }

  public int guess() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Guess a number:");
    return scan.nextInt();
  }

  public List<Integer> breakUpNum(int num) {
    List<Integer> tempList = new ArrayList<>();
    while (num > 0) {
      tempList.add(num % 10);
      num = num / 10;
    }
    Collections.reverse(tempList);
    return tempList;
  }
}
