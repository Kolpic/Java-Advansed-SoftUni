package Exam_Preparation_20_June_2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb_02 {

    private static int sapperRow;
    private static int sapperCol;
    private static int defusedBombs;
    private static int allBombsCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String commands = scanner.nextLine();

        char[][] matrix = new char[size][size];


        for (int r = 0; r < matrix.length; r++) {
            List<Character> characterList = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());

            for (int c = 0; c < characterList.size(); c++) {
                char currentChar = characterList.get(c);

                if (currentChar == 's') {
                    sapperRow = r;
                    sapperCol = c;
                } else if (currentChar == 'B') {
                    allBombsCount++;
                }

                matrix[r][c] = currentChar;
            }
        }

        String[] commandsArr = commands.split(",");

        boolean endOfTheRoute = false;

        for (int i = 0; i < commandsArr.length; i++) {

            if (endOfTheRoute) {
                break;
            }
            String currentCommand = commandsArr[i];

            matrix[sapperRow][sapperCol] = '+';

            if (currentCommand.equals("up")) {
                if (sapperRow != 0) {
                    sapperRow--;
                }
            } else if (currentCommand.equals("down")) {
                if (sapperRow != size - 1) {
                    sapperRow++;
                }
            } else if (currentCommand.equals("left")) {
                if (sapperCol != 0) {
                    sapperCol--;
                }
            } else if (currentCommand.equals("right")) {
                if (sapperCol != size - 1) {
                    sapperCol++;
                }
            }

            if (matrix[sapperRow][sapperCol] == 'B') {
                defusedBombs++;
                System.out.println("You found a bomb!");
            } else if (matrix[sapperRow][sapperCol] == 'e') {
                endOfTheRoute = true;
                break;
            }

            matrix[sapperRow][sapperCol] = 's';
        }

        if (allBombsCount == defusedBombs) {
            System.out.println("Congratulations! You found all bombs!");
        } else if (endOfTheRoute) {
            System.out.printf("END! %d bombs left on the field",allBombsCount - defusedBombs);
        } else {
            System.out.println(allBombsCount - defusedBombs + " " +
                    "bombs left on the field. Sapper position: " + "(" + sapperRow + " " + sapperCol + ")");
        }

    }
    public static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
