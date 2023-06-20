package com.hansol.queues;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

}
