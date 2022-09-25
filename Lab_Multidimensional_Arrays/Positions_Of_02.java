package Lab_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Positions_Of_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersOfTheMatrix = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                .toArray();

        int rows = numbersOfTheMatrix[0];
        int cols = numbersOfTheMatrix[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }

        int numberToFind = scanner.nextInt();

        boolean isFound = false;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int currentNumber = matrix[r][c];
                if (currentNumber == numberToFind){
                    System.out.println(r + " " + c);
                    isFound = true;
                }
            }

        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
