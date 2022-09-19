package Lab_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class Hot_Potato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] players = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < players.length; i++) {
            queue.offer(players[i]);
        }

        while(queue.size() > 1){
            for (int i = 1; i < count; i++) {
                queue.offer(Objects.requireNonNull(queue.poll()));
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
