import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PokerTest {

  private Poker poker = new Poker();
  private Card card;
  private List<Card> black;
  private List<Card> white;

  @Test
  public void getCardValueTest() {
    card = new Card("K", "D");
    int output = card.getCardValue();
    assertEquals(13, output);
  }

  @Test
  public void toStringTest() {
    card = new Card("K", "D");
    String output = card.toString();
    assertEquals("King", output);
  }

  @Test
  public void checkHighestCardTest() {
    black = Arrays.asList(
            new Card("2", "H"),
            new Card("3", "D"),
            new Card("5", "S"),
            new Card("9", "C"),
            new Card("K", "D"));

    white = Arrays.asList(
            new Card("2", "C"),
            new Card("3", "H"),
            new Card("4", "S"),
            new Card("8", "C"),
            new Card("A", "H"));

    String output = poker.checkHighestCard(black, white);
    assertEquals("White wins! - (High card: Ace)", output);
  }

  @Test
  public void checkFlushTest() {
    black = Arrays.asList(
            new Card("2", "H"),
            new Card("4", "S"),
            new Card("4", "C"),
            new Card("2", "D"),
            new Card("4", "H"));

    white = Arrays.asList(
            new Card("2", "S"),
            new Card("8", "S"),
            new Card("A", "S"),
            new Card("Q", "S"),
            new Card("3", "S"));

    String output = poker.checkFlush(black, white);
    assertEquals("White wins! - (Flush:)", output);
  }

  @Test
  public void checkFlushTestNull() {
    black = Arrays.asList(
            new Card("2", "H"),
            new Card("4", "S"),
            new Card("4", "C"),
            new Card("2", "D"),
            new Card("4", "H"));

    white = Arrays.asList(
            new Card("2", "D"),
            new Card("8", "S"),
            new Card("A", "S"),
            new Card("Q", "S"),
            new Card("3", "S"));

    String output = poker.checkFlush(black, white);
    assertEquals(null, output);
  }

  @Test
  public void checkWinFlushTest() {
    black = Arrays.asList(
            new Card("2", "H"),
            new Card("4", "S"),
            new Card("4", "C"),
            new Card("2", "D"),
            new Card("4", "H"));

    white = Arrays.asList(
            new Card("2", "S"),
            new Card("8", "S"),
            new Card("A", "S"),
            new Card("Q", "S"),
            new Card("3", "S"));

    String output = poker.checkWin(black, white);
    assertEquals("White wins! - (Flush:)", output);
  }

  @Test
  public void checkWinNoFlushTest() {
    black = Arrays.asList(
            new Card("2", "H"),
            new Card("3", "D"),
            new Card("5", "S"),
            new Card("9", "C"),
            new Card("K", "D"));

    white = Arrays.asList(
            new Card("2", "C"),
            new Card("3", "H"),
            new Card("4", "S"),
            new Card("8", "C"),
            new Card("A", "H"));

    String output = poker.checkWin(black, white);
    assertEquals("White wins! - (High card: Ace)", output);
  }
}