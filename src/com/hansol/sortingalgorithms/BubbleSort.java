//* Bubble sort O(n^2). Own implementation first then do UDemy example.*//

package com.hansol.sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = {1, 5 ,2 ,576, -23, 21, 23, 4};
        System.out.println("My example: " + Arrays.toString(myBubbleSort(arr1)));
        System.out.println("UDemy example: " + Arrays.toString(bubbleSortExample(arr1)));
    }

    // O(n^2) since it's a nested for-loop. Example of a STABLE sorting algorithm.
    public static int[] myBubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {              // Decrements unsorted partition index (arr.length)
            for (int j = 0; j < arr.length - 1 - i; j++) {      // From index 0 to last unsorted index (arr.length - i)
                if (arr[j] > arr[j+1]) {                        // If left element is greater than right, swap.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            // After one loop through from j < arr.length - 1 - i, increment i. Means to set the last element as sorted.
        }
        return arr;     // Return sorted array
    }

    // UDemy example.
    public static int[] bubbleSortExample(int[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            for (int index = 0; index < arr.length - 1 - lastUnsortedIndex; index++) {
                if (arr[index] > arr[index +1]) {
                    swapBubble(arr, arr[index], arr[index +1]);
                }
            }
        }
        return arr;
    }

    public static void swapBubble(int[] arr, int i, int j) {
        // Helper function for UDemy example. Swaps i and j.
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
