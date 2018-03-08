package sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sum {
  private static List<Integer> listOfNums = new ArrayList<>();

  public static void main(String[] args) {
    fillList();
    System.out.println(sumNums(listOfNums));
  }

  private static void fillList() {
    for (int i = 1; i < 3; i++) {
      listOfNums.add(i);
    }
  }

  public static int sumNums(List<Integer> listOfNums) {
    int sum = 0;
    for (int num:listOfNums) {
      sum += num;
    }
    return sum;
  }
}
