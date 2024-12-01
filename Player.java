/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author Hinal
 * @author Kriti Nov 29, 2024
 */
public class Player {
    private String name;
    private ArrayList<Card> hand;
    private ArrayList<Card> collectedSets;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.collectedSets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void removeCard(Card card) {
        hand.remove(card);
    }

    public void collectSet(Card card) {
        collectedSets.add(card);
    }

    public ArrayList<Card> getCollectedSets() {
        return collectedSets;
    }

    public boolean hasCard(String rank) {
        for (Card card : hand) {
            if (((GoFishCard) card).getRank().equals(rank)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    @Override
    public String toString() {
        return name + " with cards: " + hand.toString();
    }
}

