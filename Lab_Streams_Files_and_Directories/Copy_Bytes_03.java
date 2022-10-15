package Lab_Streams_Files_and_Directories;

import java.io.*;
import java.util.Set;

public class Copy_Bytes_03 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        Set<Integer> spaces = Set.of(10,32);

        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        int bytes = fileInputStream.read();

        while (bytes >= 0){
            boolean isDelimiter = spaces.contains(bytes);

            if (isDelimiter){
                printWriter.print((char)bytes);
            }else {
                printWriter.print(bytes);
            }

            bytes = fileInputStream.read();
        }

    }
}
