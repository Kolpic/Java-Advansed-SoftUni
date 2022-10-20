package Exercises_Streams_Files_and_Directories;

import java.io.*;

public class ALL_CAPITALS_03 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

        String line = bufferedReader.readLine();

        while (line != null){
            char[] charLine = line.toCharArray();
            for (char currentChar : charLine){
                bufferedWriter.write(Character.toUpperCase(currentChar));
            }
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
