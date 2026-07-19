package practice.oops;

public class oops11 {
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount("Chirag", 101, 5000);

        b1.deposit(2000);
        b1.withdraw(10000);

    }
}

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("The balance after the deposit is %.2f\n", balance);
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.printf("Transcation is complete, total amount after withdraw is %.2f\n", balance);
        }
        else {
            System.out.println("INSUFFICIENT FUNDS.");
        }
    }

}