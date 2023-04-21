package ua.hillel.lesson4;

public class Poker {
    public static void main(String[] args) {

        int cardsForPlayers = 5;
        String[] namesOfPlayers = {"Петро", "Марія", "Павло", "Оля "};
        String[] suits = {"Пика", "Бубни", "Черви", "Трефи"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Королева", "Король", "Туз"};
        int quantityOfCards = suits.length * rank.length;

        String[] deck = new String[quantityOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
            for (int i = 0; i < quantityOfCards; i++) {
            int r = i + (int) (Math.random() * (quantityOfCards - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        {
            //  for (int n = 0; n < namesOfPlayers.length; n++)  {
            //  System.out.println(namesOfPlayers[n]);

            for (int i = 0; i < namesOfPlayers.length * cardsForPlayers; i++) {
                System.out.println(deck[i]);
                if (i % cardsForPlayers == cardsForPlayers - 1)
                    System.out.println();
            }
        }
    }
}
