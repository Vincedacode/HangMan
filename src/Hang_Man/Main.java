package Hang_Man;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        HangManGame hangManGame = new HangManGame();
        boolean loop = true;

        while (loop) {
            System.out.println("\nWelcome to Hangman!");
            System.out.println("Options:");
            System.out.println("1. Start New Game");
            System.out.println("2. How to Play/ Instructions");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                int userchoice = myscanner.nextInt();
                myscanner.nextLine();

                switch (userchoice) {
                    case 1:
                        hangManGame.initializeGame();
                        playGame(hangManGame, myscanner);
                        break;

                    case 2:
                        System.out.println("\nInstructions:");
                        System.out.println("1. Guess letters one at a time to reveal the hidden word.");
                        System.out.println("2. You have 7 incorrect attempts before you lose.");
                        System.out.println("3. Try to guess the word before running out of attempts!");
                        break;

                    case 3:
                        System.out.println("Thanks for playing!");
                        loop = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                myscanner.nextLine();
            }
        }
        myscanner.close();
    }

    private static void playGame(HangManGame game, Scanner scanner) {
        while (!game.isGameOver() && !game.isGameWon()) {
            game.displayGameState();
            System.out.print("Enter a letter: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Please enter a single letter!");
                continue;
            }

            char guess = input.charAt(0);
            if (!Character.isLetter(guess)) {
                System.out.println("Please enter a valid letter!");
                continue;
            }

            game.processGuess(guess);
        }

        game.displayGameState();
        if (game.isGameWon()) {
            System.out.println("\nCongratulations! You won!");
        } else {
            System.out.println("\nGame over! The word was: " + game.wordToGuess);
        }
    }
}