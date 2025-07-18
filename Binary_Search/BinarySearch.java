/*
 🔗 Problem: [Binary Search – LeetCode #704] (https://leetcode.com/problems/binary-search/)
 🎯 Level: Easy

 🧠 Approach: Binary Search
    - Apply on a sorted array using two pointers (low, high).
    - Compare mid and shift the search window accordingly.

 ⏱ Time Complexity: O(log n)
   Space Complexity: O(1)

 📌 Example:
    Input: nums = [-1, 0, 3, 5, 9, 12], target = 9
    Output: 4
*/

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int index = search(nums, target);
        System.out.println("Target found at index: " + index);
    }

}
