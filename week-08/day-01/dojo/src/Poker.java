import java.util.List;

public class Poker {

  public String checkWin(List<Card> black, List<Card> white) {
    if (checkFlush(black, white) != null) {
      return checkFlush(black, white);
    } else {
      return checkHighestCard(black, white);
    }
  }

  public String checkHighestCard(List<Card> black, List<Card> white) {
    Card maxBlack = black.get(0);
    Card maxWhite = white.get(0);
    for (Card card : black) {
      if (card.getCardValue() > maxBlack.getCardValue()) {
        maxBlack = card;
      }
    }
    for (Card card : white) {
      if (card.getCardValue() > maxWhite.getCardValue()) {
        maxWhite = card;
      }
    }
    if (maxBlack.getCardValue() > maxWhite.getCardValue()) {
      return "Black wins! - (High card: " + maxBlack.toString() + ")";
    } else {
      return "White wins! - (High card: " + maxWhite.toString() + ")";
    }
  }

  public String checkFlush(List<Card> black, List<Card> white) {
    boolean blackHasFlush = true;
    boolean whiteHasFlush = true;
    for (int i = 1; i < black.size(); i++) {
      if (!black.get(i).getColor().equals(black.get(i - 1).getColor())) {
        blackHasFlush = false;
        break;
      }
    }
    for (int i = 1; i < white.size(); i++) {
      if (!white.get(i).getColor().equals(white.get(i - 1).getColor())) {
        whiteHasFlush = false;
        break;
      }
    }
    if (blackHasFlush) {
      return "Black wins! - (Flush:)";
    } else if (whiteHasFlush) {
      return "White wins! - (Flush:)";
    } else {
      return null;
    }
  }
}
