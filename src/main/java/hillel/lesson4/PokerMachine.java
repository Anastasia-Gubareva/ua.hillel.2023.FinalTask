package hillel.lesson4;
import java.util.ArrayList;
import java.util.Random;

public class PokerMachine {
    private final String[] suits = {"черви", "бубни", "піки", "крести"};
    private final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "валет", "дама", "король", "туз"};
    private ArrayList<String[]> deck = new ArrayList<>();
    private ArrayList<ArrayList<String[]>> players = new ArrayList<>();

    public static void main(String[] args) {
        PokerMachine pokerMachine = new PokerMachine();
        pokerMachine.createDeck();
        pokerMachine.shuffleDeck();
        pokerMachine.dealCards();
    }

    public void createDeck() {
        for (String suit : suits) {
            for (String rank : ranks) {
                String[] card = {rank, suit};
                deck.add(card);
            }
        }
    }

    public void shuffleDeck() {
        Random random = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String[] temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }
    }

    public void dealCards() {
        for (int i = 1; i <= 4; i++) {
            ArrayList<String[]> player = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                String[] card = deck.remove(0);
                player.add(card);
                System.out.println("Гравець " + i + " отримує карту " + card[0] + " " + card[1]);
            }
            players.add(player);
        }
    }
}