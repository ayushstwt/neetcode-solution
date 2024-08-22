package Array;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Integer {
    public static void main(String[] args) {
        // Test case 1: No duplicates
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Test case 1: " + hasDuplicate(nums1)); // Expected: false

        // Test case 2: One duplicate
        int[] nums2 = {1, 2, 3, 4, 5, 3};
        System.out.println("Test case 2: " + hasDuplicate(nums2)); // Expected: true

        // Test case 3: Multiple duplicates
        int[] nums3 = {1, 1, 1, 1, 1};
        System.out.println("Test case 3: " + hasDuplicate(nums3)); // Expected: true

        // Test case 4: Empty array
        int[] nums4 = {};
        System.out.println("Test case 4: " + hasDuplicate(nums4)); // Expected: false

        // Test case 5: Single element
        int[] nums5 = {1};
        System.out.println("Test case 5: " + hasDuplicate(nums5)); // Expected: false
    }
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
    public static int findDuplicate(int[] nums) {
        Set<Integer> uniques=new HashSet();
        for(int i=0;i<=nums.length;i++)
        {
            if(uniques.contains(nums[i]))
            {
                return nums[i];
            }
            uniques.add(nums[i]);
        }
        return 0;
    }
}
