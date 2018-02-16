import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        System.out.println("Please write a number: ");
        Scanner scanner = new Scanner(System.in);
        int nmbr = scanner.nextInt();
        String star = "*";

        for (int i = 0; i < nmbr; i++){
            System.out.println(star);
            star += "*";
        }
    }
}
