package fibonacci;

public class Fibonacci {

  public static void main(String[] args) {
    Fibonacci fibo = new Fibonacci();
    System.out.println(fibo.fibonacciByIndex(6));
  }

  public int fibonacciByIndex(int n) {
    int a = 0;
    int b = 1;
    for (int i = 2; i <= n; i++) {
      int temp = a;
      a = a + b;
      b = temp;
    }
    return a;
  }
}
