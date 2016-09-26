package dicegames;

import java.util.Scanner;

public class PlayPairOfDice {
    
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
    private PairOfDices dices;
    
    /**
     * Constructs the PlayPairOfDice game.
     */
    public PlayPairOfDice() {
        dices = new PairOfDices();
        scan = new Scanner(System.in);
    }
    
    /**
     * Prints a welcoming message.
     */
    private void welcomeMessage() {
        System.out.println("Welcome to the greatest dice game!");
    }

    /**
     * Ends the game, telling you:
     *
     *  - How many times you have rolled
     *  - How many doubles you have hit
     *  - What your highest roll was
     *  - How many sixes you have hit
     *  - How many fives you have hit
     *  - How many fours you have hit
     *  - How many threes you have hit
     *  - How many twos you have hit
     *  - How many ones you have hit
     *
     *  Then thanks you for playing the game.
     */
    public void endMessage() {
        System.out.println("You have rolled " + rolls + " times!");
        System.out.println("You've hit doubles " + dices.getSameValue() + " times!");
        System.out.println("Your highest roll was: " + dices.getHighestRoll() + "!");
        System.out.println("You have rolled " + dices.getSix() + " sixes!");
        System.out.println("You have rolled " + dices.getFive() + " fives!");
        System.out.println("You have rolled " + dices.getFour() + " fours!");
        System.out.println("You have rolled " + dices.getThree() + " threes!");
        System.out.println("You have rolled " + dices.getTwo() + " twos!");
        System.out.println("You have rolled " + dices.getOne() + " ones!");
        System.out.println("Thanks for playing, please come again!");
    }
    
    /**
     * Rolls both dices and adds one to the 'rolls' counter.
     * Then prints the sum of the roll
     */
    public void takeTurn() {
        dices.rollBothDices();
        rolls++;
        System.out.println("Your roll is: " + dices.sumOfDices() + "!");
    }

    /**
     * Starts the game.
     * While the boolean 'gameOver' is false, the game is running.
     * If the user input is 'n' or 'N', 'gameOver' will be set to true
     */
    public void startGame() {
        welcomeMessage();
        
        boolean gameOver = false;

        // this while loop keeps the game running.
        while (!gameOver) {
            System.out.println("Throw dices? Y/N");
            String proceedWithGame = scan.nextLine();

            // if the game is over change gameOver to true. Sending us to endMessage()
            if (proceedWithGame.equalsIgnoreCase("N")) {
                gameOver = true;
            }
            else { // if the game is not over, take a new turn!
                takeTurn();
            }
        }
        endMessage();
    }
    
}
