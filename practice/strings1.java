package practice;
import java.util.Scanner;

public class strings1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // 1. Print a string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // System.out.printf("%s\n", string);


        // 2. Find length of the string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // System.out.printf("The length of the string you entered is %d.\n", string.length());


        // 3. Convert the string into uppercase.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // System.out.printf("String before converting it to uppercase is %s", string);

        // System.out.println();

        // System.out.printf("String after converting it to uppercase is %s", string.toUpperCase());


        // 4. Convert the string to lowercase.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // System.out.printf("String before converting it to lowercase is %s", string);

        // System.out.println();

        // System.out.printf("String after converting it to lowercase is %s", string.toLowerCase());


        // 5. Print each character of the string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // char letters;

        // for(int i = 0; i < string.length(); i++) {
        //     letters = string.charAt(i);
        //     System.out.printf("%c ", letters);
        // }


        // 6. Count vowels in the string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // int count = 0;

        // for(int i = 0; i < string.length(); i++) {
        //     string = string.toLowerCase();
        //     int letter = string.charAt(i);
        //     if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        //         count++;
        //     }
        // }

        // System.out.printf("Total vowels in the string is %d.\n", count);


        // 7. Count consonants in a string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // int count = 0;

        // for(int i = 0; i < string.length(); i++) {
        //     string = string.toLowerCase();
        //     int letter = string.charAt(i);
        //     if(letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
        //         count++;
        //     }
        // }

        // System.out.printf("Total consonants in the string is %d.\n", count);


        // 8. Count digits in a string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // int count = 0;

        // for(int i = 0; i < string.length(); i++) {
        //     string = string.toLowerCase(); 
        //     char letter = string.charAt(i);
        //     if(letter >= 'a' && letter <= 'z') {
        //         count += 0;
        //     }
        //     else {
        //         count++;
        //     }
        // }

        // System.out.printf("The number of digits in the string is %d.\n", count);


        // 9. Count spaces in the string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // int count = 0;

        // for(int i = 0; i < string.length(); i++) {

        //     string = string.toLowerCase();
        //     char letter = string.charAt(i);

        //     if(letter == ' ') {
        //         count++;
        //     }
        //     else {
        //         count += 0;
        //     }

        // }

        // System.out.printf("The number of spaces in the string is %d.\n", count);


        // 10. Reverse a string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // String rString = "";

        // for(int i = string.length() - 1; i >= 0; i--) {
        //     char letter = string.charAt(i);
        //     rString += letter;
        // }

        // System.out.println(rString);


        // 11. Check palindrome.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // String rString = "";

        // for(int i = string.length() - 1; i >= 0; i--) {
        //     char letter = string.charAt(i);
        //         rString += letter;
        // }

        // if(string.equals(rString)) {
        //     System.out.println("The string is a pallindrom.");
        // }
        // else {
        //     System.out.println("The string is NOT a pallindrom.");
        // }


        // 12. Count words.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // int words = 0;
        // String[] word = string.split("\\s+");
        // words = word.length;

        // System.out.printf("The total number of words in the string is %d.\n", words);


        // 13. Find the frequency of a character.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // System.out.print("Enter a character: ");
        // char tLetter = scanner.nextLine().charAt(0);

        // int count = 0;

        // for(int i = 0; i < string.length(); i++) {
        //     int letter = string.charAt(i);

        //     if(tLetter == letter) {
        //         count++;
        //     }
        //     else {
        //         count += 0;
        //     }
        // }

        // System.out.printf("The total frequency of %c is %d.\n", tLetter, count);


        // 14. Remove spaces in a string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // for(int i = 0; i < string.length(); i++) {
        //     if(string.charAt(i) == ' ') {
        //         string = string.replace(" ", "");
        //     }
        // }

        // System.out.printf("The string after replacing is %s.\n", string);


        // 15. Replace a character of a string.

        // System.out.print("Enter a string: ");
        // String string = scanner.nextLine();

        // System.out.println();

        // for(int i = 0; i < string.length() - 1; i++) {
        //     if(string.charAt(i) == 'a') {
        //         string = string.replace('a', '@');
        //     }
        // }

        // System.out.printf("The string after replacing 'a' is %s.\n", string);

        scanner.close();

    }
}
