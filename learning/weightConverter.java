package learning;
import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight, newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs into kgs");
        System.out.println("2. Convert kgs into lbs");

        System.out.print("Choice an option: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();
        scanner.nextLine();

        if(choice == 1) {
            newWeight = (weight * 0.45359237);
            System.out.println(newWeight);
        }
        else if(choice == 2) {
            newWeight = (weight * 2.20462262);
            System.out.println(newWeight);
        }
        else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }

}
