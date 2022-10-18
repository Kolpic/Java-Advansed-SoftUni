package Exercises_Streams_Files_and_Directories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sum_Bytes_02 {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line = bufferedReader.readLine();

        long sum = 0;
        while (line != null){
            char[] charactersLine = line.toCharArray();
            for (char currentChar : charactersLine){
                sum += currentChar;
            }
            line = bufferedReader.readLine();
        }
        System.out.println(sum);
        bufferedReader.close();
    }
}
