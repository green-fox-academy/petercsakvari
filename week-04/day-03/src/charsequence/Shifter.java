package charsequence;

public class Shifter implements CharSequence {

  private String string;
  private int shiftingNum;

  Shifter (String string, int shiftingNum) {
    this.string = string;
    this.shiftingNum = shiftingNum;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    try {
      return string.charAt(index + shiftingNum);
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
