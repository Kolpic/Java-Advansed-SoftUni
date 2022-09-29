package Lab_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Real_Queen_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().split(" ");
        }


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                String currentChar = matrix[r][c];

                if (currentChar.equals("q")){
//                    int currentPlaceInMatrix = Integer.parseInt(matrix[r][c]);

                    if (goLeft(matrix,r,c) && goRight(matrix,r,c)
                    && goUp(matrix,r,c) && goDown(matrix,r,c)
                    && goUpAndLeft(matrix,r,c) && goUpAndRight(matrix,r,c)
                    && goDownAndLeft(matrix,r,c) && goDownAndRight(matrix,r,c)){
                        System.out.print(r + " " + c);
                    }
                }

            }

        }
    }

    private static boolean goRight(String[][] matrix, int r, int c) {
        int row = r;
        int col = c;

        while (col < matrix[r].length - 1){
            col++;
            if (matrix[row][col].equals("q")){
                return false;
            }
        }
        return true;
    }

    private static boolean goLeft(String[][] matrix, int r, int c) {
        int row = r;
        int col = c;

        while (col > 0){
            col--;
            if (matrix[row][col].equals("q")){
                return false;
            }
        }
        return true;
    }

    private static boolean goDown(String[][] matrix, int r, int c) {
        int row = r;
        int col = c;

        while (row < matrix.length - 1){
            row++;
            if (matrix[row][col].equals("q")){
                return false;
            }
        }
        return true;
    }

    private static boolean goUp(String[][] matrix, int r, int c) {
        int row = r;
        int col = c;

        while (row > 0){
            row--;
            if (matrix[row][col].equals("q")){
                return false;
            }
        }
        return true;
    }

    private static boolean goDownAndRight(String[][] matrix, int r, int c) {
        int row = r;
        int col = c;

        while (row < matrix.length - 1 && col < matrix[row].length - 1){
            row++;
            col++;
            if (matrix[row][col].equals("q")){
                return false;
            }
        }
        return true;
    }

    private static boolean goDownAndLeft(String[][] matrix, int r, int c) {
        int row = r;
        int col = c;

        while (row < matrix.length - 1 && col > 0){
            row++;
            col--;
            if (matrix[row][col].equals("q")){
                return false;
            }
        }
        return true;
    }

    private static boolean goUpAndLeft(String[][] matrix, int r, int c) {

        int row = r;
        int col = c;


        while (row > 0 && col > 0){
            row--;
            col--;
           if (matrix[row][col].equals("q")){
               return false;
           }
        }
        return true;
    }

    private static boolean goUpAndRight(String[][] matrix, int r, int c) {

        int row = r;
        int col = c;


        while (row > 0 && col < matrix[row].length - 1){
            row--;
            col++;
            if (matrix[row][col].equals("q")){
                return false;
            }
        }
        return true;
    }

}
