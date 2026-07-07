package practice;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        // 1. Take 'n' integers from user and print them.

        // System.out.print("How many elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("Element at position %d is %d.\n", (i + 1), arr[i]);
        // }


        // 2. Sum of array elements.

        // System.out.print("Enter the num of elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("Element at position %d is %d.\n", (i + 1), arr[i]);
        // }

        // int sum = 0;

        // for(int i = 0; i < numOfElements; i++) {
        //     sum += arr[i];
        // }
        // System.out.printf("The sum of elements of the array is %d.\n", sum);


        // 3. Find the average of all numbers in an array.

        // System.out.print("Enter the numuber of elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("The element at position %d in an array is %d.\n", (i + 1), arr[i]);
        // }

        // double sum = 0;

        // for(int i = 0; i < numOfElements; i++) {
        //     sum += arr[i];
        // }

        // double average = (double) sum / numOfElements;

        // System.out.printf("The average of the elements of the array is %.2f.\n", average);


        // 4. Find maximum element in an array.

        // System.out.print("Enter the numbers of elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("The element at position %d is %d.\n", (i + 1), arr[i]);
        // }

        // int maxNum = arr[0];

        // for(int i = 0; i < numOfElements; i++) {
        //     if(maxNum < arr[i]) {
        //         maxNum = arr[i];
        //     }
        // }

        // System.out.printf("The maximum value of element in an array is %d.\n", maxNum);


        // 5. Find the element which is a minimum value in an array.

        // System.out.print("Enter the numbers of elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("The element at position %d is %d.\n", (i + 1), arr[i]);
        // }

        // int minNum = arr[0];

        // for(int i = 0; i < numOfElements; i++) {
        //     if(minNum > arr[i]) {
        //         minNum = arr[i];
        //     }
        // }
        
        // System.out.printf("The minimum value of element in an array is %d.\n", minNum);


        // 6. Count even and odd numbers in an array.

        // System.out.print("Enter the numbers of elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("The element at position %d is %d.\n", (i + 1), arr[i]);
        // }

        // int evenValue = 0, oddValue = 0;

        // for(int i = 0; i < numOfElements; i++) {
        //     if(arr[i] % 2 == 0) {
        //         evenValue++;
        //     }
        //     else {
        //         oddValue++;
        //     }
        // }

        // System.out.printf("The number of even elements in the array is %d.\n", evenValue);
        // System.out.printf("The number of odd elements in the array is %d.\n", oddValue);


        // 7. Find a element in array using linear search.

        // System.out.print("Enter the numbers of elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // System.out.print("Enter a element you want to find: ");
        // int target = scanner.nextInt();

        // for(int i = 0; i < numOfElements; i++) {
        //     if(arr[i] == target) {
        //         System.out.printf("The target is found at index %d.\n", i);
        //     }
        // }


        // 8. Reverse an array.

        // System.out.print("Enter the numbers of elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // System.out.println("<- Array Before reversing ->");

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("%d ", arr[i]);
        // }
        // System.out.println();

        // System.out.println("<- Array After reversing ->");

        // for(int i = (numOfElements - 1); i >= 0; i--) {
        //     System.out.printf("%d ", arr[i]);
        // }
        // System.out.println();


        // 9. Copy one array into  another.

        // System.out.print("Enter the number of elements in arr1: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr1 = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr1[i] = scanner.nextInt();
        // }

        // System.out.println("<- Elements in arr1 ->");
        
        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("%d ", arr1[i]);
        // }
        // System.out.println();

        // System.out.println("<- Copy of arr1 ->");

        // int[] arr2 = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     arr2[i] = arr1[i];
        // }

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.printf("%d ", arr2[i]);
        // }
        // System.out.println();


        // 10. Count positive, Negative, Zero in array.

        // System.out.print("Enter the numbers of elements in an array: ");
        // int numOfElements = scanner.nextInt();

        // int[] arr = new int[numOfElements];

        // for(int i = 0; i < numOfElements; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // int posCount = 0;
        // int negCount = 0;
        // int zero = 0;

        // for(int i = 0; i < numOfElements; i++) {
        //     if(arr[i] > 0) {
        //         posCount++;
        //     }
        //     else if(arr[i] < 0) {
        //         negCount++;
        //     }
        //     else {
        //         zero++;
        //     }
        // }

        // System.out.printf("Number of positive elements in an array is %d.\n", posCount);
        // System.out.printf("Number of negative elements in an array is %d.\n", negCount);
        // System.out.printf("Number of zeroes in an array is %d.\n", zero);


        scanner.close();

    }
}
