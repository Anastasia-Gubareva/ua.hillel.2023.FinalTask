package ua.hillel.lesson10;
class CardException {
    private final String suit;
    private final String value;

    public CardException(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value + " of " + suit;
    }
}
