<<<<<<< HEAD:Arrays Part-1/TwoSum.java
/*
 🔗 Problem: [Two Sum – LeetCode #1](https://leetcode.com/problems/two-sum/)
 🎯 Level: Easy

 🧠 Approach:
    - Use a HashMap to store each number’s complement (target - num).
    - Traverse the array:
        - If current number's complement is already in the map → return the indices.
        - Else, store the current number and its index in the map.
    - Handles negative numbers, duplicates, and unsorted arrays.

 ⏱ Time Complexity: O(n) – single pass through the array  
 👛 Space Complexity: O(n) – to store elements in the map
 
*/

import java.util.*;
=======
import java.util.HashMap;
>>>>>>> 0cc8be1 (Renamed Arrays):Arrays/TwoSum.java
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int more = target - nums[i];
            if(map.containsKey(more)){
                ans[0] = map.get(more);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        // 🔸 Sample test case
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
