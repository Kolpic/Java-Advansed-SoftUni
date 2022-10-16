package Lab_Streams_Files_and_Directories;

import java.io.*;

public class Write_Every_Third_Line_05 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedReader Reader = new BufferedReader(new InputStreamReader(fileInputStream));

        FileOutputStream fileOutputStream = new FileOutputStream("every-third-line.txt");

        BufferedWriter Writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

        String line = Reader.readLine();

        int lineCounter = 1;

        while (line != null){
            if (lineCounter % 3 == 0){
                Writer.write(line);
                Writer.newLine();
            }
            line = Reader.readLine();
            lineCounter++;
        }
        Reader.close();
        Writer.flush();
        Writer.close();
    }
}
