package ca.sheridancollege.project;

/**
 *
 * @author divya nov 2024
 */


public class Main {
    public static void main(String[] args) {
        GoFishGame game = new GoFishGame();

        // Create and add players
        game.addPlayer(new Player("Player 1"));
        game.addPlayer(new Player("Player 2"));

        // Start the game
        game.startGame();
    }
}
