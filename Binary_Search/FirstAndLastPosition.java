/*
 🔗 Problem: [First and Last Occurrence of Element in Sorted Array – LeetCode #34] (https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 🎯 Level: Medium

 🧠 Approach:
   - Use binary search twice:
     1. To find the first occurrence (leftmost index).
     2. To find the last occurrence (rightmost index).
   - If not found, return [-1, -1].

 ⏱ Time Complexity: O(log n)
    Space Complexity: O(1)

 📌 Example:
   Input: nums = [5,7,7,8,8,10], target = 8
   Output: [3,4]

   Input: nums = [5,7,7,8,8,10], target = 6
   Output: [-1,-1]
*/

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("First and Last Positions: [" + result[0] + ", " + result[1] + "]");
    }

    // Function to return the starting and ending position of target
    public static int[] searchRange(int[] nums, int target) {
        // Perform binary search to find first and last positions
        int first = findOccurrence(nums, target, true);   // Find first occurrence
        int last = findOccurrence(nums, target, false);   // Find last occurrence

        // Return both positions in an array
        return new int[]{first, last};
    }

    // Binary Search Helper Method
    // If findFirst is true, search for the first occurrence; otherwise, search for the last
    public static int findOccurrence(int[] nums, int target, boolean findFirst) {
        int ans = -1; // Default value if target is not found
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow

            if (nums[mid] == target) {
                ans = mid; // Record current index
                // Narrow the search space
                if (findFirst) {
                    // Move left for first occurrence
                    high = mid - 1;
                } else {
                    // Move right for last occurrence
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                // Target is in the right half
                low = mid + 1;
            } else {
                // Target is in the left half
                high = mid - 1;
            }
        }

        return ans; // Returns index of occurrence or -1
    }
}
