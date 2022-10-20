package Exercises_Streams_Files_and_Directories;

import java.io.*;
import java.util.Set;

public class Count_Character_Types_04 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String input = bufferedReader.readLine();

        int vowels = 0;
        Set<Character> vowel = Set.of('a','e','i','o','u');

        int consonants = 0;

        int punctuations = 0;
        Set<Character> punctuation = Set.of('?','!',',','.');

        char whitespace = ' ';

        while (input != null){
            char[] charLine = input.toCharArray();

            for (char currentChar : charLine){
                if (vowel.contains(currentChar)){
                    vowels++;
                }else if (punctuation.contains(currentChar)){
                    punctuations++;
                }else if (currentChar == whitespace){
                    consonants++;
                    consonants--;
                }else {
                    consonants++;
                }
            }

            input = bufferedReader.readLine();
        }
        bufferedWriter.write("Vowels: " + vowels);
        bufferedWriter.newLine();
        bufferedWriter.write("Consonants: " + consonants);
        bufferedWriter.newLine();
        bufferedWriter.write("Punctuation: " + punctuations);

        bufferedReader.close();
        bufferedWriter.close();
    }
}
