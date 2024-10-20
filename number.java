import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
                break;
            }
        }

        scanner.close();
    }
}


