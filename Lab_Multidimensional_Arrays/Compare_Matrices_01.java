package Lab_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Compare_Matrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        //вкарваме двете числа

        int rows = numbers[0];
        int cols = numbers[1];
        //избираме кое число ще е за ред и кое за колкона

        int[][] firstMatrix = new int[rows][cols];
        //създаваме матрицата с дадените редове и колони

        for (int r = 0; r < rows; r++) {//ред
            for (int c = 0; c < cols; c++) {//колона
                firstMatrix[r][c] = scanner.nextInt();// на н-ти ред и на н-та колона слагаме х-число
            }
        }
        // пълним матрицата

        rows = scanner.nextInt();
        cols = scanner.nextInt();

        int[][] secondMatrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                secondMatrix[r][c] = scanner.nextInt();
            }
        }

        boolean areEqual = firstMatrix.length == secondMatrix.length ;

        if(areEqual) {

            for (int r = 0; r < firstMatrix.length; r++) { //матрицата има масив от масиви,
                //а не само един масив за проверка

                int[] firstArr = firstMatrix[r];//взимаме като масив числата от първия ред на първата матрица
                int[] secondArr = secondMatrix[r];//взимаме като масив числата от първия ред на втората матрица


                if (firstArr.length != secondArr.length) {
                    areEqual = false;
                }
                //сравняваме дължините само от първите редове на двете матрици

                if (areEqual) {
                    for (int i = 0; i < firstArr.length; i++) {  //проверяваме с цикъл
                        int firstNumber = firstArr[i];    //взимаме првото число от първия ред на првата матрица
                        int secondNumber = secondArr[i];  //взимаме второто число от втория ред на втората матрица

                        if (firstNumber != secondNumber) {       //проверка дали числата са еднакви
                            areEqual = false;
                            break;
                        }
                    }
                }
            }
        }
        if (!areEqual){
            System.out.println("not equal");
        }else {
            System.out.println("equal");
        }


//        for (int r = 0; r < firstMatrix.length; r++) {
//            for (int c = 0; c < firstMatrix[r].length; c++) {
//                System.out.print(firstMatrix[r][c] + " ");
//            }
//            System.out.println();
//        }
    }
}
