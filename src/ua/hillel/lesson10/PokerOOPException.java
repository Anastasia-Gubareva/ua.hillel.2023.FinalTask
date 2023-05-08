package ua.hillel.lesson10;

public class PokerOOPException {

    public static void main(String[] args) {
        try {
            DeckException deck = new DeckException();
            deck.createDeck();
            deck.shuffleDeck();
            deck.serveCards();
        } catch (EmptyDeckException | InvalidCardIndexException e) {
            System.out.println(e.getMessage());
        }
    }
}
