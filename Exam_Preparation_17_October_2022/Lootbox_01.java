package Exam_Preparation_17_October_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Lootbox_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

         Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(queue::offer);

         Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);

        int collectionOfClaimedItems = 0;

        while (stack.size() !=0 && queue.size() != 0){

            int firstNumber = queue.peek();
            int lastNumber = stack.peek();

            int sum = firstNumber + lastNumber;

            if (sum % 2 == 0){
                collectionOfClaimedItems += sum;
                queue.poll();
                stack.pop();
            }else {
                int numberToAdd = stack.pop();
                queue.offer(numberToAdd);
            }
        }

        if (stack.size() == 0){
            System.out.println("Second lootbox is empty");
        }else {
            System.out.println("First lootbox is empty");
        }

        if (collectionOfClaimedItems >= 100){
            System.out.printf("Your loot was epic! Value: %d",collectionOfClaimedItems);
        }else {
            System.out.printf("Your loot was poor... Value: %d",collectionOfClaimedItems);
        }
    }
}
