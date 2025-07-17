/*
 🔗 Problem: [Rotate Array – LeetCode #189](https://leetcode.com/problems/rotate-array/)
 🎯 Level: Medium

 🧠 Approach (Optimized):
    - Reverse the entire array.
    - Reverse the first k elements.
    - Reverse the remaining (n-k) elements.

    Why it works:
    Reversing in parts after a full reverse repositions elements as if rotated.

 ⏱ Time Complexity: O(n)  
    Space Complexity: O(1) – in-place

 📌 Example:
    Input: nums = [1,2,3,4,5,6,7], k = 3  
    Output: [5,6,7,1,2,3,4]
*/

import java.util.Arrays;

public class RotateArray {

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k > n

        reverse(nums, 0, n - 1);       // Step 1: reverse whole array
        reverse(nums, 0, k - 1);       // Step 2: reverse first k elements
        reverse(nums, k, n - 1);       // Step 3: reverse rest
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }

}
