package Lab_Multidimensional_Arrays;

import java.util.Scanner;
import java.util.SortedMap;

public class Intersection_of_Two_Matrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        String[][] matrixA = new String[row][col];

        for (int r = 0; r < matrixA.length; r++) {
            for (int c = 0; c < matrixA[r].length; c++) {
                matrixA[r][c] = scanner.next();
            }
        }

        String[][] matrixB = new String[row][col];

        for (int r = 0; r < matrixB.length; r++) {
            for (int c = 0; c < matrixB[r].length; c++) {
                matrixB[r][c] = scanner.next();
            }
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < matrixA.length; i++) {
            String[] matrixARow = matrixA[i];
            String[] matrixBRow = matrixB[i];

            for (int j = 0; j < matrixA[i].length; j++) {
                String matrixACurrentNum = matrixARow[j];
                String matrixBCurrentNum = matrixBRow[j];

                if (matrixACurrentNum.equals(matrixBCurrentNum)){
                    output.append(matrixACurrentNum);
                    output.append(" ");
                }else {
                    output.append("*");
                    output.append(" ");
                }
            }
            output.append(System.lineSeparator());

        }
        System.out.println(output);

    }
}
