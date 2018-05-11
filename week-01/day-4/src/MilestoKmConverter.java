import java.util.Scanner;

public class MilestoKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is the distance you want to convert from km to miles?");

        int km = scanner.nextInt();

        double miles = (km * 1.6);

        System.out.println(km + (" km in miles is: " + miles + (" miles")));


        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}
