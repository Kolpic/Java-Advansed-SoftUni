package Lab_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest_3_Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        int counter = 1;
        for(int num : sorted){
            if (counter > 3){
                break;
            }
            System.out.print(num + " ");
            counter++;
        }


    }
}
