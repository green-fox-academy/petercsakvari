package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

  private String string;

  Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    try {
      return string.charAt(length() - index - 1);
    } catch (Exception e) {
      System.err.println("There is no character at that index");
      return 0;
    }
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
