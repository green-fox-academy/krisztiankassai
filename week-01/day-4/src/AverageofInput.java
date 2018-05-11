import java.util.Scanner;

public class AverageofInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me 5 number");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        int summ = number1 + number2 + number3 + number4 + number5;
        double average = ((double) summ) / 5 ;

        System.out.println("Summ is: " + summ);
        System.out.println("Average is: " + average);


    }
    // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
}
