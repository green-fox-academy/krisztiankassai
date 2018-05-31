import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;
  ArrayList<Integer> listOfNumbers;

  @BeforeClass
  public static void init(){
    sum = new Sum();
  }

  @Test
  public void is_sum_equals() {

    listOfNumbers = new ArrayList<>(Arrays.asList(null));
    int expectedResult = 10;
    int expectedResult1 = 1;
    int expectedResult2 = 0;
    int expectedResult3 = null;

    int result1 = sum.summer(listOfNumbers) ;

    assertEquals(expectedResult2, result1);
  }
}