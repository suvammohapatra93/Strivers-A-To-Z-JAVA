
/*Insertion Sort Algorithm ->
Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.
Examples:
Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: 
After sorting the array is: 9,13,20,24,46,52
Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1,2,3,4,5
 */

//----------------------------Answer------------------------

//* Approach -> From the given array divide the array into two subarray(two parts). One is sorted array and another one is unsorted array. Keep the sorting the original array then the unsorted array will sort soon. The outer loop will runs for (n-1) times. */

package Sorting;

public class InsertionSort {

    public static void ascendingOrder(int arr[], int n) {
        for (int i = 1; i < n; i++) { // Start from the second element
            int curr = i;
            // Compare with the previous element
            while (curr > 0 && arr[curr] < arr[curr - 1]) {
                // Swap arr[curr] and arr[curr - 1]
                int temp = arr[curr];
                arr[curr] = arr[curr - 1];
                arr[curr - 1] = temp;

                curr--; // Move to the previous position
            }
        }

        System.out.println("After Sorting in ascending order -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void descendingOrder(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int curr = i;
            while (curr > 0 && arr[curr] > arr[curr - 1]) {
                // swap
                int temp = arr[curr];
                arr[curr] = arr[curr - 1];
                arr[curr - 1] = temp;

                curr--;
            }
        }

        System.out.println("After Sorting in descending order -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = 6;
        System.out.println("Given Array -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        ascendingOrder(arr, n);
        descendingOrder(arr, n);
    }
}

// ! Time Complexity = O(n^2)
// ! Space Complexity = O(1)