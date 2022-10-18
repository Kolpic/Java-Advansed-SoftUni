package Exercises_Streams_Files_and_Directories;

import java.io.*;
import java.util.Scanner;

public class Sum_Lines_01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = reader.readLine();

        while (line != null){
            long sum = 0;

            char[] currentCharLine = line.toCharArray();

            for (char currentChar : currentCharLine){
                sum += currentChar;
            }
            System.out.println(sum);

            line = reader.readLine();
        }
        reader.close();
    }
}
