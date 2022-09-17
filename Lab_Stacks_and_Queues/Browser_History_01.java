package Lab_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = scanner.nextLine();

        String currentURL = null;

        while(!input.equals("Home")){

            if (input.equals("back")){
                if(stack.isEmpty()){
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }else {
                    currentURL = stack.pop();
                }
            }else {
                if (currentURL != null){
                    stack.push(currentURL);
                }
                currentURL = input;
            }

                System.out.println(currentURL);

            input = scanner.nextLine();
        }
    }
}
