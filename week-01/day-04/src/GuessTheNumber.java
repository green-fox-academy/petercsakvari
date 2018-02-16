import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        boolean check = true;

        while (check){
            System.out.println("Guess a number between 1 and 10!");
            while (check){
                int guess = scanner.nextInt();
                    if (guess < number){
                        System.out.println("### The stored number is higher ###");
                        System.out.println("Guess again!");
                    } else if (guess > number){
                        System.out.println("### The stored number is lower ###");
                        System.out.println("Guess again!");
                    } else {
                        System.out.println("##### You found the number: " + number + " #####");
                        System.out.println("##### Do you want to try again? (type y or n) #####");

                        scanner.nextLine();
                        String cont = scanner.nextLine();

                        if (cont.equals("n")){
                            check = false;
                        }
                    }
            }
        } System.out.println("##### Thanks for playing! #####");
    }
}
