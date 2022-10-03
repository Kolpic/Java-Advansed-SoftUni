package Exercises_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_Matrix_Rotation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        String rotationString = rotation.split("[()]")[1];
        int rotationInt = Integer.parseInt(rotationString);
        int angleOfRotation = rotationInt % 360;

        String input = scanner.nextLine();

        List<String> list = new ArrayList<>();

        while (!input.equals("END")){
            list.add(input);
            input = scanner.nextLine();
        }

        String maxWord = "";

        for (int i = 0; i < list.size(); i++) {
            String currentWord = list.get(i);
            int currentWordLength = currentWord.length();

            if (currentWordLength > maxWord.length()){
                maxWord = currentWord;
            }
        }

        int row = list.size();
        int col = maxWord.length();

        char[][] matrix = new char[list.size()][maxWord.length()];

            for (int r = 0; r < matrix.length; r++) {
                    String word = list.get(r);
                for (int c = 0; c < matrix[r].length; c++) {
                    try{
                        char currentChar = word.charAt(c);
                        matrix[r][c] = currentChar;
                    }
                    catch (Exception e){
                        matrix[r][c] = ' ';
                    }
                }
            }

            switch (angleOfRotation){
                case 0:
                    for (int r = 0; r < matrix.length; r++) {
                        for (int c = 0; c < matrix[r].length; c++) {
                            System.out.print(matrix[r][c]);
                        }
                        System.out.println();
                    }
                    break;
                case 90:
                    for (int c = 0; c < col; c++) {
                        for (int r = matrix.length - 1; r >= 0; r--) {
                            System.out.print(matrix[r][c]);
                        }
                        System.out.println();
                    }
                    break;
                case 180:
                    for (int r = matrix.length - 1; r >= 0; r--) {
                        for (int c = matrix[r].length - 1; c >= 0; c--) {
                            System.out.print(matrix[r][c]);
                        }
                        System.out.println();
                    }
                    break;
                case 270:
                    for (int c = col - 1; c >= 0; c--) {
                        for (int r = 0; r < matrix.length; r++) {
                            System.out.print(matrix[r][c]);
                        }
                        System.out.println();
                    }
                    break;
            }

        //Rotating the matrix
        //From top to bottom - row++
        //From bottom to top - row--
        //From left to right - col++
        //From right to left - col--
    }
}
