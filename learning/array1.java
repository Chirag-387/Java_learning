package learning;
import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {

        // array -> collections of values of same datatype.

        String[] fruits = {"apple", "orange", "banana", "graphes"};

        // fruits[0] -> apple

        // To find the length of an array.
        // int numOfFruits = fruits.length;

        /*
        for(int i = 0; i < numOfFruits; i++) {
            System.out.printf("Fruit at index %d is %s.\n", i, fruits[i]);
        }
        */

        // OR

        // Enchned for loop or know as ForEach loop

        /*
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
        */

        // Sorting an array requires import class Array;

        Arrays.sort(fruits);
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        // filling values.

        Arrays.fill(fruits, "pineapple");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        
    }
}
