package practice.oops;

import learning.shoppingCart;

public class oops12 {
    public static void main(String[] args) {
        
        ShoppingCart s1 = new ShoppingCart("NONAME", 10, 99.99);

        s1.addItem(10, 100.1);

        s1.removeItem(10, 99);

    }
}

class ShoppingCart {

    String customerName;
    int totalItems;
    double totalPrice;

    public ShoppingCart(String customerName, int totalItems, double totalPrice) {
        this.customerName = customerName;
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
    }

    public void addItem(int quantity, double itemPrice) {
        if(quantity >= 0) {
            totalItems += quantity;
            totalPrice += itemPrice;
            System.out.printf("After adding, the total items are %d and total price is %.2f\n", totalItems, totalPrice);
        }
        else {
            System.out.println("INVALID");
        }
    }

    public void removeItem(int quantity, double itemPrice) {
        if(totalItems <= 0 || totalPrice <= 0) {
            System.out.println("INVALID");
        }
        else {
            totalItems -= quantity;
            totalPrice -= itemPrice;
            System.out.printf("The total quantity is %d and its total amount is %.2f\n", totalItems, totalPrice);
        }
    }

}