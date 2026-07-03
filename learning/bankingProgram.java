package learning;
import java.util.Scanner;

class bankingProgram{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA BANKING PROGRAM

        double amount = 0;
        int choice;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("<- BANKING PROGRAM ->");
            System.out.println("1. CHECK AMOUNT");
            System.out.println("2. DEPOSIT AMOUNT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");

            System.out.print("Choose btw 1 - 4 : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checkBalance(amount);
                case 2 -> amount += depositAmount();
                case 3 -> amount -= withdrawAmount();
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!!");
            }
        }

        scanner.close();

    }

    static void checkBalance( double amount) {
        System.out.printf("Your current bank account containes $%.2f.\n", amount);
    }

    static double depositAmount() {
        double amount;
        System.out.print("Enter the amount to deposit: ");
        amount = scanner.nextDouble();
        return amount;
    }

    static double  withdrawAmount() {
        double amount;
        System.out.print("Enter the amount to withdraw: ");
        amount = scanner.nextDouble();
        return amount;
    }


}