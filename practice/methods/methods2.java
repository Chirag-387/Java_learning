package practice.methods;

public class methods2 {
    public static void main(String[] args) {
        
        greet("Chirag");

        displayAge(18);

        addTwoNums(10, 7);

        largeOfTwoNums(7, 8);

        evenOdd(7);

        vowConst('i');

        circleArea(10);

        areaRect(87, 8.1);

        simpleInterest(7, 5, 2);

        celsiusToFarhenheit(87);

    }

    static void greet(String name) {
        System.out.printf("Hello, %s.\n", name);
    }

    static void displayAge(int age) {
        System.out.printf("Your age is %d.\n", age);
    }

    static void addTwoNums(int a, int b) {
        System.out.printf("The sum of %d and %d is %d.\n", a, b, (a + b));
    }

    static void largeOfTwoNums(int a, int b) {
        if(a > b) {
            System.out.printf("The largest number is %d.\n", a);
        }
        else {
            System.out.printf("The largest number is %d.\n", b);
        }
    }

    static void evenOdd(int a) {
        if(a % 2 == 0) {
            System.out.printf("%d is a even number.\n", a);
        }
        else {
            System.out.printf("%d is a odd number.\n", a);
        }
    }

    static void vowConst(char ch) {
        char lCh = Character.toLowerCase(ch);
        if(lCh == 'a' || lCh == 'e' || lCh == 'i' || lCh == 'o' || lCh == 'u') {
            System.out.printf("%c is a vowel.\n", ch);
        }
        else {
            System.out.printf("%c is a consonants.\n", ch);
        }
    }

    static void circleArea(double radius) {
        System.out.printf("The area of circle with %f as a radius is %.1f\n", radius, (Math.PI * radius * radius));
    }

    static void areaRect(double length, double breath) {
        System.out.printf("The area of rectangle with %f as length and %f as breath is %.2f", length, breath, (length * breath));
    }

    static void simpleInterest(double principal, double rate, double time) {
        System.out.printf("The simple interest is %.1f\n", ((principal * rate * time) / 100));
    }

    static void celsiusToFarhenheit(double celsius) {
        double farhenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.1fC is %.1fF\n", celsius, farhenheit);
    }

}