package Lab_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Math_Potato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] players = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String name:players) {
            queue.offer(name);
        }
        int cycle = 1;

        while (queue.size() > 1){
            for (int i = 1; i < count; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)){
                System.out.println("Prime " + queue.peek());
            }else {
                System.out.println("Removed " + queue.poll());
            }

           cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int cycle) {
        if(cycle == 0 || cycle == 1)
            return false;
        if(cycle == 2)
            return true;
        // Look for a divisor other than 1 and cycle
        for(int div = 2; div*div <= cycle; div++) {
            // if found return false
            if(cycle % div==0)
                return false;
        }
        // No divisors found => return it is a prime number
        return true;
    }
}
