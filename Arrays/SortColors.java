/*
 🔗 Problem: [Sort Colors – LeetCode #75](https://leetcode.com/problems/sort-colors/)
 🎯 Level: Medium

 🧠 Approach: Dutch National Flag Algorithm
    - Use 3 pointers: low, mid, high.
    - Traverse the array and swap based on the value at mid:
        - If 0 → swap with low and move both pointers forward.
        - If 1 → just move mid.
        - If 2 → swap with high and move high pointer backward.

 ⏱ Time Complexity: O(n)  
    Space Complexity: O(1)

 📌 Example:
    Input: nums = [2, 0, 2, 1, 1, 0]  
    Output: [0, 0, 1, 1, 2, 2]
*/

import java.util.Arrays;

public class SortColors {

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }

}

