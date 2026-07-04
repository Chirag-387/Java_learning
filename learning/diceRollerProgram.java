package learning;
import java.util.Random;
import java.util.Scanner;


public class diceRollerProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice, total = 0;

        System.out.print("Enter the number of dice you want to roll: ");
        numOfDice = scanner.nextInt();

        if(numOfDice < 0) {
            System.out.println("Number of dice rolled should be greater than 0.");
        }
        else {
            for(int i = 0; i < numOfDice; i++) {
                int rolled = random.nextInt(1, 7);
                printDice(rolled);
                System.out.printf("You rolled %d.\n", rolled);
                total += rolled;
            }
            System.out.printf("The total is %d.\n", total);
        }

        scanner.close();

    }

    static void printDice(int rolled) {

        String dice1 = """
                
             -------
            |       |
            |   .   |
            |       |
             -------


            """;
        
        String dice2 = """
                
             -------
            | .     |
            |       |
            |     . |
             -------


            """;

            String dice3 = """
                
             -------
            | .     |
            |   .   |
            |     . |
             -------


            """;

            String dice4 = """
                
             -------
            | .   . |
            |       |
            | .   . |
             -------


            """;

            String dice5 = """
                
             -------
            | .   . |
            |   .   |
            | .   . |
             -------


            """;

            String dice6 = """
                
             -------
            | .   . |
            | .   . |
            | .   . |
             -------


            """;

        switch(rolled) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid rolled.");
        }

    }

}
