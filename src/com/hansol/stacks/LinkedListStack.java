package com.hansol.stacks;

import java.util.LinkedList;

public class LinkedListStack {

    private LinkedList<Employee> stack;

    public LinkedListStack() {
        this.stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        this.stack.push(employee);
    }

    public Employee pop() {
        return this.stack.pop();
    }

    public Employee peek() {
        return this.stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        for (Employee employee : this.stack) {
            System.out.println(employee);
        }
    }

}
