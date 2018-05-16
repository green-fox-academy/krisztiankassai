import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        String path = "file.txt";

       linewriter(path,"alma",5);
    }
    public static void linewriter (String path, String word, int number){

        List<String> content = new ArrayList();
        for (int i = 0; i < number; i++)
        content.add(word);
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, content);

        } catch (Exception e){

        }
    }
}
