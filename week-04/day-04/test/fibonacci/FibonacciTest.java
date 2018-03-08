package fibonacci;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

  private Fibonacci fibo;

  @Before
  public void setUp() throws Exception {
    fibo = new Fibonacci();
  }

  @Test
  public void fibonacciByIndexTest() {
    assertEquals(5, fibo.fibonacciByIndex(6));
  }

  @Test
  public void fibonacciByIndexNegativeIndexTest() {
    assertEquals(0, fibo.fibonacciByIndex(-2));
  }
}