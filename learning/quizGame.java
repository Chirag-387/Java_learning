package learning;
import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

        // MATH QUIZ GAME

        String[] questions =    {"What is the value of pie?",
                                "What is the square of 10 is ?",
                                "What is the square root of 49 ?"};

        String[][] options =    {{"1. 3.14", "2. 3.16", "3. 3.15", "4. 3.13"},
                                {"1. 1000", "2. 10", "3. 100", "4. 0"},
                                {"1. 9", "2. 6", "3. 8", "4. 7"}};

        int[] answers = {1, 3, 4};

        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("<-- WELCOME TO THE MATH QUIZ GAME -->");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            
            for(String option: options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]) {
                System.out.println("CORRECT");
                score++;
            } else {
                System.out.println("WRONG");
            }
        }

        System.out.printf("Your final score is %d out of %d.", score, questions.length);

        scanner.close();
    }
}