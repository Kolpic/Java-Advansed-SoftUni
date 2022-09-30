package Exercises_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Fill_the_Matrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        
        int size = Integer.parseInt(input[0]);
        String method = input[1];
        
        int[][] matrix = new int[size][size];
        
        if (method.equals("A")){
            runMethodA(matrix,size);
        }else {
            runMethodB(matrix,size);
        }

        printMatrix(matrix,size);
    }

    private static void printMatrix(int[][] matrix, int size) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static void runMethodB(int[][] matrix, int size) {
        int counter = 1;

        for (int col = 0; col < size; col++) {
            if (col % 2 == 0){
                for (int r = 0; r < matrix.length; r++) {
                    matrix[r][col] = counter;
                    counter++;
                }
            }else {
                for (int r = matrix.length - 1; r >= 0; r--) {
                    matrix[r][col] = counter;
                    counter++;
                }
            }
        }
    }

    private static void runMethodA(int[][] matrix,int size) {

        int counter = 1;

        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix[c].length; r++) {
                matrix[r][c] = counter;
                counter++;
            }
        }
    }
}
