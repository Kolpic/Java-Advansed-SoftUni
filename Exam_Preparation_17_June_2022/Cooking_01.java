package Exam_Preparation_17_June_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Cooking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(queue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);

        int breadCount = 0;
        int cakeCount = 0;
        int pastryCount = 0;
        int fruitPieCount = 0;

        while (!queue.isEmpty() && !stack.isEmpty()){
            int liquid = queue.peek();
            int ingredient = stack.peek();

            int sum = liquid + ingredient;

            if (sum == 25){
                breadCount++;
                queue.poll();
                stack.pop();
            }else if (sum == 50){
                cakeCount++;
                queue.poll();
                stack.pop();
            }else if (sum == 75){
                pastryCount++;
                queue.poll();
                stack.pop();
            }else if (sum == 100){
                fruitPieCount++;
                queue.poll();
                stack.pop();
            }else {
                queue.poll();
                ingredient += 3;
                stack.pop();
                stack.push(ingredient);
            }

        }
        if (breadCount != 0 && cakeCount != 0
                && pastryCount != 0 && fruitPieCount != 0){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        if (queue.isEmpty()){
            System.out.println("Liquids left: none");
        }else {
            StringBuilder sb = new StringBuilder();
            sb.append("Liquids left: ");
            for (int num : queue){
                sb.append(num + ", ");
            }
            sb.deleteCharAt(sb.length()-2);
            System.out.println(sb.toString());
        }

        if (stack.isEmpty()){
            System.out.println("Ingredients left: none");
        }else {
            StringBuilder sb = new StringBuilder();
            sb.append("Ingredients left: ");
            for (int num : stack){
                sb.append(num + ", ");
            }
            sb.deleteCharAt(sb.length()-2);
            System.out.println(sb.toString());
        }

        for (int i = 0; i < 1; i++) {
            System.out.printf("Bread: %d%n",breadCount);
            System.out.printf("Cake: %d%n",cakeCount);
            System.out.printf("Fruit Pie: %d%n",fruitPieCount);
            System.out.printf("Pastry: %d%n",pastryCount);
        }
    }
}
