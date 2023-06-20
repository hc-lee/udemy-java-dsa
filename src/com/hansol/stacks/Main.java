package com.hansol.stacks;

/*

You can use an array-backed stack if memory is not an issue.

When using a LinkedList backed stack, you don't need to worry about resizing any arrays.

 */


public class Main {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(new Employee("Jane", "Jones", 123));
        arrayStack.push(new Employee("John", "Doe", 4567));
        arrayStack.push(new Employee("Mary", "Smith", 22));
        arrayStack.push(new Employee("Mike", "Wilson", 3245));
        arrayStack.push(new Employee("Bill", "End", 78));

//        System.out.println(arrayStack.peek());
//        arrayStack.printStack();
//
//        System.out.println("Popped:" + arrayStack.pop());
//        System.out.println(arrayStack.peek());


        // LinkedList implementation below:

        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(new Employee("Jane", "Jones", 123));
        linkedListStack.push(new Employee("John", "Doe", 4567));
        linkedListStack.push(new Employee("Mary", "Smith", 22));
        linkedListStack.push(new Employee("Mike", "Wilson", 3245));
        linkedListStack.push(new Employee("Bill", "End", 78));

    }

}
