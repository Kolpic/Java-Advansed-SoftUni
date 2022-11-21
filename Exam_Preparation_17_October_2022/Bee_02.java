package Exam_Preparation_17_October_2022;

import java.util.Scanner;

public class Bee_02 {
    public static int beeRow;
    public static int beeCol;
    public static boolean isoutOfRange = false;
    public static int pollinatedFlowers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int r = 0; r < matrix.length; r++) {
            String input = scanner.nextLine();
            matrix[r] = input.toCharArray();
            if (input.contains("B")){
                beeRow = r;
                int indexCol = input.indexOf("B");
                beeCol = indexCol;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            if (isoutOfRange){
                break;
            }
            switch (command){
                case"up":
                    if (outOfRange(matrix,beeRow - 1,beeCol)){
                        isoutOfRange = true;
                        continue;
                    }
                    moveUp(matrix,beeRow - 1,beeCol,pollinatedFlowers);
                    break;

                case"down":
                    if (outOfRange(matrix,beeRow + 1,beeCol)){
                        isoutOfRange = true;
                        continue;
                    }
                    moveDown(matrix,beeRow + 1,beeCol,pollinatedFlowers);
                    break;

                case"left":
                    if (outOfRange(matrix,beeRow,beeCol - 1)){
                        isoutOfRange = true;
                        continue;
                    }
                    moveLeft(matrix,beeRow,beeCol - 1,pollinatedFlowers);
                    break;

                case"right":
                   if (outOfRange(matrix,beeRow,beeCol + 1)){
                       isoutOfRange = true;
                       continue;
                   }
                    moveRight(matrix,beeRow,beeCol + 1,pollinatedFlowers);
                    break;
            }

            command = scanner.nextLine();
        }
        if (isoutOfRange){
            System.out.println("The bee got lost!");
            matrix[beeRow][beeCol] = '.';
        }

        if (pollinatedFlowers < 5){
            System.out.printf("The bee couldn't pollinate the flowers, " +
                    "she needed %d flowers more%n",5 - pollinatedFlowers);
        }else if (pollinatedFlowers >= 5){
            System.out.printf("Great job, the bee manage to" +
                    " pollinate %d flowers!%n",pollinatedFlowers);
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    public static boolean outOfRange(char[][] matrix,int r, int c){
        return r < 0 || r > matrix.length - 1 || c < 0 || c > matrix[r].length - 1;
    }

    private static void moveDown(char[][] matrix, int nextRow, int nextCol, int flowers) {
        if (matrix[nextRow][nextCol] == 'f'){
            matrix[beeRow][beeCol] = '.';
            flowers++;
            pollinatedFlowers = flowers;
            matrix[nextRow][nextCol] = 'B';
            beeRow = nextRow;
            beeCol = nextCol;
        }else if (matrix[nextRow][nextCol] == 'O'){
            matrix[beeRow][beeCol] = '.';
            matrix[nextRow][nextCol] = '.';
            if (matrix[nextRow + 1][nextCol] == 'f'){
                flowers++;
                pollinatedFlowers = flowers;
            }
            matrix[nextRow + 1][nextCol] = 'B';
            beeRow = nextRow + 1;
            beeCol = nextCol;
        }else {
            matrix[beeRow][beeCol] = '.';
            matrix[nextRow][nextCol] = 'B';
            beeRow = nextRow;
            beeCol = nextCol;
        }
    }

    private static void moveUp(char[][] matrix, int nextRow, int nextCol, int flowers) {
        if (matrix[nextRow][nextCol] == 'f'){
            matrix[beeRow][beeCol] = '.';
            flowers++;
            pollinatedFlowers = flowers;
            matrix[nextRow][nextCol] = 'B';
            beeRow = nextRow;
            beeCol = nextCol;
        }else if (matrix[nextRow][nextCol] == 'O'){
            matrix[beeRow][beeCol] = '.';
            matrix[nextRow][nextCol] = '.';
            if (matrix[nextRow - 1][nextCol] == 'f'){
                flowers++;
                pollinatedFlowers = flowers;
            }
            matrix[nextRow - 1][nextCol] = 'B';
            beeRow = nextRow - 1;
            beeCol = nextCol;
        }else {
            matrix[beeRow][beeCol] = '.';
            matrix[nextRow][nextCol] = 'B';
            beeRow = nextRow;
            beeCol = nextCol;
        }
    }

    private static void moveLeft(char[][] matrix, int nextRow, int nextCol, int flowers) {
        if (matrix[nextRow][nextCol] == 'f'){
            matrix[beeRow][beeCol] = '.';
            flowers++;
            pollinatedFlowers = flowers;
            matrix[nextRow][nextCol] = 'B';
            beeRow = nextRow;
            beeCol = nextCol;
        }else if (matrix[nextRow][nextCol] == 'O'){
            matrix[beeRow][beeCol] = '.';
            matrix[nextRow][nextCol] = '.';
            if (matrix[nextRow][nextCol - 1] == 'f'){
                flowers++;
                pollinatedFlowers = flowers;
            }
            matrix[nextRow][nextCol - 1] = 'B';
            beeRow = nextRow;
            beeCol = nextCol - 1;
        }else {
            matrix[beeRow][beeCol] = '.';
            matrix[nextRow][nextCol] = 'B';
            beeRow = nextRow;
            beeCol = nextCol;
        }
    }

    public static void moveRight(char[][] matrix, int nextRow, int nextCol, int flowers){
        if (matrix[nextRow][nextCol] == 'f'){
            matrix[beeRow][beeCol] = '.';
            flowers++;
            pollinatedFlowers = flowers;
            matrix[nextRow][nextCol] = 'B';
            beeRow = nextRow;
            beeCol = nextCol;
        }else if (matrix[nextRow][nextCol] == 'O'){
            matrix[beeRow][beeCol] = '.';
            matrix[nextRow][nextCol] = '.';
            if (matrix[nextRow][nextCol + 1] == 'f'){
                flowers++;
                pollinatedFlowers = flowers;
            }
            matrix[nextRow][nextCol + 1] = 'B';
            beeRow = nextRow;
            beeCol = nextCol + 1;
        }else {
            matrix[beeRow][beeCol] = '.';
            matrix[nextRow][nextCol] = 'B';
            beeRow = nextRow;
            beeCol = nextCol;
        }
    }
}
