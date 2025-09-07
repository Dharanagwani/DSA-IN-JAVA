/*
 🔗 Problem: [Insertion Sort Algorithm - Custom Implementation - GFG] (https://www.geeksforgeeks.org/problems/insertion-sort/1)
 🎯 Level: Easy

 🧠 Approach:
   - Iterate through the array from the second element to the last.
   - Pick the current element (key) and compare it with elements in the sorted part of the array (to its left).
   - Shift elements that are greater than the key to one position ahead.
   - Insert the key into its correct position.
   - Continue until the array is fully sorted.

 ⏱ Time Complexity: 
    - Best Case (Already Sorted): O(n)
    - Average Case: O(n^2)
    - Worst Case (Reversed): O(n^2)
    Space Complexity: O(1) → In-place sorting

 📌 Example:
   Input:  [64, 25, 12, 22, 11]
   Output: [11, 12, 22, 25, 64]
*/

public class InsertionSort {

    // Function to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse from arr[1] to arr[n-1]
        for (int i = 1; i < n; i++) {
            int key = arr[i];   // Current element to be inserted
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--; // Move left
            }

            // Place key at the correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call Insertion Sort
        insertionSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
