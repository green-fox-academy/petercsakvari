package sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  private int sum = 3;
  private List<Integer> listOfNums = new ArrayList<>();

  @Test
  public void sumNumsTest() {
    List<Integer> listOfNums = new ArrayList<>();
    for (int i = 1; i < 3; i++) {
      listOfNums.add(i);
    }
    assertEquals(sum, Sum.sumNums(listOfNums));
  }

  @Test
  public void sumNumsEmptyListTest() {
    assertEquals(0, Sum.sumNums(listOfNums));
  }

  @Test
  public void sumNumsOneElementListTest() {
    int num = 1;
    listOfNums.add(num);
    assertEquals(num, Sum.sumNums(listOfNums));
  }

  @Test (expected = NullPointerException.class)
  public void sumNumsNullListTest() {
    listOfNums = null;
    assertNull(Sum.sumNums(listOfNums));
  }
}