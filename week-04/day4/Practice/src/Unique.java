import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique {
  public static void main(String[] args) {

    List<Integer> numberlist = new ArrayList<>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
    System.out.println(uniqe(numberlist));

  }
  public static List<Integer> uniqe(List<Integer> list) {
    List<Integer> numberlist = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (!numberlist.contains(list.get(i))) {
        numberlist.add(list.get(i));
      }
    }
    return numberlist;
  }
}
