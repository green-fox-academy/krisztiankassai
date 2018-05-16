import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static List<String> appendA(List<String> fara){


        for (int i = 0; i < fara.size() ; i++) {
           fara.set(i, fara.get(i)+ "a");
        }
        return fara;

        }

    }

