package Array;

public class minMax_Element {
    public static void main(String[] args) {
        // Test Cases for Min Method
        System.out.println("Min Test Cases:");

        // Test Case 1: Normal Case
        int[] arr1 = {5, 2, 8, 1, 3};
        System.out.println("Test Case 1 - Min: " + min(arr1, arr1.length)); // Expected Output: 1

        // Test Case 2: Single Element Array
        int[] arr2 = {10};
        System.out.println("Test Case 2 - Min: " + min(arr2, arr2.length)); // Expected Output: 10

        // Test Case 3: All Elements Are the Same
        int[] arr3 = {7, 7, 7, 7};
        System.out.println("Test Case 3 - Min: " + min(arr3, arr3.length)); // Expected Output: 7

        // Test Case 4: Negative Numbers
        int[] arr4 = {-3, -1, -7, -2};
        System.out.println("Test Case 4 - Min: " + min(arr4, arr4.length)); // Expected Output: -7

        // Test Case 5: Mixed Positive and Negative Numbers
        int[] arr5 = {3, -4, 2, -9, 5};
        System.out.println("Test Case 5 - Min: " + min(arr5, arr5.length)); // Expected Output: -9

        // Test Case 6: Array with Zero
        int[] arr6 = {0, 1, 2, 3};
        System.out.println("Test Case 6 - Min: " + min(arr6, arr6.length)); // Expected Output: 0

        // Test Case 7: Array in Ascending Order
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 7 - Min: " + min(arr7, arr7.length)); // Expected Output: 1

        // Test Case 8: Array in Descending Order
        int[] arr8 = {5, 4, 3, 2, 1};
        System.out.println("Test Case 8 - Min: " + min(arr8, arr8.length)); // Expected Output: 1

        // Test Case 9: Array with Large Numbers
        int[] arr9 = {1000000, 999999, 1000001};
        System.out.println("Test Case 9 - Min: " + min(arr9, arr9.length)); // Expected Output: 999999

        // Test Case 10: Empty Array (Edge Case)
        int[] arr10 = {};
        if (arr10.length == 0) {
            System.out.println("Test Case 10 - Min: Array is empty, no minimum value.");
        } else {
            System.out.println("Test Case 10 - Min: " + min(arr10, arr10.length)); // Handle the empty case appropriately
        }

        // Test Cases for Max Method
        System.out.println("\nMax Test Cases:");

        // Test Case 1: Normal Case
        System.out.println("Test Case 1 - Max: " + max(arr1, arr1.length)); // Expected Output: 8

        // Test Case 2: Single Element Array
        System.out.println("Test Case 2 - Max: " + max(arr2, arr2.length)); // Expected Output: 10

        // Test Case 3: All Elements Are the Same
        System.out.println("Test Case 3 - Max: " + max(arr3, arr3.length)); // Expected Output: 7

        // Test Case 4: Negative Numbers
        System.out.println("Test Case 4 - Max: " + max(arr4, arr4.length)); // Expected Output: -1

        // Test Case 5: Mixed Positive and Negative Numbers
        System.out.println("Test Case 5 - Max: " + max(arr5, arr5.length)); // Expected Output: 5

        // Test Case 6: Array with Zero
        System.out.println("Test Case 6 - Max: " + max(arr6, arr6.length)); // Expected Output: 3

        // Test Case 7: Array in Ascending Order
        System.out.println("Test Case 7 - Max: " + max(arr7, arr7.length)); // Expected Output: 5

        // Test Case 8: Array in Descending Order
        System.out.println("Test Case 8 - Max: " + max(arr8, arr8.length)); // Expected Output: 5

        // Test Case 9: Array with Large Numbers
        System.out.println("Test Case 9 - Max: " + max(arr9, arr9.length)); // Expected Output: 1000001

        // Test Case 10: Empty Array (Edge Case)
        if (arr10.length == 0) {
            System.out.println("Test Case 10 - Max: Array is empty, no maximum value.");
        } else {
            System.out.println("Test Case 10 - Max: " + max(arr10, arr10.length)); // Handle the empty case appropriately
        }
    }
    public static int min(int arr[],int n)
    {
        int min=arr[0];
        for (int i=0;i<n;i++)
        {
            if (min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static int max(int arr[],int n)
    {
        int max=arr[0];
        for (int i=0;i<n;i++)
        {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}
