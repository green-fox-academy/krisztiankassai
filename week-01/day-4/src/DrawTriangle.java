import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number");

        int number1 = scanner.nextInt();

        for (int i = 0; i <= number1 ; i++) {

            for (int j = 0; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}


