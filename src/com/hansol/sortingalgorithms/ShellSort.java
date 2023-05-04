package com.hansol.sortingalgorithms;

/*

Shell sort is a variation of insertion sort. Insertion sort chooses which element to insert using a gap of 1.
Shell sort starts out using a larger gap value.
As algorithm runs, the gap is reduced.
Goal is to reduce amount of shifting is required.

After each pass through, the gap value is reduced until it's 1. At which point, it becomes insertion sort.
By the time it gets to 1, the array will be partially sorted. So less shifting.

Knuth sequences to determine gap:

Gap is calculated using (3^k -1) / 2, where k is the length of the array.

For our purposes, use gap = arr.length / 2. Then divide gap value by 2 to get next gap value.

Shell sort is an UNSTABLE algo.

 */


import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] arr1 = {1,4,1,23,5,4,123,5,-1,-34};
        System.out.println("My insertion sort: " + Arrays.toString(shellSortExample(arr1)));

    }


    public static int[] shellSortExample(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {       // Compute gap based on arr size. Handles gap changes.
            for (int i = gap; i < arr.length; i++) {              // Set the first index to the gap
                int newElement = arr[i];                          // Remove first element for later.

                int j = i;                                        // Set  j equal to i which is equal to gap.

                while (j >= gap && arr[j - gap] > newElement) {   // While the index is greater than the start of arr and element at j - gap greater than cached element at index gap.
                    arr[j] = arr[j - gap];                        // Shift indices
                    j -= gap;                                     // Decrement j by the gap and check condition again.
                }

                arr[j] = newElement;                              // Fails check (i.e. newElement < arr[j-gap]). Set cached elem. to index at current j.

            }
        }                                                         // Complete one pass of Shell. Decrement gap by gap /= 2 and redo.

        return arr;

    }


}
