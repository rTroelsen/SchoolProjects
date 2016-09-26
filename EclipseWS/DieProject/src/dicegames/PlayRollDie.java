package dicegames;

import java.util.Scanner;

/**
 * A small game where you roll dices.
 * There are no rules; just roll the die until you get bored.
 */
public class PlayRollDie {
    /**
     * How many rolls have been rolled.
     */
    private int rolls;
    
    /**
     * The scanner used for reading user input.
     */
    private Scanner scan;
    
    /**
     * The die used in the game.
     */
    private Die die;
    
    /**
     * Constructs the PlayRollDie game.
     */
    public PlayRollDie() {
        die = new Die();
        scan = new Scanner(System.in);
    }
    
    /**
     * Print out a neat welcome message to the player.
     */
    private void welcomeToGame() {
        System.out.println("Velkommen til spillet KAST terning");
    }
    
    /**
     * Finishes the game and prints out the result.
     */
    private void endGame() {
        System.out.println("Tak for spillet. Du kastede " + rolls + " " + "gange.");
        scan.close();
    }
    
    /**
     * Take another turn in the game.
     */
    private void takeTurn() {
        die.roll();
        int roll = die.getFaceValue();
        rolls++;
        System.out.println("Du har kastet: " + roll);
    }
    
    /**
     * Start the game loop.
     * The boolean gameOver will be set to true if the input is 'N' thus ending the game.
     */
    public void startGame() {
        welcomeToGame();
        
        boolean gameOver = false;
        
        while (!gameOver) {
            System.out.println("Vil du kaste en terning? Angiv Ja eller Nej: ");
            String proceedWithGame = scan.nextLine();
            if (proceedWithGame.equalsIgnoreCase("nej")) {
                gameOver = true;
            }
            else {
                takeTurn();
            }
        }
        
        endGame();
    }
}
