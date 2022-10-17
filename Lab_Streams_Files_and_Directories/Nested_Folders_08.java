package Lab_Streams_Files_and_Directories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Nested_Folders_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams";

        File root = new File(path);

        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(root);

        int count = 0;
        while (!queue.isEmpty()){

            File file = queue.poll();

//            System.out.println(file.getName());

            File[] files = file.listFiles();

            if (files != null) {
                for (File f : files) {
                    queue.offer(f);
                    count++;
                }
            }
            System.out.println(file.getName());
        }
        System.out.println(count + " folders");
    }
}
