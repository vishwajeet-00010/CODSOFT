import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        String playAgain;

        do {
            int number = rand.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\n🎯 Guess the number between 1 and 100!");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts!");
                    score += (maxAttempts - attempts + 1);
                    guessed = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("❌ Out of attempts! The number was: " + number);
            }

            System.out.println("Your current score: " + score);

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\n🏁 Game Over! Your final score: " + score);
    }
}
