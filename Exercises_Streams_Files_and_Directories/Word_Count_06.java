package Exercises_Streams_Files_and_Directories;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Word_Count_06 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\words.txt";
        String textToFind = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\text.txt";

        BufferedReader words = new BufferedReader(new FileReader(path));
        BufferedReader textToSearch = new BufferedReader(new FileReader(textToFind));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("results.txt"));

        Map<String,Integer> mapWords = new LinkedHashMap<>();

        String input = words.readLine();

        while (input != null){
            String[] inputArr = input.split(" ");
            for (String currentWord : inputArr){
                if (!mapWords.containsKey(currentWord)){
                    mapWords.put(currentWord,0);
                }
            }
            input = words.readLine();
        }

        String command = textToSearch.readLine();

        while (command != null){
            String[] commandArr = command.split("\\s+");
            for (String currentWord : commandArr){
                if (mapWords.containsKey(currentWord)){
                   int currentValue = mapWords.get(currentWord);
                   mapWords.put(currentWord,currentValue + 1);
                }
            }
            command = textToSearch.readLine();
        }
        mapWords.entrySet().stream().forEach(e->{
            try {
                bufferedWriter.write(e.getKey() + " - " + e.getValue());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                bufferedWriter.newLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        textToSearch.close();
        textToSearch.close();
        bufferedWriter.close();
    }
}
