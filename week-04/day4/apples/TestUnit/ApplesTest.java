import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  String message = "apple";
   Apples apples = new Apples(message);
   String message1 = "apple";


  @Test
  public void testPrintMessage() {
    assertEquals(message1,apples.getApple() );
  }
}