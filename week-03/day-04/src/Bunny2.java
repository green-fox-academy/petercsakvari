public class Bunny2 {
  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
  // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
  // have 3 ears, because they each have a raised foot. Recursively return the
  // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
  public static void main(String[] args) {
    int bunnies = 4;
    System.out.println(ears(bunnies));
  }
  public static int ears(int bunnies){
    int ears = 0;
    if (bunnies == 0) {
      return ears;
    } else {
      if (bunnies % 2 == 0) {
        ears = 3 + ears(bunnies - 1);
      } else {
        ears = 2 + ears(bunnies - 1);
      }
      return ears;
    }
  }
}
