import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {
            System.out.println("Guess a number between 1 and 100:");
            guess = input.nextInt();
            numberOfTries++;
            if(numberOfTries > 5)
            {
                System.out.println("Out of tries. Better luck next Time");
            }

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high!");
            }
        }

        System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
    }
}

