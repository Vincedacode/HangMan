package Hang_Man;
import java.util.*;

public class HangManGame {
    protected WordProvider wordProvider;
    protected Scanner myscanner;
    protected String wordToGuess;
    protected char[] hiddenWord;
    protected Set<Character> guessedCharacters;
    protected int attemptsLeft;

    public HangManGame() {
        this.wordProvider = new WordProvider();
        this.myscanner = new Scanner(System.in);
        initializeGame();
    }

    public void initializeGame() {
        this.wordToGuess = wordProvider.getRandomWord().toLowerCase();
        this.hiddenWord = new char[wordToGuess.length()];
        Arrays.fill(this.hiddenWord, '_');
        this.guessedCharacters = new HashSet<>();
        this.attemptsLeft = 7;
    }

    public void processGuess(char userGuess) {
        if (guessedCharacters.contains(userGuess)) {
            System.out.println("You already guessed that letter!");
            return;
        }

        boolean correct = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == userGuess) {
                hiddenWord[i] = userGuess;
                correct = true;
            }
        }

        guessedCharacters.add(userGuess);

        if (correct) {
            System.out.println("Good guess!");
        } else {
            attemptsLeft--;
            System.out.println("Wrong guess! Attempts left: " + attemptsLeft);
        }
    }

    public boolean isGameWon() {
        return wordToGuess.equals(String.valueOf(hiddenWord));
    }

    public boolean isGameOver() {
        return attemptsLeft <= 0;
    }

    public void displayGameState() {
        System.out.println("\nCurrent word: " + String.valueOf(hiddenWord));
        System.out.println("Guessed letters: " + guessedCharacters);
        System.out.println("Attempts left: " + attemptsLeft);
    }
}