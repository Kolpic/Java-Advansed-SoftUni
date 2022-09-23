package Exercise_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Balanced_Parentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();
        boolean isBalanced = true;

        if (input.length() % 2 == 0){
            for (int i = 0; i < input.length()/2; i++) {
                if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{'){
                    stack.push(input.charAt(i));
                }
            }
            for (int i = input.length()/2; i < input.length(); i++) {
                if (input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}'){
                    queue.offer(input.charAt(i));
                }
            }
            while (!stack.isEmpty() && !queue.isEmpty()){
                char currentStack = stack.pop();
                char currentQueue = queue.poll();

                if (currentStack == '(' && currentQueue != ')'){
                    isBalanced = false;
                    break;
                }else if (currentStack == '[' && currentQueue != ']'){
                    isBalanced = false;
                    break;
                }else if (currentStack == '{' && currentQueue != '}'){
                    isBalanced = false;
                    break;
                }

            }
        }
        boolean empty = false;
        if (stack.isEmpty() && queue.isEmpty()){
            empty = true;
        }

        if (!isBalanced || input.length() % 2 != 0){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
