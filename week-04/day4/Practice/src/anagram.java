import java.util.Arrays;

public class anagram {
  public static void main(String[] args) {
    String first = "dog";
    String second = "god";
    String third = "green";
    String fourth = "fox";
    System.out.println(anagramChecker(first,second));
    System.out.println(anagramChecker(third, fourth));
  }
  public static boolean anagramChecker(String first, String second){
    char[] str1 = first.toCharArray();
    Arrays.sort(str1);
    char[] str2 = second.toCharArray();
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);

  }
}
