package learning;
import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {

        System.out.println("<-- TEMPERATURE CONVERTER PROGRAM -->");

        Scanner scanner = new Scanner(System.in);

        double temp, newTemp;
        int choice;

        System.out.println("Choice your option");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter the temperature: ");
        temp = scanner.nextFloat();
        scanner.nextLine();
        
        newTemp = (choice == 1) ? ((temp * 1.8) + 32) : ((temp - 32) / 1.8);
        System.out.printf("The temp after conversion is %.2f", newTemp);

        scanner.close();

    }
}