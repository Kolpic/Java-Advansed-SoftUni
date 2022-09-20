package Exercise_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Basic_Stack_Operations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputOfThreeElements = scanner.nextLine().split(" ");

        int numbersToPush = Integer.parseInt(inputOfThreeElements[0]);
        int numbersToPop = Integer.parseInt(inputOfThreeElements[1]);
        int neededNumber = Integer.parseInt(inputOfThreeElements[2]);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numbersToPush; i++) {
            stack.push(Integer.parseInt(input[i]));
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println("0");
        }else if (stack.contains(neededNumber)){
            System.out.println(true);
        }else {
            System.out.println(Collections.min(stack));
        }
    }
}
