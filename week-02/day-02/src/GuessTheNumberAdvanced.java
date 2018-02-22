import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberAdvanced {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int lives = 10;

    public static void main(String[] args) {
        String difficulty = gameStart();               // Starts the game, asks for the difficulty.
        int numberToGuess = setDifficulty(difficulty); // Considering the difficulty it generates the random number.
        int bound = randNumBound(difficulty);
        int guessedNum = guessing(bound);              // Asks for the guess.
        checkGuess(guessedNum, numberToGuess, bound);
    }

    private static int randNumBound(String difficulty) {
        int range = 0;
        if (difficulty.toLowerCase().equals("easy")) {
            range = 50;
        } else if (difficulty.toLowerCase().equals("medium")) {
            range = 250;
        } else if (difficulty.toLowerCase().equals("hard")) {
            range = 1000;
        } /*else if (difficulty.toLowerCase().equals("impossible")) {

        }*/
        return range;
    }

    private static String gameStart() {
        System.out.println("WELCOME TO THE GUESSING GAME!");
        System.out.println("Please choose the difficulty of the game by writing it: Easy \t Medium \t Hard \t Impossible");
        return scanner.nextLine();
    }

    private static int setDifficulty(String difficulty) {
        int numberToGuess = 0;
        if (difficulty.toLowerCase().equals("easy")) {
            numberToGuess = random.nextInt(50) + 1;
        } else if (difficulty.toLowerCase().equals("medium")) {
            numberToGuess = random.nextInt(250) + 1;
        } else if (difficulty.toLowerCase().equals("hard")) {
            numberToGuess = random.nextInt(1000) + 1;
        } else if (difficulty.toLowerCase().equals("impossible")) {
            numberToGuess = random.nextInt() + 1;
        }
        return numberToGuess;
    }

    private static int guessing(int bound) {
        System.out.println("Your range of numbers: 1 - " + bound + "\nYou have 10 lives!\tNow start guessing:");
        return scanner.nextInt();
    }

    private static boolean errorCheck(int guessedNum, int bound) {
        if (guessedNum > bound || guessedNum < 1){
            System.out.println("The number you guessed is out of bound!\nGuess again:");
            return false;
        }
        return true;
    }

    private static void checkGuess(int guessedNum, int numberToGuess, int bound) {
        if (guessedNum == numberToGuess){
            System.out.println("Congratulations. You won!");
        } else if (guessedNum > numberToGuess && errorCheck(guessedNum, bound)) {
            System.out.println("Too high!" + "Lives left: " + lives--);
        } else if (guessedNum < numberToGuess && errorCheck(guessedNum, bound)){
            System.out.println("Too low!" + "Lives left: " + lives--);
        }

    }
}
