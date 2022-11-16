package My_Exam_22_October_2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Rally_Racing {

    public static int raceCarRwo = 0;
    public static int raceCarCol = 0;
    public static int firstTRwo;
    public static int firstTCol;
    public static int SecondTRwo;
    public static int SecondTCol;
    public static int totalKm = 0;
    public static boolean isFinished = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String racingNumber = scanner.nextLine();

        char[][] matrix = new char[size][size];

        for (int r = 0; r < matrix.length; r++) {
            List<Character> characterList = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());

            for (int c = 0; c < characterList.size(); c++) {
                char currentChar = characterList.get(c);

                if (currentChar == 'T') {
                    SecondTRwo = r;
                    SecondTCol = c;
                }
                matrix[r][c] = currentChar;
            }
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {

                if (matrix[r][c] == 'T' && r != SecondTRwo && c != SecondTCol){
                    firstTRwo = r;
                    firstTCol = c;
                    break;
                }

            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {


            if (command.equals("up")) {

                raceCarRwo--;
                totalKm += 10;

            } else if (command.equals("down")) {

                raceCarRwo++;
                totalKm += 10;

            } else if (command.equals("left")) {

                raceCarCol--;
                totalKm += 10;

            } else if (command.equals("right")) {

                raceCarCol++;
                totalKm += 10;

            } else {

            }

            if (matrix[raceCarRwo][raceCarCol] == 'T') {
                matrix[raceCarRwo][raceCarCol] = '.';

                raceCarRwo = SecondTRwo;
                raceCarCol = SecondTCol;
                totalKm += 20;

                matrix[SecondTRwo][SecondTCol] = '.';
            } else if (matrix[raceCarRwo][raceCarCol] == 'F') {
                isFinished = true;
                matrix[raceCarRwo][raceCarCol] = 'C';
                break;
            }

            command = scanner.nextLine();
        }
        matrix[raceCarRwo][raceCarCol] = 'C';

        if (isFinished) {
            System.out.printf("Racing car %s finished the stage!%n",racingNumber);
        } else {
            System.out.printf("Racing car %s DNF.%n",racingNumber);
        }

        System.out.printf("Distance covered %d km.%n",totalKm);

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
