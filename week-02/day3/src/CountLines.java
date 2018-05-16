import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        String filename = "src/file.txt";

        System.out.println(counter(filename));

    }
    public static int counter (String filename) {
        int linenum = 0;
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);

            linenum = lines.size();

        } catch (Exception e){

        }
        return linenum;

    }
}
