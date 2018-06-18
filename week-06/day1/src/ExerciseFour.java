import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseFour {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    System.out.println(getSquareBiggerThan20(numbers));

  }

  public static List<Integer> getSquareBiggerThan20(ArrayList<Integer> numbers){
    return numbers.stream()
            .filter(x -> x * x > 20)
            .collect(Collectors.toList());
  }

}
