import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciseFive {

  public static void main(String[] args) {

    String uppercase = "thisStringHasUpperCaseCharacters";

    System.out.println(getUpperCaseCharacters(uppercase));
    }


  public static List getUpperCaseCharacters(String example){
    return Stream.of(example)
            .sorted()
            .collect(Collectors.toList());

  }
}
