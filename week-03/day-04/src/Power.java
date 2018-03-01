public class Power {
  // Given base and n that are both 1 or more, compute recursively (no loops)
  // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  public static void main(String[] args) {
    int base = 5;
    int n = 3;
    System.out.println(powerN(base, n));
  }

  private static int powerN(int base, int n) {
    if (n == 0) {
      return 1;
    } else {
      return base * powerN(base, n - 1);
    }
  }

}
