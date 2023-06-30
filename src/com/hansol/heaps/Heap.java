package com.hansol.heaps;

/*
Definition for an array-backed MAX heap (Children <= Parent).

Left Child  = 2i + 1
Right Child = 2i + 2
Parent = (i - 1) // 2

Carries over assumption from BST that repeat values are not allowed.
 */

public class Heap {

    private int[] heap;
    private int size;    // Implicitly initialized to 0. Incremented/decremented manually.


    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public boolean isFull() {
        // Check if array is full.
        return size == heap.length;
    }

    public int getParent(int index) {
        // Returns the parent of node at index. Defaults floor division since using integers not floats.
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);      // Ternary. If left, then 2i + 1. Else, 2i + 2.
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void fixHeapAbove(int index) {
        // Helper method to insert(). O(log N) operation since binary tree.
        int newValue = heap[index];                                      // Value we just added.
        while (index > 0 && newValue > heap[getParent(index)]) {         // index 0 is root. inserted value > parent.
            heap[index] = heap[getParent(index)];                        // Assign parent to where new value was placed.
            index = getParent(index);
        }

        heap[index] = newValue;                                          // Only place new value after while loop.
    }

    public void fixHeapBelow(int index, int lastHeapIndex) {
        // Takes index of item that was deleted and index of last node in heap
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            // Left child exists
            if (leftChild <= lastHeapIndex) {
                // Right child does not exist if this fails. Left child is used to swap.
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                }
                // Right child does exist. Swap with largest child value.
                else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                }
                else {
                    break;
                }
                // Repeat until correct replacement is found.
                index = childToSwap;
            }
            else {
                break;
            }
        }
    }

    public void insert(int value) {
        // Insert a new node at end of heap. Heapifies after insertion. O(1) to insert. Potentially O(log N) to fix heap
        heap[size] = value;

        fixHeapAbove(size);
        size++;
    }

    public int delete(int index) {
        // Delete a node with index instead of value. Need to search otherwise. O(n) if using a linear search.
        // Potentially O(log N) to fix heap. IF you search, it becomes O(N log N).
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty!");
        }

        int parent = getParent(index);          // Parent of deleted item.
        int deletedValue = heap[index];         // Value to be deleted.

        heap[index] = heap[size - 1];           // Replace with rightmost node in heap.

        if(index == 0 || heap[index] < heap[parent]) {
            // If index is root or replacement value is less than parent, you can only look down.
            fixHeapBelow(index, size - 1);
        }
        else {
            fixHeapAbove(index);
        }

        size --;

        return deletedValue;
    }

    public void heapSort(){
        int lastHeapIndex = size - 1;
        for (int i = 0; i < lastHeapIndex; i++) {
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = temp;

            // Only have to fix below since we are swapping the root. -1 to exclude last index.
            fixHeapBelow(0, lastHeapIndex - i - 1);
        }
    }


    public int peek() {
        // Return the root of the heap if not empty.
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty!");
        }
        else {
            return heap[0];
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

}
