import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {
  public static void main(String[] args) {
    //Write a Stream Expression to find which number squared value is more then 20 from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    numbers.stream()
            .filter(n -> (n * n) > 20)
            .map(n -> n + " ")
            .forEach(System.out::print);
  }
}
