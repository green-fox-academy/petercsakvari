import java.util.Arrays;

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
        String [] words = {"first", "second"};
        printer(words);
    }
    public static void printer (String[] input){
        System.out.println("printer" + Arrays.toString(input));
        }
}
