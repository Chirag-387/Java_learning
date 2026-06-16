package learning;
import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int age;
        boolean Elgibile;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Hello, " + name);

        if(age >= 60) {
            Elgibile = false;
            System.out.println(Elgibile);
        }
        else if(age >= 18) {
            Elgibile = true;
            System.out.println(Elgibile);
        }
        else {
            Elgibile = false;
            System.out.println(Elgibile);
        }

        input.close();

    }
}
