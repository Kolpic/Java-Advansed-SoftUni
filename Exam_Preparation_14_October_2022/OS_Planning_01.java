package Exam_Preparation_14_October_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OS_Planning_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstLine = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> tasks = new ArrayDeque<>();

        for(Integer num : firstLine){
            tasks.push(num);
        }

        int[] secondLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> threads = new ArrayDeque<>();

        for (Integer num : secondLine){
            threads.offer(num);
        }

        int endTask = Integer.parseInt(scanner.nextLine());


        int tasksValue = tasks.peek();
        int threadsValue = threads.peek();

        while (tasksValue != endTask){

            if (threadsValue >= tasksValue){
                tasks.pop();
            }
            threads.poll();


            tasksValue = tasks.peek();
            threadsValue = threads.peek();
        }
        System.out.printf("Thread with value %d killed task %d%n",threads.peek(),tasks.peek());
        for (int num : threads){
            System.out.print(num + " ");
        }

    }
}
