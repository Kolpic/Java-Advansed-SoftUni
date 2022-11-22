package Exam_Preparation_20_June_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Flower_Wreaths_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();
        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();

        int flowerWreaths = 0;
        int sumWithoutWreaths = 0;

        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(liliesStack::push);

        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(rosesQueue::offer);

        while (!rosesQueue.isEmpty() && !liliesStack.isEmpty()) {
            int lastLilie = liliesStack.peek();
            int firstRose = rosesQueue.peek();

            int sum = lastLilie + firstRose;

            if (sum == 15) {
                flowerWreaths++;
                rosesQueue.poll();
                liliesStack.pop();
            } else if (sum > 15) {
                lastLilie = liliesStack.pop();
                lastLilie -= 2;
                liliesStack.push(lastLilie);
            }else {
                sumWithoutWreaths += sum;
                rosesQueue.poll();
                liliesStack.pop();
            }
        }
        int additionalWreaths = sumWithoutWreaths / 15;
        flowerWreaths += additionalWreaths;

        if (flowerWreaths >= 5) {
            System.out.printf("You made it, you are going to the " +
                    "competition with %d wreaths!%n",flowerWreaths);
        }else {
            System.out.printf("You didn't make it, you need %d wreaths more!%n",5 - flowerWreaths);
        }
    }
}
