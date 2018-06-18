import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciseSix {

  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS", "AVAROROSAMIIREVEGZODIKI"));

    System.out.println(getStartsWithAEndsWithI(cities));

  }

  public static List<String> getStartsWithAEndsWithI(ArrayList<String> cities){
    return cities.stream()
            .filter(s -> s.startsWith("A") && s.endsWith("I"))
            .collect(Collectors.toList());
  }

}
