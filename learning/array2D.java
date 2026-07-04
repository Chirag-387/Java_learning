package learning;

public class array2D {
    public static void main(String[] args) {

        // 2D array -> An array in which each element is an array, useful for storing a matrix of data.

        /*
        String[] fruits = {"apple", "banana", "orange"};
        String[] vegetables = {"tomato", "carrot", "potato"};
        String[] other = {"spices", "milk", "butter", "rice"};

        String[][] groceries = {fruits, vegetables, other};

        for(String[] foods: groceries) {
            for(String food: foods) {
                System.out.printf("%s ", food);
            }
            System.out.println();
        }
        */

        // OR

        /*
        String[] fruits = {"apple", "banana", "orange"};
        String[] vegetables = {"tomato", "carrot", "potato"};
        String[] other = {"spices", "milk", "butter", "rice"};

        String[][] groceries = {{"apple", "banana", "orange"},
                                {"tomato", "carrot", "potato"},
                                {"spices", "milk", "butter", "rice"}};

        groceries[0][0] = "pineapple";
        groceries[1][2] = "spinach";

        for(String[] foods: groceries) {
            for(String food: foods) {
                System.out.printf("%s ", food);
            }
            System.out.println();
        }
        */

        char[][] telephone =   {{'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'}};

        for(char[] row: telephone) {
            for(char number: row) {
                System.out.printf("%c ", number);
            }
            System.out.println();
        }

    }
}