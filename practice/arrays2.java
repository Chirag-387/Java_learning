package practice;
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. Find the second largest number in an array.

        // System.out.print("Enter the number of elements in an array: ");
        // int numOfElements = scanner.nextInt();
        // System.out.println();

        // int[] nums = new int[numOfElements];

        // System.out.println("<- Inputing elements ->");
        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     nums[i] = scanner.nextInt();
        // }
        // System.out.println();

        // System.out.println("<- Printing array ->");
        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }
        // System.out.println();

        // int firstLargest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;

        // for(int i = 0; i < numOfElements; i++) {
        //     if(nums[i] > firstLargest) {
        //             secondLargest = firstLargest;
        //             firstLargest = nums[i];
        //     }
        //     else if(nums[i] > secondLargest && nums[i] != firstLargest) {
        //         secondLargest = nums[i];
        //     }
        // }

        // System.out.printf("The second largest element of the array is %d.\n", secondLargest);


        // 2. Find second smallest element in an array.

        //  System.out.print("Enter the number of elements in an array: ");
        // int numOfElements = scanner.nextInt();
        // System.out.println();

        // int[] nums = new int[numOfElements];

        // System.out.println("<- Inputing elements ->");
        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     nums[i] = scanner.nextInt();
        // }
        // System.out.println();

        // System.out.println("<- Printing array ->");
        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }
        // System.out.println();

        // int firstSmallest = Integer.MAX_VALUE;
        // int secondSmallest = Integer.MAX_VALUE;

        // for(int i = 0; i < numOfElements; i++) {
        //     if(nums[i] < firstSmallest) {
        //             secondSmallest = firstSmallest;
        //             firstSmallest = nums[i];
        //     }
        //     else if(nums[i] < secondSmallest && nums[i] != firstSmallest) {
        //         secondSmallest = nums[i];
        //     }
        // }

        // System.out.printf("The second smallest element of the array is %d.\n", secondSmallest);


        // 3. Check if array is sorted.


        // System.out.print("Enter the number of elements in an array: ");
        // int numOfElems = scanner.nextInt();

        // System.out.println();

        // int[] nums = new int[numOfElems];

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.print("Enter a value for to be a element in an array: ");
        //     nums[i] = scanner.nextInt();
        // }

        // System.out.println();

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }

        // System.out.println();

        // boolean sorted = true;

        // for(int i = 0; i < numOfElems; i++) {
        //     for(int j = i; j < numOfElems; j++) {
        //         if(nums[i] > nums[j]) {
        //             sorted = false;
        //         }
        //     }
        // }

        // if(sorted) {
        //     System.out.println("The array is sorted");
        // }
        // else {
        //     System.out.println("The array is not sorted.");
        // }


        // 4. Swap first and last element of the array.

        // System.out.print("Enter the number of elements in an array: ");
        // int numOfElems = scanner.nextInt();

        // int[] nums = new int[numOfElems];

        // System.out.println();

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.print("Enter the element's value: ");
        //     nums[i] = scanner.nextInt();
        // }

        // System.out.println();

        // System.out.println("<- Array Before swap ->");
        
        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }

        // System.out.println();

        // int temp = 0;

        // System.out.println("<- Array after swap ->");

        // for(int i = 0; i < numOfElems; i++) {
        //     if(i == 0) {
        //         temp = nums[i];
        //         nums[i] = nums[numOfElems - 1];
        //     }
        //     else if(i == numOfElems - 1) {
        //         nums[i] = temp;
        //     }
        // }

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }


        // 5. Rotate an array left by one.

        // System.out.print("Enter the number of elements in an array: ");
        // int numOfElems = scanner.nextInt();

        // System.out.println();

        // int[] nums = new int[numOfElems];

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.print("Enter a element: ");
        //     nums[i] = scanner.nextInt();
        // }

        // System.out.println("<- Array before rotating ->");

        // System.out.println();

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }

        // System.out.println();

        // System.out.println("<- Array after rotating ->");
        
        // System.out.println();

        // int temp = nums[0];

        // for(int i = 0; i < numOfElems; i++) {
        //     if(i < numOfElems - 1) {
        //         nums[i] = nums[i + 1];
        //     }
        //     else {
        //         nums[i] = temp;
        //     }
        // }

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }


        // 6. Rotate the array right by one.

        // System.out.print("Enter the number of elements in an array: ");
        // int numOfElems = scanner.nextInt();

        // System.out.println();

        // int[] nums = new int[numOfElems];

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.print("Enter a element: ");
        //     nums[i] = scanner.nextInt();
        // }

        // System.out.println("<- Array before rotating ->");

        // System.out.println();

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }

        // System.out.println();

        // System.out.println("<- Array after rotating ->");
        
        // System.out.println();

        // int temp = nums[numOfElems - 1];

        // for(int i = numOfElems - 1; i > 0; i--) {
        //     nums[i] = nums[i - 1];
        // }

        // nums[0] = temp;

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.printf("%d ", nums[i]);
        // }


        // 7. rotate the array to left by k position

        // pending...

        scanner.close();
    }
}

