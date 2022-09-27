package Lab_Multidimensional_Arrays;

import java.util.Scanner;

public class Print_Diagonals_of_Square_Matrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[number][number];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }

        int row = 0;
        int col = 0;

        while (row < matrix.length && col < matrix[row].length){
            System.out.print(matrix[row][col] + " ");
            row++;
            col++;
        }
        System.out.println();

        row = matrix.length - 1;
        col = 0;

        while (row >= 0 && col < matrix[row].length){
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }
    }
}
