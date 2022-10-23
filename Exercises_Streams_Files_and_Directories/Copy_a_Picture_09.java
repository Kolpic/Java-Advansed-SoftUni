package Exercises_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_a_Picture_09 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\photo.jpg");
        FileOutputStream fos = new FileOutputStream("picture-copy.j");

        byte[] buffer = new byte[1024];

        while (fis.read(buffer) >= 0){
            fos.write(buffer);
        }
        fis.close();
        fos.close();
    }
}
