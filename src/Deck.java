import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>(52);

    public Deck() {
        List<String> names = new ArrayList<String>();
        names.add("Ace");
        names.add("Two");
        names.add("Three");
        names.add("Four");
        names.add("Five");
        names.add("Six");
        names.add("Seven");
        names.add("Eight");
        names.add("Nine");
        names.add("Ten");
        names.add("Jack");
        names.add("Queen");
        names.add("King");

        for (int i = 0; i < 13; i++) {
            Card card = new Card();
            card.setName(names.get(i) + " of Spades");
            card.setValue(i + 1);
            cards.add(card);
        }
        for (int i = 0; i < 13; i++) {
            Card card = new Card();
            card.setName(names.get(i) + " of Clubs");
            card.setValue(i + 1);
            cards.add(card);
        }
        for (int i = 0; i < 13; i++) {
            Card card = new Card();
            card.setName(names.get(i) + " of Hearts");
            card.setValue(i + 1);
            cards.add(card);
        }
        for (int i = 0; i < 13; i++) {
            Card card = new Card();
            card.setName(names.get(i) + " of Diamonds");
            card.setValue(i + 1);
            cards.add(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        return cards.remove(cards.size() - 1);
    }
}
