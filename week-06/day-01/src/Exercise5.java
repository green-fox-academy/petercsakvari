import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!
    String s = "sdasSADDASDsadasdASdADSA";
    List<Character> letters = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      letters.add(s.charAt(i));
    }
    letters.stream()
            .filter(Character::isUpperCase)
            .forEach(System.out::print);
  }
}
