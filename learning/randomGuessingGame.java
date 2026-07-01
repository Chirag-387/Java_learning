package learning;
import java.util.Random;
import java.util.Scanner;

public class randomGuessingGame {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess, attemps = 0;
        int randomNumber = random.nextInt(1, 21);

        System.out.println("<-- Number Guessing Game -->");
        System.out.println("<-- Guess a number btw 1 and 20 -->");

        do { 

            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attemps++;

        } while (guess != randomNumber);

        System.out.printf("You won with %d guesses", attemps);
        scanner.close();

    }
}
