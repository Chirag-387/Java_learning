package youtube;

import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What do you want to buy: ");
        item = input.nextLine();

        System.out.print("what's the price : ");
        price = input.nextDouble();
        input.nextLine();

        System.out.print("How many : ");
        quantity = input.nextInt();
        input.nextLine();

        total = quantity * price;

        System.out.println("You buy " + quantity + " " + item + " so total is " + total + currency + ".");

        input.close();
    }
}