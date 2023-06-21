package com.hansol.queues;
import java.util.LinkedList;

public class LinkedListQueue {


    private LinkedList<Employee> queue;

    public LinkedListQueue() {
        this.queue = new LinkedList<Employee>();
    }

    public void add(Employee employee) {
        this.queue.add(employee);
    }

    public Employee remove() {
        return this.queue.remove();
    }

    public Employee peek() {
        return this.queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printStack() {
        for (Employee employee : this.queue) {
            System.out.println(employee);
        }
    }

}
