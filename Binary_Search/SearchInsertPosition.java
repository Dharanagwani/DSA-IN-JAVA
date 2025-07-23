/*
 🔗 Problem: [Search Insert Position – LeetCode #35] https://leetcode.com/problems/search-insert-position/
 🎯 Level: Easy

 🧠 Approach:
   - Apply binary search.
   - If target found → return index.
   - Else → low pointer will indicate correct insert position.

 ⏱ Time Complexity: O(log n)
   Space Complexity: O(1)

 📌 Example:
   Input: nums = [1,3,5,6], target = 5
   Output: 2

   Input: nums = [1,3,5,6], target = 2
   Output: 1
*/

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return low; // insert position
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = searchInsert(nums, target);
        System.out.println("Insert position: " + result);
    }

}

