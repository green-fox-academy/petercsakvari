import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Exercise2 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    OptionalDouble average = numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToDouble(n -> n)
            .average();
    double averageD = average.orElse(0);
    System.out.println(averageD);
  }
}
