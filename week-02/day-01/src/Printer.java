import java.util.Arrays;
import java.util.Scanner;

public class Printer {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printer`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printer("first")
    // printer("first", "second")
    // printer("first", "second", "third", "fourh")
    // ...
    public static void main(String[] args){
        System.out.println("Write words: ");
        printer();
    }
    public static void printer (){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("printer (" + input + ")");
        }
}
