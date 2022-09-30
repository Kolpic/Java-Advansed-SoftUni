package Exercises_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_of_Palindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = numbers[0];
        int cols = numbers[1];

        String[][] matrix = new String[rows][cols];

        char startingChar = 97;
        char middleChar = 97;

        for (int r = 0; r < matrix.length; r++) {
            middleChar = startingChar;
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] =  (startingChar + "" + middleChar + "" +startingChar);
                middleChar++;
            }
            startingChar++;
        }
        printMatrix(matrix,rows,cols);
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
