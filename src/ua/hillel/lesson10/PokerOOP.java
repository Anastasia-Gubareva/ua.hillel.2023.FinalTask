package ua.hillel.lesson10;

public class PokerOOP {

    public static void main(String[] args) {
        try {
            Deck deck = new Deck();
            deck.createDeck();
            deck.shuffleDeck();
            deck.serveCards();
        } catch (Exceptions.EmptyDeckException | Exceptions.InvalidCardIndexException e) {
            System.out.println(e.getMessage());
        }
    }
}