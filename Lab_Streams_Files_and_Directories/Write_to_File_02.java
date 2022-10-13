package Lab_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Write_to_File_02 {
    public static void main(String[] args) {

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int bytes = fileInputStream.read();



            while (bytes >= 0){
                if ((char)bytes == ',' || (char)bytes == '.' || (char)bytes == '!'|| (char)bytes == '?'){
                    bytes = fileInputStream.read();
                    continue;
                }
                System.out.print((char) bytes);
                bytes = fileInputStream.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
