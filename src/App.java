public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Player player1 = new Player("Bob");
        Player player2 = new Player("Tom");

        // Players draw all cards
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Players reveal each of their cards and get points if theirs is higher value
        Card card1, card2;
        for (int i = 0; i < 26; i++) {
            card1 = player1.flip();
            card2 = player2.flip();
            if (card1.value > card2.value) {
                player1.incrementScore();
            } else if (card1.value < card2.value) {
                player2.incrementScore();
            }
        }

        // Scores are compared and announced
        player1.describe();
        player2.describe();
        if (player1.score > player2.score) {
            System.out.println(player1.name);
        } else if (player1.score < player2.score) {
            System.out.println(player2.name);
        } else {
            System.out.println("Draw");
        }
    }
}
