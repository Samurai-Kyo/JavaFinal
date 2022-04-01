import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> hand = new ArrayList<Card>();
    int score;
    String name;

    public Player(String name) {
        score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println("NAME: " + name + "  SCORE: " + score);
        for (Card x : hand) {
            x.describe();
        }
    }

    public Card flip() {
        return hand.remove(hand.size() - 1);
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }

}
