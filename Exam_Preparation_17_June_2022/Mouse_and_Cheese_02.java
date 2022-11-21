package Exam_Preparation_17_June_2022;

import java.util.Scanner;

public class Mouse_and_Cheese_02 {
    public static int mouseRow;
    public static int mouseCol;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] territory = new char[size][size];

        for (int r = 0; r < territory.length; r++) {
            String scanRow = scanner.nextLine();
            territory[r] = scanRow.toCharArray();

            if (scanRow.contains("M")) {
                mouseRow = r;
                int colMouse = scanRow.indexOf('M');
                mouseCol = colMouse;
            }
        }
        String command = scanner.nextLine();

        int eatenCheeses = 0;

        while (!command.equals("end")) {
            territory[mouseRow][mouseCol] = '-';

            if (command.equals("up") && mouseRow > 0) {
                mouseRow--;

            } else if (command.equals("down") && mouseRow < territory.length - 1){
                mouseRow++;

            } else if (command.equals("left") && mouseCol > 0) {
                mouseCol--;

            } else if (command.equals("right") && mouseCol < territory.length - 1) {
                mouseCol++;
            }else {
                territory[mouseRow][mouseCol] = '-';
                System.out.println("Where is the mouse?");
                break;
            }

            if (territory[mouseRow][mouseCol] == 'c') {
                eatenCheeses++;
            } else if (territory[mouseRow][mouseCol] == 'B') {
                continue;
            }

            territory[mouseRow][mouseCol] = 'M';

            command = scanner.nextLine();
        }

        if (eatenCheeses < 5) {
            System.out.printf("The mouse couldn't eat the cheeses," +
                    " she needed %d cheeses more.%n", 5 - eatenCheeses);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n",eatenCheeses);
        }

        printMatrix(territory);
    }
    public static void printMatrix(char[][] matrix){
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
