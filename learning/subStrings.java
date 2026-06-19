package learning;
import java.util.Scanner;

public class subStrings {
    public static void main(String[] args) {

        /*
        substring is a method of extract a portion of a string.
        string.substring(start, end)
        */

        // String email = "noName123@gmail.com";
        
        // String username = email.substring(0, 9); // ending index is exclusive.
        // String username = email.substring(0, email.indexOf('@'));

        // String domain = email.substring(10, 19);
        // String domain = email.substring(10);
        // String domain = email.substring(email.indexOf('@') + 1);

        // System.out.println(username);
        // System.out.println(domain);


        Scanner scanner = new Scanner(System.in);

        String email, username, domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf('@'));
        domain = email.substring(email.indexOf('@') + 1);

        System.out.println(username);
        System.out.println(domain);

        }
        else {
            System.out.println("Email is not valid.");
        }

        scanner.close();
    }
}
