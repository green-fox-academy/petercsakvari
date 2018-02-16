import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        System.out.println("Please write two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();

        if (var1 >= var2){
            System.out.println("The second number should be bigger");
        } else {
            for (int i = var1; i < var2; i++){
                System.out.println(i);
            }
        }
    }
}
