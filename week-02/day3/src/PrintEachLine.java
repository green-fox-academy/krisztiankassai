import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("src/file.txt");
            List<String> lines = Files.readAllLines(filePath);

            System.out.println(lines);
        } catch (Exception e){

            System.out.println("Uh-oh could not read the file");
        }

    }
}
