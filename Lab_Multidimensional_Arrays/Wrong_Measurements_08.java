package Lab_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Wrong_Measurements_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        
        int[][] matrix = new int[number][];

        for (int r = 0; r < matrix.length; r++) {
                matrix[r] = readArray(scanner);

        }

        int[] wrongNumbers = readArray(scanner);

        int row = wrongNumbers[0];
        int col = wrongNumbers[1];
        
        int wrongNumber = matrix[row][col];

        List<int[]> correctValues = new ArrayList<>();

        for (int r = 0; r < matrix.length ; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                int currentNumber = matrix[r][c];

                if (currentNumber == wrongNumber){
                    int correctValue = getNearbySum(matrix,r,c,wrongNumber);
                    correctValues.add(new int[]{r,c,correctValue});
                }
            }
        }

        for (int[] correctValue : correctValues) {
            int r = correctValue[0];
            int c = correctValue[1];
            matrix[r][c] = correctValue[2];
        }
        
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static int getNearbySum(int[][] matrix, int r, int c,int wrongNumber) {
        int sum = 0;

        if (inBounds(matrix,r,c - 1) && matrix[r][c - 1] != wrongNumber){
            sum += matrix[r][c - 1];

        }
        if (inBounds(matrix,r,c + 1) && matrix[r][c + 1] != wrongNumber){
            sum += matrix[r][c + 1];

        }
        if (inBounds(matrix,r - 1,c) && matrix[r - 1][c] != wrongNumber){
            sum += matrix[r - 1][c];

        }
        if (inBounds(matrix,r + 1,c) && matrix[r + 1][c] != wrongNumber){
            sum += matrix[r + 1][c];

        }

        return sum;
    }

    private static boolean inBounds(int[][] matrix ,int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
