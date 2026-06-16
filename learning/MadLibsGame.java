package learning;
import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter adjective1 : ");
        adjective1 = input.nextLine();
        System.out.print("Enter noun1 : ");
        noun1 = input.nextLine();
        System.out.print("Enter adjective2 : ");
        adjective2 = input.nextLine();
        System.out.print("Enter verb1 : ");
        verb1 = input.nextLine();
        System.out.print("Enter adjective3 : ");
        adjective3 = input.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        input.close();

    }
}
