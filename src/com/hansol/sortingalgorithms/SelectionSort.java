package com.hansol.sortingalgorithms;

/*
General algorithm. Partitions into sorted and unsorted sets.

Visual: https://visualgo.net/en/sorting

Start from the left. Set the first index of the list as the min.
Iterate through the unsorted partition to the end of the array. If you encounter a smaller value, it as the new tempMin.
After iterating to end, swap the starting index with the index of the lowest value. Stay if they are equal.
The first index is now in the sorted set. Increment starting index and pass through again.
 */

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr1 = {1,4,1,23,5,4,123,5,-1,-34};
        System.out.println("My selection sort: " + Arrays.toString(mySelectionSort(arr1)));
        System.out.println("UDemy selection sort: " + Arrays.toString(selectionSortExample(arr1)));

    }


    // Sorts by comparing for smallest values.
    public static int[] mySelectionSort(int[] arr) {

        for (int i=0; i < arr.length; i++) {

            int indexMin = i;                                       // Set current index as minimum

            for (int j = i + 1; j < arr.length; j++) {              // Iterate through every index i + 1.
                if(arr[j] < arr[indexMin]) {
                    indexMin = j;                                   // If element set index of new min
                }
            }
            int swap_tempMin = arr[i];                              // Cache first unsorted element.
            arr[i] = arr[indexMin];                                 // Set first unsorted element to first sorted elem.
            arr[indexMin] = swap_tempMin;                           // Move first unsorted elem to pos of sorted elem.
        }
        return arr;
    }


    // Sorts by comparing for largest values.
    public static int[] selectionSortExample(int[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swapSelection(arr, largest, lastUnsortedIndex);
        }
        return arr;
    }

    public static void swapSelection(int[] arr, int i, int j) {
        // Helper function for UDemy example. Swaps i and j.
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}


