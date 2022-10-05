package Lab_Sets_and_Maps_Advanced;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;
import java.util.stream.Collectors;

public class Voina_Number_Game_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds > 0){

            Iterator<Integer> iterator = firstPlayer.iterator();

            int firstCard = iterator.next();
            firstPlayer.remove(firstCard);

            Iterator<Integer> iteratorTwo = secondPlayer.iterator();

            int secondCard = iteratorTwo.next();
            secondPlayer.remove(secondCard);

            if (firstCard > secondCard){
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            }else if (secondCard > firstCard){
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }


            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                break;
            }
            rounds--;
        }
        if (firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        }else if (secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }
    }
}
