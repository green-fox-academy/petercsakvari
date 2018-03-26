import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of characters in a given string!
    String s = "smdfhflkyfhdfkiofdoisusfdsfdaksdafgh";
    List<Character> characters = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      characters.add(s.charAt(i));
    }
    System.out.println(characters.stream()
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}
