import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberAdvanced {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int LIVES = 10;

    public static void main(String[] args) {
        String difficulty = gameStart();               // Starts the game, asks for the difficulty.
        int numberToGuess = setDifficulty(difficulty); // Considering the difficulty it generates the random number.
        int bound = randNumBound(difficulty);
        int guessedNum = guessing(bound);              // Asks for the guess.
        errorCheck(guessedNum, bound);
        checkGuess(guessedNum, numberToGuess);
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
        System.out.println("Awesome! \n You have 10 lives! \n \n Guess in the range of: 1 - " + bound + "Now start guessing:");
        return scanner.nextInt();
    }

    private static void errorCheck(int guessedNum, int bound) {
        if ()
    }

    private static void checkGuess(int guess, int numberToGuess) {
        if (guess == numberToGuess){
            System.out.println("Congratulations. You won!");
        } else if (guess > numberToGuess) {
            System.out.println("Too high!" + "Lives left: " + LIVES--);
        } else if (guess < numberToGuess){
            System.out.println("Too low!" + "Lives left: " + LIVES--);
        }

    }
}
