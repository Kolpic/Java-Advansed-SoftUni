package Exercises_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maximal_Sum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = scanNumbers(scanner);

        int rows = numbers[0];
        int cols = numbers[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }

        StringBuilder matrixPrinter = new StringBuilder();
        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {

                int currentSum = 0;

                if (c + 2 > matrix[r].length - 1 || r + 2 > matrix.length - 1){
                    break;
                }else {
                     currentSum = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2] +
                            matrix[r + 1][c] + matrix[r + 1][c + 1] + matrix[r + 1][c + 2] +
                            matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];
                }


                if (currentSum > maxSum){
                    maxSum = currentSum;
                    matrixPrinter.delete(0,matrixPrinter.length());
                    matrixPrinter.append(matrix[r][c]).append(" ").append(matrix[r][c + 1]).append(" ").append(matrix[r][c + 2]).append(System.lineSeparator());
                    matrixPrinter.append(matrix[r + 1][c]).append(" ").append(matrix[r + 1][c + 1]).append(" ").append(matrix[r + 1][c + 2]).append(System.lineSeparator());
                    matrixPrinter.append(matrix[r + 2][c]).append(" ").append(matrix[r + 2][c + 1]).append(" ").append(matrix[r + 2][c + 2]).append(System.lineSeparator());

                }
            }
        }
        System.out.println("Sum = " + maxSum);
        System.out.println(matrixPrinter);
    }

    private static int[] scanNumbers(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
