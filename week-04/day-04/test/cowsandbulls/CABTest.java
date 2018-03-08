package cowsandbulls;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CABTest {

  private CAB cab;
  private int number;
  private int guessedNum;

  @Before
  public void setUp() throws Exception {
    cab = new CAB();
    number = 1234;
    guessedNum = 1325;
  }

  @Test
  public void CABStateTest() {
    assertEquals("playing", cab.getState());
  }

  @Test
  public void CABCounterTest() {
    assertEquals(0, cab.getCounter());
  }

  @Test
  public void breakUpNumTest() {
    assertEquals(Arrays.asList(1, 2, 3, 4), cab.breakUpNum(number));
  }

  @Test
  public void mainGameTest() {
    assertEquals(Arrays.asList("cow", "bull", "bull", "nope").toString(), cab.mainGame(number, guessedNum));
  }
}