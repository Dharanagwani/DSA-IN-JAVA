/*
 🔗 Problem: [Pascal's Triangle – LeetCode #118](https://leetcode.com/problems/pascals-triangle/)
 🎯 Level: Easy

 🧠 Approach:
    - Start with the first row: [1].
    - For each new row:
        - Start and end with 1.
        - Fill middle elements using sum of two elements from the previous row.
    - Continue this process up to `numRows`.

 ⏱ Time Complexity: O(n²) – due to nested loop building each row  
 👛 Space Complexity: O(n²) – to store all rows

*/

import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Middle values from previous row
                    int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(val);
                }
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
