import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberAdvanced {

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private static int lives = 2;
    private static boolean fullRestart = true;
    private static boolean mainGameStop = true;

    public static void main(String[] args) {
        while (fullRestart) {
            String difficulty = gameStart();                    // Starts the game, asks for the difficulty.
            int numberToGuess = setDifficulty(difficulty);      // Considering the difficulty it generates the random number.
            int bound = randNumBound(difficulty);
            System.out.println("Your range of numbers: 1 - " + bound);
            System.out.println("You have 10 lives!\tGuess:");
            mainGameStop = true;
            while (mainGameStop) {
                mainGame(numberToGuess, bound);
            }
        }
    }

    private static void mainGame(int numberToGuess, int bound) {
        int guessedNum = guessing();
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

    private static int guessing() {
        return scanner.nextInt();
    }

    private static boolean errorCheck(int guessedNum, int bound) {
        if (guessedNum > bound || guessedNum < 1) {
            System.out.println("The number you guessed is out of bound!\nGuess again:");
            return false;
        }
        return true;
    }

    private static void checkGuess(int guessedNum, int numberToGuess, int bound) {
        if (guessedNum == numberToGuess) {
            System.out.println("Congratulations. You won!");
            mainGameStop = false;
            fullRestart = false;
        } else if (guessedNum > numberToGuess && errorCheck(guessedNum, bound)) {
            System.out.println("Too high!" + "\tLives left: " + --lives);
            fullRestart = isDead();
            System.out.println("Guess again:");
        } else if (guessedNum < numberToGuess && errorCheck(guessedNum, bound)) {
            System.out.println("Too low!" + "\tLives left: " + --lives);
            fullRestart = isDead();
            System.out.println("Guess again:");
        }
    }

    private static boolean isDead() {
        String retryCheck = "";
        if (lives == 0) {
            System.out.println("YOU DIED!\nDo you want to try again? (y or n)");
            retryCheck = scanner.next();
        }
        return checkIfRetry(retryCheck);
    }

    private static boolean checkIfRetry(String retryCheck) {
        scanner.nextLine();
        if (retryCheck.toLowerCase().equals("n")) {
            System.exit(0);
        } else if (retryCheck.toLowerCase().equals("y")) {
            mainGameStop = false;
        }
        return fullRestart;
    }
}
