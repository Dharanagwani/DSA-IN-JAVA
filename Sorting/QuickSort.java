/*
 🔗 Problem: [Quick Sort Algorithm - GFG] (https://www.geeksforgeeks.org/problems/quick-sort/1)
 🎯 Level: Medium

 🧠 Approach:
   - Choose a pivot element (here we take the last element as pivot).
   - Partition the array so that:
       - Elements smaller than the pivot are moved to the left.
       - Elements greater than the pivot are moved to the right.
   - Recursively apply the above steps on left and right subarrays.
   - Continue until the entire array is sorted.

 ⏱ Time Complexity:
   - Best Case: O(n log n)   (balanced partitions)
   - Average Case: O(n log n)
   - Worst Case: O(n^2)     (if array is already sorted or pivot always smallest/largest)
   Space Complexity: O(log n) → recursion stack

 📌 Example:
   Input:  [10, 7, 8, 9, 1, 5]
   Output: [1, 5, 7, 8, 9, 10]
*/

public class QuickSort {

    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array using pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing last element as pivot
        int i = (low - 1);      // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return partition index
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call Quick Sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
