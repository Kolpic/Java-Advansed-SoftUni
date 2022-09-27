package Lab_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Matrix_Elements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = numbers[0];
        int cols = numbers[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int sumOfTheMatrix = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int currentNumber = matrix[r][c];
                sumOfTheMatrix += currentNumber;
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumOfTheMatrix);
    }
}
