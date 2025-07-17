/*
 🔗 Problem: [Majority Element – LeetCode #169](https://leetcode.com/problems/majority-element/)
 🎯 Level: Easy

 🧠 Approach: Moore's Voting Algorithm
    - Maintain a count and candidate.
    - When count is 0, change the candidate.
    - Increase count if current == candidate, else decrease.

 ⏱ Time Complexity: O(n)  
    Space Complexity: O(1)

 📌 Example:
    Input: nums = [3,2,3]  
    Output: 3
*/


public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums){
            if (count == 0)
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println("Majority Element: " + majorityElement(nums));
    }
}
