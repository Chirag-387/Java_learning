package learning;
import java.util.Scanner;

public class compoundInterestCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount : ");
        principal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the rate (in %) : ");
        rate = scanner.nextDouble() / 100;
        scanner.nextLine();

        System.out.print("Enter the times compound : ");
        timesCompound = scanner.nextInt();
        scanner.nextLine();

        System.out.print("For How many years : ");
        years = scanner.nextInt();
        scanner.nextLine();

        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.printf("The final amount after %d years is %.2f", years, amount);

        scanner.close();

    }
}
