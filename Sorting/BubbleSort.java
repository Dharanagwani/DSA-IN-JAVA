/*
 🔗 Problem: [Bubble Sort – Custom Implementation - GFG] (https://www.geeksforgeeks.org/problems/bubble-sort/1)
 🎯 Level: Easy

 🧠 Approach:
   - Repeatedly compare adjacent elements.
   - Swap them if they are in the wrong order.
   - After each pass, the largest element is placed at the end.
   - Keep doing this until the array is sorted.

 ⏱ Time Complexity:
    - Best Case (Already Sorted): O(n)
    - Average Case: O(n^2)
    - Worst Case: O(n^2)
    Space Complexity: O(1)

 📌 Example:
   Input: arr = [64, 25, 12, 22, 11]
   Output: [11, 12, 22, 25, 64]
*/

public class BubbleSort {

    // Function to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization: check if any swap happened

            // Inner loop for adjacent comparison
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped → array is already sorted
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Perform Bubble Sort
        bubbleSort(arr);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

