// Import the Scanner class and the Random class
import java.util.Scanner;
import java.util.Random;

// Define the main class
public class Number_Game {

    // Define the main method
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a Random object for generating random numbers
        Random random = new Random();

        // Declare and initialize variables for the game parameters
        int min = 1; // The minimum number in the range
        int max = 100; // The maximum number in the range
        int maxAttempts = 10; // The maximum number of attempts allowed
        int rounds = 3; // The number of rounds to play
        int score = 0; // The user's score

        // Print a welcome message and the game instructions
        System.out.println("Welcome to the Number Game!");
        System.out.println("I will think of a number between " + min + " and " + max + ".");
        System.out.println("You have to guess what it is in " + maxAttempts + " attempts or less.");
        System.out.println("You will play " + rounds + " rounds and your score will be based on how many attempts you take.");
        System.out.println("Let's begin!");

        // Loop through the rounds
        for (int round = 1; round <= rounds; round++) {

            // Generate a random number within the range
            int number = random.nextInt(max - min + 1) + min;

            // Declare and initialize a variable for the user's guess
            int guess = 0;

            // Declare and initialize a variable for the number of attempts taken
            int attempts = 0;

            // Print the current round number
            System.out.println("\nRound " + round + ":");

            // Loop until the user guesses the correct number or runs out of attempts
            do {

                // Prompt the user to enter their guess
                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                // Increment the number of attempts taken
                attempts++;

                // Compare the user's guess with the generated number and provide feedback
                if (guess == number) {
                    System.out.println("You got it!");
                } else if (guess > number) {
                    System.out.println("Too high.");
                } else {
                    System.out.println("Too low.");
                }

                // Check if the user has reached the maximum number of attempts
                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you ran out of attempts. The number was " + number + ".");
                }

            } while (guess != number && attempts < maxAttempts);

            // Update the user's score based on the number of attempts taken
            score += maxAttempts - attempts;

            // Print the user's score after each round
            System.out.println("Your score is: " + score);

        }

        // Print a farewell message and thank the user for playing
        System.out.println("\nThank you for playing the Number Game!");
        System.out.println("Your final score is: " + score);
    }
}
