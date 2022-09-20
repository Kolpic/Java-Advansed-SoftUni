package Exercise_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Reverse_Numbers_with_a_Stack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Deque<String> stack = new ArrayDeque<>();

        for (String currentNum:input) {
            stack.push(currentNum);
        }

        while (!stack.isEmpty()){
            System.out.printf("%s ",stack.pop());
        }
    }
}
