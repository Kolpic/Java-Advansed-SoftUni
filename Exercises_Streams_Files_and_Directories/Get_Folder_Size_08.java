package Exercises_Streams_Files_and_Directories;

import java.io.File;
import java.util.ArrayDeque;

public class Get_Folder_Size_08 {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\Exercises Resources");

        ArrayDeque<File> directories = new ArrayDeque<>();

        directories.offer(folder);

        int sumOfBytes = 0;

        while (!directories.isEmpty()){
             File current = directories.poll();
             File[] files = current.listFiles();
             for (File file : files){
                 if (file.isDirectory()){
                     directories.offer(file);
                 }else {
                     sumOfBytes += file.length();
                 }
             }
        }
        System.out.println(sumOfBytes);
    }
}
