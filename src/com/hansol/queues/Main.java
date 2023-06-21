package com.hansol.queues;


public class Main {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(10);

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        arrayQueue.add(janeJones);
        arrayQueue.add(johnDoe);
        arrayQueue.add(marySmith);
        arrayQueue.add(mikeWilson);
        arrayQueue.add(billEnd);

        // This will print the items IN ORDER, since it is a FIFO structure.
        arrayQueue.printQueue();

        // Removes Jane, since she is at the front.
        arrayQueue.remove();
        arrayQueue.printQueue();

        // Peeked. Array is not changed.
        System.out.println("Peeked: " + arrayQueue.peek());

    }

}
