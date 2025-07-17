/*
 🔗 Problem: [Maximum Subarray – LeetCode #53](https://leetcode.com/problems/maximum-subarray/)
 🎯 Level: Medium

 🧠 Approach: Kadane's Algorithm
    - Track current subarray sum.
    - If currentSum < 0, reset to 0.
    - Update maxSum at each step.

 ⏱ Time Complexity: O(n)  
    Space Complexity: O(1)

 📌 Example:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6
*/

public class KadaneAlgorithm {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums));
    }

}

