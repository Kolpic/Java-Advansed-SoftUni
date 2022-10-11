package Exercises_Sets_and_Maps_Advanced;

import java.util.*;

public class Hands_Of_Cards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> playerAndCards = new LinkedHashMap<>();

        while (!input.equals("JOKER")){
            String name = input.split(": ")[0];
            String[] cards = input.substring(name.length() + 2,input.length()).split(",\\s+");

            for (int i = 0; i < cards.length; i++) {

                if (!playerAndCards.containsKey(name)){
                    playerAndCards.put(name,new HashSet<>());
                }
                    playerAndCards.get(name).add(cards[i]);

            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> currentCard : playerAndCards.entrySet()){
            String name = currentCard.getKey();
            int points = calculatePoints(currentCard.getValue());

            System.out.println(name + ": " + points);
        }
    }

    private static int calculatePoints(Set<String> cards) {
        int points = 0;

        for (String card : cards){
            String power = card.substring(0,card.length() - 1);
            String type = card.substring(card.length() - 1);
            int cardsPoints = getPower(power) * getType(type);
            points += cardsPoints;
        }
        return points;
    }

    private static int getType(String type){
        switch (type){
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
        }
        return 0;
    }


    private static int getPower(String power) {
        switch (power){
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
        }
        return 0;
    }
}
