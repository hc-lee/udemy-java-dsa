package com.hansol.sortingalgorithms;

/*
Insertion Sort:

Visual: https://visualgo.net/en/sorting

Assume the first element of the array is sorted. Then, from the next elem from the last sorted elem, compare until
index = 0.
While next elem > last elem, shift last elem to the right. If next elem < last elem, move the next elem into position.
 */

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr1 = {1,4,1,23,5,4,123,5,-1,-34};
        System.out.println("My insertion sort: " + Arrays.toString(myInsertionSort(arr1)));
        System.out.println("Insertion sort example: " + Arrays.toString(insertionSortExample(arr1)));

    }


    public static int[] myInsertionSort(int[] arr) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int value = arr[firstUnsortedIndex];
            int position = firstUnsortedIndex - 1;

            while(position >= 0 && arr[position] > value) {
                arr[position + 1] = arr[position];
                position--;
            }

            arr[position + 1] = value;

        }
        return arr;
    }

    public static int[] insertionSortExample(int[] arr) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {

            int newElement = arr[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i-1];
            }

            arr[i] = newElement;

        }
        return arr;
    }

}
