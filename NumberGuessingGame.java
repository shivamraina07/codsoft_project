import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRange = 1; // Minimum value for the range
        int maxRange = 100; // Maximum value for the range

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between " + minRange + " and " + maxRange + ".");
        System.out.println("Try to guess the number!");

        Random random = new Random();
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int guess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in "
                        + attempts + " attempts!");
                break;
            }
        } while (true);

        scanner.close();
    }
}