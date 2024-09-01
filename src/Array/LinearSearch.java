package Array;

public class LinearSearch {
    public static void main(String[] args) {
        // Test Case 1: Target is present in the array
        int[] arr1 = {5, 2, 8, 1, 3};
        int target1 = 8;
        System.out.println("Test Case 1: " + linearSearch(arr1, target1)); // Expected Output: true

        // Test Case 2: Target is not present in the array
        int[] arr2 = {5, 2, 8, 1, 3};
        int target2 = 4;
        System.out.println("Test Case 2: " + linearSearch(arr2, target2)); // Expected Output: false

        // Test Case 3: Single Element Array with Target Present
        int[] arr3 = {10};
        int target3 = 10;
        System.out.println("Test Case 3: " + linearSearch(arr3, target3)); // Expected Output: true

        // Test Case 4: Single Element Array with Target Absent
        int[] arr4 = {10};
        int target4 = 5;
        System.out.println("Test Case 4: " + linearSearch(arr4, target4)); // Expected Output: false

        // Test Case 6: Target is the first element in the array
        int[] arr6 = {5, 2, 8, 1, 3};
        int target6 = 5;
        System.out.println("Test Case 6: " + linearSearch(arr6, target6)); // Expected Output: true

        // Test Case 7: Target is the last element in the array
        int[] arr7 = {5, 2, 8, 1, 3};
        int target7 = 3;
        System.out.println("Test Case 7: " + linearSearch(arr7, target7)); // Expected Output: true

        // Test Case 8: Array with negative numbers, target present
        int[] arr8 = {-5, -2, -8, -1, -3};
        int target8 = -8;
        System.out.println("Test Case 8: " + linearSearch(arr8, target8)); // Expected Output: true

        // Test Case 9: Array with negative numbers, target absent
        int[] arr9 = {-5, -2, -8, -1, -3};
        int target9 = -4;
        System.out.println("Test Case 9: " + linearSearch(arr9, target9)); // Expected Output: false
    }

    private static boolean linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
