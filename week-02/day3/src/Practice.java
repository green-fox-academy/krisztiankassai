import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number: ");

        int number = scanner.nextInt();

        divider(number);
    }
    public static void divider (int number){
        try {
            int divided = 10/number;
            System.out.println(divided);
        } catch (ArithmeticException e){
            System.out.println("You can not divide by zero");
        }
    }
}
