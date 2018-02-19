import java.util.Arrays;
import java.util.Scanner;

public class SwapElements {
    // - Create an array variable named `abc`
    //   with  the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`
    public static void main(String[] args) {

        String[] abc = {"first", "second", "third"};
        swap(abc);
        System.out.println(Arrays.toString(abc));
    }
    public static void swap (String[] input){
        String temp;
        temp = input[0];
        input[0] = input[2];
        input[2] = temp;
    }
}
