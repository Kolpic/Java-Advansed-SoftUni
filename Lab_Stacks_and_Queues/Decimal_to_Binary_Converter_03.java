package Lab_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Decimal_to_Binary_Converter_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (number != 0){
            stack.push(number % 2);
            number = number / 2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
