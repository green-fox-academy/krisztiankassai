import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 10");

        int number = 6;

        int number1 = scanner.nextInt();

       while (number != number1){
           if (number > number1){
               System.out.println("The number is higher guess again");
               int guessNew = scanner.nextInt();
           } else if (number < number1){
               System.out.println("The number is lower guess again");
               int guessNew = scanner.nextInt();
           }
       }
        System.out.println("You guessed the number right, it was:" + number);


    }
}
