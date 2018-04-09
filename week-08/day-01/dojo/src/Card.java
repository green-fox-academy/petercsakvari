public class Card {

  private String value;
  private String color;

  public Card() {

  }

  public Card(String value, String color) {
    this.value = value;
    this.color = color;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCardValue() {
    if (this.value.equalsIgnoreCase("t")) {
      return 10;
    } else if (this.value.equalsIgnoreCase("j")) {
      return 11;
    } else if (this.value.equalsIgnoreCase("q")) {
      return 12;
    } else if (this.value.equalsIgnoreCase("k")) {
      return 13;
    } else if (this.value.equalsIgnoreCase("a")) {
      return 14;
    } else {
      return Integer.parseInt(this.value);
    }
  }

  @Override
  public String toString() {
    if (this.value.equalsIgnoreCase("t")) {
      return "10";
    } else if (this.value.equalsIgnoreCase("j")) {
      return "Jack";
    } else if (this.value.equalsIgnoreCase("q")) {
      return "Queen";
    } else if (this.value.equalsIgnoreCase("k")) {
      return "King";
    } else if (this.value.equalsIgnoreCase("a")) {
      return "Ace";
    } else {
      return this.value;
    }
  }
}
