import java.util.Random;

public class Counter {

  public static void main(String[] args) {
    Random random = new Random();
    int n = random.nextInt(20);
    counter(n);
  }

  public static int counter (int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return n * counter(n - 1);
    }
  }
}
