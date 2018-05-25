import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {


        int number1 = 5;
        String empty = " ";


        for (int i = number1; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++ ) {

                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
