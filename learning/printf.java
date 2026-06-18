package learning;

public class printf {
    public static void main(String[] args) {

        // "printf" is used to format the output.
        
        // %[flag][width][.precision][specifier_character]

        String name = "Noname";
        char firstLetter = 'N';
        int age = 70;
        double height = 5.23;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("You are starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f inches tall\n", height); // precision is used as ".2" for only two decimal numbers after the point.
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old.\n", name, age);

        /*
            flags
            + -> output a plus
            , -> comma grouping seperator
            ( -> negative number enclosed within ()
            space -> display a minus if negative, space if positive 
        */

        double num1 = 23.87;
        double num2 = -87.31;
        double num3 = -2.5;
        double num4 = 78645362.98;;

        System.out.printf("%+.2f\n", num1);
        System.out.printf("%(.2f\n", num2);
        System.out.printf("% .2f\n", num3);
        System.out.printf("%,.2f\n", num4);

        /*
            width
            0 -> zero padding
            number -> right justified padding
            negative number -> left justifies padding
        */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); // here 0 is means zero padding and 4 after zero represents upto how many numbers zero padding.
        System.out.printf("%4d\n", id2); // right padding
        System.out.printf("%-4d\n", id3); // left padding
        System.out.printf("%04d\n", id4); 

    }
}
