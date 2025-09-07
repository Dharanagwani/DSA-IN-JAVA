/*
 🔗 Problem: [Merge Sort Algorithm - GFG] (https://www.geeksforgeeks.org/problems/merge-sort/1)
 🎯 Level: Medium

 🧠 Approach:
   - Divide: Recursively split the array into two halves until each subarray has one element.
   - Conquer: Sort each half by recursion.
   - Combine: Merge the two sorted halves into a single sorted array.

 ⏱ Time Complexity:
   - Best Case: O(n log n)
   - Average Case: O(n log n)
   - Worst Case: O(n log n)
   Space Complexity: O(n) → Extra array used for merging

 📌 Example:
   Input:  [38, 27, 43, 3, 9, 82, 10]
   Output: [3, 9, 10, 27, 38, 43, 82]
*/

public class MergeSort {

    // Function to sort an array using merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays to merge
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        // Merge temp arrays back into arr[left..right]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
