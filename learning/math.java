package learning;
import java.util.Scanner;

public class math {
    public static void main(String[] args) {

        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        // double result;

        // result = Math.pow(2, 3); -> power function = 2 ^ 3.
        // result = Math.abs(-5); -> abs is called Absolute which gives positive value only.
        // result = Math.sqrt(9); -> square root function.
        // result = Math.round(3.14); -> round about to nearest number.
        // result = Math.ceil(3.14); -> round about to the upper number like 3.14 -> 4.0 or 3.87 -> 4.0 .
        // result = Math.floor(3.14); -> round about to the lower number like 3.14 -> 3.0 or 3.87 -> 3.0 .
        // result = Math.max(10, 20); -> gives the bigger value of the given variable or number.
        // result = Math.min(10, 20); -> gives the smaller value of a given variabble or number.


        // System.out.println(result);

        // Q. Finding the hypotenuse of a right triangle.

        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter the value of a : ");
        a = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the value of b : ");
        b = input.nextDouble();
        input.nextLine();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("The value is : %.2fcm", c);

        input.close();
    }
}
