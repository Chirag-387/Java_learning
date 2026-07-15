package practice.other;
import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. Remove duplicate elements in an array.

        // System.out.print("Enter the number of elements in an array: ");
        // int numOfElems = scanner.nextInt();

        // System.out.println();

        // int[] nums = new int[numOfElems];

        // for(int i = 0; i < numOfElems; i++) {
        //     System.out.print("Enter a element: ");
        //     nums[i] = scanner.nextInt();
        // }

        // System.out.println();

        // int[] nNums = new int[numOfElems];
        // int uniqueCount = 0;

        // for(int i = 0; i < numOfElems; i++) {

        //     boolean found = false;

        //     for(int j = 0; j < uniqueCount; j++) {
        //         if(nums[i] == nNums[j]) {
        //             found = true;
        //             break;
        //         }
        //     }
        //         if(!found) {
        //             nNums[uniqueCount] = nums[i];
        //             uniqueCount++;
        //         }
        //     }

            
        

        // for(int i = 0; i < uniqueCount; i++) {
        //     System.out.printf("%d ", nNums[i]);
        // }


        // 2. Merging two arrays.

        // System.out.print("Enter the number of elements in an array1: ");
        // int numOfElems1 = scanner.nextInt();
        // System.out.println();
        // System.out.print("Enter the number of elements in an array2: ");
        // int numOfElems2 = scanner.nextInt();

        // System.out.println();

        // int[] nums1 = new int[numOfElems1]; 
        // int[] nums2 = new int[numOfElems2];

        // for(int i = 0; i < numOfElems1; i++) {
        //     System.out.print("Enter a element for array1: ");
        //     nums1[i] = scanner.nextInt();
        // }

        // System.out.println();

        // for(int i = 0; i < numOfElems2; i++) {
        //     System.out.print("Enter a element for array2: ");
        //     nums2[i] = scanner.nextInt();
        // }

        // System.out.println();

        // int[] nums3 = new int[numOfElems1 + numOfElems2];

        // for(int i = 0; i < numOfElems1; i++) {
        //     nums3[i] = nums1[i];
        // }

        // for(int i = 0; i < numOfElems2; i++) {
        //     nums3[i + numOfElems1] = nums2[i];
        // }

        // for(int i = 0; i < numOfElems1 + numOfElems2; i++) {
        //     System.out.printf("%d ", nums3[i]);
        // }


        // 3. Find common elements between two arrays.

        // System.out.print("Enter the number of elements for array1: ");
        // int numOfElems1 = scanner.nextInt();

        // System.out.println();

        // System.out.print("Enter the number of elements for array2: ");
        // int numOfElems2 = scanner.nextInt();

        // System.out.println();

        // int[] nums1 = new int[numOfElems1];
        // int[] nums2 = new int[numOfElems2];

        // for(int i = 0; i < numOfElems1; i++) {
        //     System.out.print("Enter a element for array1: ");
        //     nums1[i] = scanner.nextInt();
        // }

        // System.out.println();

        // for(int i = 0; i < numOfElems2; i++) {
        //     System.out.print("Enter a element for array2: ");
        //     nums2[i] = scanner.nextInt();
        // }

        // System.out.println();

        // for(int i = 0; i < numOfElems1; i++) {
        //     for(int j = 0; j < numOfElems2; j++) {
        //         if(nums1[i] == nums2[j]) {
        //             System.out.printf("%d ", nums1[i]);
        //         }
        //     }
        // }


        // 4. Finding missing values from 1 to n.

        // System.out.print("Enter the value to print the number from 1 to n: ");
        // int n = scanner.nextInt();

        // System.out.println();

        // int[] arr = new int[n];

        // for(int i = 0; i < n; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // System.out.println();

        // int[] orArray = new int[n];

        // for(int i = 0; i < n; i++) {
        //     orArray[i] = i + 1;
        // }

        // for(int i = 0; i < n; i++) {
        //     if(arr[i] != orArray[i]) {
        //         System.out.println(orArray[i]);
        //         break;
        //     }
        // }


        // 5. Find the largest and smallest number in an array.

        // System.out.print("Enter the value of n: ");
        // int n = scanner.nextInt();

        // System.out.println();

        // int[] arr = new int[n];

        // for(int i = 0; i < n; i++) {
        //     System.out.print("Enter a element: ");
        //     arr[i] = scanner.nextInt();
        // }

        // System.out.println();

        // int currentLarge = 0;
        // int currentSmall = 0;
        // int largestNumber = arr[currentLarge];
        // int smallestNumber = arr[currentSmall];

        // for(int i = 0; i < n; i++) {
        //     if(arr[currentLarge] < arr[i]) {
        //         currentLarge = i;
        //     } 
        // }

        // for(int i = 0; i < n; i++) {
        //     if(arr[currentSmall] > arr[i]) {
        //         currentSmall = i;
        //     } 
        // }

        // System.out.printf("The Smallest value in the array is %d.\n", arr[currentSmall]);
        // System.out.printf("The Largest value in the array is %d.\n", arr[currentLarge]);

        scanner.close();

    }
}
