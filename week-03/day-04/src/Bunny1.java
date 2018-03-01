public class Bunny1 {
  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
  public static void main(String[] args) {
    int bunnies = 4;
    int bunnyEars = 2;
    System.out.println(allEars(bunnies, bunnyEars));
  }
  public static int allEars (int bunnies, int bunnyEars) {
    if (bunnies == 0) {
      return 0;
    } else {
      return bunnyEars + allEars(bunnies-1, bunnyEars);
    }
  }
}
