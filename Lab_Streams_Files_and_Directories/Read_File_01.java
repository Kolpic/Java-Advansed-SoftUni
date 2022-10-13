package Lab_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read_File_01 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            int oneByte = fileInputStream.read();

            while (oneByte >= 0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
