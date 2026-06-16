package learning;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        /*  
        Scanner is an Object which is used to accept user input.
        In order to use, we have to import it from the packages which is utilities oe util.
        */

        // Scanner input = new Scanner(System.in);
        // // System.out.println("Enter your name : "); // user input in next line
        // System.out.print("Enter your name : "); // Same line for user input
        
        // String name = input.nextLine(); // It reads the whole variable whether it contains String or not.
        // // String name = input.next(); // after a space in a variable, it doesn't read any further.

        // System.out.print("Enter your age : ");
        // int age = input.nextInt(); // If you write a double or any different datatype value, you will hit with a ERROR.
        // input.nextLine();

        // System.out.print("Enter your GPA : ");
        // double GPA = input.nextDouble();
        // input.nextLine();

        // System.out.print("Are you a student (true/false) : ");
        // boolean isStudent = input.nextBoolean();
        // input.nextLine(); // It is considered a good practice to use nextLine method after taking a input as mix of the two lines can happen if this is not used, but no need to use it when taking a String input.

        // System.out.println("Hello, " + name);
        // System.out.println("Your age is " + age + ".");
        // System.out.println("Your GPA is " + GPA + ".");
        // System.out.println("Student : " + isStudent);

        // input.close();   // Should close Scanner as not doing it led to unexpected behaviours.

        // Q. Calculate the area of rectangle.

        Scanner input2 = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle : ");
        double Length = input2.nextDouble();
        input2.nextLine();

        System.out.print("Enter the breath of the rectangle : ");
        double Breath = input2.nextDouble();
        input2.nextLine();

        double area = Length * Breath;

        System.out.println("The area of rectangle is " + area + ".");

        input2.close();

    }
}
