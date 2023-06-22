/*

Binary search is a O(log_n) algorithm because the size is being halved every time. Reminder: log_n == log_2_n
Binary search can also be implemented recursively.

 */
package com.hansol.searchalgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Should return '3'.
        System.out.println(linearSearch(intArray, 7));

        // To use binarySearch, the array needs to be sorted.
        Arrays.sort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));
        // Should return '1'.
        System.out.println(binarySearch(intArray, -15));
    }

    // Simple iterative search for a target int in an array. O(n) worst case.
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // For binarySearch to work, the array MUST be sorted!!
    public static int binarySearch(int[] arr, int target) {

        int front = 0;
        int back = arr.length - 1;

        while(front < back) {
            int mid = (back - front) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                front = mid + 1;
            } else {
                back = mid - 1;
            }
        }
        return -1;
    }

}
