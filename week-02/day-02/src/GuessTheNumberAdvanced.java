import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberAdvanced {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int LIVES = 10;

    public static void main(String[] args) {
        String difficulty = gameStart();
        int numberToGuess = setDifficulty(difficulty);
        int guessedNum = guessing();
        checkGuess(guessedNum, numberToGuess);
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

    private static int guessing() {
        System.out.println("Awesome! \n You have 10 lives! \n Now start guessing:");
        return scanner.nextInt();
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
}
