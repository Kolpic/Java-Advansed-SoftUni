package Lab_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Extract_Integers_04 {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }else {
                scanner.next();
            }
        }
    }
}
