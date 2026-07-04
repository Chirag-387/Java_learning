package learning;

public class array3 {
    public static void main(String[] args) {

        // Searching any element inside an array.

        int[] numbers = {1, 2, 3, 4, 5, 9, 8, 7, 6, 10, 7};
        int target = 11;
        boolean isFound = false;

            for(int i = 0; i < numbers.length; i++) {
                if(target == numbers[i]) {
                    System.out.printf("Found the target at index %d.\n", i);
                    isFound = true;
                    // break;
                }
            }
            if(!isFound) {
                System.out.println("Target is not present in the given array.");
            }
        }

    }

