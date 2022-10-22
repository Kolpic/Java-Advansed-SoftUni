package Exercises_Streams_Files_and_Directories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Merge_Two_Files_07 {
    public static void main(String[] args) throws IOException {

        Path FirstFile = Paths.get("C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\inputOne.txt");
        List<String> firstFileLines = Files.readAllLines(FirstFile);

        Path SecondFile = Paths.get("C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\inputTwo.txt");
        List<String> secondFileLines = Files.readAllLines(SecondFile);

        Path output = Paths.get("output.txt");
        Files.write(output,firstFileLines, StandardOpenOption.APPEND);
        Files.write(output,secondFileLines, StandardOpenOption.APPEND);
    }
}
