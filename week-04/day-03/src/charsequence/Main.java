package charsequence;

public class Main {
  public static void main(String[] args) {

    Gnirts string1 = new Gnirts("example");
    Shifter string2 = new Shifter("example", 2);

    //Try charAt exception
    System.out.println(string1.charAt(50));

    //Try charAt normally
    System.out.println(string1.charAt(1));

    //Try Shifter exception
    System.out.println(string2.charAt(50));

    //Try Shifter normally
    System.out.println(string2.charAt(0));
  }
}
