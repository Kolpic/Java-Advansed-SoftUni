package Exam_Preparation_10_February_2022;

import java.util.*;
import java.util.stream.Collectors;

public class Autumn_Cocktails_01 {
    public static boolean isBiggerThanOne = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> ingredientsQueue = new ArrayDeque<>();
        ArrayDeque<Integer> freshnessLevelStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(ingredientsQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(freshnessLevelStack::push);

        Map<String,Integer> cocktails = new TreeMap<>();
        cocktails.put("Pear Sour",0);
        cocktails.put("The Harvest",0);
        cocktails.put("Apple Hinny",0);
        cocktails.put("High Fashion",0);

        while (!ingredientsQueue.isEmpty() && !freshnessLevelStack.isEmpty()) {

            int firstIngredient = ingredientsQueue.poll();

            if (firstIngredient == 0) {
                continue;
            }
            int lastFreshnessLevel = freshnessLevelStack.pop();

            int sum = firstIngredient * lastFreshnessLevel;

            if (sum == 150) {

                cocktails.put("Pear Sour",cocktails.get("Pear Sour") + 1);

            } else if (sum == 250) {

                cocktails.put("The Harvest",cocktails.get("The Harvest") + 1);

            } else if (sum == 300) {

                cocktails.put("Apple Hinny",cocktails.get("Apple Hinny") + 1);

            } else if (sum == 400) {

                cocktails.put("High Fashion",cocktails.get("High Fashion") + 1);

            } else {

                firstIngredient += 5;
                ingredientsQueue.offer(firstIngredient);

            }
        }

        if (cocktails.get("Pear Sour") > 0 &&
                cocktails.get("The Harvest") > 0 &&
                cocktails.get("Apple Hinny") > 0 &&
                cocktails.get("High Fashion") > 0) {

            System.out.println("It's party time! The cocktails are ready!");
        } else {

            System.out.println("What a pity! You didn't manage to prepare all cocktails.");

        }

         int finalSum = 0;

         for (int num : ingredientsQueue) {
             finalSum += num;
         }

         if (finalSum > 0) {
             System.out.printf("Ingredients left: %d%n",finalSum);
         }

         cocktails.entrySet()
                 .forEach(e -> {
                     if (e.getValue() != 0) {
                         System.out.printf("# %s --> %d%n",e.getKey(),e.getValue());
                     }
                 });
    }
}
