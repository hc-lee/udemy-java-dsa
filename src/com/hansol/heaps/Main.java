package com.hansol.heaps;

/*
Implement a MAX heap
 */

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        Heap heap = new Heap(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        System.out.println("Before deletion:");
        heap.printHeap();

        System.out.println();

        heap.delete(1);
        System.out.println("After deleting '75':");
        heap.printHeap();

        System.out.println();

        System.out.println("Peeking into heap:");
        System.out.print(heap.peek());
        System.out.println();
        System.out.println();

        System.out.println("Heap sort:");
        heap.heapSort();
        heap.printHeap();
        System.out.println();


        // Using Java's PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);


        // Peek at MIN of pq since PriorityQueue is a MIN heap.
        System.out.println("PQ peek: " + pq.peek());

        // Remove priority item (min).
        System.out.println("Removing item:" + pq.remove());
        System.out.println("PQ peek after removing from queue: " + pq.peek());
        // Poll does the same thing as remove().
        System.out.println("Polling: " + pq.poll());
        System.out.println("PQ peek after poll: " + pq.peek());
        // Remove a node with value N.
        pq.remove(54);
        System.out.println("Removing non-root: " + pq.peek());

        // Convert and print as array.
        Object[] ints = pq.toArray();
        for (Object num: ints) {
            System.out.print(num);
            System.out.print(", ");
        }

    }

}
