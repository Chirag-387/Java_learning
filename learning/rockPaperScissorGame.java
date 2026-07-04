package learning;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissorGame {
    public static void main(String[] args) {

        // ROCK PAPER SCISSOR GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissor): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
                System.out.println("INVALID CHOICE.");
                continue;
            }
            
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("IT'S A TIE.");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissor"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || (playerChoice.equals("scissor") && computerChoice.equals("paper"))) {
                System.out.println("YOU WON!!");
            }
            else {
                System.out.println("YOU LOSE.");
            }

            System.out.print("PLAY AGAIN (YES/NO): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!!");

        scanner.close();

    }
}
