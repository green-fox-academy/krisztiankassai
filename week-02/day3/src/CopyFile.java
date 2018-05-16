import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\pc\\greenfox\\krisztiankassai\\week-02\\day3\\file11.txt";

        String file2 = "C:\\Users\\pc\\greenfox\\krisztiankassai\\week-02\\day3\\file2.txt";

        copy(file1, file2);

    }
    public static boolean copy (String file1, String file2){
        Path path1 = Paths.get(file1);
        Path path2 = Paths.get(file2);
        try {
            List<String> file1content = Files.readAllLines(path1);
            Files.write(path2, file1content);
            System.out.println("Sikerült");
            return true;
        } catch (IOException e){
            System.out.println("Nem sikerült :(");
            return false;
        }



    }
}
