package com.hansol.sortingalgorithms;
/*
Recursive implementation of merge sort.
Divide and conquer type algorithm. Split the array in half over and over again until you are left with only one element
per partition.

Then, compare and merge two sister partitions up the call stack for each half of the array. Finally, merge the two
sorted partitions.

O(n) = n*log_2*n
 */

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr1 = {1,4,1,23,5,4,123,5,-1,-34};
        mergeSort(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));

    }

    // Driver method to recursively mergesort.
    public static void mergeSort(int[] arr, int start, int end) {

        if (end - start < 2) {              // Base case: smallest partition reached.
            return;
        }

        int mid = (end + start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {

        if (arr[mid - 1] <= arr[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArr = new int[end - start];

        while (i < mid && j < end) {
            tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(tempArr, 0, arr, start, tempIndex);

    }


    // Alternative, easier to read solution:

    public static void mergeSort2(int[] arr, int low, int mid, int high) {

        if (arr[mid - 1] <= arr[mid]) {         // Already in order. No change.
            return;
        }

        int i = low;
        int j = mid;
        int[] temp = new int[high - low];

        int k = 0;
        while (i < mid && j < high) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }

            if (arr[j] <= arr[i]) {
                //using a second "if" condition instead of "else if" will give a better time complexity as the array increases in size
                temp[k++] = arr[j++];
            }

        }

        //Copying remaining elements from the "arr" to temp array
        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j < high) {
            temp[k++] = arr[j++];
        }

        //copying temp back to original array
        k = 0;
        for (int p = low; p < high; p++) {
            arr[p] = temp[k++];
        }
    }



}
