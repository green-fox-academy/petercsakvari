import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a number: ");
    divideTen(scanner.nextInt());
  }

  private static void divideTen(int input) {
    try {
      System.out.println(10/input);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
