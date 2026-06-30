package learning;
import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {

        // variable = (condition) ? ifTrue : ifFalse;

        Scanner scanner = new Scanner(System.in);

        int marks;

        System.out.print("Enter your marks: ");
        marks = scanner.nextInt();
        scanner.nextLine();

        String result = (marks >= 70) ? "PASS" : "FAIL";
        System.out.println(result);

        scanner.close();

    }
}