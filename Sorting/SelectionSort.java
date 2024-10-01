
/* Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1, 2, 3, 4, 5 */

// -------------------------Answer---------------------------------

// * Approach -> In Selction sort we choose the smallest element and put it in their position. The outer loop will goes for (n-1) times. LEARN IT FROM HERE - https://takeuforward.org/sorting/selection-sort-algorithm/ */

package Sorting;

public class SelectionSort {

    public static void ascendingOrder(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            // swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Äfter sorting in ascending Order -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void descendingOrder(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[mini]) {
                    mini = j;
                }
            }
            // swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After sorting in descending Order -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = 6;
        ascendingOrder(arr, n);
        descendingOrder(arr, n);
    }
}

// ! Time Complexity = O(n^2)
// ! Space Complexity = O(1)