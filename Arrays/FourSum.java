/*
 🔗 Problem: [4Sum – LeetCode #18](https://leetcode.com/problems/4sum/)
 🎯 Level: Medium

 🧠 Approach:
    - Sort the array to use two-pointer technique.
    - Fix the first two numbers using nested loops.
    - Use two pointers (`left` and `right`) to find remaining two numbers.
    - Skip duplicates to avoid repeated quadruplets.

 ⏱ Time Complexity: O(n^3) – 2 nested loops + 2 pointers  
 👛 Space Complexity: O(1) – excluding the result list

*/

import java.util.*;

public class FourSum {
    
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicates for j

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for left and right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // 🔸 Sample test case
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);

        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
