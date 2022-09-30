package Exercises_Multidimensional_Arrays;

import java.util.Scanner;

public class Diagonal_Difference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfTheMatrix = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[sizeOfTheMatrix][sizeOfTheMatrix];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = Integer.parseInt(String.valueOf(scanner.nextInt()));
            }
        }

        int col = 0;
        int row = 0;

        int primarySum = 0;

        while (row < matrix.length && col < matrix[row].length){

            int currentNumber =  matrix[col][row];
            primarySum += currentNumber;
            row++;
            col++;

        }

        int secondarySum = 0;

        row = matrix.length - 1;
        col = 0;

        while (row >= 0 && col < matrix[row].length){
            int currentNumber = matrix[row][col];
            secondarySum += currentNumber;
            row--;
            col++;
        }
        System.out.println(Math.abs(primarySum - secondarySum));
    }
}
