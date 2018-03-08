package apples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  private Apple apple;

  @Before
  public void createObject() {
    apple = new Apple("apple");
  }

  @Test
  public void getAppleTest() {
    assertEquals("apple", apple.getApple());
  }

  @After
  public void deleteObject() {
    apple = null;
  }
}
