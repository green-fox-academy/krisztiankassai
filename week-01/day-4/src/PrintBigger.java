import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two  number");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("First number is bigger");
        } else if (number1 == number2) {
            System.out.println("They are equal");
        } else {
            System.out.println("Second number is bigger");
        }

    }
}
