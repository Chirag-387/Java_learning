package learning;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        // Inserting input in the arrays.

        Scanner scanner = new Scanner(System.in) ;

        System.out.print("How many items you want to to order: ");
        int numOfItems = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[numOfItems];

        for(int i = 0; i < numOfItems; i++) {
            System.out.printf("Enter your item[%d]: ", (i+1));
            foods[i] = scanner.nextLine();
        }

        for(String food: foods) {
            System.out.println(food);
        }

        scanner.close();

    }
}
