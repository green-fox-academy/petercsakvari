import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of characters in a given string!
    String s = "smdfhflkyfhdfkiofdoisusfdsfdaksdafgh";
    System.out.println(s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}
