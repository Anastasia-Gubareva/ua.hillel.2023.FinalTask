package ua.hillel.lesson10;


import java.util.Random;

class DeckException {
    private static final int NUMBER_OF_CARDS = 52;
    private final static int NUM_OF_PLAYERS = 4;
    private final CardException[] deck = new CardException[NUMBER_OF_CARDS];
    private int currentIndex = 0;

    public void createDeck() {
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int index = 0;
        for (String suit : suits) {
            for (String value : values) {
                deck[index++] = new CardException(suit, value);
            }
        }
    }

    public void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(NUMBER_OF_CARDS);
            int out = random.nextInt(NUMBER_OF_CARDS);
            CardException tmpCard = deck[in];
            deck[in] = deck[out];
            deck[out] = tmpCard;
        }
    }

    public void serveCards() throws EmptyDeckException, InvalidCardIndexException {
        if (currentIndex >= NUMBER_OF_CARDS) {
            throw new EmptyDeckException("The deck is empty");
        }
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round: " + round);

            for (int player = 1; player <= NUM_OF_PLAYERS; player++) {
                if (currentIndex >= NUMBER_OF_CARDS) {
                    throw new EmptyDeckException("The deck is empty");
                }
                System.out.println("Player " + player + " gets: " + deck[currentIndex++]);
            }

            System.out.println("====================\n");
        }
    }
}

class EmptyDeckException extends Exception {
    public EmptyDeckException(String message) {
        super(message);
    }
}

class InvalidCardIndexException extends Exception {
    public InvalidCardIndexException(String message) {
        super(message);
    }
}