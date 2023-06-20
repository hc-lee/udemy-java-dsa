package com.hansol.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;


    public ArrayStack(int capacity) {
        this.stack = new Employee[capacity];
    }

    // Add Employee object to top of stack.
    public void push(Employee employee) {
        if (this.top == this.stack.length) {
            // need to resize backing array. Resize operation is O(n).
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(this.stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    // Return the Employee object at top of stack.
    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = this.stack[--top];
        stack[this.top] = null;
        return employee;
    }

    public boolean isEmpty() {
        return this.top == 0;
        }


    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // You want to do [top-1] and not top-- since top-- changes the pointer.
        return this.stack[this.top - 1];
    }

    public void printStack() {
        for (int i = top -1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}