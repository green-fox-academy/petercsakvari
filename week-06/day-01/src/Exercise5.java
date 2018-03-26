public class Exercise5 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!
    String s = "sdasSADDASDsa dasdASdADSA";
    s.chars()
            .mapToObj(c -> (char) c)
            .filter(Character::isUpperCase)
            .forEach(System.out::print);
  }
}
