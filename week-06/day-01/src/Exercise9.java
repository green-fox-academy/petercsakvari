import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    //Write a Stream Expression to convert a char array to a string!
    Character[] characters = {'a', 'b', 'c', 'd'};
    String s = Arrays.stream(characters)
            .map(Object::toString)
            .collect(Collectors.joining());
    System.out.println(s);
  }
}
