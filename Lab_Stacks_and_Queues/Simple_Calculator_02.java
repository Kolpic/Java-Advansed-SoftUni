package Lab_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Simple_Calculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack,input);

        while (stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            if (operator.equals("+")){
                stack.push(String.valueOf(firstNum + secondNum));
            }else {
                stack.push(String.valueOf(firstNum - secondNum));
            }
        }
        System.out.println(stack.pop());
    }
}
