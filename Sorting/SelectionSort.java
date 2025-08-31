/*
 🔗 Problem: [Selection Sort – Custom Implementation GFG] (https://www.geeksforgeeks.org/problems/selection-sort/1)
 🎯 Level: Easy

 🧠 Approach:
   - Divide the array into two parts: sorted and unsorted.
   - Repeatedly find the minimum element from the unsorted part.
   - Swap it with the first unsorted element.
   - Continue until the entire array is sorted.

 ⏱ Time Complexity:
    - Best Case: O(n^2)
    - Average Case: O(n^2)
    - Worst Case: O(n^2)
    Space Complexity: O(1)

 📌 Example:
   Input: arr = [64, 25, 12, 22, 11]
   Output: [11, 12, 22, 25, 64]
*/

public class SelectionSort {

    // Function to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume current element is the minimum

            // Find the index of the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        // Example array
        int[] arr = {64, 25, 12, 22, 11};

        // Call Selection Sort function
        selectionSort(arr);

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
