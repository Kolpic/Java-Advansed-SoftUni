package Exercise_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Basic_Queue_Operations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] threeNumbers = scanner.nextLine().split(" ");

        int numberToOffer = Integer.parseInt(threeNumbers[0]);
        int numberToPoll = Integer.parseInt(threeNumbers[1]);
        int neededNumber = Integer.parseInt(threeNumbers[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i <numberToOffer ; i++) {
            queue.offer(Integer.parseInt(input[i]));
        }
        for (int i = 0; i < numberToPoll; i++) {
            queue.poll();
        }
        if (queue.isEmpty()){
            System.out.println("0");
        }else if (queue.contains(neededNumber)){
            System.out.println(true);
        }else {
            System.out.println(Collections.min(queue));
        }
    }
}
