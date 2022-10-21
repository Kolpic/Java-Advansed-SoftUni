package Exercises_Streams_Files_and_Directories;

import java.io.*;

public class Line_Numbers_05 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\inputLineNumbers.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String line = bufferedReader.readLine();

        int counter = 1;
        while (line != null){
            bufferedWriter.write(counter + ". " + line);
            bufferedWriter.newLine();
            counter++;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
