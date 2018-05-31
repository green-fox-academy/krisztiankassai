import java.util.ArrayList;

public class Sum {

  int numbers;


  public int summer(ArrayList<Integer> numberList){
    int sum = 0;
    for (int i = 0; i < numberList.size() ; i++) {
      sum += numberList.get(i);
    }
    return sum;
  }

}
