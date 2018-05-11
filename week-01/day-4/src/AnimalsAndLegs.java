import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me two number:");

        int chicken = scanner.nextInt();
        int pig = scanner.nextInt();

        int chickenLegs = (chicken *=2);
        int pigLegs = (pig *= 4);

        System.out.println("Chickens have " + chickenLegs + " legs");
        System.out.println("Pigs have " + pigLegs + " legs");
        System.out.println("That is a total of " + (chickenLegs + pigLegs) + " legs");


        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
