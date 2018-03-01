public class String1 {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
    String string = "XXXXXXxxxXXxxXXXXxxxxXXXxxXXXX";
    char from = 'x';
    char to = 'y';

    System.out.println(replace(string, from, to));
  }

  public static String replace(String string, char from, char to){
    if (string.length() < 1) {
      return string;
    }
    else {
      char first = from == string.charAt(0) ? to : string.charAt(0);
      return first + replace(string.substring(1), from, to);
    }
  }
}
