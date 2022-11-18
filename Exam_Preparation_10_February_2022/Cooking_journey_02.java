package Exam_Preparation_10_February_2022;

import java.util.Scanner;

public class Cooking_journey_02 {

    public static int currentRow;
    public static int currentCol;
    public static int money;
    public static boolean outOfBounds = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int r = 0; r < matrix.length; r++) {
            String scan = scanner.nextLine();
            matrix[r] = scan.toCharArray();

            if (scan.contains("S")) {
                currentRow = r;
                currentCol = scan.indexOf('S');
            }
        }

        String command = scanner.nextLine();

        while (money <= 49) {

            int nextRow = currentRow;
            int nextCol = currentCol;

            matrix[currentRow][currentCol] = '-';

            if (command.equals("up") && currentRow > 0) {

                nextRow--;

            } else if (command.equals("down") && currentRow < matrix.length - 1) {

                nextRow++;

            } else if (command.equals("left") && currentCol > 0) {

                nextCol--;

            } else if (command.equals("right") && currentCol < matrix[currentRow].length - 1) {

                nextCol++;

            } else  {
                outOfBounds = true;
                break;
            }

            if (matrix[nextRow][nextCol] == 'P') {

                int currentPillarRow = nextRow;
                int currentPillarCol = nextCol;
                matrix[currentPillarRow][currentPillarCol] = '-';

                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix[r].length; c++) {

                        if (matrix[r][c] == 'P' && r != currentPillarRow && c != currentPillarCol) {
                            currentPillarRow = r;
                            currentPillarCol = c;
                            break;
                        }
                    }
                }

                nextRow = currentPillarRow;
                nextCol = currentPillarCol;
            } else if (matrix[nextRow][nextCol] == '-') {
                currentRow = nextRow;
                currentCol = nextCol;

                matrix[currentRow][currentCol] = 'S';
            } else {
                char digit = matrix[nextRow][nextCol];
               boolean isDigit = Character.isDigit(digit);

               if (isDigit) {
                   int digitInt = Integer.parseInt(String.valueOf(digit));
                   money += digitInt;
               }
            }

            currentRow = nextRow;
            currentCol = nextCol;

            matrix[currentRow][currentCol] = 'S';

            if (money <= 49) {
                command = scanner.nextLine();
            }
        }

        if (outOfBounds) {
            System.out.println("Bad news! You are out of the pastry shop.");
        }

        if (money >= 50) {
            System.out.println("Good news! You succeeded in collecting enough money!");
        }

        System.out.println("Money: " + money);

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
