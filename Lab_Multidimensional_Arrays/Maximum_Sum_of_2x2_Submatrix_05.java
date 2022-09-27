package Lab_Multidimensional_Arrays;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Sum_of_2x2_Submatrix_05 {
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

        int maxSum = Integer.MIN_VALUE;
        StringBuilder miniMatrix = new StringBuilder();

        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {

                int sum = matrix[r][c] + matrix[r][c + 1]
                         + matrix[r + 1][c] + matrix[r + 1][c + 1];

                if (sum > maxSum){
                    maxSum = sum;
                    miniMatrix.delete(0,miniMatrix.length());
                    miniMatrix.append(matrix[r][c]);
                    miniMatrix.append(" ");
                    miniMatrix.append(matrix[r][c + 1]);
                    miniMatrix.append(System.lineSeparator());
                    miniMatrix.append(matrix[r + 1][c]);
                    miniMatrix.append(" ");
                    miniMatrix.append(matrix[r + 1][c + 1]);
                }
            }
        }
        System.out.println(miniMatrix);
        System.out.println(maxSum);

    }
}
