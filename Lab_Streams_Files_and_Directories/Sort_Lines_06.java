package Lab_Streams_Files_and_Directories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Lines_06 {
    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\galin\\OneDrive\\Работен плот\\Streams\\input.txt";

        Path path = Paths.get(address);

        List<String> lines = Files.lines(path)
                .sorted()
                .collect(Collectors.toList());

        Files.write(Paths.get("sorted-lines.txt"),lines);
    }
}
