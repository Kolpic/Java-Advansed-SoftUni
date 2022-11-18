package Exam_Preparation_14_October_2022;

import java.util.Arrays;
import java.util.Scanner;

public class ReVolt_02 {
    public static int playerRow;
    public static int playerCol;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int countOfCommands = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int r = 0; r < matrix.length; r++) {
            String scan = scanner.nextLine();
            matrix[r] = scan.toCharArray();

            if (scan.contains("f")){
                playerRow = r;
                playerCol = scan.indexOf("f");
            }

        }

//        for (int r = 0; r < matrix.length; r++) {
//            for (int c = 0; c < matrix[r].length; c++) {
//                if (matrix[r][c] == 'f'){
//                    playerRow = r;
//                    playerCol = c;
//                    break;
//                }
//            }
//        }

        boolean end = false;

        while (countOfCommands > 0 && !end){

            String command = scanner.nextLine();
            switch (command){
                case "up":
                    end = movePlayerUp(matrix, end);
                    break;

                case "down":
                    end = movePlayerDown(matrix, end);
                    break;

                case "left":
                    end = movePlayerLeft(matrix, end);
                    break;

                case "right":
                    end = movePlayerRight(matrix, end);
                    break;
            }

            countOfCommands--;
        }
        if (!end){
            System.out.println("Player lost!");
            printMatrix(matrix);
        }
    }

    private static boolean movePlayerRight(char[][] matrix, boolean end) {
        matrix[playerRow][playerCol] = '-';
        playerCol++;
        checkPlayerOutOfMatrix(matrix);
        if (matrix[playerRow][playerCol] == 'T'){
            playerCol--;
            matrix[playerRow][playerCol] = 'f';
        }else if (matrix[playerRow][playerCol] == 'B'){
            playerCol++;
            checkPlayerOutOfMatrix(matrix);
            matrix[playerRow][playerCol] = 'f';
        }else if (matrix[playerRow][playerCol] == 'F'){
            matrix[playerRow][playerCol] = 'f';
            System.out.println("Player won!");
            printMatrix(matrix);
            end = true;
        }else {
            matrix[playerRow][playerCol] = 'f';
        }
        return end;
    }

    private static boolean movePlayerLeft(char[][] matrix, boolean end) {
        matrix[playerRow][playerCol] = '-';
        playerCol--;
        checkPlayerOutOfMatrix(matrix);
        if (matrix[playerRow][playerCol] == 'T'){
            playerCol++;
            matrix[playerRow][playerCol] = 'f';
        }else if (matrix[playerRow][playerCol] == 'B'){
            playerCol--;
            checkPlayerOutOfMatrix(matrix);
            matrix[playerRow][playerCol] = 'f';
        }else if (matrix[playerRow][playerCol] == 'F'){
            matrix[playerRow][playerCol] = 'f';
            System.out.println("Player won!");
            printMatrix(matrix);
            end = true;
        }else {
            matrix[playerRow][playerCol] = 'f';
        }
        return end;
    }

    private static boolean movePlayerDown(char[][] matrix, boolean end) {
        matrix[playerRow][playerCol] = '-';
        playerRow++;
        checkPlayerOutOfMatrix(matrix);
        if (matrix[playerRow][playerCol] == 'T'){
            playerRow--;
            matrix[playerRow][playerCol] = 'f';
        }else if (matrix[playerRow][playerCol] == 'B'){
            playerRow++;
            checkPlayerOutOfMatrix(matrix);
            matrix[playerRow][playerCol] = 'f';
        }else if (matrix[playerRow][playerCol] == 'F'){
            matrix[playerRow][playerCol] = 'f';
            System.out.println("Player won!");
            printMatrix(matrix);
            end = true;
        }else {
            matrix[playerRow][playerCol] = 'f';
        }
        return end;
    }

    private static boolean movePlayerUp(char[][] matrix, boolean end) {
        matrix[playerRow][playerCol] = '-';
        playerRow--;
        checkPlayerOutOfMatrix(matrix);
        if (matrix[playerRow][playerCol] == 'T'){
            playerRow++;
            matrix[playerRow][playerCol] = 'f';
        }else if (matrix[playerRow][playerCol] == 'B'){
            playerRow--;
            checkPlayerOutOfMatrix(matrix);
            matrix[playerRow][playerCol] = 'f';
        }else if (matrix[playerRow][playerCol] == 'F'){
            matrix[playerRow][playerCol] = 'f';
            System.out.println("Player won!");
            printMatrix(matrix);
            end = true;
        }else {
            matrix[playerRow][playerCol] = 'f';
        }
        return end;
    }

    private static void checkPlayerOutOfMatrix(char[][] matrix){
        if (playerRow < 0){
            playerRow = matrix.length - 1;
        }else if (playerRow > matrix.length - 1){
            playerRow = 0;
        }else if (playerCol < 0){
            playerCol = matrix.length - 1;
        }else if (playerCol > matrix.length - 1){
            playerCol = 0;
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
