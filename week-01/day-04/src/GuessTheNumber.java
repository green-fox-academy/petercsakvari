import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    static Scanner scanner = new Scanner(System.in);
    static int guess;
    static boolean check = true;
    static String cont = "y";

    public static void main(String[] args){
        while (check){
            Random rand = new Random();
            int number = rand.nextInt(10) + 1;
            while (check){
                System.out.println("Guess a number between 1 and 100: ");
                guess = scanner.nextInt();
                checkGuess(guess, number);
            }
            System.out.println("No?\nReally?\nWell...\nFormatting C:");
        }
    }

    public static void checkGuess(int guess, int number){                            //Guess and Number comparing method

            if(guess<number){
                System.out.println("### The stored number is higher ###");
            }else if(guess>number){
                System.out.println("### The stored number is lower ###");
            } else {
                System.out.println("##### You found the number: "+number+" #####");
                System.out.println("##### Do you want to try again? (type y or n) #####");
                scanner.nextLine();
                cont = scanner.nextLine();
                check = checkCont();
            }

    }
    public static boolean checkCont () {                        //Check if the player wants to continue

        if (cont.equals("y")) {
            return true;
        } else
            return false;
    }
}
