/*
 🔗 Problem: /*
  🔗 Problem: [Search in Rotated sorted Array – LeetCode #33] https://leetcode.com/problems/search-in-rotated-sorted-array/
  🎯 Level: Medium
 
  🧠 Approach:
    - Even though the array is rotated, one part is always sorted.
    - We use modified binary search to check which side is sorted and decide where to move.
    - Continue halving the array accordingly.
 
  ⏱ Time Complexity: O(log n)
  👛 Space Complexity: O(1)
 
  📌 Example:
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
 
    Input: nums = [4,5,6,7,0,1,2], target = 3
    Output: -1
 */
 
 public class SearchInRotatedSortedArray {
 
     public static int search(int[] nums, int target) {
         int low = 0, high = nums.length - 1;
 
         while (low <= high) {
             int mid = low + (high - low) / 2;
 
             // Target found
             if (nums[mid] == target)
                 return mid;
 
             // Check if left half is sorted
             if (nums[low] <= nums[mid]) {
                 // Target lies in left half
                 if (nums[low] <= target && target < nums[mid]) {
                     high = mid - 1;
                 } else {
                     // Target in right half
                     low = mid + 1;
                 }
             } else {
                 // Right half is sorted
                 if (nums[mid] < target && target <= nums[high]) {
                     low = mid + 1;
                 } else {
                     // Target in left half
                     high = mid - 1;
                 }
             }
         }
 
         // Not found
         return -1;
     }
      public static void main(String[] args) {
         int[] nums = {4,5,6,7,0,1,2};
         int target = 0;
 
         int result = search(nums, target);
         System.out.println("Target index: " + result);
     }
}