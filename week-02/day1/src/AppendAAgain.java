import java.util.Arrays;

public class AppendAAgain {
    public static void main(String[] args) {
        String[] animals = {"kuty", "macsk", "cic"};
        for (int i = 0; i < animals.length ; i++) {
            animals[i]+="a";
        }
        System.out.println(Arrays.deepToString(animals));
    }
}
