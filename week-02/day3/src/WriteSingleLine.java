import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> myname = new ArrayList<>();
        myname.add("Krisztian Kassai");

        try{
            Path filepath = Paths.get("src/file.txt");
            Files.write(filepath, myname);
        }
        catch (Exception e){
            System.out.println("Unable to write file file.txt");
        }
    }
}
