package My_Exam_22_October_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Energy_Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> milligramsOfCaffeinеStack = new ArrayDeque<>();
        ArrayDeque<Integer> energyDrinksQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(milligramsOfCaffeinеStack::push);

        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(energyDrinksQueue::offer);

//        int startingCaffeine = 0;
        int StamatTotalCaffeine = 0;

        while (!milligramsOfCaffeinеStack.isEmpty() && !energyDrinksQueue.isEmpty()) {
            int lastMilligrams = milligramsOfCaffeinеStack.pop();
            int FirstEnergyDrink = energyDrinksQueue.poll();

            int sum = lastMilligrams * FirstEnergyDrink;

            if (sum + StamatTotalCaffeine <= 300) {

                StamatTotalCaffeine += sum;


            } else {
                energyDrinksQueue.offer(FirstEnergyDrink);

                if (StamatTotalCaffeine >= 30) {
                    StamatTotalCaffeine -= 30;
                }

            }
        }

        if (!energyDrinksQueue.isEmpty()) {
            StringBuilder sb = new StringBuilder("Drinks left: ");
            for (int num : energyDrinksQueue) {
                sb.append(num);
                sb.append(", ");
            }
            sb.deleteCharAt(sb.length() - 2);
            System.out.println(sb.toString());
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.",StamatTotalCaffeine);
    }
}
