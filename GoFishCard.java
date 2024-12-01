package ca.sheridancollege.project;

/**
 *
 * @author Dhruv
 * @author Kriti Nov 29, 2024
 */
public class GoFishCard extends Card {
    private String rank;
    private String suit;

    public GoFishCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

  
}
