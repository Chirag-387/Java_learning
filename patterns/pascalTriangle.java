package patterns;
import java.util.Scanner;

public class pascalTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the max number of rows and columns: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            int value = 1;

            for(int j = 0; j < i + 1; j++) {
                    System.out.printf("%d ", value);
                    
                        value = (value * (i - j))/(j + 1) ; // Used formula from combination from math.
                    
            }

            System.out.println();

        }

        scanner.close();

    }

}
