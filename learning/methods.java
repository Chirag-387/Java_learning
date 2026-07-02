package learning;

public class methods {
    public static void main(String[] args) {

        // method -> A block of reusable code that is executed when called ().

        happyBirthday("YOYO", 20); // calls the method named happyBirthday just like how we call function in other programming language.

        System.out.println(square(5));

        System.out.println(areaSquare(32, 42));

        System.out.println(ageCheck(19));

    }

    static void happyBirthday(String name, int age) {

        System.out.println("HAPPY BIRTHDAY TO YOU.");
        System.out.printf("MAY GOD BLESS YOU %s.\n", name);
        System.out.printf("YOU ARE %d YEARS OLD.\n", age);
        System.out.println("HAPPY BIRTHDAY TO YOU.\n");

    }

    static double square(double number) {

        return number * number;

    }

    static double areaSquare(double length, double breath) {

        return length * breath;

    }

    static String ageCheck(int age) {

        if(age >= 18) {
            return("ELIGIBLE TO VOTE.");
        } else {
            return("NOT ELIGIBLE.");
        }

    }

}
