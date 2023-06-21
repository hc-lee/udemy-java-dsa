package com.hansol.queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == this.queue.length - 1) {
            Employee[] newArray = new Employee[2 * this.queue.length];
            System.arraycopy(this.queue, 0, newArray, 0, this.queue.length);
            this.queue = newArray;
        }

        queue[back] = employee;

        // Implementing a circular queue to avoid unnecessary extensions and use null space.
        if (back < queue.length -1 ) {
            back++;
        } else {
            back = 0;
        }
    }

    public Employee remove() {

        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public int size() {
        return back - front;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}