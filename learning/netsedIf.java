package learning;
import java.util.Scanner;

public class netsedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean Eligible;
        int age;


        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        if(age >= 18) {
            if(age >= 60) {
                Eligible = false;
            }
            else {
                Eligible = true;
            }
        }
        else {
            Eligible = false;
        }

        System.out.printf("Your age is %d, so you are Eligibility = %b.\n", age, Eligible);

        scanner.close();

    }
}
